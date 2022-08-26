import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class codewars {
    public static void main(String[] args) {
//     System.out.println(decode("100111111000111001000010000111111000000111001111000111110110111000010111"));
       System.out.println(whoLikesIt("Max", "John"));
    }

//        public static String accum(String s) {
//            // your code
//            s.toLowerCase();
//            StringBuilder accum = new StringBuilder();
//            for (int i = 0; i < s.length(); i++) {
//                char input = s.charAt(i);
//                accum.append(Character.toUpperCase(input));
//                for(int j = 0; j < s.length(); j++) {
//
//                }
//                accum.append((input.repeat(i - 1) + "-");
//            }
//            String p = accum.setLength(accum.length() - 1).toString();
//            return p;
//        }

//        static List<String> binary = new ArrayList<String>();
//
//        public String encode(String text) {
//
//            return "bits";
//        }
//        List<Integer> li = new ArrayList<int>();
//        public static String decode(String bits) {
//            //group every 3 characters
//            binary = Arrays.asList(bits.split( 3));
//
//            //keep the higher char count for every 3 char
//
//            //convert to bytes
//
//            //convert to ascii values
//
//            //translate to characters
//            return binary.toString();
//        }

    public static String whoLikesIt(String... names) {
        //Do your magic here
        List<String> allNames = new ArrayList<>(Arrays.asList(names));
        int size = allNames.size();
        String result = "";
        switch(size) {
            case 0:
                result = "no one likes this";
                break;

            case 1:
                result = allNames.get(0) + " likes this";
                break;

            case 2:
                result = String.format("%s and %s like this", allNames.get(0),allNames.get(1));
                break;

            case 3:
                result = String.format("%s, %s and %s like this", allNames.get(0),allNames.get(1),allNames.get(2));
                break;

            default:
                result = String.format("%s, %s and %d others like this", allNames.get(0), allNames.get(1), (size -2));
                break;
        }
        return result;

    }
}
