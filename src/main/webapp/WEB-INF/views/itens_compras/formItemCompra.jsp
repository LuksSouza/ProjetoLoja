<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Item de Compra</title>
</head>
<body>
	<h1>Teste Cadastro tabela Item_Compra</h1>
	<form action="/ProjetoLoja/cadastrarItemCompra" method="post">
		<div>
			<label>Quantidade:</label> <input type="text" name="quantidade">
		</div>
		<div>
			<label>Preço:</label> <input type="text" name="preco">
		</div>
		<div>
			<label>Produto:</label> <input type="text" name="produto">
		</div>
		<div>
			<label>Compra:</label> <input type="text" name="compra">
		</div>
		<button type="submit">Cadastrar Item de Compra</button>
	</form>
	<br>
	<form action="/ProjetoLoja">
		<button type="submit">Home</button>
	</form>
</body>
</html>