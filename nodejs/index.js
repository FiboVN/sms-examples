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
