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
