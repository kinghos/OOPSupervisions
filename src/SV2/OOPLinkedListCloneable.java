package SV2;

public class OOPLinkedListCloneable implements Cloneable{
    private OOPLinkedListElement head;

    public OOPLinkedListCloneable(OOPLinkedListElement head) {
        this.head = head;
    }

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        OOPLinkedListCloneable clone = (OOPLinkedListCloneable) super.clone();
        // [james] No, not quite. You also need to *clone* OOPLinkedListElement...you need a cloneable version of this too
        clone.head = new OOPLinkedListElement(getHead().getVal(), getHead().getNext());
        return clone;
    }
}

