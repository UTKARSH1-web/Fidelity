class Nodel {
    int data;
    Nodel next;

    public Nodel(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Nodel head;

    public void insert(int data) {
        Nodel newNode = new Nodel(data);
        if (head == null) {
            head = newNode;
        } else {
            Nodel current = head;
            while (current.next != null) {
                System.out.println(current.data);
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display() {
        Nodel current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

    public class Ques1Insert {
        public static void main(String[] args) {
           LinkedList list = new LinkedList();
           list.insert(1);
           list.insert(2);
           list.insert(3);
           list.insert(4);
           list.insert(5);
           list.display();
        }

    }

