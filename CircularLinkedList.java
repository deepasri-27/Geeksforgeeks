package LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    public CLL(){
       this.head=null;
       this.tail=null;   
     }
     public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
     }

     //delete
     public void delete(int val){
        Node node=head;
        if(node==null){
            return;

        }
        //when the deleting element is head element
        if(node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.val==val){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);
     }

     //display function
     public void display(){
        Node node=head;
        if(head!=null){
            do{
                System.out.print(node.val+"->");
                node=node.next;
            }while(node!=head);//while displaying in circular linked list check start from head and the head is pointed next time then stop displaying
                               // can also be done for tail  with the condition while(node!=tail);

        }
        System.out.println("Head");
     }
    private class Node{
        int val;
        Node next;
      //constructor
        public Node(int val){
            this.val=val;
        }
        // public Node(int val,Node next){
        //     this.val=val;
        //     this.next=next;
        // }
    }
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);   
        list.delete(19); 
        list.display();//after printing these items they print in circular manner
    }
}
