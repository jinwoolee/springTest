<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	multipartView.jsp
	
	<form action="/mvc/multipart/upload" enctype="multipart/form-data" method="post">
		<input type="text" name="userId" value="브라운"> <br>
		<input type="file" name="uploadFile"> <br><br>
		
		<input type="file" name="files"> <br>
		<input type="file" name="files"> <br>
		<input type="submit" value="전송">
	</form>

</body>
</html>