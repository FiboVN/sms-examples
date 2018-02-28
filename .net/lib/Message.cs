public class Message {
  public string SenderName { get; set; }
  public string PhoneNumber { get; set; }
  public string SmsMessage { get; set; }
  public string SmsGUID { get; set; }

  public ClassName(string _SenderName, string _PhoneNumber, string _SmsMessage, string _SmsGUID)
  {
    SenderName = _SenderName;
    PhoneNumber = _PhoneNumber;
    SmsMessage = _SmsMessage;
    SmsGUID = _SmsGUID;
  }
}
