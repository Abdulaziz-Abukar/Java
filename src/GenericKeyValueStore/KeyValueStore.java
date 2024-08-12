package GenericKeyValueStore;
class KeyValueStore<K, V> {
    private K key;
    private V value;

    // Constructor to initialize the key-value pair
    public KeyValueStore(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Method to get the key
    public K getKey() {
        return key;
    }

    // Method to get the value
    public V getValue() {
        return value;
    }

    // Method to set a new value
    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KeyValueStore{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}