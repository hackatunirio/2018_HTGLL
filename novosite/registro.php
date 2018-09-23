<!DOCTYPE HTML>
<html>
	<head>
		<title>UWRanking</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main2.css" />
	</head>
<script >
	
	function myFunction(){
		alert("Email já utilizado!");
	}


</script>
<?php
	if(isset($_REQUEST['alert'])){
		echo "<body style='background-color: #444' onload='myFunction()'>";
		$pais = $_REQUEST['pais'];
		$nome =  $_REQUEST['nome'];
		$sobrenomes = $_REQUEST['sobrenomes'];
		$youtube =  $_REQUEST['youtube'];
	}
	else{
		$pais = "----------";
		$pais = "";
		$nome =  "";
		$sobrenomes = "";
		$youtube =  "";
		echo "<body style='background-color: #444;'>";
	}


?>
		<!-- Two -->
			<section id="two" class="wrapper style2 special" style="padding-bottom: 20%;padding-top: 10%;">
				<div class="inner narrow">
					<header>
						<h2>Registro</h2>
					</header>
					<form method="post" action="registrar.php" style="text-align: start">
						<div class="form-control narrow">
							<label for="nome">Nome</label>
							<input name="nome" id="nome"type="text"required="" value=<?php echo"$nome"; ?>>						
						</div>
						<div class="form-control narrow">
							<label for="Sobrenomes">Sobrenomes</label>
							<input name="sobrenomes" id="sobrenomes" type="text" required="" value=<?php echo"$sobrenomes"; ?>>	
						</div>
						<div class="form-control narrow">
							<label for="Senha">Senha</label>
							<input name="senha" id="senha" type="password" required="" pattern=".{4,}" title="Mais de 4 caracteres">
						</div>
						<div class="form-control narrow">
							<label for="Senha">Confirmação da Senha</label>
							<input name="csenha" id="csenha" type="password" required="">
						</div>
						<div class="form-control narrow">
							<label for="email">Email</label>
							<input name="email" id="email" type="email" required="">
						</div>
						<div class="form-control narrow">
							<label for="matricula">Matrícula</label>
							<input name="matricula" id="" type="text" required="" class="form-control narrow" >
						</div>
						<ul class="actions">
							<center><li><input value="REGISTRAR" type="submit" style="border-left-width: 50%;margin-top: 20%;"></li></center>
						</ul>
					</form>
				</div>
			</section>

			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>

