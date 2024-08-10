package bankdemo;

import java.util.Scanner;

public class SBIbank extends Bank {
	
	private double getCalculateintereset(double principleamount,int tenure,double rateOfinterest)
		{   
		
		  
		  double sbiinterest=(principleamount*tenure*rateOfinterest)/100;
			System.out.println("SBI interest is:"+sbiinterest);
		
		 return 0;
		}
		
	
	public void getSBIBankDetails() {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter principleamount:");
		principleamount =sc.nextDouble();
			System.out.println("Enter tenure:");
			  tenure=sc.nextInt();
			System.out.println("enter rateOfinterest:");
			  rateOfinterest=sc.nextDouble();
		
					 System.out.println("SBI bank details are");
			  System.out.println("principleamount is:"+ principleamount);
				System.out.println("tenure is:"+tenure);
				System.out.println("rateOfinterest is:"+ rateOfinterest);
				getCalculateintereset(principleamount,tenure,rateOfinterest);
				
				
				
				
				 

			
			
	}
	
	

}
