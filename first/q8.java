public class q8 {
    public static void main(String[] args) {
        String s="ashitakumar";
        System.out.println("original string:"+s);
        StringBuffer sb=new StringBuffer(s);


        System.out.println("after reverse and delete index from 4 to 9");
        System.out.println(sb.reverse().delete(4,9));



    }
}