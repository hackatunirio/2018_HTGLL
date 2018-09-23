<?php
		
	include ("conectaBD.php");
	
	$link = mysql_connect($host,$usuario,$senha);						

	if(!$link){
		echo mysql_error();											
		die();
	}

	if(!mysql_select_db($banco)){										
		echo mysql_error();
		mysql_close($link);
		die();
	}

	$resposta = mysql_query("select * from usuarios");				

	$linha = mysql_fetch_assoc($resposta);

	$email =$_REQUEST["email"];
	$senha=$_REQUEST["senha"];
	$confirmacao=0;

	$token = sha1("$email$senha");
	
	echo"$token";	

	if($resposta){	

		while($linha){
			print_r($linha);
			if(($linha['email'] == $email)&&($linha['token'] == $token)){
				$confirmacao=1;
				break;
			}
			$linha = mysql_fetch_assoc($resposta);
		}
	
	}

	mysql_close($link);

	session_start();
	echo"<br>$confirmacao";

	if($confirmacao){
		
		$_SESSION["usuario"]=$email;
		header("location:cadastro.php");
	
	}
	else{
		header("location:login.php");

	}
?>
