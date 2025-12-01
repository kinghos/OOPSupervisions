package SV2;

public class OOPLinkedListElementGeneric<T> {
    private T val;
    private OOPLinkedListElement next;

    public OOPLinkedListElementGeneric(T val, OOPLinkedListElement next) {
        this.val = val;
        this.next = next;
    }

    public T getVal() {
        return val;
    }

    public OOPLinkedListElement getNext() {
        return next;
    }

    public void setNext(OOPLinkedListElement n) {
    }
}
