<%@page import="metier.Colis"%>
<%@page import="java.util.Iterator"%>
<%@page import="web.ColisBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insertion des Colis</title>
</head>
<body>
  <%
    ColisBeans colis;
     if(request.getAttribute("modele")!= null){
    	 colis=(ColisBeans) request.getAttribute("modele");
     }
     else{
    	 colis = new ColisBeans();
     }
     
  
  %>
<h1> Ajouter un nouveau Colis</h1>
<form action="colisservlet" method="post">
<table border="1" width="50%">
<tr>
    <td>Id :</td>
    <td><input type ="text" name="id"/></td>
</tr>
<tr>
    <td>Poid :</td>
    <td><input type ="text" name="poid"/></td>
</tr>
<tr>
    <td>Quantite :</td>
    <td><input type ="text" name="quantite"/></td>
</tr>
<tr>
    <td>Type :</td>
    <td><input type ="text" name="type"/></td>
</tr>
<tr>
    <td>Volume :</td>
    <td><input type ="text" name="volume"/></td>
</tr>
<tr>
    <td>Adresse :</td>
    <td><input type ="text" name="addresse"/></td>
</tr>
<tr>
    <td>Adresse Destination :</td>
    <td><input type ="text" name="addresseD"/></td>
</tr>
   <td><input type ="submit" value="valider"/></td>
</tr>
</table>
<table border="1" width="60%">
<tr>
  <th>Id </th>
  <th>Poid </th>
  <th>Quantite </th>
  <th>Type </th>
  <th>Volume </th>
  <th>Adresse </th>
  <th>Adresse Destination </th>
  <th>option </th>
  </tr>
  
  <%
     Iterator<Colis> list = colis.getListe().iterator();
      while(list.hasNext()){
      Colis c = list.next();
   %>
  <tr>
     <td><%=c.getId() %></td>
     <td><%=c.getPoid() %></td>
     <td><%=c.getQuantite() %></td>
     <td><%=c.getType() %></td>
     <td><%=c.getVolume()%></td>
     <td><%=c.getAddresse() %></td>
     <td><%=c.getAdresseD() %></td>
     <td>
      <form action="colisservlet" method="post">
         <input type="hidden" name ="id" value="<%=c.getId() %>"/>
         <input type = "hidden"  name="action" value="suprimer" />
         <input type= "submit" value="suprimer"/>
       </form>
     </td>
      
  </tr>
    <% } %>
</table>
</form>
</body>
</html>