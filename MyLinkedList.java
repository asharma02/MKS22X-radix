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



  }
