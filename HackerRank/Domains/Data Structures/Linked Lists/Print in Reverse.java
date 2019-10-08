/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method.
    
    Stack<Node> nodeStack = new Stack<Node>();
    
    Node current = head;
    while(current != null){
        nodeStack.push(current);
        current = current.next;
    }
    
    while(! nodeStack.isEmpty()){
        System.out.println(nodeStack.pop().data);
    }

}

