public class StringReverse2 {
        public static void main(String args[]){
            String name="Yogendra";
            StringBuilder reverseString=new StringBuilder(name); // Declaring a StringBuilder and converting string to StringBuilder
            reverseString.reverse();//Reversing the StringBuilder
            String result=reverseString.toString();//Converting StringBuilder to String
            System.out.println(result);
        }
    }

