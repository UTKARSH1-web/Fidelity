class Nodess {
    int data;
    Nodess next;
    public Nodess(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedLi{
    Nodess head;
    public void insertAtEnd(int data){
        Nodess newNode = new Nodess(data);
        if(head == null){
            head = newNode;
        }
        else{
            Nodess current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void insertAtPos(int data, int pos){
        Nodess newNode = new Nodess(data);
        if(pos == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Nodess current = head;
        for(int i = 0; i < pos-1; i++){
            if(current == null || current.next == null){
                System.out.println("Pos out of bounds");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void display(){
        Nodess current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Ques3InsertNodeAtSpecificPos {
    public static void main(String[] args) {
        LinkedLi list = new LinkedLi();
        list.insertAtEnd(16);
        list.insertAtEnd(13);
        list.insertAtEnd(7);
        list.insertAtPos(1,2);
        list.display();

    }
}
