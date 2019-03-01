public class Linked{

  public static class Node{

    private String data;
    private Node next;

    public Node(String data, Node next){
      this.data = data;
      this.next = next;
    }

    public String getData(){
      return this.data;
    }

    public Node getNext(){
      return this.next;
    }

    public void setData(String data){
      this.data = data;
    }

    public void setNext(Node next){
      this.next = next;
    }

    public void printNode(){
      System.out.println(this.getData());
    }

  }

  public static void printLL(Node head){
    while(head != null){
      head.printNode();
      head = head.getNext();
    }
  }

  public static Node reverseLL(Node head){
    Node current = head;
    Node nextNode = head.getNext();
    Node lastNode = null;
    while(current != null){
      current.setNext(lastNode);
      lastNode = current;
      current = nextNode;
      if(nextNode != null){
        nextNode = nextNode.getNext();
      }
    }
    return lastNode;
  }

  public static void main(String[] args){

    Node node4 = new Node("4", null);
    Node node3 = new Node("3", node4);
    Node node2 = new Node("2", node3);
    Node node1 = new Node("1", node2);

    Node head = node1;
    printLL(head);
    head = reverseLL(head);
    printLL(head);
  }
}
