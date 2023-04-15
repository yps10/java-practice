/*
public class Test {
   int i
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.i);
    }
*/

/*
no argument constructor
public class Test {
    Test(){
        System.out.println("Namste bhart");
    }
    public static void main(String[] args) {
Test t=new Test();
    }
}
*/
// parametrize constructor
public class Test {
    Test(int a){
        System.out.println("hello ji kaise ho");
    }
    public static void main(String[] args) {
        Test t=new Test(10);

    }
}


