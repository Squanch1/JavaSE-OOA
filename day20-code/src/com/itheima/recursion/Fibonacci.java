package com.itheima.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }

    public static int fibonacci(int n) {
        if(n<=0){
            System.out.println("参数错误!");
            return -1;
        }
        if (n == 1 | n == 2) {
            return 1;
        } else {
            //我们推导的递推式为f(n)=f(n-1)+f(n-2),但是方法里面不能这么写,方法返回值不能被赋值.
            //我们可以直接写return f(n-1)+f(n-2),这种写法不仅合法,而且表达的含义就是f(n)=f(n-1)+f(n-2);
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
