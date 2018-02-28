#!/usr/bin/python

from lib.sms import SMS

clientNo = "YOUR_CLIENT_NO"
clientPass = "YOUR_CLIENT_PASS"

client = new SMS(clientNo, clientPass);
result = client.send_sms("+841234567899", "FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.")
if result:
  print("Success")
else:
  print("Failed")
