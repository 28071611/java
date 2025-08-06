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
    void sort(){
        Node current;
        Node index;
        for(current=head;current.next!=null;current=current.next){
        for(index=current.next;index!=null;index=index.next){
            if(current.data>index.data){
                int temp=current.data;
                current.data=index.data;
                index.data=temp;
            }
        }
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
        System.out.print("Before sorting:");
        list.display();
        list.sort();
        System.out.print("After sorting:");
        list.display();
    }
}