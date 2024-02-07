<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 외부 CSS 파일(css/default.css) 연결하기 -->
<!-- <link href="./css/default.css" rel="stylesheet" type="text/css"> -->
<%-- EL 을 활용하여 컨텍스트경로를 얻어와서 절대주소처럼 사용 가능 --%>
<link href="${pageContext.request.contextPath }/resources/css/default.css" rel="stylesheet" type="text/css">
<style type="text/css">
	/* 채팅방 전체 영역 */
	#chatRoomArea {
		width: 650px;
		height: 600px;
		border: 1px solid black;
		margin-top: 20px;
		margin-bottom: 20px;
		/* 지정한 영역 크기보다 컨텐츠 양이 더 많을 경우 수직 방향 스크롤바 추가 */
		overflow-y: auto;
		display: inline-block;
	}
	
	/* 채팅방 1개 영역 */
	.chatRoom {
		margin-right: 10px;
		margin-bottom: 20px;
		display: inline-block;
		border: 1px solid black;
	}
	
	/* 채팅 메세지 표시 영역 */
	.chatMessageArea {
		width: 300px;
		height: 200px;
		border: 1px solid gray;
		overflow-y: auto;
	}
	
	
	/* 채팅방 목록 전체 영역 */
	#chatRoomListArea {
		width: 300px;
		height: 600px;
		border: 1px solid black;
		margin-top: 20px;
		margin-bottom: 20px;
		/* 지정한 영역 크기보다 컨텐츠 양이 더 많을 경우 수직 방향 스크롤바 추가 */
		overflow-y: auto;
		display: inline-block;
	}
	
</style>
<script src="${pageContext.request.contextPath }/resources/js/jquery-3.7.1.js"></script>
<script>
	$(function() {
		// 채팅 페이지 접속 시 웹소켓 연결 즉시 수행
		connect();
		// ===============================================================
		// 버튼 클릭 이벤트 처리
		$("#btnJoin").click(function() {
			// 상대방 아이디 미입력 시 오류메세지 출력 및 입력창 포커스 요청
			if($("#receiver_id").val() == "") {
				alert("상대방 아이디 입력 필수!");
				$("#receiver_id").focus();
				return;
			}
			
			startChat();
		});
		
		$("#btnQuit").click(function() {
			disconnect();	
		});
		
	});
	
	// ===============================================================
	// 웹소켓 연결 요청
	let ws; // 웹소켓 연결 시 웹소켓 객체를 저장할 변수 선언
	let current_user_id; // 채팅방에서 사용할 사용자 아이디 저장 변수 선언
	
	function connect() {
		// 사용자 세션 아이디 변수에 저장
		current_user_id = "${sessionScope.sId}";

		// 웹소켓 연결에 사용할 기본 주소 설정(ws 프로토콜 사용)
		// => 보안을 위해서는 ws 대신 wss 사용해야함
		let ws_base_url = "ws://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}";
		// => 주의! request 객체의 contextPath 값은 "/XXX" 형식으로 리턴되므로 문자열 결합 시 / 생략
		
		// 웹소켓 요청(Handshake)
		// => WebSocket 객체 생성(생성자 파라미터로 요청 주소 전달)
		ws = new WebSocket(ws_base_url + "/echo2");
		// => 이 요청을 서버에서 처리하기 위해 매핑을 수행해야하는데
		//    이 매핑은 컨트롤러가 아닌 xml 파일에서 설정 필요
		//    (=> ws-context.xml 파일 만들어서 설정)
		
		// WebSocket 객체의 onxxx 이벤트에 각각의 함수 연결
		// => 주의! onxxx 이벤트에 전달하는 함수는 반드시 함수명만 기술
		ws.onopen = onOpen;
		ws.onmessage = onMessage;
		ws.onclose = onClose;
		ws.onerror = onError;
		
	}
	// =========================================================================
	// 웹소켓(서버) 연결 시 open 이벤트 처리 메서드(채팅방 입장 버튼 클릭 시)
	function onOpen() {
		// 채팅 페이지 접속 시 웹소켓 연결 후 초기화 메세지 전송
		// => 메세지타입(INIT), 사용자 아이디, 3개 널스트링
		ws.send(getJsonString("INIT", current_user_id, "", "", ""));
	}
	
	// ================================================================
	// 상대방과의 채팅 시작(이미 채팅페이지 접속 시점에 웹소켓은 생성되어 있음)
	function startChat() {
		// 채팅 시작을 알리는 웹소켓 메세지 전송
		// => 타입(START), 사용자아이디, 상대방아이디, 나머지 2개 널스트링
		ws.send(getJsonString("START", current_user_id, $("#receiver_id").val(), "", ""));
	}
	// ================================================================
	// 전송할 메세지 및 각종 정보를 JSON 타입 문자열로 변환하여 리턴하는 getJsonString() 함수 정의
	function getJsonString(type, current_user_id, receiver_id, room_id, message) {
		// 전달받은 파라미터들을 하나의 객체로 결합하여 JSON 타입 문자열로 변환 후 리턴
		// => 파라미터 : 메세지타입, 사용자아이디, 상대방아이디, 방번호, 메세지
		let data = {
			type : type,
			sender_id : current_user_id,
			receiver_id : receiver_id,
			room_id : room_id,
			message : message
		};
		
		// JSON.stringify() 메서드를 통해 객체 -> JSON 문자열로 변환
		return JSON.stringify(data);
	}
	
	// ================================================================
	// 현재 채팅창에 메세지 출력
	// => 파라미터 : 룸ID, 발신자, 수신자, 메세지, 타입, 발신시각
	function appendMessageToTargetRoom(room_id, sender_id, receiver_id, message, type, send_time) {
// 		console.log(room_id + ", " + sender_id + ", " + receiver_id + ", " + message + ", " + type);
		// ================================================================
		// 메세지 시각 등 설정 필요
		// ================================================================
		// 단순히 메세지만 표시(임시)
		// 1) 현재 채팅방 찾기
		//    => #chatRoomArea 의 자식들 중 클래스 선택자(.)가 room_id 인 채팅방 탐색
		let chatRoom = $("#chatRoomArea").find("." + room_id);
		// 2) 현재 채팅방의 자식들 중 메세지 표시 영역(클래스 선택자 chatMessageArea) 탐색
		let chatMessageArea = $(chatRoom).find(".chatMessageArea");
		// 3) 해당 메세지 표시 영역에 메세지 표시
		$(chatMessageArea).append(message + "<br>");
		// 4) 채팅 메세지 출력창 스크롤바를 항상 맨 밑으로 유지
		// => 메세지 영역의 크기 활용
		$(chatMessageArea).scrollTop($(".chatMessageArea").height());
	}
	
	// =========================================================================
	// 서버로부터 메세지 수신 시 message 이벤트 처리 메서드
	// => 파라미터로 MessageEvent 객체가 전달됨
	function onMessage(event) {
		// 전달받은 데이터(event.data)가 JSON 타입 문자열로 전달되므로
		// JSON.parse() 메서드를 통해 JSON 객체로 변환하여 접근
		let data = JSON.parse(event.data);
			
		// 전달받은 메세지의 타입 판별(ENTER or LEAVE or TALK)
		if(data.type == "ENTER" || data.type == "LEAVE") { // 입장 또는 퇴장
			// 입장&퇴장 메세지는 시스템 메세지 형식(>>> xxx <<<) 으로 출력
			appendMessageToTargetRoom(">>> " + data.message + "<<<");
			// ------------------------------------------------------------
			// 채팅방 접속한 사용자 or 나간 사용자 닉네임을 목록에 표시 or 제거
			// 단, 접속(ENTER)일 경우 표시, 나가기(LEAVE)일 경우 제거
			if(data.type == "ENTER") {
				// -------------------------------------------------------------
				// 채팅방 참여자 목록에 접속자 닉네임(아이디)을 추가
				$("#chatUserListArea").append("<div id='user_" + data.nickname + "'>" + data.nickname + "</div>");
				// -------------------------------------------------------------
			} else {
				// 채팅방 참여자 목록에서 닉네임(닉네임에 해당하는 ID 선택자 요소) 제거
				$("#user_" + data.nickname).remove();
			}
		} else if(data.type == "TALK") { // 대화
			// 대화 메세지는 닉네임 : 메세지 형식으로 출력
// 			appendMessage(data.nickname + " : " + data.message);
		} else if(data.type == "START") { // 채팅방 열기(생성)
			// createRoom() 함수 호출
			// => 파라미터 : 룸 아이디, 상대방 아이디
			createRoom(data.room_id, data.receiver_id);
		
			// 현재 채팅방에 메세지 표시
			appendMessageToTargetRoom(
					data.room_id, data.sender_id, data.receiver_id, data.message, data.type, "");
		} else if(data.type == "LIST_ADD") {
			// 기존 채팅방 목록에 새 채팅방 추가
			// => 룸ID, 상대방ID, 채팅방 제목, status 값(null) 전달
			let title = "채팅-" + data.receiver_id;
			appendChatRoomToRoomList(data.room_id, data.receiver_id, title, null);
		} else if(data.type == "LIST") {
			// 전체 채팅방 목록 표시
			// 1) 기존 채팅방 목록 표시 영역 초기화
			$("#chatRoomListArea").empty();
			
			// 2) 전달받은 메세지를 JSON 객체로 파싱하여 반복문을 통해 채팅방 목록 생성 표시
			// => 파싱 과정에서 배열 내의 객체 형식으로 파싱되므로 반복문 통해 배열 접근
			for(let room of JSON.parse(data.message)) {
				console.log(room);
				appendChatRoomToRoomList(room.room_id, room.receiver_id, room.title, room.status);
			}
		} 
		
	}
	
	// =========================================================================
	// 채팅방 생성
	function createRoom(room_id, receiver_id) {
		let room = "<div class='chatRoom " + room_id + "'>"
					+ "		<div class='chatMessageArea'></div>"
					+ "			<div class='commandArea'>"
					+ "				<input type='hidden' class='room_id' value='" + room_id + "'>"
					+ "				<input type='hidden' class='receiver_id' value='" + receiver_id + "'>"
					+ "				<input type='text' class='chatMsg' onkeypress='checkEnter(this)'>"
					+ "				<input type='button' class='btnSend' value='전송' onclick='sendMessage(this)'>"
					+ "				<input type='button' class='btnQuitRoom' value='나가기' onclick='quitRoom(this)'>"
					+ "			</div>"
					+ "</div>"
		
		
		$("#chatRoomArea").append(room);
	}
	
	// =========================================================================
	// 채팅방 목록에 새 채팅방 추가
	function appendChatRoomToRoomList(room_id, receiver_id, title, status) {
		// 채팅방 목록 1개 정보에 chatRoomList 와 room_id 값을 class 선택자로 추가
		let room = "<div class='chatRoomList " + room_id + "'>"
					+ "		<div class='chatRoomTitle'>" + title + "</div>"
					+ "</div>";
		
		$("#chatRoomListArea").append(room);
	}
	// =========================================================================
	// 웹소켓 연결 해제
	function disconnect() {
		// WebSocket 객체의 close() 메서드 호출하여 웹소켓 연결 종료
		ws.close();
	}
	
	// 웹소켓 연결 해제 시 close 이벤트에 대한 처리 메서드
	function onClose() {
		
	}
	// =========================================================================
	// 웹소켓 연결 실패 등의 사유로 오류 발생 시 error 이벤트에 대한 처리 메서드
	// => 에러 정보 객체가 event 파라미터로 전달됨
	function onError(event) {
		console.log(">>> 시스템 오류 발생 <<<");
		console.log(event);
	}
	// =========================================================================
	// 채팅창 엔터키 입력 판별
	function checkEnter(target) {
		let keyCode = event.keyCode;
		
		if(keyCode == '13') {
			sendMessage(target);
		}
	}
	// =========================================================================
	// 웹소켓 서버로 메세지 전송
	function sendMessage(target) {
		// 메세지가 입력된 채팅방 구분
		// 전달받은 요소 객체(target)의 부모 탐색(<div class='commandArea'></div>)
		let commandArea = $(target).parent();
		
		// 입력창의 채팅메세지 가져오기
		// => 부모에 해당하는 commandArea 의 자식들 중 클래스 선택자(".chatMsg") 요소 탐색
		let msg = $(commandArea).find(".chatMsg").val();
// 		console.log("msg : " + msg);
		
		// 해당 채팅방의 룸 아이디 가져오기
		let room_id = $(commandArea).find(".room_id").val();
// 		console.log("room_id : " + room_id);
		
		// 해당 채팅방의 상대방 아이디 가져오기
		let receiver_id = $(commandArea).find(".receiver_id").val();
// 		console.log("receiver_id : " + receiver_id);
		
		// 입력창의 채팅메세지가 널스트링이 아닐 경우에만 sendMessage() 호출
		if(msg == "") {
			alert("메세지 입력 필수!");
			$(commandArea).find(".chatMsg").focus();
			return;
		}
		
		// 서버로 메세지 전송
		ws.send(getJsonString("TALK", current_user_id, receiver_id, room_id, msg));
		
		// 입력창 초기화 후 포커스 요청
		$(commandArea).find(".chatMsg").val("");
		$(commandArea).find(".chatMsg").focus();
	}
	
	
	
</script>
</head>
<body>
	<header>
		<!-- 기본메뉴 표시 영역(top.jsp 페이지 삽입) -->
		<%-- 주의! JSP 파일은 WEB-INF/views 디렉토리 내에 위치 --%>
		<jsp:include page="../inc/top.jsp"></jsp:include>
	</header>
	<article>
		<!-- 본문 표시 영역 -->
		<h1>채팅 페이지</h1>
		<hr>
		<!-- 상대방 아이디를 직접 입력하여 채팅방 생성 -->
		<!-- 실제 환경에서는 게시물 내의 상대방 아이디를 클릭하여 채팅하기 등을 클릭했을 경우 -->
		상대방 아이디 : <input type="text" id="receiver_id"> 
		<input type="button" value="채팅 시작" id="btnJoin">
		<input type="button" value="채팅방 나가기" id="btnQuit">
		<hr>
		<div id="chatRoomArea"><%-- 채팅방 추가될 위치 --%></div>
		<div id="chatRoomListArea"><%-- 현재 사용자의 채팅방 목록 추가될 위치 --%></div>
	</article>
	<footer>
		<!-- 회사소개 표시 영역(bottom.jsp 페이지 삽입) -->
		<jsp:include page="../inc/bottom.jsp"></jsp:include>
		<select name="lang" onchange="location.href='${pageContext.request.contextPath}?lang=' + this.value">
			<option value="ko-kr" <c:if test="${param.lang eq 'ko-kr'}">selected</c:if>>한국어</option>
			<option value="en-us" <c:if test="${param.lang eq 'en-us'}">selected</c:if>>영어</option>
		</select>
	</footer>
</body>
</html>














