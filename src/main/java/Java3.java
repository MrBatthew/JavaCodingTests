public class Java3 {


    static int initialNumber = 12345;
    static String turnIntoString(int initialString){

        return Integer.toString(initialString);
    }



    public static void main(String[] args) {

        String numToString = turnIntoString(initialNumber);

        String reverseString = "";
        char ch;
        for(int i = 0; i < numToString.length(); i++) {

            // extracts each character
            ch = numToString.charAt(i);

            // adds each character in
            // front of the existing string
            reverseString = ch + reverseString;
        }
        int final_number = Integer.parseInt(reverseString);
        System.out.println(final_number);
    }
}
