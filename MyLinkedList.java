

public class MyLinkedList {
  private int size;
  private Node start,end;

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

public void extend(MyLinkedList<E> other)
  //   in O(1) time, connect the other list to the end of this list.
  //  The other list is then reset to size 0 (do not wipe out the nodes, just disconnect them.)
  //  This is how you will merge lists together for your radix sort.
public E removeFront()
    //remove the 1st element of the list, and return that value.


//OPTIONALLY:
  //  A working iterator would be faster than remove front for traversing the list.

}
