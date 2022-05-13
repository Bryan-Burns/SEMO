import java.util.*;

public class Dec<E extends Comparable<E> & Cloneable> {

    private LinkedList<E> mList;

    public Dec() {
        mList = new LinkedList<>();
    }

    public ArrayList<E> DuplicateItems() {
        ArrayList<E> listToReturn = new ArrayList<>();
        for (int i = 0; i < mList.size(); i++) {
            for (int j = 0; j < mList.size(); j++) {
                if (i == j) {
                    continue;
                } else if (listToReturn.contains(mList.get(i))) {
                    break;
                } else if (mList.get(i).equals(mList.get(j))) {
                    listToReturn.add(mList.get(i));
                    break;
                }
            }
        }
        return listToReturn;
    }

    public boolean isGreaterThan(Dec<E> other) {
        LinkedList<E> mListThis = this.copy();
        LinkedList<E> mListOther = other.copy();

        Collections.sort(mListThis);
        Collections.sort(mListOther);

        E smallest = mListThis.get(0);
        E median = mListThis.get(mListThis.size() / 2);
        E largest = mListThis.get(mListThis.size() - 1);
        E otherSmallest = mListOther.get(0);
        E otherMedian = mListOther.get(mListOther.size() / 2);
        E otherLargest = mListOther.get(mListOther.size() - 1);


        return (smallest.compareTo(otherSmallest) > 0) &&
                (median.compareTo(otherMedian) > 0) &&
                (largest.compareTo(otherLargest) > 0);
    }

    public void insert_second_last(E item){
        if(mList.size() > 2){
            mList.add(mList.size() - 3, item);
        }
    }
    public LinkedList<E> copy(){
        LinkedList<E> temp2 = new LinkedList<E>();
        for(int i = 0; i < mList.size(); i++){
            temp2.add((mList.get(i)));
        }
        return temp2;
    }

}


// Any time data is referenced in a potentially destructive manner, cloning is used to ensure data integrity.
// Private access modifiers are used to ensure secure coding practices are followed.