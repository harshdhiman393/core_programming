import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	double base=sc.nextDouble();
	double height=sc.nextDouble();
	double area=0.5*base*height;
	double inch=2.54*6;
	double areaOfTriangleInch=area/inch;
	System.out.print("The Area of the triangle in sq in is"+area+" and sq cm is"+areaOfTriangleInch);
	
	
	}
}
