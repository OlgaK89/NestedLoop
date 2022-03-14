public class StringBuilder {
    public static void main(String[] args) {


        //VARIABLES:
        String firstName = "John";
        String lastName = "Black";
        int batchNo = 122345;

        System.out.println(generateStudentID());
    }

    public static String generateStudentID() {

         String firstName = "";
         String lastName = "";

        int n = lastName.length();
        char fN = firstName.charAt(0);
        char LN = lastName.charAt(n - 1);

        int randomNum = 100 + (int) (Math.random() * 900);

        StringBuilder ID = new StringBuilder();

        return ID.append(n + fN + LN + batchNo + randomNum).toString();

    }
}