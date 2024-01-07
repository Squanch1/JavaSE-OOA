package com.itheima.search.specialblocksearch;

public class Block {
    private int max;
    private int beginIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int beginIndex, int endIndex) {
        this.max = max;
        this.beginIndex = beginIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getBeginIndex() {
        return beginIndex;
    }

    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
