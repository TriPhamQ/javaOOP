class SinglyLinkedList {
  private Node head;
  private Node tail;
  
  public SinglyLinkedList() {
    this.head = new Node();
  }

  public SinglyLinkedList(int value) {
    this.head = new Node(value);
  }

  public Node getHead() {
    return this.head;
  }

  public Node getTail() {
    return this.tail;
  }

  public void add(int value) {
    if (!this.head.hasNext()) {
      Node newTail = new Node(value);
      this.tail = newTail;
      this.head.setNext(this.tail);
    }
    else {
      Node newTail = new Node(value);
      try {
        this.tail.setNext(newTail);
      } catch (Exception e) {
        System.out.println("Something wrong");
      }
      this.tail = newTail;
    }
  }

  public void remove() {
    Node runner = this.head;

    while (runner.getNext() != this.tail) {
      runner = runner.getNext();
    }
    runner.setNext(null);
    this.tail = runner;
  }

  public void printValues() {
    Node runner = this.head;

    while (runner != null) {
      System.out.println(runner.getValue());
      runner = runner.getNext();
    }
  }

  public Node findInt(int value) {
    Node runner = this.head;

    while (runner != null) {
      if (runner.getValue() == value) {
        return runner;
      }
      runner = runner.getNext();
    }

    return null;
  }

  public void removeAt(int n) {
    Node runner = this.head;

    while (n > 1) {
      try {
        runner = runner.getNext();
        n--;
      } catch (Exception e) {
        System.out.println("n is out of list range");
        return;
      }
    }
    if (n >= 1) {
      if (runner != null) {
        if (runner.getNext() != null) {
          if (runner.getNext().getNext() != null) {
            runner.setNext(runner.getNext().getNext());
          }
          else {
            runner.setNext(null);
            this.tail = runner;
          }
        }
      }
      else {
        System.out.println("n is out of list range");
      }
    }
    else {
      System.out.println("n need to range from 1 to list range");
    }
    if (n == 0) {
      if (this.head.getNext() != null) {
        this.head = this.head.getNext();
      }
    }
  }
}