package com.javademo.practice;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Auther: wangben
 * CreateAt: 2020/10/24
 * Describer: Calculator
 */
public class Calculator<Student> {
    public static long Intege() {
        /*Integer 类
        判断数大小 compareTo,实例是否相等 equals
        将字符串转换为数值parseInt(String str,int radix) 实现将字符串按照参数 radix 指定的进制转换为 int
         */
        //int
        Integer a = Integer.valueOf("10");
        //string
        Integer b = 10;
        //数值类型转换
        float c = a.floatValue();
        String d = "10101110";
        return Integer.parseInt(d);
    }
    public static boolean CharacterDemo(){
        /*  基本类型char
        isDigit(char ch)	boolean	确定字符是否为数字
        isLetter(char ch)	boolean	确定字符是否为字母
        isLowerCase(char ch)	boolean	确定字符是否为小写字母
        isUpperCase(char ch)	boolean	确定字符是否为大写字母
        isWhitespace(char ch)	boolean	确定字符是否为空白字符
        isUnicodeIdentifierStart(char ch)	boolean	确定是否允许将指定字符作为 Unicode 标识符中的首字符
         */
        int count;
        char[] values = {'*', '!'};
        for (count = 0;count<values.length;count++){
            //
            if (Character.isDigit(values[count])){
//                System.out.println("数字"+values[count]);
//                return Character.isDigit(values[count] );
            }
        }
        char c = ' ';
        return Character.isWhitespace(c);
    }
    public static int RandomDemo(){
        /*
        Random()：创建一个新的随机数生成器。Random num = new Random();
            没带参数构造函数生成的Random对象的种子缺省是当前系统时间的毫秒数
            直接使用Random无法避免生成重复的数字，如果需要生成不重复的随机数序列，需要借助数组和集合类
        Random(long seed)：使用单个 long 种子创建一个新的随机数生成器  ##new Random(10);
         */
//        ArrayList list = getDiffNO(10);
        Random num = new Random();
        for ( int i = 0 ;i < 10;i++ ){
            return num.nextInt(10);
//            System.out.println(num.nextInt(10));
        }
//        System.out.print(num.nextInt(10));
        return 0;
    }
    private static @NotNull ArrayList<Integer> getDiffNO(int n ){
        //生成[0-N)不重复随机数,list保存生成随机数
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        boolean[] bool = new boolean[n];
        int num = 0;
        for(int i = 0;i < n; i++){
            //相同数继续循环
            do {
                num = rand.nextInt(n);
            } while (bool[num]);bool[num] = true;list.add(num);
        }
        return list;
    }
    public List<Student> Students;
    public Calculator(){
        this.Students = new ArrayList<Student>();
    }

    public static void main(String[] args) {
        long intege = Intege();
        boolean CharacterDemo = CharacterDemo();
        ArrayList list = getDiffNO(20);
        System.out.println(list);
    }
}
