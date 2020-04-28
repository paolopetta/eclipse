<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Check form</title>

<style>
div.error {
	color: red;
}

div.ok {
	color: green;
}
</style>



</head>
<body>

<%
	String name = (String)request.getAttribute("name");
    if(name == null) name = "";
    
	String surname = (String)request.getAttribute("surname");
    if(surname == null) surname = "";
	
%>

<%
   String error = (String)request.getAttribute("error");
   if(error != null) {
	   
	 if(!error.equals("")) {
%>
	<div class="error"><%=error %></div>
<% 
   } else {	   
%>
	<div class="ok">Insert ok: <%=name %> <%=surname %></div>

<%  } 
  }%>



<form name="loginForm" method="POST" action="Check">
  Name: <input type="text" name="name" placeholder="Michele" value="<%= name%>"><br>
  Surname: <input type="text" name="surname" placeholder="Risi"value="<%=surname%>"><br>
  <br>
  <input type="submit">
  <input type="reset">
</form>



</body>
</html>