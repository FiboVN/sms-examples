#!/usr/bin/ruby
require 'lib/sms'

clientNo = "YOUR_CLIENT_NO"
clientPass = "YOUR_CLIENT_PASS"

client = SMS.new(clientNo, clientPass)
res = client.send_sms("FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.")
if res
  puts("Success")
else
  puts("Failed")
