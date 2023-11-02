/*
 insert first
 insert at position
 insert last

 delete first
 delete at position or delete head
 delete last or delete tail

 
*/


package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    //first node item in the linkedList 
    public void insertfirst(int val)
    {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;

    }
    //insert at last
    public void insertlast(int val){
        Node node=new Node(val);
        if(tail==null){
            insertfirst(val);
            return ;
        }
        tail.next=node;
        tail=node;
        size+=1;

    }
    //insert at position
    public void insert(int val,int index)
    {    
        if (index==0) {
            insertfirst(val);
            return;        
        }
        if(index==size)
        {
            insertlast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val, temp.next);
            temp.next=node;
            size++;
        
    }
    //Delete the first node
    //return the deleted value
    public int deletefirst(){
        //store the value which is going to be deleted

        int val = head.value;
        head=head.next;
        if(head==null){
            tail=null;

        }
        size--;
        return val;
    }
    //delete the last element
    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val; 
    }
    //delete at index
    public int delete(int index){
        if(index==0){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        //find the previous index so that the reference based deleting become easier
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;

    }
    //get value of the node 
    //give me the reference of the node
    //when you put any value or integer to the index,it will actually return the reference pointer to that node
    public Node get(int index)
    {   //node if the temp variable that traverse through the Array
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;

        }
        return node;
    }
    //get the node if the value is given
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        //not found return null
        return null;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.print("END");
    }


// TEMPLATE OF NODE 
public class Node {
        private int value;
        private Node next;
    //constructor with value
    public Node(int value)
    {
        this.value=value;

    }
     //constructor with value and reference o next node
    public Node(int value,Node next)
    {
        this.value=value;
        this.next=next;
    }
}
public static void main(String[] args) {
    LL list=new LL();
    list.insertfirst(3);
    list.insertfirst(2);
    list.insertfirst(8);
    list.insertfirst(17);
     list.insertlast(99);
     list.insert(100,3);
     System.out.println(list.deletefirst());
     list.display();
     System.out.println();
     System.out.println(list.deletelast());
    list.display();
    System.out.println();
    System.out.println(list.delete(2));
    list.display();
    
}
}
