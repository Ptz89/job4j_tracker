package ru.job4j.tracker;

import java.util.Arrays;
import static java.util.Objects.nonNull;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int count = 0;
        Item[] findItems = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (nonNull(items[i]) && items[i].getName().equals(key)) {
                findItems[count++] = items[i];
            }
        }
        return Arrays.copyOf(findItems, count);
    }

    public boolean replace(int id, Item item) {
        if (indexOf(id) > -1) {
            items[indexOf(id)].setName(item.getName());
            return true;
        } else {
            return false;
        }
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        int distPos = indexOf(id);
        if (distPos != -1) {
            System.arraycopy(items, distPos + 1, items, distPos, size - distPos - 1);
            items[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }

}