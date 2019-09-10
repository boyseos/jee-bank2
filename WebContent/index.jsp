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
<h2>로그인</h2>
<table border="1">
	<tr>
		<td>로그인</td>
		<td><input id="btn" type="button" value="login"/></td>
	</tr>
	<tr>
		<td>회원가입</td>
		<td><a href="#" id="joinlink">바로가기</a></td>
	</tr>
</table>
<script>
$('#btn').click(function(){
	location.assign('<%=request.getContextPath()%>/member.do?page=login');
});
$('#joinlink').click(function(){
	location.assign('<%=request.getContextPath()%>/member.do?page=join');
});
</script>
</body>
</html>