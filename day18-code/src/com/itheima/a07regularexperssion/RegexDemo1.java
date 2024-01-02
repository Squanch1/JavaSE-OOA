package com.itheima.a07regularexperssion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//汉字属于.(任意字符)
//regex中的断言(Assertion)是零宽的,不占用任何字符
public class RegexDemo1 {
    static String str = "当然！以下是一个包含多次出现Java1和版本号的示例文本Java2是一种广泛使用的编程语言，" +
            "其中最新的版本是Java3。无论是开发桌面应用程序、Web应用程序还是移动应用程序，" +
            "Java987949都是一种强大而灵活的选择。Java8具有丰富的库和工具生态系统，使开发人员能够快速构建高质量的应用在Java11中，" +
            "你可以使用不同的版本来开发应用程序。过去的版本包括Java17等，";

    public static void main(String[] args) {
        //regex只是一个字符串,不算真正的正则表达式对象
        String regex1 = "(?i)(Java)(\\d{0,2})";

        //(?:)一般的非捕获分组,不是零宽的,如果后面需要用到该分组,则需要删除?:
        String regex3 = "(?i)(Java)(?:8|11|17)";

        //(?=)零宽正向先行断言(非捕获分组) (zero-width positive lookahead assertion)
        //零宽代表这个(?!8|11|17)这个组只是一个断言,是零宽的,在匹配字符串的时候不消耗任何字符
        //要求:匹配的对象不满足后面的条件(8|11|17),分组本事是一个断言,因为是零宽的,所以后面find()到的字符是不包含(?=8|11|17)的.
        //捕获的结果就是(?i)(?:Java)
        String regex2 = "(?i)(?:Java)(?=8|11|17)";

        //(?!)零宽负向先行断言(非捕获分组) (zero-width negative lookahead assertion)
        //零宽代表这个(?!8|11|17)这个组只是一个断言,是零宽的,在匹配字符串的时候不消耗任何字符
        //要求:匹配的对象不满足后面的条件(8|11|17),分组本事是一个断言,因为是零宽的,所以最终匹配的字符就是(?i)Java
        String regex4 = "(?i)(Java)(?!8|11|17)";


        String regex5 = "(?i)(Java)(\\d{0,2})";
        String regex6 = ".*?";

        //Pattern这个类就是正则表达式的类
        //创建一个真正的正则表达式的对象
        Pattern p = Pattern.compile(regex2);

        //创建一个(文本)匹配器对象
        //个人理解:将文本str和正则表达式对象p组成一个匹配器对象m
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }


    }
}
