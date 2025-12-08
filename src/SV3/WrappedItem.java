interface Item {
}
interface Wrappable extends Item {
    public void wrap();
}

// [James] This should absolutely not be static
static class ShopItem implements Wrappable {
    @Override
    public void wrap() {}
}

public static class WrappedItem implements Item {
    private Wrappable item;

    public WrappedItem(Wrappable item) {
        this.item = item;
    }

}

static void main() {
    ShopItem book = new ShopItem();
    WrappedItem gift = new WrappedItem(book);
    // [James] good
//     WrappedItem doubleGift = new WrappedItem(gift);  FIXME Error here
}