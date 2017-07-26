<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Marcas Cadastradas</title>
</head>
<body>

	<h1>Lista de Marcas</h1>
	<br>
	<h2>${sucesso}</h2>
	<br>
	<table>
		<tr>
			<td>ID</td>
			<td>Descrição</td>
		</tr>
		
		<c:forEach items="${marcas}" var="marca">
			<tr>
				<td>${marca.id}</td>
				<td>${marca.descricao}</td>				
			</tr>
		</c:forEach>
	</table>
	<br>
	<form action="/ProjetoLoja">
		<button type="submit">Home</button>
	</form>
</body>
</html>