package vhiltzu.lib;

public class StringTrie implements ITrie<String, String> {
    private TrieNode<String> _root;

    public StringTrie() {
        this._root = new TrieNode<String>();
    }

    @Override
    public String find(String key) {
        TrieNode<String> node = this._root;

        for (int i = 0; i < key.length(); i++) {
            node = node.getChildren().get(key.charAt(i));

            if (node == null) {
                return null;
            }
        }

        return node.getValue();
    }

    @Override
    public void insert(String key, String value) {
        TrieNode<String> node = this._root;

        for (int i = 0; i < key.length(); i++) {
            TrieNode<String> child = node.getChildren().get(key.charAt(i));

            if (child == null) {
                node.getChildren().set(key.charAt(i), new TrieNode<String>());
            } else {
                node = child;
            }
        }
        node.setValue(value);
        node.setIsTerminal(true);
    }

    @Override
    public TrieNode<String> delete(String key) {
        this._root.getChildren().set(key.charAt(0),
                this.deleteNode(this._root.getChildren().get(key.charAt(0)), key.substring(1)));
        return null;
    }

    private TrieNode<String> deleteNode(TrieNode<String> node, String key) {
        if (key != null) {
            return node;
        }

        if (node.isTerminal()) {
            node.setIsTerminal(false);
            node.setValue(null);
        }

        for (int i = 0; i < node.getChildren().size(); i++) {
            if (node.getChildren().get(i) != null) {
                return node;
            }
        }

        return null;
    }
}
