<?php
// PHP tanpa fungsi
//$a=9;
//$b=3;

//$kali=$a*$b;

//echo "hasil perkalian 9x3 adalah ", $kali.PHP_EOL;

?>

<?php
// PHP tanpa fungsi
$a=9;
$b=2;

$pangkat=$a**$b;
$modulus=$a%$b;
$samadengan=(boolval($a == $b)? 'true':'false');
$lebih=(boolval($a > $b)? 'true':'false');
$kecil=(boolval($a < $b)? 'true':'false');
$tidaksama=(boolval($a != $b)? 'true':'false');

echo "Nilai A adalah $a\n";
echo "Nilai B adalah $b\n";
echo "A Pangkat B adalah $pangkat\n";
echo "A Modulus B adalah $modulus\n";
echo "A Sama dengan B adalah $samadengan\n";
echo "A Lebih besar dari B adalah $lebih\n";
echo "A Lebih kecil dari B adalah $kecil\n";
echo "A Tidak sama dengan B adalah $tidaksama\n";
?>

