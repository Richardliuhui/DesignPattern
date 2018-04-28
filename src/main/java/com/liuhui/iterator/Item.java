package com.liuhui.iterator;

/**
 * @author liuhui
 * @since 2018-04-28 下午2:21
 */
public class Item {
    private ItemType type;
    private String name;

    public Item(ItemType type, String name) {
        this.type = type;
        this.name = name;
    }

    public final void setType(ItemType type) {
        this.type = type;
    }

    public ItemType getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
}
