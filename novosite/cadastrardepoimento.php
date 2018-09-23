<?php
include ("session.php");
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<!--<html xmlns="https://cdnjs.cloudfare.com/ajax/libs/jquery.mask/1.14.10/jquery.mask.min.js">-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Site Alimentador</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />
<style>a:hover#sair{
			color: white;
		}
</style>
</head>

<div id="page" class="container">
	<div id="header">
		<div id="menu">
			<ul>
				<br><br><br><br><br><br><br><br><br>
				<li><a href="cadastro.php" accesskey="1" title="">Cadastro</a></li>				<!-- class="current_page_item"-->
				<li><a href="cadastrarajudante.php" accesskey="2" title="">Cadastra Ajudante</a></li>
				<li class="current_page_item"><a href="cadastrardepoimento.php" accesskey="3" title="">Cadastrar Depoimento</a></li>
				<li><a href="cadastrarevento.php" accesskey="4" title="">Cadastrar Evento</a></li>
				<li><a href="sair.php" accesskey="5" title="" id="sair">Sair</a></li>
			</ul>
		</div>
	</div>
	<div id="main">
		<div id="welcome">
			<div class="title"><br><br><br>
				<h1 style="font-size: 80px">Cadastrar Depoimento</h1><hr>
			</div>
		</div>
		<div style="float: left;">
		<form id="contact_form" action="mensagem.php" method="POST" enctype="multipart/form-data">
			<div class="row">
				<label for="nome" style="font-size: 30px;">Nome:</label><br />
				<input id="nome" class="input" name="nome" type="text" value=""  style="height:25px ;width:500px;"/><br />
			</div>
			<div class="row">
				<label for="curso" style="font-size: 30px;">Curso:</label><br />
				<input id="curso" class="input" name="assunto" type="text" value=""  style="height:25px ;width:500px;"/><br />
			</div>
			<div class="row">
				<label for="data" style="font-size: 30px;">Assunto:</label><br />
				<input id="data" class="input" name="data" type="text" value=""  style="height:25px ;width:500px;"/><br />
			</div>
			<div class="row">
				<label for="texto" style="font-size: 30px;">Mensagem:</label><br />
				<textarea id="texto" class="input" name="texto" style="resize:none;height:200px ;width:500px;"></textarea><br/>
			</div>
			<br>			
			<input id="submit_button" type="submit" value="ENVIAR" style="height:50px ;width:100px;background-color: #999;font-style: bold;" />
		</form>	
	</div>
	</div>
</div>
</body>
</html>
