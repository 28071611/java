
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        StringBuilder result=new StringBuilder();
        while(num>0){
            num--;
            int remainder=num%26;
            char letter=(char)('A'+remainder);
            result.insert(0,letter);
            num=num/26;
        }
        System.out.print(""+result.toString());
    }
}
