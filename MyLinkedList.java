public class MyLinkedList<E> {
  private class Node{
  	  private E data;
  	  private Node next,prev;
  		public Node(E value) { //NODE STUFF FROM LAST LAB
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


  private int size;
  private Node start,end;

   //Empty list constructor
   public MyLinkedList() {
     size = 0;
   }

   //Reset list to empty state
   public void clear() {
     size = 0;
     start = null;
     end = null;
   }

   public int size() {
     return size;
   }

//tostring
   public String toString() {
     if (size == 0) {
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
  	public boolean add(E val) {
  		Node newNode = new Node(val); //make new node
  		if (size() == 0) {
  			start = newNode;
  			end = newNode; //start and end both become this
  			size = 1;
  		}
      else {
  			newNode.setPrev(end);
  			size += 1;
  			end.setNext(newNode);
  			//the new node is the end
  			end = newNode;
  		}
  		return true;
  	}

    //in O(1) time, connect the other list to the end of this list.
    //The other list is then reset to size 0 (do not wipe out the nodes, just disconnect them.)
    //This is how you will merge lists together for your radix sort.
    public void extend(MyLinkedList<E> other) {
  		end.setNext(other.start); //set end, start of next one
  		other.start.setPrev(end); //set the previous of next start, this end
  		end = other.end; //set the end to the other end
  		size = size() + other.size(); //add the sizes
  		other.size = 0; //set stuff to null
  		other.start = null;
  		other.end = null;
  	}

    //remove the 1st element of the list, and return that value.
    public E removeFront() {
      E ogstart = start.getData(); //get stat from start
      if (size() == 1) {
        start = null; //set everything null
        end = null;
      }
      else {
        start = start.next(); //start is the next one
        start.setPrev(null); //set the one  before null
      }
      size--; //reduce size
      return ogstart;
    }




  }
