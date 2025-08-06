import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class singly{
    Node head=null;
    void insert(int data){
        Node n=new Node(data);
        if(head==null){
            head=n;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    void search(int key){
        Node temp=head;
        int position=1;
        boolean found=false;
        while(temp!=null){
            if(temp.data==key){
                System.out.print("It is found at the position "+position);
                found=true;
                break;
            }
            temp=temp.next;
            position++;
        }
        if(!found){
            System.out.print("It is not found in the list");
        }
    }
}
    public class Main{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            singly list=new singly();
            System.out.print("Enter the node:");
            int k=sc.nextInt();
            for(int i=1;i<=k;i++){
                int data=sc.nextInt();
                list.insert(data);
            }
            list.display();
            System.out.print("Enter the value to be search:");
            int key=sc.nextInt();
            list.search(key);
        }
    }