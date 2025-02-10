<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Registrar Producto</h1>

<form method="post" action="ControladorProducto">
<table align="center" border="2">
<tr>
<td>producto</td>
<td><input type="text" name="producto"></td>
</tr>
<tr>
<td>cantidad</td>
<td><input type="text" name="cantidad"></td>
</tr>
<tr>
<td>precio</td>
<td><input type="text" name="precio"></td>
</tr>
<tr>
<td>nro. de lote</td>
<td><input type="text" name="lote"></td>
</tr>
<tr>
<td>cod. de barras</td>
<td><input type="text" name="codbarras"></td>
</tr>
<tr>
<td>fechaven</td>
<td><input  type="date" name="fechaven"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit"  value="registrar"></td>
</tr>
</table>
</form>
</body>
</html>