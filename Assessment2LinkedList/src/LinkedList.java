import org.w3c.dom.Node;

import java.util.Scanner;
public class LinkedList{
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

    Node head;
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public void removeAtIndex(int index){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if (index == 0){
            head = head.next;
            return;
        }
        Node current = head;
        Node previous = null;
        int currentIndex = 0;
        while(current != null && currentIndex < index){
            previous = current;
            current = current.next;
            currentIndex++;
        }
        if(current == null){
            System.out.println("Index out of bounds");
            return;
        }
        previous.next = current.next;
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        System.out.println("Enter the size of list");
        for(int i =0; i<4; i++){
            System.out.print("Element" + (i+1) + ": ");
            int data = sc.nextInt();
            list.append(data);
        }
        System.out.println("Current Linked list:");
        list.display();
        System.out.print("Enter the index of the element to remove:");
        int indexToRemove = sc.nextInt();
        list.removeAtIndex(indexToRemove);
        System.out.println("Updated linked list after removel:");
        list.display();
        sc.close();
    }
}
