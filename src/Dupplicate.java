public class Dupplicate {
    public static void main(String[] args) {
        String str="aabcc";
        char[] carry=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(carry[i]==carry[j]){
                    System.out.print(carry[j]+" ");
                    break;
                }
            }
        }
    }
}
