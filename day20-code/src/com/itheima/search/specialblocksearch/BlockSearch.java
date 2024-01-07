package com.itheima.search.specialblocksearch;

/**
 * 特殊的分块查找块与块之间没有交集,块内无序,块间有序.
 */
public class BlockSearch {
    public static void main(String[] args) {
        int[] arr = {7, 10,
                13, 19, 16, 20,
                27, 22, 30, 40, 36,
                43, 50, 48};
        int number = 48;
        Block block1 = new Block(10, 0, 1);
        Block block2 = new Block(20, 2, 5);
        Block block3 = new Block(40, 6, 10);
        Block block4 = new Block(50, 11, 13);
        Block[] blocks = {block1, block2, block3, block4};
        int index = getIndex(blocks, arr, number);
        System.out.println(index);
        if(index==-1){
            System.out.println("数组中没有这个数字");
        }else {
            System.out.println(arr[index]);
        }
    }

    public static int getIndex(Block[] blocks, int[] arr, int number) {
        int blockIndex = getBlockIndex(blocks, number);
        int beginIndex = blocks[blockIndex].getBeginIndex();
        int endIndex = blocks[blockIndex].getEndIndex();
        for (int i = beginIndex;i<=endIndex;i++){
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }

    public static int getBlockIndex(Block[] blocks, int number) {
        for (int i = 0; i < blocks.length; i++) {
            if (number <= blocks[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}
