package com.bw.test;

import java.util.ArrayList;

/**
 * Title: IDEAL中模板所处的位置类标题
 * Description: 类功能描述
 * Author:胡正林(823865618@qq.com)
 * Date:2019/5/21-16:34
 */
public class TestTemplate {
    //模板6：prsf 可生成:private static final
    private static final int i=10;
    //变形：psf
    public static final String name="小明";
    //变形：psfi
    public static final int num=10;
    //变形：psfs
    public static final String sex="男";


    // 模板1：psvm
    public static void main(String[] args) {
        //模板2：sout
        System.out.println("小明");
        //变形：soutp/soutv/soutm/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TestTemplate.main");
        System.out.println("args = " + args);
        
        int num=10;
        int num1=20;
        System.out.println("num = " + num);
        System.out.println(num1);
        method02();
    }

    public static void method(){
        //模板3：fori
        String[] s = {"上海","武汉","北京"};
        for (int i = 0; i <s.length ; i++) {
            System.out.println(s[i]);
        }
        System.out.println("-------------------------");
        //变型:iter
        for (String s1 : s) {
            System.out.println(s1);
        }
        System.out.println("-------------------------");
        //变型:itar
        for (int i = 0; i < s.length; i++) {
            String s1 = s[i];
            System.out.println(s1);
        }
        System.out.println("-------------------------");
    }
    public static void method01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小黄");
        list.add("小花");
        //模板4：list.for
        for (String s : list) {
            System.out.println(s);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //变型：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void method02(){
        //模板5：ifn
        ArrayList<String> list = new ArrayList<>();
        list.add("小明");
        list.add("小黄");
        list.add("小花");
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }
        //变形:xxx.nn
        if (list != null) {

        }
        //变型:xxx.null
        if (list == null) {

        }
    }
}
