<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script   src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h2>로그인페이지</h2>
<form id="login" action="<%=request.getContextPath()%>/member.do">
아이디<input type="text" name="id" /> <br />
비밀번호<input type="text" name="pass" /> <br />
<input type="hidden" name="action" value="login"/> <br />
<input type="hidden" name="page" value="mypage"/> <br />
<input type="submit"  value="전송"/> <br />
</form>
<script>
$('#login').submit(function(){
	
});
</body>
</html>