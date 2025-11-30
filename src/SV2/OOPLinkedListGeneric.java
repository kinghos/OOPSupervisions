package SV2;

public class OOPLinkedListGeneric<T> {
    private T head;

    public OOPLinkedListGeneric(T head) {
        this.head = head;
    }

    public T getHead() {
        return head;
    }

    public int valAt(int i) {
        T element = head;
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
        T element = head;
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
        T clone = (T) super.clone();
        clone.head = new OOPLinkedListElement(getHead().getVal(), getHead().getNext());
        return clone;
    }
}

