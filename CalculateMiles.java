import java.util.Scanner;
public class calculateMiles{
    public static void main(String [] args){
	    Scanner sc = new Scanner(System.in);
		double kilometer = sc.nextDouble();
		double mile=1.6;
		double distIntoKilometer= kilometer*mile;
		System.out.print("The total miles is" +distIntoKilometer+"mile for the given "+kilometer+"km");
		
    }
}