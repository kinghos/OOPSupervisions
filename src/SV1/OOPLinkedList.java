package SV1;

public class OOPLinkedList {
    private OOPLinkedListElement head;

    public OOPLinkedList(OOPLinkedListElement head) {
        this.head = head;
    }

    // [James] OOPLinkedListElement should not be exposed to the outside world
    public OOPLinkedListElement getHead() {
        return head;
    }

    public int valAt(int i) {
        OOPLinkedListElement element = head;
        while (i >= 0) {
            element = element.getNext();
        }
        return element.getVal();
    }

    public void removeHead() {
        head = head.getNext();
    }

    public int length() {
        int i = 0;
        OOPLinkedListElement element = head;
        while (element != null) {
            i++;
            element = element.getNext();
        }
        return i;
    }

    public void add(int val) {
        head = new OOPLinkedListElement(val, head);
    }
}

