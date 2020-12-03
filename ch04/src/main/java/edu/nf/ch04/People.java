package edu.nf.ch04;

/**
 * @author LZ
 * @date 2020/12/1
 */
public class People {
    //jvm去执行
    public People() {
        System.out.println("执行了构造方法");
    }
    public void init(){
        System.out.println("执行init方法");
    }

    public void destroy(){
        System.out.println("执行destroy方法");
    }

    public void say(){
        System.out.println("say");
    }
}
