/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method.
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    
    if(position == 0){
        newNode.next = head;
        head = newNode;
    }else{
        Node current = head;
        while(position > 1){
            current = current.next;
            position -= 1;
        }
    
        newNode.next = current.next;
        current.next = newNode;
    }
    
    return head;
    
    
}

