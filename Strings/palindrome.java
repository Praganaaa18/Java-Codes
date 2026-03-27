public class palindrome {
    public static void main(String[] args) {
        String str = "stats";
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println(str + "is a palindrome");
        }else{
            System.out.println(str + "is not a palindrome");
        }
    }
}
