<?php
		
	include ("conectaBD.php");

	$nome=$_REQUEST["nome"];
	$sobrenomes=$_REQUEST["sobrenomes"];
	$senha=$_REQUEST["senha"];
	$csenha=$_REQUEST["csenha"];
	$email=$_REQUEST["email"];
	$matricula=$_REQUEST["matricula"];
	$confirmacao=0;

	if($senha!=$csenha){
		$confirmacao = 1;
		header("location:registro.php");
	}

	$resposta = mysql_query("select * from usuarios where email = '$email'");				


	if($resposta){	
	
		$linha = mysql_fetch_assoc($resposta);
		
		if(!$linha){
				
			$token = sha1("$email$senha");			
			$sql = "insert into usuarios (nome,sobrenomes,token,email,matricula) values ('$nome','$sobrenomes','$token','$email','$matricula')";
			mysql_query($sql);
			header("location:validausuario.php?email=$email&senha=$senha");
			

		}
		else{

			header("location:registro.php?alert=1&nome=$nome&sobrenomes=$sobrenomes&matricula=$matricula");		
	
		}
	
	}
	else{
		echo mysql_error();											/* Erro ao executar a consulta */
	}
	mysql_close($link);
?>

