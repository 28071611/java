import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the value of elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value to find:");
        int value=sc.nextInt();
        int i,count=0;
        for(i=0;i<n;i++){
            if(arr[i]==value){
                count++;
                break;
            }
        }
        if(count==1){
            System.out.printf("The element found in the index %d",i);
        }else{
        System.out.printf("It is not found in the list");
       }
}
}