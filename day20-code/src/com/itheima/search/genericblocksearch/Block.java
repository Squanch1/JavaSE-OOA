package com.itheima.search.genericblocksearch;

public class Block {
    private int min;
    private int max;
    private int beginIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int min, int max, int beginIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.beginIndex = beginIndex;
        this.endIndex = endIndex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
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

