package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps count of
 * the number of attempted element insertions (not to be confused with the
 * current size, which goes down when an element is removed) and exports an
 * accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntList extends SortedIntList {

    // Write your implementation below with API documentation
    private int totalAdded;

    public InheritanceSortedIntList() {
        super();
        totalAdded = 0;

    }

    @Override
    public boolean add(int num) {
        boolean blabla = super.add(num);
        if (blabla) {
            totalAdded++;
        }
        return blabla;
    }

    @Override
    public boolean addAll(IntegerList List) {
        // int size = size();
        boolean amjilt = super.addAll(List);
        if (amjilt) {
            totalAdded++;
        }
        return amjilt;
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}
