public class OOPLinkedListElement {
    private int val;
    private OOPLinkedListElement next;

    public OOPLinkedListElement(int val, OOPLinkedListElement next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public OOPLinkedListElement getNext() {
        return next;
    }

    public void setNext(OOPLinkedListElement n) {
        next = n;
    }

}
