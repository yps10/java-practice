public class MaxSearching {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int min=a[0];//for min and for max max=a[0]
        for(int i=1;i<a.length;i++){
            if(min>a[i]){//max>a[i]
                min=a[i];//max=a[i]
            }
        }
        System.out.println("Minm is:"+min);//here we have to solve for min value
    }
}
