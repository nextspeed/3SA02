<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
    
<html>
	<body>
		<h1 align="center">Result of Process</h1>
		<p>
		
		<%
			String result = (String)request.getAttribute("result");
			
				out.print("<br>Try : " + result);
			
		%>
	</body>
</html>
