# FIBO SMS Examples

## Java

```java
import vn.fibo.sms.*;

class SMSSender {
  private static String clientNo = "YOUR_CLIENT_NO";
  private static String clientPass = "YOUR_CLIENT_PASS";

  public static void main(String[] args) {
    SMS client = new SMS(clientNo, clientPass);
    boolean result = client.sendSMS('+841234567899', "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.");
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

    boolean res = client.SendSMS("+841234567899", "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.");
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
$res = $sms->sendSMS("+841234567899", "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.");
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
result = client.send_sms("+841234567899", "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.")
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
res = client.send_sms("+841234567899", "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.")
if res
  puts("Success")
else
  puts("Failed"
```

## NodeJS

```js
const SMS = require('./lib/sms');

// Please define clientNo, clientPass
const clientNo = 'YOUR_CLIENT_NO';
const clientPass = 'YOUR_CLIENT_PASS';

const client = new SMS({ clientNo, clientPass });
client
  .sendSMS(
    '+841234567899',
    'FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.',
  )
  .then(res => {
    console.log('Success');
  })
  .catch(err => {
    console.log(err);
  });
```
