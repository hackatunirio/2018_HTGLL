<?php
	session_start();
	$usuario=$_SESSION["usuario"];

	if(!$usuario){

		header("location:login.php");
		die();

	}
	include ("conectaBD.php");
?>
