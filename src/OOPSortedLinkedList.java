public class OOPSortedLinkedList extends OOPLinkedList {
    public OOPSortedLinkedList(OOPLinkedListElement head) {
        super(head);
    }

    public void add(int val) {
        OOPLinkedListElement new_item;
        OOPLinkedListElement element = getHead();
        OOPLinkedListElement next = element.getNext();
        while (next.getVal() < val) {
            element = element.getNext();
            next = next.getNext();
        }
        new_item = new OOPLinkedListElement(val, next);
        element.setNext(new_item);

    }
}
