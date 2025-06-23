public class TypeExpression {
    public static void main(String[] args) {
        /*1st Rule:
            byte, short, char will convert in integer in expression >>
        */
        byte bt = 10;
        short sh = 5;
        char ch = 'd';
        int sum = bt+sh+ch;
        System.out.println(sum);

        /* Rule 2:
            if one variable in long, float, double then whole expression will convert in long, float, double respectively
        */
        float f = 10.78f;
        long l = 100;
        double d = 10.99;
        double sum2 = f+l+d;
        System.out.println(sum2);
    }
}
