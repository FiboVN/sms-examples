<?php
require_once('lib/sms.php');
$clientNo = "YOUR_CLIENT_NO";
$clientPass = "YOUR_CLIENT_PASS";

$sms = new SMS($clientNo, $clientPass);
$res = $sms->sendSMS([
  "senderName" => "TESTER",
  "phoneNumber" => "+841234567899",
  "smsMessage" => "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.",
  "smsGUID" => "U8h1d9K"
]);
if ($res) {
  echo "Success";
} else {
  echo "Failed";
}
