package Generics;

// Remove this import - use custom LinkedList instead
// import java.util.LinkedList;

public class HashTable<K, V> {
    private class HTPair {
        K key;
        V value;

        HTPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object other) {
            HTPair otherPair = (HTPair) other;
            return this.key.equals(otherPair.key);
        }

        @Override
        public String toString() {
            return "{" + this.key + "-" + this.value + "}";
        }
    }

    public static final int DEFAULT_CAPACITY = 10;
    
    // ✅ Use custom LinkedList, not java.util.LinkedList
    private LinkedList<HTPair>[] bucketArray;
    private int size;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    public HashTable(int capacity) {
        this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[capacity];
        this.size = 0;
    }

    // ✅ FIXED: Corrected the logic in put method
    public void put(K key, V value) throws Exception {
        int bi = hashfunction(key); // bucket index
        LinkedList<HTPair> bucket = this.bucketArray[bi];
        HTPair pta = new HTPair(key, value); // pair to add

        if (bucket == null) {
            // Bucket doesn't exist, create new bucket
            bucket = new LinkedList<>();
            bucket.addLast(pta);
            this.bucketArray[bi] = bucket;
            this.size++;
        } else {
            // Bucket exists, check if key already present
            int findAt = bucket.find(pta);
            if (findAt == -1) {
                // Key NOT found, add new pair
                bucket.addLast(pta);
                this.size++;
            } else {
                // Key found, update existing value
                HTPair pair = bucket.getAt(findAt);
                pair.value = value;
            }
        }
    }

    private int hashfunction(K key) {
        int hc = key.hashCode();
        int bi = Math.abs(hc) % this.bucketArray.length;
        return bi;
    }

    public V get(K key) throws Exception {
        int bi = hashfunction(key);
        LinkedList<HTPair> bucket = this.bucketArray[bi];
        
        if (bucket == null) {
            return null;
        }
        
        HTPair pta = new HTPair(key, null);
        int findAt = bucket.find(pta);
        
        if (findAt == -1) {
            return null;
        }
        
        HTPair pair = bucket.getAt(findAt);
        return pair.value;
    }

    public V remove(K key) throws Exception {
        int bi = hashfunction(key);
        LinkedList<HTPair> bucket = this.bucketArray[bi];
        
        if (bucket == null) {
            return null;
        }
        
        HTPair pta = new HTPair(key, null);
        int findAt = bucket.find(pta);
        
        if (findAt == -1) {
            return null;
        }
        
        HTPair pair = bucket.removeAt(findAt);
        this.size--;
        return pair.value;
    }

    public boolean containsKey(K key) throws Exception {
        int bi = hashfunction(key);
        LinkedList<HTPair> bucket = this.bucketArray[bi];
        
        if (bucket == null) {
            return false;
        }
        
        HTPair pta = new HTPair(key, null);
        int findAt = bucket.find(pta);
        return findAt != -1;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void display() {
        System.out.println("HashTable Contents:");
        for (int i = 0; i < this.bucketArray.length; i++) {
            System.out.print("Bucket " + i + ": ");
            LinkedList<HTPair> bucket = this.bucketArray[i];
            if (bucket != null && !bucket.isEmpty()) {
                bucket.display();
            } else {
                System.out.println("null");
            }
        }
        System.out.println("Size: " + this.size);
    }
}