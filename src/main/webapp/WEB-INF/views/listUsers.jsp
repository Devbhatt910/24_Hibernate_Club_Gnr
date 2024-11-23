<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
	List<uEntity> users = (List<uEntity>) request.getAttribute("users");
    %>

	<table border="2px">
	<tr>
<%
	for(int i=0;i<users.size();i++)
	{
		out.print(users.get(i).getfname());
	}
%>
	<table>
</body>
</html>