<%@page import="medicijn.MedicijnFile"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.io.StringWriter"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reultaat van medicijnen</title>
</head>
<body>
	<%
		String search = request.getParameter("search");
		if (search != null){
	%>
		<h1>medicijn met als naam:  "<%= search %>":</h1>
	<%
		
		ArrayList<String> medicijnen = MedicijnFile.getMedicijn(search); 		
	%>
	<ul>
	<% for (String m : medicijnen) {%>
		<li><%=m %></li>
	<%} %>
	</ul>
	<%
		
		}
	%>
	<a href="med.jsp">Back to Search</a>
</body>
</html>