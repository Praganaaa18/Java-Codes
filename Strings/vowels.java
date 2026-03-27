public class vowels {
    String str = "Pragana";
    int count = 0;
    for(char c: str.toLowerCase().toCharArray()){
        if ("aeiou".indexOf(c) != -1){
            count++;
        }
    }
    System.out.println("Vowels:" + count);
}
