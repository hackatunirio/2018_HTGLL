<?php
	
	include ("conectaBD.php");

	$id=$_REQUEST["id"];
	$nome=$_REQUEST["nome"];
	$matricula=$_REQUEST["matricula"];
	$email=$_REQUEST["email"];
	$senha=$_REQUEST["senha"];


	$sql = "update usuarios set nome = '$nome', matricula = '$matricula', email = '$email', senha = '$senha' where id = $id";

	$resposta = mysql_query($sql);
	if($resposta)
	{
        header("location: home.php");
	}
	else
	{
		/* erro ao executar a consulta */
		echo mysql_error();
	}

	/* fecha a conexão */
	mysql_close($link);
?>