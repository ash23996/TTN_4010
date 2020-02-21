package ashita.collections;

import java.util.HashSet;

public class Que2 {
    static void countCharacter(String str)
    {
        char charArray[] = str.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for(int i =0;i<charArray.length; i++)
        {
            hashSet.add(charArray[i]);
        }
        System.out.println("number of unique characters in Ashita Kumar : "+hashSet.size());
    }
    public static void main(String[] args) {
        String myString = "Ashita Kumar";
        countCharacter(myString);

    }
}
