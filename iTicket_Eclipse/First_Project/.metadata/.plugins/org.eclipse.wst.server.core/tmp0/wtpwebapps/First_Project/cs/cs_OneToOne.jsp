<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객센터</title>
<%-- 외부 CSS 파일(css/default.css) 연결하기 --%>
<link href="${pageContext.request.contextPath}/css/cs.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrapper">
		<h1>1 : 1 문의</h1>
		
		<nav> <%-- 사이드 메뉴바 --%>
			<jsp:include page="cs_menubar.jsp"></jsp:include>
		</nav>
		
		<form action="" method="" name="">
			<p>고객님의 문의에 답변하는 직원은 고객 여러분의 가족 중 한 사람일 수 있습니다.<br>
			고객의 언어폭력(비하, 욕설, 반말, 성희롱 등)으로부터 직원을 보호하기 위해<br> 
			관련 법에 따라 수사기관에 필요한 조치를 요구할 수 있으며, 형법에 의해 처벌 대상이 될 수 있습니다.<br>
			FAQ를 이용하시면 궁금증을 더 빠르게 해결하실 수 있습니다.<br>
			1:1 문의글 답변 운영시간 10:00 ~ 19:00<br>
			접수 후 48시간 안에 답변 드리겠습니다.</p>
		
			<section id="agree_msg"> <%-- 개인정보 수집 동의 영역 --%>
				<input type="checkbox" id="checkbox" required>
				<label for="checkbox">개인정보 수집에 대한 동의</label>
				<hr>
				<p>귀하께서 문의하신 다음의 내역은 법률에 의거 개인정보 수집·이용에 대한 본인동의가 필요한 항목입니다.<br>
				<br>
				<b>[개인정보의 수집 및 이용목적]</b><br>
				회사는 1:1 문의 내역의 확인, 요청사항 처리 또는 완료 시 원활한 의사소통 경로 확보를 위해 수집하고 있습니다.<br>
				<br>
				<b>[필수 수집하는 개인정보의 항목]</b><br>
				이름, 휴대전화, 이메일, 문의내용<br>
				<br>
				<b>[개인정보의 보유기간 및 이용기간]</b><br>
				문의 접수 ~ 처리 완료 후 3년<br>
				(단, 관계법령의 규정에 의하여 보존 할 필요성이 있는 경우에는 관계 법령에 따라 보존)<br>
				자세한 내용은 '개인정보 처리방침'을 확인하시기 바랍니다.</p>
			</section>
			<b id="warning">* 원활한 서비스 이용을 위한 최소한의 개인정보이므로 동의하지 않을 경우 서비스를 이용하실 수 없습니다</b>
			
			<section id="input_table"> <%-- 문의 입력창 --%>
				<b id="warning">* 필수입력항목</b> <br>
				<table id="cs_table">
					<tr>
						<td id="table2">문의유형<b>*</b></td>
						<td id="table3">
							<select required>
								<option value="">문의유형 선택</option>
								<option value="영화관">영화관</option>
								<option value="영화">영화</option>
								<option value="예매">예매/결제</option>
								<option value="관람권/할인권">관람권/할인권</option>
								<option value="개인정보">개인정보</option>
								<option value="칭찬/불만/제안">칭찬/불만/제안</option>
							</select>
						</td>
						<td id="table2">문의지점<b>*</b></td>
						<td id="table3">
							<input type="radio" name="ox" required> 선택안함 <%-- 체크 시 select창 비활성화 --%>
							<input type="radio" name="ox" required> 선택함 <br> <%-- 체크 시 지점명 필수선택 --%>
							<select>
								<option>선택안함</option>
								<option>지점명A</option> <%-- 지점명 정해지면 수정 --%>
								<option>지점명B</option>
							</select>
						</td>
					</tr>
					<tr>
						<td id="table2">이름<b>*</b></td>
						<td id="table3"><input type="text" id="name" required></td>
						<td id="table2">휴대전화<b>*</b></td>
						<td id="table3">
							<input type="tel" id="tel" placeholder="'-' 기호 제외한 숫자만 입력" required>
						</td>
					</tr>
					<tr>
						<td id="table2">이메일<b>*</b></td>
						<td id="table3" colspan="3"><input type="email" id="email" required></td>
					</tr>
					<tr>
						<td id="table2">제목<b>*</b></td>
						<td id="table3" colspan="3"><input type="text" id="title" required></td>
					</tr>
					<tr>
						<td id="table2">내용<b>*</b></td>
						<td id="table3" colspan="3"><textarea rows="15" cols="90" required></textarea></td>
					</tr>
					<tr>
						<td id="table2">첨부파일</td>
						<td id="table3" colspan="3"><input type="file" id="file"></td>
					</tr>
					
					<tr>
						<td id="table2">비밀번호<b>*</b></td>
						<td id="table3" colspan="3">
							<input type="password" id="passwd" maxlength="4" placeholder="숫자 4자리" required>
							<b>*고객님의 소중한 정보를 보호하기위해 게시글의 비밀번호를 설정해주세요.</b>
						</td>
					</tr>
				</table>
				<div id="cs_button">
					<input type="button" value="취소"> <%-- 취소하시겠습니까? 메세지 출력 후 고객센터 메인 페이지로 바로 이동 --%>
					<input type="submit" value="등록"> <%-- 문의가 접수되고 고객센터 메인 페이지로 이동 --%>
				</div>
			</section>
		</form>
	</div>
</body>
</html>