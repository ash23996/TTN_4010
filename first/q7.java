class Outer{
    static String firstname;
    static String lastname;
    static int age;
    static {
        firstname="Ashita";
        lastname="Kumar";
        age=23;
    }
    static void statm(){
        System.out.println("first name is:"+firstname);
        System.out.println("last name  is:"+lastname);
        System.out.println("age is:"+age);
    }

}

public class q7 {
    public static void main(String[] args) {
        Outer.statm();
    }
}