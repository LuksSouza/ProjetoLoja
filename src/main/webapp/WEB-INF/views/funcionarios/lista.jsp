<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de FUncionarios Cadastrados</title>
</head>
<body>

	<h1>Lista de Funcionarios</h1>
	<br>
	<h2>${sucesso}</h2>
	<br>
	<table>
		<tr>
			<td>ID</td>
			<td>Nome</td>
			<td>Salário</td>
			<td>CPF</td>
			<td>Data de Nascimento</td>
		</tr>
		
		<c:forEach items="${funcionarios}" var="funcionario">
			<tr>
				<td>${funcionario.id}</td>
				<td>${funcionario.nome}</td>
				<td>${funcionario.salario}</td>
				<td>${funcionario.cpf}</td>
				<td>${funcionario.data_nascimento}</td>				
			</tr>
		</c:forEach>
	</table>
	<br>
	<form action="/ProjetoLoja">
		<button type="submit">Home</button>
	</form>
</body>
</html>