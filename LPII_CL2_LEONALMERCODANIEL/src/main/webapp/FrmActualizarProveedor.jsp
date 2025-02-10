<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Proveedor</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">
Actualizar Proveedor...
</h1>
<form method="post" action="ControladorProveedor">
<table align="center" border="2">
<!-- recuperamos los valores que vienen del controlador   -->
<%
String codigo=request.getAttribute("codigo").toString();
String nombre=(request.getAttribute("nombre")!=null)?request.getAttribute("nombre").toString():"";
String ruc=(request.getAttribute("ruc")!=null)?request.getAttribute("ruc").toString():"";
String razonsocial=(request.getAttribute("razonsocial")!=null)?request.getAttribute("razonsocial").toString():"";
String email=(request.getAttribute("email")!=null)?request.getAttribute("email").toString():"";
String fechaingreso=(request.getAttribute("fechaingreso")!=null)?request.getAttribute("fechaingreso").toString():"";
%>
<input  type="hidden" name="codigo"  value="<%=codigo%>">
<tr>
<td>nombre</td>
<td><input type="text" name="nombre"  value="<%=nombre%>"></td>
</tr>
<tr>
<td>ruc</td>
<td><input type="text" name="ruc"    value="<%=ruc%>"></td>
</tr>
<tr>
<td>razonsocial</td>
<td><input type="text" name="razonsocial"  value="<%=razonsocial%>"></td>
</tr>
<tr>
<td>email</td>
<td><input type="text" name="email"  value="<%=email%>"></td>
</tr>
<tr>
<td>fechaingreso</td>
<td><input  type="date" name="fechaingreso" value="<%=fechaingreso %>"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit"  value="actualizar"></td>
</tr>
</table>
</form>



</body>
</html>