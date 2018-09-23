<!DOCTYPE HTML>
<html>
	<head>
		<title>Site Alimentador</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<script type="text/javascript">
			function myfuction(){
				window.location.replace("registro.php");
			}
		</script>
	</head>
	<body style="background-color: #444;">

		<!-- Two -->
			<section id="two" class="wrapper style2 special" style="padding-bottom: 20%;padding-top: 10%;">
				<div class="inner narrow">
					<header>
						<h2>Site Alimentador</h2>
					</header>
					<form class="grid-form" method="post" action="validausuario.php">
						<div class="form-control narrow">
							<center>
								<label for="name">Email</label>
								<input name="email" id="email" type="email">
							</center>
						</div>
						<div class="form-control narrow">
							<center>
								<label for="email">Senha</label>
								<input name="senha" id="senha" type="password">
							</center>
						</div>
						<ul class="actions">
							<center>
								<li style="padding-left: 6%"><input value="ENTRAR" type="submit"></li>
								<li ><input value='REGISTRAR' type="button" onclick='myfuction()'></input></li>    
								<!--  <a href="registro.php"></a>-->
							</center>
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
