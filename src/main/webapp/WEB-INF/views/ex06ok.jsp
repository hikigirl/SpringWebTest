<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="http://bit.ly/3WJ5ilK" />
</head>
<body>
	<!-- ex06ok.jsp -->
	<div>입력값: ${data}</div>
	<div>이름: ${dto.name}</div>
	<div>나이: ${dto.age}</div>
	<div>주소: ${dto.address}</div>
</body>
</html>