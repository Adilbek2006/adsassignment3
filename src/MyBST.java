public class MyBST<K extends Comparable<K>, V> {
    private Node root;
    private int size;
    private class Node {
        private K key;
        private V val;
        private Node left;
        private Node right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }
    public class Entry {
        private K key;
        private V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public K getKey() {
            return key;
        }
        public V getValue () {
            return value;
        }
    }
    public void put(K key, V val) {
        root = put(root,K key, V val);
    }
    private Node put(Node node, K key, V val) {
        if (node == null) {
            size++;
            return new Node(key, val);
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = put(node.left,key, val);
        }
        else if (cmp > 0) {
            node.right = put(node.right, key, val);
        }
        else {
            node.val = val;
        }
        return node;
    }
    public V get(K key) {}
    public void delete(K key) {}
    public Iterable<K> iterator() {}
}
