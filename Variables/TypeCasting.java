public class TypeCasting {
    public static void main(String[] args) {
        //widening casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble);

        //narrowing casting
        double myDouble2 = 9.79d;
        int myInt2 = (int) myDouble2;

        System.out.println(myDouble2);
        System.out.println(myInt2);
    }
}
