<%@ page import="java.util.ArrayList" %>
<%@ page import="it.unisa.model.ProductBean" %>
<%@ page import="it.unisa.model.Cart" %><%--
  Created by IntelliJ IDEA.
  User: peppe
  Date: 01/05/2020
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<ProductBean> product = (ArrayList<ProductBean>) request.getAttribute("products");

    String message = (String) request.getAttribute("message");

    String error = (String) request.getAttribute("error");

    Cart<ProductBean> cart = (Cart<ProductBean>) request.getAttribute("cart");

    if(product == null && error == null && cart == null){
        response.sendRedirect(response.encodeRedirectURL("./ProductControl"));
    }


    ProductBean pr = (ProductBean) request.getAttribute("product");
%>

<html>
<head>
    <meta charset="UTF-8">
    <link href="ProductStyle.css" type="text/css" rel="stylesheet">
    <title>Products</title>
</head>
<body>
    <h1>PeppStore</h1>
    <h2>Products</h2>
    <table>
        <tr>
            <th>Code <a href="<%= response.encodeURL("ProductControl?sort=code")%>">Sort</a></th>
            <th>Name <a href="<%= response.encodeURL("ProductControl?sort=name")%>">Sort</a></th>
            <th>Description  <a href="<%= response.encodeURL("ProductControl?sort=description")%>">Sort</a></th>
            <th>Action</th>
        </tr>
        <%
            //ArrayList<ProductBean> product = (ArrayList<ProductBean>) request.getAttribute("products");
            if(product != null && product.size() > 0){
                for(ProductBean p : product){
        %>
                <tr>
                    <td><%= p.getCode() %></td>
                    <td><%= p.getName() %></td>
                    <td><%= p.getDescription() %></td>
                    <td>
                        <a href="<%=response.encodeURL("ProductControl?action=details&id=" + p.getCode())%>">Details</a>
                        <a href="<%=response.encodeURL("ProductControl?action=addCart&id=" + p.getCode())%>">AddToCart</a>
                    </td>
                </tr>
            <%  }
            } else { %>
            <tr>
            	<td colspan="4">Nessun prodotto disponibile</td>
            </tr>
        <% } %>
    </table>

    <% if(pr != null && !pr.isEmpty()) { %>
        <h3>Deatils</h3>
        <table>
            <tr>
                <th>Code</th>
                <th>Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Quantity</th>
            </tr>
            <tr>
                <td><%= pr.getCode() %></td>
                <td><%= pr.getName() %></td>
                <td><%= pr.getDescription() %></td>
                <td><%= pr.getPrice() %></td>
                <td><%= pr.getQuantity() %></td>
            </tr>
        </table>
    <% } %>

    <h2>Cart</h2>
    <%
        if(cart != null) {
            ArrayList<ProductBean> prodCart = cart.getItems();
            if(prodCart.size()>0) {
    %>
        <a href="<%=response.encodeURL("ProductControl?action=clearCart")%>">Clear</a>
        <a href="<%=response.encodeURL("ProductControl")%>">Buy</a>
    <% } %>
    <table>
        <tr>
            <th>Name</th>
            <th>Price</th>
            <th>Action</th>
        </tr>
        <% if(prodCart.size() > 0) {
            for(ProductBean p : prodCart) {
        %>
            <tr>
                <td> <%= p.getName() %> </td>
                <td> <%= p.getPrice() %> </td>
                <td> <a href="<%=response.encodeURL("ProductControl?action=deleteToCart&id="+p.getCode())%>">Delete</a> </td>
            </tr>
        <% }
        } else {%>
            <tr><td colspan="3">No product available in the cart</td></tr>
        <% }
        }%>
    </table>
    <% if(message != null && !message.equals("")) { %>
            <p style="color: green"><%= message %></p>
    <% } %>

    <form action="<%= response.encodeURL("ProductControl")%>" method="post">
        <fieldset>
            <legend><b>Insert</b></legend>
            <input type="hidden" name="action" value="insert"> <br>

            <label for="name">Name:</label> <br>
            <input name="name" id="name" type="text" maxlength="20" placeholder="enter name" required > <br>

            <label for="description">Description:</label> <br>
            <textarea name="description" id="description" maxlength="100" rows="3" placeholder="enter description" required></textarea> <br>

            <label for="price">Price:</label> <br>
            <input name="price" id="price" type="number" min="0" value="0" required > <br>

            <label for="quantity">Quantity:</label> <br>
            <input name="quantity" id="quantity" type="number" min="1" value="1" required > <br>

            <input type="submit" value="insert">
            <input type="reset" value="reset">

        </fieldset>
    </form>

</body>
</html>
