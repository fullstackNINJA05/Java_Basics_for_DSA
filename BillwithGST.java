import java.util.*;
public class BillwithGST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        //calculating total amount of 3 items>>
        float amt = (pen+pencil+eraser);

        //calculating gst>>
        float gst = (18*amt)/100; // 18% GST of total amount

        float totalamt = amt + gst; // adding item amount with gst

        System.out.println(totalamt);

        

    }
}
