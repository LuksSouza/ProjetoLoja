<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Marca</title>
</head>
<body>
	<h1>Teste Cadastro tabela Marca</h1>
	<form action="/ProjetoLoja/cadastrarMarca" method="post">
		<div>
			<label>Nome da Marca:</label> <input type="text" name="marca">
		</div>
		<button type="submit">Cadastrar Marca</button>
	</form>
	<br>
	<form action="/ProjetoLoja">
		<button type="submit">Home</button>
	</form>
</body>
</html>