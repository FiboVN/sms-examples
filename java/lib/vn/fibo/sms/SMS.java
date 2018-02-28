package vn.fibo.sms;

import java.util.Map;

import javax.xml.soap.*;

public class SMS {
  private String endpoint;
  private String clientNo;
  private String clientPass;
  private int serviceType;
  private Object client;

  public SMS(String endpoint, String clientNo, String clientPass, int serviceType) {
    this.endpoint = endpoint;
    this.clientNo = clientNo;
    this.clientPass = clientPass;
    this.serviceType = serviceType;
    this.client = null;
  }

  public SMS(String clientNo, String clientPass) {
    this.endpoint = "http://center.fibosms.com/service.asmx";
    this.clientNo = clientNo;
    this.clientPass = clientPass;
    this.serviceType = 1;
    this.client = null;
  }

  public boolean sendSMS(String message) {
    SOAPMessage response = this.callSoapWebService(this.toUri(), "SendMaskedSMS");
    // get the body
    SOAPBody soapBody = response.getSOAPBody();
    // find your node based on tag name
    NodeList nodes = soapBody.getElementsByTagName("Message");
    String result = null;
    Node node = nodes.item(0);
    result = node != null ? node.getTextContent() : "";
    return result == "Sending...";
  }

  private void createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException {
    SOAPPart soapPart = soapMessage.getSOAPPart();

    String myNamespace = this.endpoint + "?wsdl";
    String myNamespaceURI = "http://www.webserviceX.NET/";

    // SOAP Envelope
    SOAPEnvelope envelope = soapPart.getEnvelope();
    envelope.addNamespaceDeclaration(myNamespace, myNamespaceURI);
  }

  private SOAPMessage callSoapWebService(String soapEndpointUrl, String soapAction) {
    SOAPConnection soapConnection;
    try {
      // Create SOAP Connection
      SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
      soapConnection = soapConnectionFactory.createConnection();

      // Send SOAP Message to SOAP Server
      SOAPMessage soapResponse = soapConnection.call(createSOAPRequest(soapAction), soapEndpointUrl);

      return soapResponse;
    } catch (Exception e) {
      System.err.println(
          "\nError occurred while sending SOAP Request to Server!\nMake sure you have the correct endpoint URL and SOAPAction!\n");
      e.printStackTrace();
    } finally {
      if (soapConnection) {
        soapConnection.close();
      }
    }
  }

  private SOAPMessage createSOAPRequest(String soapAction) throws Exception {
    MessageFactory messageFactory = MessageFactory.newInstance();
    SOAPMessage soapMessage = messageFactory.createMessage();

    createSoapEnvelope(soapMessage);

    MimeHeaders headers = soapMessage.getMimeHeaders();
    headers.addHeader("SOAPAction", soapAction);

    soapMessage.saveChanges();

    /* Print the request message, just for debugging purposes */
    System.out.println("Request SOAP Message:");
    soapMessage.writeTo(System.out);
    System.out.println("\n");

    return soapMessage;
  }

  private String toUri(String service, String query) {
    return String.format("%s/%s?%s", this.endpoint, service, query);
  }

  private String buildQuery(Map<String, String> params) {
    return params.entrySet().stream().map(p -> p.getKey() + "=" + p.getValue()).reduce((p1, p2) -> p1 + "&" + p2)
        .map(s -> "?" + s).orElse("");
  }
}
