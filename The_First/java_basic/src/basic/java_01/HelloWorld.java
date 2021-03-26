package basic.java_01;/*
 @author 阳光正好，微风不燥
 @DESCRIPTION 第一个java文件
 @create 2021/3/25
*/

public class HelloWorld {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {
        System.out.println("Hello,World!");
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
