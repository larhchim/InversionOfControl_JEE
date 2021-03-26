<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="Metier.Entity.Produits" %>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>


<% List<Produits> arr = (List<Produits>)request.getAttribute("listeProd"); 
   double var =(double)request.getAttribute("var");
%>

	
<table>
  <tr>
    <th>Numero produit</th>
    <th>Description</th>
    <th>Prix</th>
  </tr>
  <% for(int i=0;i<arr.size();i++){ %>
  <tr>
    <td><%= arr.get(i).getId() %></td>
    <td><%= arr.get(i).getDes() %></td>
    <td><%= ( arr.get(i).getPrix()*var) %> DHS</td>
  </tr>
  <%} %>
  <%
  double somme=0;
  for(int j=0;j<arr.size();j++){
	  somme=somme+( arr.get(j).getPrix()*var);
  }
  %>
  <tr>
  <td></td>
  <td style="color:red;">TOTAL DU PRIX:</td>
  <td style="color:red;" ><%= somme %> DHS</td>
  </tr>
</table>



</body>
</html>