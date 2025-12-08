package SV2;


// [James] I can't rememebr if we discussed this in the previous supervision, but this should be
// a non-public class in the OOPLinkedList.java file, to hide implementation details
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
