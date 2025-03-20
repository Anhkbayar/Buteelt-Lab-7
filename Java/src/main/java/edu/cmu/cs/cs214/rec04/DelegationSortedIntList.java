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

    @Override
    public boolean add(int num);

    @Override
    public boolean addAll(IntegerList list);

    @Override
    public int get(int index);

    @Override
    public boolean remove(int num);

    @Override
    public boolean removeAll(IntegerList list);

    @Override
    public int size();

}
