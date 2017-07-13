<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Funcionário</title>
</head>
<body>
	<h1>Teste Cadastro tabela Funcionario</h1>
	<form action="/ProjetoLoja/cadastrarFuncionario" method="post">
		<div>
			<label>Nome:</label> <input type="text" name="nome">
		</div>
		<div>
			<label>Data de Nascimento:</label> <input type="text" name="data_nascimento">
		</div>
		<div>
			<label>Salario:</label> <input type="text" name="salario">
		</div>
		<div>
			<label>CPF:</label> <input type="text" name="cpf">
		</div>
		<button type="submit">Cadastrar Funcionario</button>
	</form>
	<br>
	<form action="/ProjetoLoja">
		<button type="submit">Home</button>
	</form>
</body>
</html>