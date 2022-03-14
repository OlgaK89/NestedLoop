import java.util.Locale;

public class test {
    public static void main(String[] args) {
        System.out.println(reverseWordOrder("Hello World")); // "World Hello"
        System.out.println(reverseWordOrder("Java is fun"));  // "fun is Java"
        System.out.println(reverseWordOrder("Hi How Are You")); // "You Are How Hi"
        System.out.println(reverseWordOrder("talk is cheap. show me the code")); // "code the me show cheap. is talk"





    }
        public static String reverseWordOrder(String str) {

           String [] str1 = str.split(" ");
           String reversedStr = "";
           for(int i = str1.length-1; i >= 0; i--){
               reversedStr = reversedStr + str1[i] + " ";


        }
            return reversedStr;

    }
}

