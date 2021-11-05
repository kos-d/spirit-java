package books.promdev.part_02_libraries.chapt10;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {
    private ItemEnum sortingIndex;
    
    public ItemComparator(ItemEnum sortingIndex) {
        setSortingIndex(sortingIndex);
    }
    
    public final void setSortingIndex(ItemEnum sortingndex) {
        if (sortingIndex == null) {
            throw new IllegalArgumentException();
        }
        this.sortingIndex = sortingndex;
    }

    public ItemEnum getSortingIndex() {
        return sortingIndex;
    }

    @Override
    public int compare(Item one, Item two) {
        switch (sortingIndex) {
            case ITEM_ID:
                return one.getItemId() - two.getItemId();
            case PRICE:
                return Double.compare(two.getPrice() - one.getPrice());
            case NAME:
                return one.getName().compareTo(two.getName());
            default:
                throw new EnumConstantNotPresentException(ItemEnum.class, sortingIndex.name());
        }
    }
}
