<?php
		
	include ("conectaBD.php");
	include ("session.php");

	$nome=$_REQUEST["nome"];
	$curso=$_REQUEST["curso"];
	$data=$_REQUEST["data"];
	$texto=$_REQUEST["texto"];



	$idpessoa = $_SESSION['usuario'];
	$resposta=mysql_query("select * from usuarios where email = '$idpessoa'");
	$linha= mysql_fetch_assoc($resposta);
	$id_user = $linha['id'];

	$sql = "insert into depoimento (nome,curso,data,texto) values ('$nome','$curso','$data','$texto')";
	
	
	$resposta = mysql_query($sql);

	header("location:cadastro.php");
			
?>