import java.util.*;
public class UniversityFee {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPer = 10;

        double discount = (discountPer / 100.0) * fee;
        double totalFee = fee - discount;

        System.out.println(discount);
        System.out.println(totalFees);
    }
}
