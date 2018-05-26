<?php 
class SMS { 
    private $endpoint = 'http://center.fibosms.com/service.asmx?wsdl'; 
    private $clientNo = '';
    private $clientPass = '';
    private $soapclient = NULL;
    
    function __construct($clientNo, $clientPass) {
      $this->clientNo = $clientNo;
      $this->clientPass = $clientPass;
      $this->soapclient = new SoapClient($this->endpoint);
    }

    function sendSMS($msg) {
      $params = array(
        'clientNo' => $this->clientNo,
        'clientPass' => $this->clientPass,
        'senderName' => $msg['senderName'],
        'phoneNumber' => $msg['phoneNumber'],
        'smsMessage' => $msg['smsMessage'],
        'smsGUID' => $msg['smsGUID'],
        'serviceType' => 0
      );
      print_r($params);
      return $this->soapclient->SendMaskedSMS($params);;
    }
} 
