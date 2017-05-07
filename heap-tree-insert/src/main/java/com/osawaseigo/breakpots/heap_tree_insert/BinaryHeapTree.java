package com.osawaseigo.breakpots.heap_tree_insert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seigo on 07/05/2017.
 */
public class BinaryHeapTree {
    private List<Integer> list = new ArrayList<Integer>();

    public void insert(int[] ints) {
        for (int i : ints) {
            this.insert(i);
        }
    }

    private void insert(int value) {
        list.add(value);
        if (list.size() == 1) { // it was the root
            return;
        } else {
            siftUp();
        }
    }

    private void siftUp() {
        int newValueIndex = list.size() - 1;
        do {
            // value for parent calculation based on Binary Heap Tree format
            int posOddity = 2 - (newValueIndex % 2);
            int parentIndex = (newValueIndex - posOddity) / 2;
            if (list.get(newValueIndex) > list.get(parentIndex)) {
                switchPlaces(newValueIndex, parentIndex);
                newValueIndex = parentIndex;
                continue;
            } else {
                break;
            }
        } while (newValueIndex != 0);
    }

    private void switchPlaces(int i, int newPosition) {
        int tmp = list.get(i);
        list.set(i, list.get(newPosition));
        list.set(newPosition, tmp);
    }
}
