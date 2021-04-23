package homework3.task3;

public class MyHashMap<K, V>{
    private int capacity = 10;
    Node[] node = new Node[capacity];
    private int size = 0;


    public V put(K key, V value) {

        return null;
    }


    public V get(K key) {
        return null;
    }

    public V remove(K key) {
        return null;
    }


    static class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;


        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }


        public K getKey() {
            return key;
        }


        public V getValue() {
            return value;
        }
    }
}
