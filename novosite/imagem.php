<?php


$nomeTemp = $_FILES["imagem"]["tmp_name"];
$nomeReal = $_FILES["imagem"]["name"];
$tamanho = $_FILES["imagem"]["size"];
$formato = $_FILES["imagem"]["type"];

//print_r($_FILES);
//die();

$imagemEnviada = imagecreatefromjpeg($nomeTemp);
list($w, $h) = getimagesize($nomeTemp);

if ($w > $h) {
	$wi = 0.8 * $h;
}
else {
	$wi = 0.8 * $w;
}

$xi = ($w - $wi) / 2;
$yi = ($h - $wi) / 2;

$wf = 700;
$destino = imagecreatetruecolor($wf, $wf);

imagecopyresized($destino, $imagemEnviada, 0, 0, $xi, $yi, $wf, $wf, $wi, $wi);

$salva = sha1("$nomeTemp");

imagejpeg($destino, "./images/min-$salva.jpg");
imagejpeg($imagemEnviada, "./images/$salva.jpg");

imagedestroy($destino);
imagedestroy($imagemEnviada);

include("conectaBD.php");
include("session.php");

$resposta = mysql_query("select * from usuarios where email = '{$_SESSION['usuario']}'");
$resp = mysql_fetch_assoc($resposta);

$resposta2 = mysql_query("select * from imagem where idpessoa = '{$resp['id']}'");
$resp2 = mysql_fetch_assoc($resposta2);

if ($resp2) {
	$resposta3 = mysql_query("delete from imagem where id = '{$resp2['id']}'");
}

$sql = "insert into imagem (tamanho, tmp_name, nomeReal, formato,idpessoa) values ('$tamanho','$salva','$nomeReal','$formato','{$resp['id']}')";

$resposta = mysql_query($sql);
header("location: home.php");
?>











