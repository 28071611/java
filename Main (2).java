import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Add: "+(a+b));
                    break;
                case 2:
                    System.out.println("Sub: "+(a-b));
                    break;
                case 3:
                    System.out.println("Mul: "+(a*b));
                    break;
                case 4:
                    System.out.println("Div:"+(a/b));
                    break;
                case 5:
                    return;
                default:
                     System.out.println("Please enter the valid input");
                     break;
                    
        }
    }
}