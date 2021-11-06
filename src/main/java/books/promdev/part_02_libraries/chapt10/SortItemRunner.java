package books.promdev.part_02_libraries.chapt10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortItemRunner {
    public static void main(String[] args) {
            ArrayList<Item> p = new ArrayList<Item>() {
                {
                    add(new Item(52201, 9.75f, "T-Shirt"));
                    add(new Item(52127, 12.99f, "Dress"));
                    add(new Item(47063, 45.95f, "Jeans"));
                    add(new Item(90428, 60.9f, "Gloves"));
                    add(new Item(53235, 31f, "Shirt"));
                    add(new Item(63220, 14.9f, "Tie"));
                }
            };
            Comparator<Item> comp;
        comp = new Comparator<Item>() {
            @Override
            public int compare(Item one, Item two) {
                return Double.compare(two.getPrice(), one.getPrice());
            }
        };

//            Item.IdComparator comp = new Item.IdComparator();
//            Item.PriceComparator comp = new Item.PriceComparator();
            Collections.sort(p, comp);
//            Collections.sort(p, new ItemComparator(ItemEnum.ITEM_ID));
            System.out.println(p);
    }
}
