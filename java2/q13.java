package ashita.java2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AgeNotFoundException extends Exception {

    public AgeNotFoundException(String message) {
        super(message);
    }
}
public class q13
{
    public static void main(String[] args) throws IOException, AgeNotFoundException {
        System.out.println("Enter the age");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int age=Integer.parseInt(br.readLine());
        if(age>18)
            System.out.println("You are adult");
        else{
            throw new AgeNotFoundException("You are not adult");
        }
    }
}