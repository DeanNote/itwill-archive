<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	// 전달받은 msg 속성값 alert() 함수로 출력
	alert("${msg}")
	
	// Model 객체로 전달받은 "isClose" 값에 따른 처리
	// => 단, Model 객체에 저장된 실제 데이터타입과 상관없이 자바스크립트에서 문자열로 처리
	if("${isClose}" == "true") { // 만약, "true" 일 때만 문자열 전달 시 == "true" 생략해도 됨
		// 부모창 페이지 이동 처리
		window.opener.location.href = "${targetURL}";
		// 현재 창 닫기		
		window.close();
	} else {
		// 전달받은 targetURL 속성값 location.href 로 이동 처리
		location.href = "${targetURL}";
	}
	
</script>
















