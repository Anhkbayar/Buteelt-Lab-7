package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps count of
 * the number of attempted element insertions (not to be confused with the
 * current size, which goes down when an element is removed) and exports an
 * accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */
public class DelegationSortedIntList implements IntegerList {

    private SortedIntList sortedList;
    private int added;

    public DelegationSortedIntList() {
        this.sortedList = new SortedIntList();
        added = 0;
    }

    @Override
    public boolean add(int num) {
        added++;
        return sortedList.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        boolean diff = false;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (add(num)) {
                diff = true;
            }
        }
        return diff;
    }

    @Override
    public int get(int index) {
        return sortedList.get(index);
    }

    @Override
    public boolean remove(int num) {
        return sortedList.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortedList.removeAll(list);
    }

    @Override
    public int size() {
        return sortedList.size();
    }

    public int getTotalAdded() {
        return added;
    }

}
