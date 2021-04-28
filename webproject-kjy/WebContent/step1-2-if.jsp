<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step1-2-if</title>
</head>
<body>
<a href="step1-if.jsp">step1로 이동</a><hr>
별명 ${param.nick} 나이 ${param.age} <br>
<c:if test="${param.age>=20 && param.nick=='아이유'}">
	성인 ${param.age}세 ${param.nick}님 
</c:if>
</body>
</html>




