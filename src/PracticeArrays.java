public class PracticeArrays {

public static void main(String [] args) {
    double[] myList = {1, 2, 3, 4};
    double temp = myList[1];
    for (int i = 1; i < myList.length; i++) {
        myList[i - 1] = myList[i];
    }
    myList[myList.length - 1] = temp;


    System.out.println(temp);
}}