import java.sql.SQLOutput;

public class Employee {
     String name;
     int emp_id;
     Employee(String name,int emp_id){
         this.name=name;
         this.emp_id=emp_id;

     }

    public static void main(String[] args) {
        Employee e1=new Employee("Yogendra",137);
        Employee e2=new Employee("Love babbar",93);
        System.out.println(e1.name +" "+ e1.emp_id);
        System.out.println(e2.name +" "+ e2.emp_id);
    }
}
//constructor main work to initilize the objectt and no return type
