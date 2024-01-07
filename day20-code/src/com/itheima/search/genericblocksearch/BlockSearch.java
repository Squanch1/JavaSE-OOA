package com.itheima.search.genericblocksearch;

/**
 * 只要是分块查找一定要保证块与块之间没有交集
 * 分块查找的特殊情况是块内无序,块间有序,各组没有交集.这种情况下的Block对象就可以只存Max值,有序的块隐含了Min值.在索引表中寻找数据所在的块中时,就可以直接写一个判断条件
 * 但是一般情况下数据通常是块间也无序的,这时就需要我们对Block一般化处理(多存一个min值),分组条件一定是各组之间没有交集.
 */
public class BlockSearch {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20, 7, 10,
                43, 50, 48};
        int number = 20;
        Block block1 = new Block(22, 40, 0, 4);
        Block block2 = new Block(7, 20, 5, 10);
        Block block3 = new Block(43, 50, 11, 3);
        Block[] blocks = {block1, block2, block3};
        int index = getIndex(blocks, arr, number);
        System.out.println(index);
        System.out.println(arr[index]);
    }
    public static int getIndex (Block[] blocks, int[] arr,int number){
        int blockIndex = getBlockIndex(blocks, number);
        int beginIndex = blocks[blockIndex].getBeginIndex();
        int endIndex = blocks[blockIndex].getEndIndex();
        for (int i = beginIndex; i <= endIndex; i++) {
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }

    public static int getBlockIndex(Block[] blocks, int number) {
        for (int i = 0; i < blocks.length; i++) {
            if (number <= blocks[i].getMax() && number >= blocks[i].getMin()){
                return i;
            }
        }
        return -1;

    }


}
