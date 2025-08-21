import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double num1 = sc.nextDouble();
	double num2 = sc.nextDouble();
	double add = num1+num2;
	double sub = num1-num2;
	double div = num1/num2;
	double mult = num1*num2;
	System.out.print("The addition, subtraction, multiplication and division value of 2 numbers"+num1+"and"+num2+","+add+","+sub+","+div+"and"+mult);
	}
}
