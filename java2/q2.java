public class q2 {
    public static void main(String[] args) {
        String str="Ashita";
        char ch[]=str.toCharArray();
        char temp;
        for(int character=0;character<str.length();character++){
            for(int nxt=0;nxt<str.length();nxt++){
                if(ch[character]<ch[nxt]){
                    temp=ch[character];
                    ch[character]=ch[nxt];
                    ch[nxt]=temp;
                }
            }
        }

        String sortarr=String.valueOf(ch);
        System.out.println(sortarr);
    }

}