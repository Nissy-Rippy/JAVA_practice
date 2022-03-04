package chap17;

import java.util.Currency;

class Node {
  public Node next;
  public int data;
  Node (int data, Node next) { this.next = next; this.data = data; }
  public void displayNode() { System.out.print(" { " + data + " }  -> "); }
}


public class OnewayLinkedList {
   public Node head;
   public OnewayLinkedList() { head  = null; }
   public void addFirst(int data) { head = new Node(data, head); }
   public void addLast(int data) {
     if (head == null){ addFirst(data); }
     else{
       Node tmp = head;
       while(tmp.next != null) tmp = tmp.next;
       tmp.next = new Node(data, null);
     }
    }

  public int add(int pos, int data) {
    if(head == null) return(-1);
    Node tmp = head;
    for(int i = 0; i < pos; i++) { tmp = tmp.next; }
    if(tmp != null) {tmp.next = new Node(data, tmp.next); }
    return(0);
  }

  public void displayList(){
    System.out.print("(first -> last) : ");
    Node cur  = head;
    while ( cur != null) { cur.displayNode(); cur = cur.next; }
    System.out.println(" ");
  }

  public static void main(String[] args){
    OnewayLinkedList list = new OnewayLinkedList();
    list.addLast(64); list.addLast(28);
    list.addLast(61); list.addLast(32);
    list.displayList( );
    list.add(2,29);
    list.displayList();
  }  }

