[TOC]



#### 1_1、JRE和JDK

- **JRE** 是 java程序**运行**时的环境，包含`JVM`和运行需要的核心类库

- **JDK** 是 java程序**开发**工具包，包含`JRE`和开发人员使用的工具

只需要运行java程序，只需要装 JRE，

需要开发Java程序，需要安装 JDK

![image-20210325201505786](/home/lin/桌面/IEDA/image/image-20210325201505786.png)

#### 1_2、Java开发说明

三个步骤：**编写 编译  运行**

Java源程序——>Java编译器——>Java字节码文件——>JVM运行

第一个java程序：

```java
public class HelloWorld{//class名字要和文件名完全相同，且大小写敏感
		public static void main(String[] args){
            System.out.println("Hello,World!");
        }
}
```

 

#### 2_1、java方法基础

定义格式：

```
public static void 方法名称(){
	方法体；
}
```

##### **一般方法格式**

```
修饰符   返回值类型    方法名称 (参数类型  参数名称，...){
	方法体；
	return 返回值；
}
```

调用格式：

```
	方法名称();
```

```java
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
```

注意事项：

1、方法的定义顺序无所谓

2、方法定义必须是挨着的，不能在一个方法内部定义另外一个方法

3、方法定义之后，自己不会执行，如果希望执行，一定要进行方法的调用。



##### **方法的重载**

方法名称相同，参数列表不同。

```
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同
与返回值类型无关。
```



在调用输出语句的时候，println方法就是进行了多种数据类型的重载形式。



##### **数组**

```java
//创建数组
//1、动态数组
//数据类型[] 数组名称 = new 数据类型[长度值]
int[] arr = new int[100];
//2.静态数组
//数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，....}；
//几个元素，数组长度就是几。
String[] str = new String[]{"helllo","world","java"};
String[] str = {"A","B","C"}; //省略格式
```

**数组的长度**

```java
数组名称.length
得到一个int类型的值，代表数组的长度，
数组一旦创建，程序运行期间不可改变
int[] arrry = new int[3]
System.out.println(array.length);//3
array = new int[5]
System.out.println(array.length);//5
//实质上，这是两个数组，分配了两个数组空间
```



##### java的内存划分

1.栈`stack`:存放的都是方法中的局部变量，**方法的运行一定要在栈中**。

​	局部变量：方法的参数，或者是在方法`{} `内部的变量；

​	作用域：一旦超出作用域，立刻从栈内存中 消失。

​	**栈中存储**的是局部变量所存储的**内存地址**

2.堆`heap`:凡是`new`创建的东西，都在堆之中，堆内存里面的东西，都有一个地址	值，且为16进制，

​	堆中的数据，都有默认值，规则：

​	如果是整型：	默认  `0`

​	如果浮点型		默认为 `0.0`

​	如果是字符		默认是 `\u0000`

​	如果是布尔值	默认是 `false`

​	如果是引用类型	默认是`Null`

3.方法区`method area`   存储.class的相关信息，包含方法的信息，**但是运行方法时在栈**

4.本地方法栈 `Native Method Stack`  与操作系统相关。

5.寄存器`pc Register ` 与cpu相关



**一个数组的内存圈**

![image-20210326173217785](/home/lin/桌面/IEDA/image/image-20210326173217785.png)



**两个数组的内存圈**![image-20210326173828940](/home/lin/.config/Typora/typora-user-images/image-20210326173828940.png)