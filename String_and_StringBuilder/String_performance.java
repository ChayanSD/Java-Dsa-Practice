package String_and_StringBuilder;

public class String_performance {
    public static void main(String[] args) {
       // System.out.println((char) ( 'a' + 1));
        //print all the character
        String series = "" ;
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a'+i);
             series = series + ch;

        }
        System.out.println(series);
    }
}
