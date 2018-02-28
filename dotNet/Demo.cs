class Demo
{
  private static string clientNo = "YOUR_CLIENT_NO";
  private static string clientPass = "YOUR_CLIENT_PASS";

  static void Main()
  {
    SMS client = new SMS(clientNo, clientPass);

    boolean res = client.SendSMS("FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.");
    if (res) {
      Console.WriteLine("Success");
    } else {
      Console.WriteLine("Failed");
    }
  }
}
