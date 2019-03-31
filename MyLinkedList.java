public class MyLinkedList {
  private int size;
  private Node<E> start,end;

  public String toString()

public MyLinkedList<E>() {   //construct an empty list
  size = 0;
  start = null;
  end = null;
}

public void clear() { //reset the list to an empty state. Very similar to the constructor.
  size = 0;
  start = null;
  end = null;
}

public boolean add(E) {
  if (size == 0) {
    Node x = new Node(value, null, null);
    start = x;
    end = x;
    size++;
    return true;
  }
  else {
    Node x = new Node(value, null, end);
    end.setNext(x);
    end = x;
    size++;
    return true;
  }

}//add an element to the end of the list (the boolean would be true all the time if you want to conform to list standards)

public void extend(MyLinkedList<E> other) {
  if (!(other.size() == 0)) { //check if other has anything
    if (size == 0){ //if nothing in A, just set start of A equal to the start of other
      start = other.start;
    }
    else{ //if there is stuff in A, set the start of other the next of end of A and vice versa
      end.setNext(other.start);
      other.start.setPrev(end);
    }
  end = other.end; //constants to do no matter what
  size += other.size;
  other.start = null;
  other.end = null;
        other.size = 0;
  }
}
  //   in O(1) time, connect the other list to the end of this list.
  //  The other list is then reset to size 0 (do not wipe out the nodes, just disconnect them.)
  //  This is how you will merge lists together for your radix sort.
public E removeFront() {
  start = getGivenNode(1);
  //set start as the node in front if it is at first index
  start.setPrev(null); // so it is null for before it
}
    //remove the 1st element of the list, and return that value.

    private Node getGivenNode(int index) {
       if (index < 0 || index >= size){
         throw new IndexOutOfBoundsException();
       } //check for exception
        Node current = start;
        int i = 1;
        //gets to index
        while (i <= index) {
          current = current.next();
          i++;
        }
        //returns when u reach index
         return current;
    }


//OPTIONALLY:
  //  A working iterator would be faster than remove front for traversing the list.

}
