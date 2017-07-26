<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastrar Funcionário</title>
</head>
<body>
	<h1>Teste Cadastro tabela Funcionario</h1>
	<form action="/ProjetoLoja/funcionarios/cadastrarFuncionario" method="post">
		<div>
			<label>Nome:</label> <input type="text" name="nome" />
		</div>
		<div>
			<label>Data de Nascimento:</label> <input type="datetime" name="data_nascimento" />
		</div>
		<div>
			<label>Salario:</label> <input type="decimal" name="salario" />
		</div>
		<div>
			<label>CPF:</label> <input type="text" name="cpf" />
		</div>
		<button type="submit">Cadastrar Funcionario</button>
	</form>
	<br>
	<form action="/ProjetoLoja">
		<button type="submit">Home</button>
	</form>
</body>
</html>