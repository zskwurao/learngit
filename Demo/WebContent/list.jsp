<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/ListServlet" method="post">
	<!-- 书名：<input type="text" name="bookname" value=""><br>
	作者：<input type="text" name="auther"><br>
	价格：<input type="text" name="price"><br> -->
	<input type="text" name="bookname">
	<input type="submit" value="查询">
	</form>
</body>
</html>