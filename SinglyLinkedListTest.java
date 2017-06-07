class SinglyLinkedListTest {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();

    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.getHead().setValue(1);

    // Infinite circle loop
    // list.getTail().setNext(list.getHead());

    // list.printValues();

    list.remove();
    // list.printValues();
    
    System.out.println(list.findInt(2));
    list.removeAt(-1);
    list.printValues();

    // Check tail and head
    System.out.println(list.getTail().getValue());
    System.out.println(list.getHead().getValue());
  }
}