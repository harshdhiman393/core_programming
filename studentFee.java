import java.util.Scanner;
public class studentFee{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter fees = ");
	int fee = sc.nextInt();
	System.out.print("Enter Discount Percent = ");
	int discountPercent = sc.nextInt();
	int discount=(fee*discountPercent)/100;
	int finalDiscount=fee-discount;
	System.out.print("The discount amount is INR="+discount+"and final discounted fee is INR"+finalDiscount);
	
    }
}