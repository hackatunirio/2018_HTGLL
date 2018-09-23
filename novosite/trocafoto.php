<?php
		
	include ("conectaBD.php");

	$email=$_SESSION["usuario"];

	$resp = mysql_query("select * from usuarios where email = '$email'");
	$resp3 = mysql_fetch_assoc($resp);
	$resp2 = mysql_query("select * from imagem where idpessoa = '{$resp3['id']}'");
	$resp4 = mysql_fetch_assoc($resp2);

	$nomeimg = "profile.png";
	if($resp4){
		$nomeimg = "min-{$resp4['tmp_name']}.jpg";
	}
	echo "<img src='./images/$nomeimg' alt='imagems' style='height:200px ;width:200px;' $aux/>";
			
?>