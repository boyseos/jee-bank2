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
마이페이지
<h2>${member.name}</h2><br />
<h2>아이디${member.id}</h2><br />
<h2>비번${member.pass}</h2><br />
<h2>민번${member.ssn}</h2><br />
<h2>신용도${member.credit}</h2><br />
</body>
</html>