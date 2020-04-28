<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>JSP Form Upload</title>
</head>
<body>
<%
   String message = (String)request.getAttribute("message");
   String error = (String)request.getAttribute("error");
%>
    <h3>JSP File Upload</h3>

<% if(message != null && !message.equals("")) { %>	
	<p><%=message %>
<% } %>	

	<form method="post" action="fileupload" name="echo" enctype="multipart/form-data">
		<fieldset>
		<legend>Select file(s)</legend>
		<input type="file" name="file" size="50" multiple /><br> 
		<input type="submit" value="Send"> 
		<input type="reset" value="Reset">
		</fieldset>
	</form>
<% if(error != null && !error.equals("")) { %>	
	<p style="color:red;"><%=error %>
<% } %>	
</body>
</html>