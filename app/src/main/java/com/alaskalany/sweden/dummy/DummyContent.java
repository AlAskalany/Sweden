package com.alaskalany.sweden.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    @SuppressWarnings("Convert2Diamond")
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    @SuppressWarnings("Convert2Diamond")
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    /**
     * Items count
     */
    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    /**
     * Add item
     *
     * @param item {@link DummyItem} Item
     */
    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * Create dummy item
     *
     * @param position {@link int} Item's position
     * @return {@link DummyItem} Item
     */
    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    /**
     * Make item details
     *
     * @param position {@link int} Item's position
     * @return {@link String} Item's details
     */
    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        /**
         * Item's id
         */
        public final String id;
        /**
         * Item's content
         */
        public final String content;
        /**
         * Item's details
         */
        public final String details;

        /**
         * DummyItem constructor
         *
         * @param id      {@link String} Item's id
         * @param content {@link String} Item's content
         * @param details {@link String} Item's details
         */
        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        /**
         * toString helper method
         *
         * @return {@link String} Item's content
         */
        @Override
        public String toString() {
            return content;
        }
    }
}
