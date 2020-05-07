<%@page import="it.unisa.model.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,it.unisa.model.ProductBean"%>
    
<%
	//se la jsp non è passata dalla servlet faccio una redirect
	Collection<?> products = (Collection<?>) request.getAttribute("products");
	
	String error=(String) request.getAttribute("error");
	
	if(products == null && error == null){	//non siamo passati per la servlet
		response.sendRedirect(response.encodeRedirectURL("./ProductControl")); //se metti lo / devi inserire il punto
	}
	products.clear();
	
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href= "ProductStyle.css" rel= "stylesheet" type ="text/css">

<title>	StoreDemo	</title>
</head>
<body>
	<h1>StoreDemo</h1>

<h2>Products</h2>
<table >
	<tr>
		<th>Code</th>
		<th>Name</th>
		<th>Description</th>
		<th>Action</th>
	</tr>
	<%
		if(products != null && products.size() > 0){
			Iterator<?> it= products.iterator();
			while(it.hasNext()){
				ProductBean bean= (ProductBean) it.next();
	%>
		<tr> 
			<td> <%=bean.getCode() %> <a href="<%= response.encodeURL("ProductControl?sort=code") %>">Sort</a></td>
			<td> <%=bean.getName() %> <a href="<%= response.encodeURL("ProductControl?sort=name") %>">Sort</a></td>
			<td> <%=bean.getDescription()%> <a href="<%= response.encodeURL("ProductControl?sort=description") %>">Sort</a></td>
			<td></td>
		</tr>
		

	
	<%		} 
		} else { %>
	<tr colspan="4"> No product available</tr> 
	<%} %>
	
</table>
	

<p><%= error %></p>
</body>
</html>