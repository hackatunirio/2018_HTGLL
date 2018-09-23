<?php
include ("session.php");
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
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
<script>
	function ativaUpload() 
	{
		document.getElementById("file1").click();
	}
	function escolheuImagem() 
	{
		document.getElementById("form1").submit();
	}
</script>
</head>
<body>
<div id="page" class="container">
	<div id="header">
		<div id="menu">
			<ul>
				<br><br><br><br><br><br><br><br><br>
				<li><a href="cadastro.php" accesskey="1" title="">Cadastro</a></li>				<!-- class="current_page_item"-->
				<li><a href="cadastrarajudante.php" accesskey="2" title="">Cadastrar Ajudante</a></li>
				<li><a href="cadastrardepoimento.php" accesskey="3" title="">Cadastrar Depoimento</a></li>
				<li class="current_page_item"><a href="cadastrarevento.php" accesskey="4" title="">Cadastrar Evento</a></li>
				<li><a href="sair.php" accesskey="6" title="" id="sair">Sair</a></li>
			</ul>
		</div>
	</div>
	<div id="main">	
		<div id="welcome">
			<div class="title"><br><br><br>
		<h1 style="font-size: 80px">Cadastrar Eventos</h1><hr>
		<br>
			</div>
		</div>
		<div id="" style="padding-top: 0px">
			<div style="visibility:hidden;">
<form id="form1" method="post" action="imagem.php" enctype="multipart/form-data">
	<input id="file1" type="file" name="imagem" onchange="escolheuImagem()"/>
</form>
</div>
			<form method="post" action="atualiza informacoes.php" style="text-align: start">
						<pre style="font-family: 'Source Sans Pro', sans-serif;font-style: bold;font-size: 35px;text-align: start;">
<?php $aux = "onclick='ativaUpload();'";
				include ("trocafoto.php");
			?>
<div class="form-control narrow">
<label for="nome">Nome:</label>
<input name="nome" id="nome" type="text" required="" value="" style="padding-bottom:10px;padding-top: 10px;width: 319px"></div><div class="form-control narrow" >
<label for="Sobrenomes">Data:</label>
<input name="sobrenomes" id="data" type="text" required="" value="" style="padding-bottom:10px;padding-top: 10px;width: 319px"></div><div class="form-control narrow">
<label for="resumo">Resumo:</label>
<input name="resumo" id="resumo" type="text" required="" value="" style="resize:none;height:200px ;width:500px;padding-bottom:10px;padding-top: 10px;width: 319px"></div>

<ul><li>
<input value="Salvar" type="submit" style="padding-right: 20px;padding-left: 20px;text-align: center;font-size: 20px;background-color: #999;font-family: 'Source Sans Pro', sans-serif;"></li></ul>
						</pre>
						<input type="hidden" name="id" value="<?=$id?>"></input>
				</form>
	</div>
</div>
<div style="visibility:hidden;">
<form id="form1" method="post" action="imagem.php" enctype="multipart/form-data">
	<input id="file1" type="file" name="imagem" onchange="escolheuImagem()"/>
</form>
</div>

</body>
</html>
