class SMS:
  endpoint = "http://center.fibosms.com/service.asmx"
  clientNo = ""
  clientPass = ""

  def __init__(self, clientNo, clientPass):
    self.clientNo = clientNo
    self.clientPass = clientPass

  def send_sms(self, message):
    return False

