package DoublyLinkedList;

public class DLL {
    private Node head;
    //insert the node at fIrst in the doubly linked list
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
        head.prev=node;
        }
        head=node;
    }
    //insert the node at last of Dll
    public void insertlast(int val){
        Node node=new Node( val);
        Node temp=head;
        
        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }

         temp.next=node;
         node.prev=temp;
        
    }
     public Node find(int value){
            Node node=head;
            while(node!=null){
                if(node.val==value){
                    return node;
                }
            }
            return null;

         }
    //insert after value or insert at position
    public void insert(int after,int val){

        Node prev = find(after);

        if(prev==null){
            System.out.println("Does not exist");
            return;
        }

        Node node =new Node(val);
        node.next=prev.next;
        prev.next=node;
        node.prev=prev;
        
        //may cause null pointer exception
        if(node.next!=null){
            node.next.prev=node;
        }
    }
//display function for the Linked List
    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.val+"->");
            last=temp;
            temp=temp.next;
           
        }
        System.out.print("END");
        System.out.println();
        
        System.out.println("Print in reverese order:");
        while(last!=null){
            System.out.print(last.val+"->");
            last=last.prev;

        }
        System.out.print("START");
    }


     class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val=val;
            
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(17);
         list.display();
        list.insert(8, 65);
        list.display();

    }
}
 
