package HashMap;

public interface Map<K, V> {
    public void put(K key, V value);
    public V get(K key);
    public void remove(K key);
    public boolean contains(K key);
    public int size();
}
