class Nodes{
    int data;
    Nodes next;
    public Nodes(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedLists{
    Nodes head;
    public void insertHead(int data){
        Nodes newNode = new Nodes(data);
        newNode.next = head;
        head = newNode;
    }
    public void display(){
        Nodes current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}


public class Ques2InsertHead {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.insertHead(1);
        list.insertHead(2);
        list.insertHead(3);
        list.insertHead(4);
        list.insertHead(5);
        list.display();
    }
}
