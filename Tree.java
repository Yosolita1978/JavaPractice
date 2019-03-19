public class Tree{

  public static class Node{
    private int data;
    private Node right;
    private Node left;

    public Node(int data, Node right, Node left){
      this.data = data;
      this.right = right;
      this.left = left;
    }

    public Node(int data){
      this(data, null, null);
    }

    public int getData(){
      return this.data;
    }

    public Node getRight(){
      return this.right;
    }

    public Node getLeft(){
      return this.left;
    }

    public void setData(int data){
      this.data = data;
    }

    public void setRight(Node right){
      this.right = right;
    }

    public void setLeft(Node left){
      this.left = left;
    }

    public void printNode(){
      System.out.print("* " + this.data + " " );
      if(this.left != null){
        this.left.printNode();
      }else{
          System.out.print("null ");
      }

      if(this.right != null){
        this.right.printNode();
      }else{
          System.out.print("null");
      }
      System.out.print(" *");
    }
  }


public static Node makeATree(int[] numbers){

    Node root = new Node(numbers[0]);
    for(int i = 1; i < numbers.length; i++){
        Node newNode = new Node(numbers[i]);
        Node current = root;
        while(current != null){
            if(current.data < newNode.data){
                if(current.right == null){
                    current.setRight(newNode);
                    current = null;

                } else{
                  current = current.right;
                }
            } else{
              if(current.left == null){
                current.setLeft(newNode);
                current = null;
              } else{
                current = current.left;
              }
            }
        }
    }
    return root;
}

public static void main(String[] args){
  int[] numbers = {3,6,5,4,1,2};
  makeATree(numbers).printNode();
  System.out.println();
}

}
