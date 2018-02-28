import vn.fibo.sms.*;

class SMSSender {
  private static String clientNo = "YOUR_CLIENT_NO";
  private static String clientPass = "YOUR_CLIENT_PASS";

  public static void main(String[] args) {
    SMS client = new SMS(clientNo, clientPass);
    boolean result = client.sendSMS("FIBO xin chao quy khach, chuc quy khach nam moi an khang thinh vuong.");
    if (result) {
      System.out.println("Success");
    } else {
      System.out.println("Failed");
    }
  }
}
