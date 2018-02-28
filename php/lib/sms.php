<?php 
class SMS { 
    private $endpoint = 'http://center.fibosms.com/service.asmx'; 
    private $clientNo = '';
    private $clientPass = '';
    
    
    function __construct($clientNo, $clientPass) {
      $this->clientNo = $clientNo;
      $this->clientPass = $clientPass;
    }

    function sendSMS($msg) {
      return false;
    }
} 
