class SMS
  @endpoint = "http://center.fibosms.com/service.asmx"
  @clientNo = ""
  @clientPass = ""

  def initialize(clientNo, clientPass)
    @clientNo = clientNo
    @clientPass = clientPass
  end

  def send_sms(message)
    return false
  end
end
