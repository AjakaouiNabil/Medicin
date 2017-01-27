<%@page import="quotes.QuotesFile"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@page import="java.io.StringWriter"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reultaat</title>
</head>
<body>
	<%
		String search = request.getParameter("search");
		if (search != null){
	%>
		<h1>Gevonden quotes voor "<%= search %>":</h1>
	<%
		
		ArrayList<String> quotes = QuotesFile.getQuotes(search); 		
	%>
	<ul>
	<% for (String q : quotes) {%>
		<li><%=q %></li>
	<%} %>
	</ul>
	<%
		
		}
	%>
	<a href="quotes.jsp">Back to Search</a>
</body>
</html>