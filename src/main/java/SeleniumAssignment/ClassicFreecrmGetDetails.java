package SeleniumAssignment;

public class ClassicFreecrmGetDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get Companyvalue Xpath
		(//td/a[text()='Ali khan']/parent::td)[1]/following-sibling::td/a[@context='company']
				
		//GetPhoneValue XPath
				((//td/a[text()='Abel Kainan']/parent::td)[1]/following-sibling::td/span[@context='phone'])[1]
				
		//Get HomephoneXPath
						((//td/a[text()='Abel Kainan']/parent::td)[1]/following-sibling::td/span[@context='phone'])[2]
				
		//Get Mobilevalue XPath
								
								
								<td align="left" valign="top" class="datalistrow" style="cursor:pointer;" onclick="javascript:void(quickFill(this,'52964404','mobile','contact_id','contacts'));"> &nbsp;</td>
								
								//td[@onclick='javascript:void(quickFill(this,'52964404','mobile','contact_id','contacts'));']
								
								This xpath is not working:
									
									<span style="cursor:pointer;" onmouseover="getPhoneToolTip(this, 'Right click to call 76589234')" context="phone" _number="76589234" _hasvoice="N" _hasvon="N" _cid="52898679">76589234</span>
	}

}
