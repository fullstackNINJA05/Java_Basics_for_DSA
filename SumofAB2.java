import java.util.*;
public class SumofAB2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        //taking input of a and b 
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum of "+ a +" and "+ b +" is : "+sum);

        //Product of a and b
        int d = a * b;
        System.out.println("Product of "+a+" and "+ b+ " is "+d);
    }
}
