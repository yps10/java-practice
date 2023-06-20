public class Count {
    public static void main(String[] args) {
        int num=0003456;
        int count=0;
        while(num!=0){
            num=num/10;
            count++;// Note->"here four iteration and count increase the value one by one"
        }
        System.out.println("number of digit-"+count);
    }
}
