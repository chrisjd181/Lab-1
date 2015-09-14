package MainPackage;

import org.apache.poi.ss.formula.functions.FinanceLib;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args){
		
		Scanner in = new Scanner(System.in);
		
		//Given variables from walk through. 
		double r;
		double n;
		double y;
		double p;
		double f;
		
		//Variables to hold data entered by user.
		double an;
		double years; //Years retired
		double yearsw; //Years worked
		double income;
		double SSI;
		boolean t;
		
		//Gather user input.
		System.out.println("Enter number of years you expect to be retired: ");
		years = in.nextDouble();
		
		System.out.println("Enter the expected annual return on investment (percentage): ");
		an = in.nextDouble();
		
		System.out.println("Enter required income: ");
		income =in.nextDouble();
		
		System.out.println("Enter expected monthly Social Security Income (SSI): ");
		SSI=in.nextDouble();
		
		//Calculate Present Value
		double PV;
		r = (an/12);
		n = years*12;
		y = income-SSI;
		f = 0;
		t = false;
		
		PV=FinanceLib.pv(r, n, y, f, t);
		
		//Output Present Value
		System.out.println("Your PV is: ");
		System.out.println(PV);
		
		//Gather info and calculate payment.
		double PMT;
		System.out.println("Enter the expected annual return on investment (percentage): ");
		an = in.nextDouble();
		
		System.out.println("Enter how long you expect to work: ");
		yearsw = in.nextDouble();
		
		r = (an / 12);
		n = yearsw * 12;
		p = 0;
		f = PV;
		t = false;
		
		PMT=FinanceLib.pmt(r, n, p, f, t);
		
		//Output payment.
		System.out.println("Your PMT is: ");
		System.out.println(PMT);

	}
}