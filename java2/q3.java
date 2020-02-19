package ashita.java2;

class exist{
    void m(){
        System.out.println("hii");
    }
}
class q3 {
    public static void main(String args[]) {
        try
        {
            Class.forName("ClassDoesnotExist");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        exist obj=new exist();
    }

}