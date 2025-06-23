import java.util.*;
public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //taking radius as input >>
        int r = sc.nextInt();
        //calculating area of circle
        float area = (3.14f * r * r);

        System.out.println(area);
    }
}
