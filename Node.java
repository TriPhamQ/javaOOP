class Node {
  private int value;
  private Node next;

  public Node() {
    
  }

  public Node(int value) {
    this.value = value;
  }
  
  public Node(int value, Node next) {
    this.next = next;
  }

  public Node getNext() {
    return this.next;
  }

  public int getValue() {
    return this.value;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public boolean hasNext() {
    if (this.next == null) {
      return false;
    }
    else {
      return true;
    }
  }
}