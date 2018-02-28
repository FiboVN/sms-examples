# FIBO SMS Examples

## Java

```java
import vn.fibo.sms.*;

class SMSSender {
  private static String clientNo = "YOUR_CLIENT_NO";
  private static String clientPass = "YOUR_CLIENT_PASS";

  public static void main(String[] args) {
    SMS client = new SMS(clientNo, clientPass);
    Message msg = new Message(
        "TESTER",
        "+841234567899",
        "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.", 
        "U8h1d9K"
      );
    boolean result = client.sendSMS(msg);
    if (result) {
      System.out.println("Success");
    } else {
      System.out.println("Failed");
    }
  }
}
```

## .Net (CSharp)

```csharp
class Demo
{
  private static string clientNo = "YOUR_CLIENT_NO";
  private static string clientPass = "YOUR_CLIENT_PASS";

  static void Main()
  {
    SMS client = new SMS(clientNo, clientPass);
    Message msg = new Message(
        "TESTER",
        "+841234567899",
        "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.", 
        "U8h1d9K"
      );

    boolean res = client.SendSMS(msg);
    if (res) {
      Console.WriteLine("Success");
    } else {
      Console.WriteLine("Failed");
    }
  }
}

```

## PHP

```php
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

```

## Python

```python
from lib.sms import SMS

clientNo = "YOUR_CLIENT_NO"
clientPass = "YOUR_CLIENT_PASS"

client = new SMS(clientNo, clientPass);
result = client.send_sms({
    "senderName": "TESTER",
    "phoneNumber": "+841234567899",
    "smsMessage": "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.",
    "smsGUID": "U8h1d9K",
  })
if result:
  print("Success")
else:
  print("Failed")
```

## Ruby

```ruby
require 'lib/sms'

clientNo = "YOUR_CLIENT_NO"
clientPass = "YOUR_CLIENT_PASS"

client = SMS.new(clientNo, clientPass)
res = client.send_sms({
  :senderName => 'TESTER',
  :phoneNumber => '+841234567899',
  :smsMessage => 'FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.',
  :smsGUID => 'U8h1d9K',
})
if res
  puts("Success")
else
  puts("Failed")
```

## NodeJS

```js
const SMS = require('./lib/sms');

// Please define clientNo, clientPass
const clientNo = 'YOUR_CLIENT_NO';
const clientPass = 'YOUR_CLIENT_PASS';

const client = new SMS({ clientNo, clientPass });
client
  .sendSMS({
    senderName: 'TESTER',
    phoneNumber: '+841234567899',
    smsMessage: 'FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.',
    smsGUID: 'U8h1d9K',
  })
  .then(res => {
    console.log('Success');
  })
  .catch(err => {
    console.log(err);
  });
```
