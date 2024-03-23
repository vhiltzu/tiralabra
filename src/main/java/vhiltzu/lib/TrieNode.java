package vhiltzu.lib;

import java.util.ArrayList;

public class TrieNode<TValue> {
    private ArrayList<TrieNode<TValue>> _children;
    private boolean _terminal;
    private TValue _value;

    public TrieNode() {
        this._children = new ArrayList<>();
    }

    public TrieNode(TValue value) {
        this();
        this._value = value;
    }

    public TrieNode(TValue value, boolean terminal) {
        this(value);
        this._terminal = terminal;
    }

    public ArrayList<TrieNode<TValue>> getChildren() {
        return this._children;
    }

    public TValue getValue() {
        return this._value;
    }

    public boolean isTerminal() {
        return this._terminal == true;
    }

    public void setValue(TValue value) {
        this._value = value;
    }

    public void setIsTerminal(boolean isTerminal) {
        this._terminal = isTerminal;
    }
}
