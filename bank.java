package bankdemo;

public class Maintest {

	public static void main(String[] args) {
		
		SBIbank s=new SBIbank();
		s.getSBIBankDetails();
		HDFCBank h=new HDFCBank();
		h.getHDFCBankDetails();
		ICICI i=new ICICI();
		i.getICICBankDetails();
		
	}

}
