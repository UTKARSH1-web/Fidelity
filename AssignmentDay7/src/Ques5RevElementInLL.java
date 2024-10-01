class Nod{
    int data;
    Nod next;
    Nod(int data){
        this.data = data;
        this.next = null;
    }
}
class LL{
    Nod head;
    public void insAtEnd(int data){
        Nod temp = new Nod(data);
        if(head == null){
            head = temp;
        }
        else{
            Nod curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = temp;
        }
    }
    public void reverse(){
        Nod prev = null;
        Nod curr = head;
        Nod next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void display(){
        Nod curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}


public class Ques5RevElementInLL {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insAtEnd(1);
        ll.insAtEnd(2);
        ll.insAtEnd(3);
        ll.insAtEnd(4);
        ll.insAtEnd(5);
        ll.insAtEnd(6);
        ll.reverse();
        ll.display();
    }
}
