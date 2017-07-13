<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Compra</title>
</head>
<body>
	<h1>Teste Cadastro tabela Compra:</h1>
	<form action="/ProjetoLoja/cadastrarCompra" method="post">
		<div>
			<label>Valor Total:</label> <input type="text" name="valor_total" />
		</div>
		<div>
			<label>Data e Hora:</label> <input type="text" name="data_hora" />
		</div>
		<div>
			<label>Cliente:</label> <input type="text" name="clinte" />
		</div>
		<div>
			<label>Funcionario:</label> <input type="text" name="funcionario" />
		</div>
		<button type="submit">Cadastrar</button>
	</form>
	<br>
	<form action="/ProjetoLoja">
		<button type="submit">Home</button>
	</form>
</body>
</html>