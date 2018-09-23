<?php
		
	$host = "localhost";
	$usuario = "unirio";
	$senha = "admin";
	$banco = "unirio";
	
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


?>
