package com.javademo;

import android.app.Activity;

import com.facebook.react.ReactRootView;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;


/**
 * Auther: wangben
 * CreateAt: 2020/10/21
 * Describer: CaseDemo
 */
public class CaseDemo {
    private ReactRootView mReactRootView;

    public static long log(){
        return System.currentTimeMillis();
    }
    public static void main(String[] args) throws ParseException{
        /** Date 时间工具类使用
         *  compareTo(Date anotherDate) 比较两个日期
         *  equals() 比较两个日期是否相同
         *  getTime() 获取时间的毫秒数
         *  当前时间根据指定格式转换字符串
             *  new SimpleDateFormat()默认格式字符串输出‘20-10-23 下午3:34
             *  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") 指定格式输出 2020-10-23 15:38:06
             *  new SimpleDateFormat("yyyy-MM-dd hh:mm:ss") 指定格式输出 2020-10-23 03:44:01
         *  将字符串转化为date类型，字符串格式与SimpleDateFormat指定日期格式一致;parse
        获取当前时间
        Date date = new Date();
        System.out.println(date);
        当前时间转化为毫秒
        System.out.println(date.getTime());
        String date1= "2020-10-23";
        String date2= "2020-10-24";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(date1);
        Date parse1 = simpleDateFormat.parse(date2);
        if (parse.getTime() > parse1.getTime()){
            System.out.println(date1+"xiao");
        }else {
            System.out.println(date2);
        }
        */
        /** Calendar 日历工具类使用
         */
        Calendar instance = Calendar.getInstance();
//        System.out.println(instance);
        //获取当前时间 getTime()
//        Date time = instance.getTime();
        //将日期Date转化为Calendar;设置日期是月份需要减1
//        instance.setTime(new Date());
//        instance.set(2019,4-1,14);
        //通过set(int field, int value)给指定的属性赋值，我们常用的属性,自定义
//        instance.set(Calendar.YEAR,2023);
//        instance.set(Calendar.MARCH,4-1); //Calendar.MONTH实际月份比设置月份大1，即设置的是4，实际输出的是5月份
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = simpleDateFormat.format(instance.getTime());
        //通过field获取value值  instance.get()
        System.out.println(instance.get(Calendar.YEAR));

//        long l = System.currentTimeMillis();
        Date date = new Date(log());
        System.out.print(date);

    }
    public static int getAdd(int one, int two){
        return one+two;
    }
    public String id;
    public String name;
    public void Student(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String toSTRING(){
        return "Student{"+"id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }
}




//        异常处理
//        try {
//            System.out.println(1/0);
//        }catch (ArithmeticException e){
//            System.out.println("出错....");
////            e.printStackTrace();
//        }finally {
//            System.out.println("会执行");
//        }
//    }
//    public double divide(double divident, double dividor) {
//        if (dividor == 0) throw new IllegalArgumentException("Dividor cannot be 0");
//        return divident / dividor;
//    }
//    public static int casedemo (int[] list){
//        //定义最小值
//        int max = Integer.MIN_VALUE;
//        if(list.length == 0){
//            //判断列表长度,列表为空抛出异常
//            throw new RuntimeException("Empty list");
//        }
//        for (int i = 0;i < list.length;i++){
//            if (list[i]>max){
//                max = list[i];
//            }
//        }
//        return max;
//    }