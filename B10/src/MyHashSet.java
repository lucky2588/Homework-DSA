import java.util.LinkedList;

public class MyHashSet {
    private static final int size = 1000;
    boolean[] mBucketArray;


    public MyHashSet() {
        mBucketArray = new boolean[1000];

    }

    public void addValue(int key) {
        int hashIndex = hashFunction(key);
        if (!mBucketArray[hashIndex]) {
            mBucketArray[hashIndex] = true;
        }
    }

    public boolean contrains(int key) {
        int hashIndex = hashFunction(key);
        return mBucketArray[hashIndex];
    }

    public void remove(int key) {
        int hashIndex = hashFunction(key);
        mBucketArray[hashIndex] = false;
    }

    private int hashFunction(int key) {
        return key % size;
    }
}
