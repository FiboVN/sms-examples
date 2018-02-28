<?php
require_once('lib/sms.php');
$clientNo = "YOUR_CLIENT_NO";
$clientPass = "YOUR_CLIENT_PASS";

$sms = new SMS($clientNo, $clientPass);
$res = $sms->sendSMS("+841234567899", "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.");
if ($res) {
  echo "Success";
} else {
  echo "Failed";
}
