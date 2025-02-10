<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Proveedor</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Registrar Proveedor</h1>

<form method="post" action="ControladorProveedor">
<table align="center" border="2">
<tr>
<td>nombre</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>ruc</td>
<td><input type="text" name="ruc"></td>
</tr>
<tr>
<td>razonsocial</td>
<td><input type="text" name="razonsocial"></td>
</tr>
<tr>
<td>email</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>fechaingreso</td>
<td><input  type="date" name="fechaingreso"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit"  value="registrar"></td>
</tr>
</table>
</form>
</body>
</html>