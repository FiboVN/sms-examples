#!/usr/bin/ruby
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
