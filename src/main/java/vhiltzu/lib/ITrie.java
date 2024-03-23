package vhiltzu.lib;

public interface ITrie<TKey, TValue> {
    String find(TKey key);

    void insert(TKey key, String value);

    TrieNode<TValue> delete(TKey key);
}
