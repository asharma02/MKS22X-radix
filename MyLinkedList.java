public class MyLinkedList<E> {
  private class Node{
  	  private E data;
  	  private Node next,prev;
  		public Node(E value) {
  			data = value;
  		}
  		public E getData() {
  			return data;
  		}
  		public E setData(E value) {
  			E old = data;
  			data = value;
  			return old;
  		}
  		public Node next() {
  			return next;
  		}
  		public void setNext(Node other) {
  			next = other;
  		}
  		public Node prev() {
  			return prev;
  		}
  		public void setPrev(Node other) {
  			prev = other;
  		}
  		public String toString() {
  			return "" + getData();
  	  }
  }


  private int length;
  private Node start,end;

   //Empty list constructor
   public MyLinkedList() {
     length = 0;
   }

   //Reset list to empty state
   public void clear() {
     length = 0;
     start = null;
     end = null;
   }

   public int size() {
     return length;
   }

   public String toString() {
     if (length == 0) {
       return "[]";
     }
     Node current = start;
     String ans = "[" + current.getData();
     for (int i = 1; i < size(); i++) {
       current = current.next();
       ans += ", " + current.getData();
     }
     return ans + "]";
   }

   //Adds a node at the end of the list, used boolean
  	public boolean add(E value) {
  		Node newNode = new Node(value); //make new node
  		if (size() == 0) {
  			start = newNode;
  			end = newNode; //start and end both become this
  			length = 1;
  		}
      else {
  			newNode.setPrev(end);
  			length += 1;
  			end.setNext(newNode);
  			//the new node is the end
  			end = newNode;
  		}
  		return true;
  	}

    







  }
