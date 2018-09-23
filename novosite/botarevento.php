<?php
	
	include ("conectaBD.php");

	$id=$_REQUEST["id"];
	$nome=$_REQUEST["nome"];
	$data=$_REQUEST["data"];
	$resumo=$_REQUEST["resumo"];
	
	$sql = "update eventos set nome = '$nome', data = '$data', resumo = '$resumo', where id = $id";

	$resposta = mysql_query($sql);
	if($resposta)
	{
        header("location: cadastro.php");
	}
	else
	{
		/* erro ao executar a consulta */
		echo mysql_error();
	}

	/* fecha a conexão */
	mysql_close($link);
?>