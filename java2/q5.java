package ashita.java2;
class CopyContructer{

    int rollno;
    String name;
    CopyContructer(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    CopyContructer(CopyContructer obj)
    {
        System.out.println("Copy Constructor Invoked");
        rollno = obj.rollno;
        name= obj.name;
    }
}

public class q5 implements Cloneable {
    int rollno;
    String name;

    q5(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String args[]){
        try{
            q5 s1=new q5(101,"ashita");

            q5 s2=(q5) s1.clone();

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

            CopyContructer cp=new CopyContructer(121,"smriti");
            CopyContructer cp2=new CopyContructer(cp);
            System.out.println(cp.rollno+" "+cp.name);
            System.out.println(cp2.rollno+" "+cp2.name);

        }catch(CloneNotSupportedException c){}

    }

}
