<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	userId : <input type="text" name="userId"><br>
	password : <input type="text" name="password"><br>
	
	<h3>localeChange</h3>
	<select>
		<c:forEach items="${localeMap }" var="locale">
			<option value="${locale.key}">${locale.value}</option>
		</c:forEach>
	</select>
</body>
</html>