<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Projeto Loja - Spring MVC e Hibernate</title>
</head>
<body>
	<h1>Projeto Loja com Spring MVC e Hibernate</h1>
	<div>
		<h2>Links de cadastros:</h2>
		<br>
		<form action="/ProjetoLoja/clientes/formCliente">
			<button type="submit">Cadastrar Cliente</button>
		</form>
		<br>
		<form action="/ProjetoLoja/marcas/formMarca">
			<button type="submit">Cadastrar Marca</button>
		</form>
		<br>
		<form action="/ProjetoLoja/funcionarios/formFuncionario">
			<button type="submit">Cadastrar Funcionario</button>
		</form>
		<br>
		<form action="/ProjetoLoja/compras/formCompra">
			<button type="submit">Cadastrar Compra</button>
		</form>
		<br>
		<form action="/ProjetoLoja/produtos/formProduto">
			<button type="submit">Cadastrar Produto</button>
		</form>
		<br>
		<form action="/ProjetoLoja/itens_compras/formItemCompra">
			<button type="submit">Cadastrar Pedidos de Compra</button>
		</form>
	</div>
</body>
</html>