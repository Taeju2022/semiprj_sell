<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
<script src="https://code.jquery.com/jquery-3.6.3.js"></script>
</head>
<body>
	<section>
		<form action="/WEB-INF/view/sellerLogin.jsp" method="post">
		사용자 계정 : <input type="text" name="sellerId">
		비밀번호 : <input type=password name="sellerPassword">
		<button type="submit">confirm</button>
		</form>
	</section>
	<script>
	</script>
</body>
</html>