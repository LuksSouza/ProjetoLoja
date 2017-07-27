<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Import da taglib -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Teste Cadastro tabela Produto:</h1>
	<form action="/ProjetoLoja/cadastrarProduto" method="post">
		<div>
			<label>Nome do Produto:</label> <input type="text"
				name="nome" />
		</div>
		<div>
			<label>Preço:</label> <input type="text" name="preco" />
		</div>
		<div>
			<label>Marca do Produto:</label>
			<!--<c:forEach items="${marcas}" var="marca">
				<input type="hidden" value="${tipoPreco}" />
				<td>${marca.descricao}</td>
			</c:forEach>-->
			<select>
				<c:forEach var="marca" items="${marcas}">
					<option value="${marca}" label="${marca.descricao}"/>
				</c:forEach>
			</select>
		</div>
		<button type="submit">Cadastrar</button>
	</form>
	<br>
	<form action="/ProjetoLoja">
		<button type="submit">Home</button>
	</form>
</body>
</html>