title: Java基础复习
date: 2019-08-27 17:07:18
tags: 一时学习一时爽、一直学习一直爽、代码虐我千百遍、我视代码如初恋。今日又学习。

# Java基础复习

## 一、绪论（2019.08.27）

### １、计算机包括硬件和软件两个部分。

硬件就是看得见的部分例如鼠标、键盘、主机、显示器。软件就是看不见的指令，例如操作系统、应用软件。

### 2、世界上没有最好的语言，每种语言都有各自的优点和缺点。（其实Java是世界上最好的语言）。

### 3、冯诺依曼体系结构

现代计算机的基础，现代大多数计算机仍然是冯诺依曼体系的组织结构，只是做了部分改进，并没有从根本上挣脱此体系的束缚。计算机之父。中央处理器cpu以频率为衡量标准：1024hz = 1khz,1024khz=1mhz,1024mhz=1ghz（兆赫兹）。

### 4、IT行业三大定律 :

1、摩尔定律:  同价格的硬件每隔18-24个月，性能会翻一倍。2、安迪比尔定律 ：软件和硬件同时提升，才能带来更好的体验。3、反摩尔定律：如果一个IT公司今天和18个月卖掉同样多的产品，那么它的营业额就降低一半。

### 5、存储设备

硬盘: 机械硬盘、固态硬盘，本地存储。内存：内存条，断电数据丢失。8比特bit = 1字节byte,1024b =1k。一个0或者一个1存储为一个bit ，是计算机的最小存储单位。字节是计算中最基本的存储单元。1024程序员节。内存的存取速度是硬盘的十倍，计算机操作数据必须先加载到内存中、或者保存数据先经过内存再到硬盘。

### ６、操作系统是运行在计算机上的最重要的程序，它可以管理和控制计算机的活动。

### ７、万维网world wide web

web客户端浏览器可以通过url统一资源定位符，去访问web服务端上的资源。这些资源通过超文本传输协议http传输给用户。

### 8、java语言应用场景：

Java基础是JavaEE，大数据、android开发的基石。

## 二、Java语言概述（2019.08.28）

### 1、人机交互方式

图形化界面GUI： 简单直观、便于操作、易于接受。命令行方式CLI：输入特定的指令完成操作，需要记住一些命令。

~~~ java
win+r 输入cmd 打开命令提示窗口
dir 列出当前目录下的所有文件及文件夹
md 创建目录（文件夹）
rd 删除目录
cd 进入指定目录
cd.. 返回上级目录
cd/ 返回根目录
del 删除文件
exit 退出
echo javase>1.doc 将指定的数据写入新建的文件中
~~~

### 2、Java语言的分类

### JavaSE标准版、JavaEE企业版、JavaME移动版

### 3、Java语言的特点

面对对象、安全、开源、跨平台、解释型、健壮性、多线程、去掉指针、自动的垃圾回收机制。

### 4、JVM

不同操作系统有不同的jvm，一次编译处处运行，。垃圾回收机制：自动的垃圾回收机制，但还是会出现内存溢出（内存空间已不足供继续使用）、内存泄漏（没有任何的引用的对象没有被回收），内存泄漏最终会导致内存溢出。

### 5、JDK

java开发工具包，包含：JRE+java开发工具集，JRE又包含：jvm+java类库。

### 6、JDK的安装目录

不应该有中文，不要使用默认的路径，最好安装在SSD固态硬盘，提高运行速度。JRE运行环境可以不安装，但是建议安装，因为使用esclipse要加载独立的jre。安装目录：bin目录java工具，lib目录jar包。

### 7、环境变量的配置path

提供windows命令行中指令的可执行文件路径，当我们在命令行中键入指令时，根据环境变量中的path值，找到对应的指令可执行文件进行执行，是提供给计算机系统的。classpath:jdk1.6之后不用配置也不建议配置，如果配置也要配置正确，其作用是告诉jvm系统中class文件的路径。

~~~ java
JAVA_HOME D:\SystemForJava\java_1.8
Path %JAVA_HOME%\bin
~~~

### 8、第一个Java程序

~~~java
package com.ybjt.study01;

/**
 * @author zxh
 * @create 2019-08-29 14:26
 */
public class HelloWorld {
    public static void main(String [] args){
        System.out.println("Hello World");
    }
}
~~~

### 9、Java中的注释

~~~ java
package com.ybjt.study01;

/**
 * 单行、多行注释不参与编译，生成的class文件中不包含注释信息，
 * 对程序解释说明，增强可读性。可以简单的调试程序。
 * 文档注释：注释内容可以被JDK提供的工具javadoc所解析，形成一套以网页文件形式体现的该程序的说明文件
 * @author zxh
 * @create 2019-08-29 14:26
 */
public class HelloWorld {
    public static void main(String [] args){
        System.out.println("Hello World");
       /*
        System.out.println("Hello World");输出换行
        System.out.print("Hello World");输出不换行
        System.out.println("Hello World");多行注释：注释多行，不可以嵌套使用
        */
        //System.out.println("Hello World");单行注释：注释一行
    }
}

~~~

### 10、API

Java提供的基本编程接口，API文档即API的使用说明书。一个java源文件可以声明多个class，但是只能有一个类是被public修饰的，且只能加在和文件名同名的类上。即public修饰的类名和文件名相同。程序的入口是main方法，格式固定。每一个语句都以；结尾。每一个语句单独占一行。

## 三、Java基础

### 1、关键字与保留字

关键字：被java语言赋予了特殊含义，用作专门用途的单词，关键字中的所有单词都小写。calss public 等..

保留字：现有的java版本没有使用，以后的版本有可能使用。goto，const

### 2、标识符

定义：变量、方法和类等要素命名时使用的字符序列。凡是可以自己定义名字的地方都叫标识符。

定义规则：1.由26个英文大小写字母、数字0-9，_ 或$组成。2.数字不可以开头 3.不可以使用关键字和保留字但能包含。4.严格区分大小写，长度无限制。5.不能包含空格。驼峰原则，见名知意。

~~~XML
java中命名规范：
    包名：xxx 全部小写
    类名、接口名：XxxYyy
    方法名：xxYyy
    变量名：xxxYyyy
    常量名：XXX_YYY
~~~

### 3、变量

#### 1、概念：

内存中的一块存储区域，该区域中的数据可以在同一范围内不断变化，变量是程序中最基本的存储单元，包含变量类型，变量名和变量值。

#### 2、使用：

每个变量必须先声明后使用，通过变量名来访问保存的数据，变量的作用域在一对{}内才有效，同一作用域内不能定义同名的变量。

#### 3、基本数据类型的分类(8种)

整数型：byte short int long    /1字节（-128-127）2字节 4字节 8字节    / 1byte=8bit  /  默认为int型的，声明long型变量末尾加"L", long num = 123132132L;日常使用为int类型的变量已足够使用。

浮点型（带小数的数值）：float单精度 double双精度 / 4字节 8字节 / float表示数值的范围比long还大 / 默认为double类型的，声明float类型的要在末尾加"f"或者"F"。日常使用为double类型的变量已足够使用。

字符型：char 1字符 = 2字节，char str = 'a' ；单引号包围且只能写一个字符，转义字符：\t制表符 \n换行符，使用unicode，char str = '\u0043'

布尔型：boolean   true false,在条件判断和循环结构中使用

引用数据类型：类、接口、数组、枚举

按位置分类：成员变量 局部变量

~~~ java
package com.ybjt.study01;

/**
 * 变量
 * @author zxh
 * @create 2019-08-29 16:12
 */
public class variate {
    public static void main(String[] args) {
        //先声明后使用
        int age = 18 ;
        double num = 1.0;
        long s = 11115555555L;
        char sts = '\u0043';
        char str = 'a'；
        System.out.println(sts);
        System.out.println(str);
        System.out.println(s);
        System.out.println(age);
        System.out.println(num);
    }
}
~~~

### 4、字符集

​	字符编码（英语：Character encoding）也称字集码，是把[字符集](https://baike.baidu.com/item/字符集)中的[字符](https://baike.baidu.com/item/字符/4768913)[编码](https://baike.baidu.com/item/编码)为指定[集合](https://baike.baidu.com/item/集合)中某一[对象](https://baike.baidu.com/item/对象/17158)（例如：[比特](https://baike.baidu.com/item/比特/3431582)模式、[自然数](https://baike.baidu.com/item/自然数/385394)[序列](https://baike.baidu.com/item/序列/1302588)、8位组或者[电脉冲](https://baike.baidu.com/item/电脉冲/10706490)），以便[文本](https://baike.baidu.com/item/文本/5443630)在[计算机](https://baike.baidu.com/item/计算机/140338)中存储和通过[通信](https://baike.baidu.com/item/通信)[网络](https://baike.baidu.com/item/网络)的传递。unicode，utf-8，gbk 

### 5、类型转换（不包含boolean）

#### 1、自动类型转换

当容量小的数据类型的变量与容量大的数据类型的变量做运算，结果自动提升为容量大的数据类型。当byte/short/chart三种变量做运算时提升为int类型。

byte 、  short   、chart  -->  int  -->  long  -->  float  -->  double

#### 2、强制类型转换

大容量的数据类型的变量赋值给小容量的数据类型，通过一对"(被转数据类型)"进行强转。

~~~ java
package com.ybjt.study01;

/**
 * 类型转换
 * @author zxh
 * @create 2019-08-29 20:34
 */
public class NumberTest {
    public static void main(String[] args) {
        //小类型赋值给大类型，自动类型提升
        byte s = 2;
        int s1 = 120;
        int s2 = s + s1;
        System.out.println(s2);
		//强制类型转换
        double s3 = 12.3;
        float s4 = (float) s3;
        System.out.println(s4);
    }
}
~~~

说明：容量大小指的是表示数的范围。

### 6、String 字符串类型

String是引用数据类型，不是基本数据类型，声明使用一对"内容"。

String可以和8种数据类型做运算  +  法，连接运算，运算的结果为String类型。

~~~ java
package com.ybjt.study01;

/**
 * @author zxh
 * @create 2019-08-29 21:19
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "66666";
        int num = 123;

       //字符串连接符 +
        String s2 = s1 + num;
        System.out.println(s2);
    }
}
~~~

### 7、进制的转换

二进制：0，1 ，满2进1，以0b/0B开头

十进制：0-9，满10进1

八进制:0-7,满8进一，以数字0开头表示

十六进制：0-9即A-F，满16进1，以0x/0X开头，此处的A-F不区分大小写。

最高位为符号位，0表示正数，1表示负数。

原码：直接将一个数值换成二进制数，最高位为符号位。

负数的反码：是对原码按位取反，最高位符号位为1

负数的补码：其反码+1

正数的原码、反码、补码三码合一

计算机底层都以补码的形式存储数据

~~~ java
package com.ybjt.study01;

/**
 * 进制
 * @author zxh
 * @create 2019-08-29 21:43
 */
public class BinarnyTest {
    public static void main(String[] args) {
        int num = 0b1100;//二进制以0b开头 0.1
        int num1 = 123;//十进制0-9
        int num2 = 012357;//八进制以0开头 0-7
        int num3 = 0x23F;//十六进制以0x开头 0-9 A-F
        //以十进制输出
        System.out.println(num);//12
        System.out.println(num1);//123
        System.out.println(num2);//5359
        System.out.println(num3);//575
    }
}

~~~

### 8、运算符

####  1、算术运算符

~~~ java
package com.ybjt.study01;

/**
 * @author zxh
 * @create 2019-08-30 9:29
 * + 正号  - 负号  + 加  - 减  * 乘  / 除（取整） %（取模） 取余
 *  ++ （前后）加加 -- （前后）减减   + 字符串拼接
 */
public class MathTest {
    public static void main(String[] args) {
        //除法取整
        int num = 12;
        int num1 = 5;
        int num2 = -19;
        int num3 = num/num1;
        int num4 = num/num1*num1;
        //模取余，结果的符号与被模数相同
        //取模结果为0，表示能被除尽，常用于判断。
        int num5 = num%num1;
        int num6 = num2%num1;
        System.out.println(num3);//2
        System.out.println(num4);//10
        System.out.println(num5);//2
        System.out.println(num6);//-4

        //前++:先自增再运算 后++：先运算再自增
        int num7 = num1++;
        int num8 = ++num1;
        System.out.println(num7);//5
        System.out.println(num8);//7

        //都自增，没有区别
        num++;
        System.out.println(num);//13
        ++num;
        System.out.println(num);//14

        //++自增不会改变自身的数据类型  --自减类似于自增运算，就是减法
        //+=有隐式的自动类型转换
        short num10 = 12;
        num10 += 1 ;//相当于 num10 = num10+1;编译报错，将int类型的变量赋值给short,损失精度。
        System.out.println(num10);//13

    }
}

~~~

#### 2、赋值运算符

 ~~~java
package com.ybjt.study01;

/**
 * 赋值运算符 =  支持连续赋值
 * 当=号两侧数据类型不一致时，可以使用自定类型转换或者强制类型转换进行处理。
 * 扩展运算符：+= -= /= *= %=
 * @author zxh
 * @create 2019-08-30 10:02
 */
public class FuZhiTest {
    public static void main(String[] args) {
        //连续赋值
        int num1,num2;
        int i1 = 10,i2=20;
        num1 = num2 = 10;
        System.out.println(num1);//10
        System.out.println(num2);//10
        System.out.println(i1);//10
        System.out.println(i2);//20

        num1 += 10;
        System.out.println(num1);//20

        //推荐加1、加2写法 num++ num += 2
    }
}

 ~~~

#### 3、比较运算符（关系运算符）

~~~ java
package com.ybjt.study01;

/**
 * 比较运算符,运算的结果是boolean类型，不是true就是false
 *  == 等于 != 不等于 < 小于  > 大于  <=  小于等于 >= 大于等于 instaceof 检查是否是类的对象
 * @author zxh
 * @create 2019-08-30 10:21
 */
public class CompaireTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println(i == j); //fasle
        System.out.println(4>=3);//true
    }
}

~~~

#### 4、逻辑运算符

|   a   |   b   |  a&b  | a&&b  | a\|b  | a\|\|b |  !a   |  a^b  |
| :---: | :---: | :---: | :---: | :---: | :----: | :---: | :---: |
| true  | fasle | fasle | fasle | true  |  true  | fasle | true  |
| true  | true  | true  | true  | true  |  true  | fasle | fasle |
| false | true  | false | false | true  |  true  | true  | true  |
| false | false | false | false | false | false  | true  | fasle |

~~~ java
package com.ybjt.study01;

/**
 * 逻辑运算符：操作boolean类型的变量
 * & 逻辑与   | 逻辑或  ! 逻辑非
 * && 短路与   || 短路或    ^ 异或 相同为false/不同为true
 * @author zxh
 * @create 2019-08-30 13:03
 */
public class LuojiTest {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1&b2);//false
        System.out.println(b1&&b2);//false
        System.out.println(!b2);//true
    }
}

~~~

#### 5、位运算符

~~~ java
package com.ybjt.study01;

/**
 * 位运算符：>> 右移除 2^位数幂    << 左移乘 2^位数幂
 * >>>无符号右移  & 与运算   | 或运算
 * ^ 异或运算（一个数异或另一个数两次，仍为原来的数）   ~取反运算（按位取反，包括符号位）
 * 都是操作整型的变量的数据
 * @author zxh
 * @create 2019-08-30 13:26
 */
public class WeiYunSunTest {
    public static void main(String[] args) {
        int num = 12;
        int num1 =18;

        System.out.println(num<<2);//48
        System.out.println(num>>2);//3
        System.out.println(num^8^8);//12

        int temp;
        temp = num;
        num = num1;
        num1 = temp;

        System.out.println(num);//18
        System.out.println(num1);//12
    }
}

~~~

#### 6、三元运算符

~~~ java
package com.ybjt.study01;

/**
 * 三元运算符：变量 = 条件表达式1？表达式2：表达式3；
 * 条件表达式的结果为boolean类型
 * 如果条件表达式为true，执行表达式2。
 * 如果条件表达式为false，执行表达式3。
 * 表达式2/3要求是一致的 三元运算符是可以嵌套的
 * 凡是可以使用三元运算符的地方都可以改写成if...else...结构，反之则不一定成立。
 * 如果程序既可以使用三元运算符又可以使用if...else...建议使用三元运算符，简洁、效率较高
 * @author zxh
 * @create 2019-08-30 14:02
 */
public class SanYuanYunSuanTest {
    public static void main(String[] args) {
        int num = 10<0?120:(2>1?100:120);//三元运算符的嵌套
        System.out.println(num);//100

        int max = 18;
        int min = 2;
        int n = (max>min)?max:min;
        System.out.println(n);//18

        //获取三个数中的最大值
        int num1 = 5;
        int num2 = 8;
        int num3 = 13;
        int max1 = (num1>num2)?num1:num2;
        int max2 = (max1>num3)?max1:num3;
        System.out.println(max2);//13

    }
}

~~~

#### 7、运算符的优先级

如果想要部分运算优先，可以使用（）括起来，使其优先级提高。具体的优先级排序没有必要记。

### 9、流程控制（顺序结构、分支结构、循环结构）

#### 1、if...else..

 ~~~ java
package com.ybjt.study01;
import java.util.Scanner;
/**
 * 分支结构：if...else...单选一、二选一、多选一
 * @author zxh
 * @create 2019-08-30 14:43
 */
public class IfElseTest {
    public static void main(String[] args) {
        boolean flag = false;
        if (flag){
            System.out.println("Java是世界上最好的语言");
        }

        if(flag){
            System.out.println("good good study");
        }else {
            System.out.println("day day up");
        }

        int num = 60;
        if(num>60){
            System.out.println("1");
        }else if(num>70){
            System.out.println("2");
        }else{
            System.out.println("3");
        }

        //从键盘获取值
        System.out.println("请输出年龄");
        Scanner scanner = new Scanner(System.in);
        //如果输出的内容与要求的类型不匹配，产生异常InputMismatchException
        int age = scanner.nextInt();
        System.out.println("年龄："+age);
    }
}

 ~~~

#### 2、switch...case...

~~~ java
package com.ybjt.study01;

import java.util.Scanner;

/**
 * switch...case..
 * switch(表达式){
 *     case 常量：
 *          语句；
 *          break;
 *     case 常量：
 *         语句；
 *         break;
 *     default:
 *         语句；
 * }
 * 表达式中的值依次匹配case后面的常量，如果匹配成功，则执行里面的语句，break退出整个switch结构。
 * 如果没有break，就会穿透执行每个case里面的语句，直到执行完或者遇到break。
 * 表示式只能是如下类型：byte short int char 枚举类型(JDk5.0新增) String（JDK7.0新增）
 * case只能声明常量，不能声明范围、
 * break关键字是可选的
 * default结构是可选的，而且位置是灵活的。
 * 凡是可以使用switch-case的结构，都可以转成if-else,反之不成立。两个能够同时使用，且case情况 较少，那么使用switch-case,结构清晰，效率较高。
 * @author zxh
 * @create 2019-08-30 15:15
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄：");
        int i = scanner.nextInt();
        switch(i){
            case 20:
                System.out.println("20岁不小了！");
                break;
            case 30:
                System.out.println("要生孩子了！");
                break;
        }
    }
}

~~~

#### 3、for

~~~ java
package com.ybjt.study01;

/**
 * 循环结构的4要素
 * 初始化条件
 * 循环条件是boolean类型
 * 循环体
 * 迭代条件
 * @author zxh
 * @create 2019-08-31 8:37
 */
public class ForTest {
    public static void main(String[] args) {
        for (int i = 0;i<10;i++){
            System.out.println("循环了"+(i+1)+"次！！");
        }

        //遍历100以内的偶数
        for(int i = 0;i<=100;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}

~~~

#### 4、while

~~~ java
package com.ybjt.study02;

/**
 * while循环
 * 迭代条件丢失，会产生死循环。
 * 编码中应避免死循环
 * for循环和while循环可以相互转换。但是两者的初始化条件变量的作用域不一样
 * @author zxh
 * @create 2019-09-02 12:14
 */
public class whileTest {
    public static void main(String[] args) {
        int num = 0;
        while (num<100){
            System.out.println(num);
            num++;
        }
    }
}

~~~

#### 5、do...while...

~~~ java
package com.ybjt.study02;

/**
 * do{
 *
 * }while();
 * 会至少执行一次循环体
 * 实际开发中经常使用for/while循环结构较多，不太实用do...while..
 * @author zxh
 * @create 2019-09-02 12:23
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int num = 0;
        do {
            System.out.println(num);
            num++;
        }while(num<100);
    }
}

~~~

~~~ java
package com.ybjt.study02;

import java.util.Scanner;

/**
 * 键盘输出不确定的整数，记录输入的正数和负数的个数，并显示
 * 当输入为0时程序终止/
 * 跳出循环的方法：迭代条件不满足或者调用break
 * 死循环的写法：for(;;){}   while(true){}
 * @author zxh
 * @create 2019-09-02 20:53
 */
public class ForWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //局部变量的声明一定要赋值。
        int count = 0;
        int total = 0;
        while (true){
            int number = scanner.nextInt();
            if(number>0){
                count++;
            }else if(number<0){
                total++;
            }else{
                break;
            }
        }
        System.out.println(count);
        System.out.println(total);
    }
}

~~~

#### 6、嵌套循环

​	将一个循环结构声明在另一个循环的循环体中，分为内层循环和外层循环。

​	注意：尽量不要超过三层

~~~ java
package com.ybjt.study02;

/**
 * 输出100以内的质数
 * 质数：只能被1和它本身整除的自然数-->从2开始到这个数减一结束都不能被整除
 * 最小的质数是2
 * @author zxh
 * @create 2019-09-02 21:24
 */
public class ZhuShuTest {
    public static void main(String[] args) {
        boolean flag = true;
        for(int i = 2;i<=100;i++){
            //用i除以每个2到i-1之间的数
            for(int k = 2;k<i;k++){
                //如果有一个数被除尽了，那么i就不是质数
                if(i%k == 0){
                  flag = false;
                }
            }
            //不是质数flag为false.不输出
            if(flag){
                System.out.println(i);
            }
            //每判断完一个数之后，将falg重置为true,以便进行下一个数的判断。
            flag = true;
        }
    }
}

~~~

~~~ java
package com.ybjt.study02;

/**
 * 输出100以内的质数的优化方案
 * 质数：只能被1和它本身整除的自然数-->从2开始到这个数减一结束都不能被整除
 * 最小的质数是2
 * @author zxh
 * @create 2019-09-02 21:24
 */
public class ZhuShuTest2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        boolean flag = true;
        for(int i = 2;i<=100000;i++){
            //用i除以每个2到i-1之间的数
            for(int k = 2;k<=Math.sqrt(i);k++){//优化二
                //如果有一个数被除尽了，那么i就不是质数
                if(i%k == 0){
                  flag = false;
                 break;//优化一：如果有一个数已经被整除，就不是质数，后面的就不用判断了。
                }
            }
            //不是质数flag为false.不输出
            if(flag){
                System.out.println(i);
            }
            //每判断完一个数之后，将falg重置为true,以便进行下一个数的判断。
            flag = true;
        }

        long end = System.currentTimeMillis();
        System.out.println("耗时： "+(end-start)+"ms");//16759 1692 91
    }
}

~~~

#### 7、break/continue

~~~ java
package com.ybjt.study02;

/**
 * break:使用在switch...case...或者循环结构中，结束当前循环。
 * continue：使用在循环结构中，结束当次循环。
 * 两者后面都不能声明执行语句,嵌套循环break只跳出内层循环，continue只结束内层的当次循环。
 * 可以使用给循环起别名，用于操作指定的循环结构。
 * return 用于结束循环或者结束方法
 * @author zxh
 * @create 2019-09-02 22:18
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        label:for (int i = 1;i<=10;i++){
            if(i == 4){
                //break;//123
                continue label;//1235678910
            }
            System.out.println(i);
        }
    }
}

~~~

~~~ java
package com.ybjt.project01;

import java.util.Scanner;

/**
 * @author zxh
 * @create 2019-09-03 21:30
 */
public class Untily {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 从键盘获取指定长度的字符串
     * @return
     */
    public static String readKeyBorad(int limit) {
        String line = "";
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入的长度不合法,不应超过：" + limit);
                continue;
            }else {
                break;
            }

        }
        return line;
    }
}

~~~

### 10、数组

概念：数组是相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。

特点：数组是有序排列的，数组的长度就是数组能保存元素的个数。 使用角标、索引来操作数组中的元素。

数组本身是引用类型的数据，而数组中的元素可以是任意数据类型，包括基本数据类型和引用数据类型。

创建数组对象会在内存中开辟一块连续的空间，而数组名中引用的是这块空间的首地址。

数组的长度一旦确定，就不能修改。

数组的分类：一维数组、二维数组/基本数据类型的数组、引用数据类型的数组。

数组异常：角标越界ArrayIndexOutOfBoundsExcetion、空指针异常NullPointerExcetion

~~~ java
package com.ybjt.study03;

/**
 * 一维数组
 * 一维数组的内存解析：引用类型的数据，通过内存地址找到对应的对象。
 * @author zxh
 * @create 2019-09-04 21:58
 */
public class ArrayTest {
    public static void main(String[] args) {
        //数组的声明，一旦初始化完成其长度就确定
        int [] arr = new int[10];//动态初始化
        int [] aee = new int[]{1,2,3};//静态初始化:初始化和元素的赋值同时进行
        int [] ass = {2,6,10};

        //通过角标的方式调用指定位置的元素
        //arr[0] = 5;
        //System.out.println(arr[0]);//5

        //获取数组的长度
        System.out.println(arr.length);//10

        //如何遍历数组元素
        for (int i = 0; i <aee.length ; i++) {
            System.out.println(aee[i]);// 1 2 3
        }

        //数组元素的默认初始化值:
        /**
         * 数组元素是整型：0
         * 数组元素是浮点型：0.0
         * 数组元素是char类型：0 '\u0000'
         * 数组元素是布尔类型：false
         * 数组元素是引用数据类型：null
         */
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);//000000
        }

        char [] charArr = new char[5];
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
        }
    }
}

~~~

~~~ java
package com.ybjt.study03;
/**
 * 二维数组
 * @author zxh
 * @create 2019-09-04 22:53
 */
public class ErArrayTest {
    public static void main(String[] args) {
        //二维数组的声明
        int [][] arr = new int[3][2];
        int [][] ass = new int[][]{{1,1,2},{5,96,9,}};

        //调用指定位置的元素
        System.out.println(ass[0][2]);

        //遍历
        for(int i = 0;i<ass.length;i++){
            for(int k = 0 ;k<ass[i].length;k++){
                System.out.println(ass[i][k]);
            }
        }

        //二维数组的元素初始化值：外层元素的初始化值为地址值，内层元素的初始化值与一维数组相同
    }
}

~~~

~~~ java
package com.ybjt.study03;

/**
 * 杨辉三角：使用二维数组打印杨辉三角
 * 第一行有1个元素，第n行有n个元素
 * 从第三行开始，对于非第一个和非最后一个元素的元素：即
 * arr[j][k] = arr[j-1][k]+arr[j-1][k-1]
 * @author zxh
 * @create 2019-09-05 21:08
 */
public class YangHuiTest {
    public static void main(String[] args) {
        int [][] arr = new int [10][];
        for (int i = 0; i <arr.length; i++) {
           arr[i] = new int [i+1];
           //给首末元素赋值
            arr[i][0] = arr[i][i] = 1;
            if(i>1){
                for (int j = 1; j < arr[i].length-1 ; j++) {
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }

        //遍历
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

~~~

~~~ java
package com.ybjt.study03;

/**
 * 数组元素的赋值
 * 创建一个长度为6的int类型的数组，要求元素的值都在1-30之间
 * 且是随机赋值，同时要求各元素的值不相同
 * @author zxh
 * @create 2019-09-05 21:25
 */
public class ArrayTestFuZhi {
    public static void main(String[] args) {
        int [] arr = new int [6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 30) + 1);
            for (int j = 0; j <i; j++) {
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }
        for (int num:arr) {
            System.out.println(num);
        }
    }
}

~~~

~~~ java
package com.ybjt.study04;

/**
 * $冒泡排序
 * @author zxh
 * @create 2019-09-10 21:32
 */
public class BubbleTest {
    public static void main(String[] args) {
        int [] arr = {23,45,5,9,36,78,52,-56,-2,20};
        for(int i = 0 ;i<arr.length-1;i++){
            for(int k = 0;k<arr.length-1-i;k++){
                if(arr[k]>arr[k+1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }

        for(int num:arr){
            System.out.print(num+"\t");
        }
    }
}

~~~

~~~java
package com.ybjt.study04;
import java.util.Arrays;
/**
 * Arrays数组工具类测试
 * @author zxh
 * @create 2019-09-12 9:48
 */
public class ArraysTest {
    public static void main(String[] args) {
        int [] arr = {23,45,5,9,36,78,52,-56,-2,20};
        int [] sts = {23,45,8,9,36,78,52,-56,-2,20};

        //判断是否相等
        boolean flag = Arrays.equals(arr, sts);
        System.out.println(flag);

        //输出数组信息
        String s = Arrays.toString(arr);
        System.out.println(s);

        //将数组中的元素替换成指定的元素
        Arrays.fill(arr,666);
        System.out.println(Arrays.toString(arr));

        //排序
        Arrays.sort(sts);
        System.out.println(Arrays.toString(sts));

        //二分查找,返回指定元素的索引
        int i = Arrays.binarySearch(sts, 20);
        System.out.println(i);
    }
}

~~~

## 四、面向对象

###　１、面向过程与面向对象对比

面向对象是相对于面向过程的，面向过程强调的是功能和行为，完成任务具体的方法和步骤，以函数作为最小单位。面向对象是将功能封装进对象，强调的是对象，通过调用对象完成具体的功能。并且面向的对象的思想更符合人们在日常生活中的思维习惯。

### ２、面向对象的两个要素

类是对一类事务的描述，是抽象的概念上的定义。

对象是实际存在的该类事物的个体，因而也称为实例。

面对对象程序设计的重点是类的设计。设计类就是设计类的成员。

### 3、类的成员

属性：类中的成员变量   vs  局部变量

在类中声明的位置不同，直接定义在{}内的叫做属性。声明其属性时指明其权限，使用权限修饰符。

常用的权限修饰符：private-public-default-protected

声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量叫做局部变量。先声明后使用，都有对应的作用域。

方法：类中的成员方法，是否有形参、是否有返回值！

权限修饰符 返回值类型 方法名（形参列表）{ 方法体 }

如果有返回值，则在方法声明时指定返回值的类型。同时，方法中需要使用return关键字来返回指定类型的常量或者变量。如果没有返回值值，方法声明时使用void关键字，通常不使用return关键字，如果要使用则return;表示结束此方法。

return关键字的使用：

1、使用在方法体中

2、用于结束方法，针对有返回值类型的方法，使用return返回数据。

3、return关键字后不可以声明执行语句

方法的使用，可以调用当前类的属性和方法。方法内可以调用方法。

### 4、万物皆对象

在Java语言范畴中，我们都将功能、结构封装到类中，通过类的实例化，来调用具体的功能结构。

### 5、匿名对象

创建的对象没有显示的命名，匿名对象只能调用一次。

### 6、方法

​	1、方法的重载

在同一个类中有多个方法名相同，参数列表不同的方法，叫做方法的重载(overload)。参数列表不同指类型不同、个数不同。跟方法的权限修饰符、 返回值类型、形参变量名、方法体无关。

### 7、可变参数

JDK5.0中提供了可变参数的机制，允许直接定义能和多个实参匹配的形参。

格式：参数类型...形参名称

当调用可变参数的方法时，传入的参数可以是0个、1个、多个。。。

可变参数可以与本类中，方法名相同，参数列表不同的方法构成重载。

可变参数相当于传入数组

可变个数形参在方法的形参中必须声明在末尾，并且只有一个！

### 8、值传递机制

变量的赋值：如果是基本数据类型，赋值的变量所保存的数据值。如果变量是引用数据类型，赋值的变量所保存的地址值！

~~~ java
package com.ybjt.bean;

/**
 * 单列设计模式 饿汉式 实现起来简单，没有多线程同步问题。耗费内存。
 * @author zxh
 * @create 2019-10-08 13:25
 */
public class Cat {
    private Cat(){}
    private static Cat catIns = new Cat();
    public static Cat getCatIns(){
        return catIns;
    }
}

package com.ybjt.bean;

/**
 * 单例设计模式 懒汉式 在多线程环境中，这种实现方法是完全错误的，根本不能保证单例的状态。
 * @author zxh
 * @create 2019-10-08 13:29
 */
public class Dog {
    private Dog(){}
    private static Dog dogIns = null;
    public static Dog getDogIns(){
        if(dogIns != null){
            return new Dog();
        }
        return  dogIns;
    }
}

package com.ybjt.bean;

/**
 * 单例设计模式 懒汉式 线程安全
 * @author zxh
 * @create 2019-10-08 13:29
 */
public class Dog {
    private Dog(){}
    private static Dog dogIns = null;
    public static synchronized Dog getDogIns(){
        if(dogIns != null){
            return new Dog();
        }
        return  dogIns;
    }
}

~~~

~~~ java
package com.ybjt.bean;

/**
 * 如果类的构造器或者静态方法工厂中有多个参数（四个参数以上），使用Builder
 * 构建者设计模式
 * 避免创建不必要的对象
 * @author zxh
 * @create 2019-10-08 13:43
 */
public class Car {
    private String name;
    private String old;
    private String num;

    public static class Bulider{
        private String name = "奥迪";
        private String old;
        private String num;

        public Bulider setOld(String old){
            this.old = old;
            return this;
        }

        public Bulider setNum(String num){
            this.num = num;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    private Car(Bulider bulider){
        this.name = bulider.name;
        this.old = bulider.old;
        this.num = bulider.num;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", old='" + old + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}

~~~

### 9、封装性

隐藏对象内部的复杂性，只对外公开简单的接口，便于外界调用，提高系统的扩展性和可维护性，把该隐藏的隐藏起来，把该暴露的暴露出来，这就是封装性的设计思想。

封装性的体现：1、私有化属性，对外提供公开的get和set方法。2、不对外暴露的私有方法。3、单例设计模式。等。。。

封装性的体现需要权限修饰的配合，Java规定的四种权限修饰符(从小到大 )：

private 缺省 protected public

private 私有的，同一类的内部访问

不写就是缺省，同一包下都可以访问

protected受保护的，不同包的子类中都可以访问

public公开的，整个工程下都能访问

修饰类只能用public和缺省

4种权限修饰符来修饰类及类内部的结构，体现类及类内部结构在被调用时资源可见性的大小。

### 10、构造器

1、构造器的作用：创建对象、初始化对象的信息

2、如果没有显式的定义构造器，系统会默认提供一个空参的构造器。一旦显式的定义了构造器，系统将不再提供默认的空参的构造器。

3、格式：权限修饰符 类名（形参列表）{}

4、类中定义的多个构造器，彼此构成重载。

类的属性赋值的先后顺序：①默认初始化②显式初始化③构造器赋值④对象.方法或者对象.属性的方式赋值

### 11、JavaBean

java语言提供的可重用的组件，类是公共的，有一个无参的构造器，有多个属性且提供公共的get/set方法。

~~~java
package com.ybjt.bean;

import java.io.Serializable;

/**
 * @author zxh
 * @create 2019-07-24 15:50
 * 实体类，类的设计
 * 成员变量即类的属性
 * 局部变量声明在方法内、方法形参、代码块内、构造器形参、构造器内的变量
 */
public class User implements Serializable {
    private static final long serialVersionUID = -5555401105921349900L;
    private String name;
    private String age;
    private String address;

    public User() {
    }

    /**
     * 带参的构造器
     * @param name 名字
     * @param age 年龄
     * @param address 地址
     */
    public User(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "com.ybjt.bean.User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void song(){
        System.out.println(name+"跪着唱征服！");
    }
}

~~~

### 12、this关键字

三W学习法，what?why?how?

①this可以修饰属性和方法：当前对象或者当前正在创建的对象  this.name （属性）= name（形参）;

②this调用构造器：this(形参列表);通过形参列表指定调用本类的其他构造器（不能调用自己）。必须声明在当前构造器的首行！简化代码降低冗余！

### 13、package 

package 包 ：实现项目中类的管理，引入包的概念。声明类或者接口所属的包，声明在源文件的首行。属于标识符，遵循标识符的命名规范（全小写），见名知意。xxx.yyy.zzz 每"."一次表示一层文件目录。同一个包下不能定义同名的类或者接口。

### 14、MVC

MVC设计模式，M模型层、V视图层、C控制层。将程序输入输出、数据处理、一级数据展示分离开来的设计模式是程序结构变得灵活且清晰，同时也描述了各个程序之间的通信方式，降低了程序的耦合性。分层开发各司其职，程序员只需关注自己负责的部分代码，提高了代码的关注度，从而提高开发质量。

### 15、import

导入：在源文件中，显示的导入指定包下的结构（类或接口）。

~~~ java
import java.until.String;
import java.util.*;//*表示导入包下的所有结构
import static XXX;//导入指定类或者接口中的静态结构：属性和方法

~~~

静态导入：import static 包名….类名.方法名; JDK1.5

A:方法必须是静态的

B:如果有多个同名的静态方法，容易不知道使用谁?这个时候要使用，必须加前缀

~~~ java
//静态导入
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.max;

~~~



### 16、继承性

①继承性的好处：减少代码冗余，提高代码复用性。便于功能的扩展。为多态的使用提供了前提。

②继承关键字: Class A extends Class B    A子类 B父类   ，A类中就能获取B类中所有的属性和方法。（父类中声明的private私有的属性和方法，子类继承后，仍然获取到了父类中的结构，只是因为封装性的影响，使得子类不能直接调用父类的私有的结构。）

③子类继承父类，还可以声明子类特有的属性和方法。实现功能的扩展。

④Java只支持类的单继承和多层继承，不允许多继承。（一个类可以被多个子类继承。一个类只能有一个父类。子父类是相对的概念。子类直接继承的类叫做直接父类，间接继承的类叫做间接父类，子类拥有直接父类和间接父类中所有的属性和方法。）

### 17、Object类

所有的Java类，除java.lang.Object类外，都直接或者间接的继承Object类。

### 18、方法的重写

①概念：在子类中可以根据需要对父类中继承的方法进行改造，也称方法的的重置、覆盖。在程序执行时，子类的方法将覆盖父类中的方法。

②子类对象调用重写父类的方法，执行的是子类重写的方法。

④重写的规定：约定俗成：子类中的方法叫重写的方法，父类中的叫被重写的方法。方法名和形参列表相同；重写方法的权限修饰符不小于被重写的方法；子类不能重写声明为private的方法；父类被重写的方法的返回值为void，那么子类重写的方法只能是void的；父类被重写的方法是A类的，子类重写方法的返回值可以A类在或者A类的子类；父类被重写的方法的返回值的是基本类型，子类重写方法的返回值与父类中的相同；子类重写的方法抛出的异常类型不大于父类被重写方法抛出的异常。

⑤子类和父类中的同名同参的方法，要么都声明为非static的（考虑重写）。要么都声明为static的（不能重写） 

### 19、supper关键字

①supper父类的，用来调用属性、方法、构造器

②在子类方法或者构造器中，使用supper.属性或者supper.方法名（）的方式，显式调用父类声明中的方法和属性，通常情况下省略supper.结构，但是当子父类中定义了同名的属性，如果使用父类的属性，就要显式的使用supper.属性的形式调用。父类方法的调用与属性相同！

③supper调用构造器：可以在子类的构造器中，使用supper（形参列表）的方式，显式的调用父类中的构造器。必须声明在子类构造器中的首行，this(形参列表)或者supper(形参列表)只能声明一个。两个都不写，系统会默认添加supper()调用父类中空参的构造器。

在类的多个构造器中，至少有一个构造器使用supper()调用父类的构造器，

### 20、多态性

①理解：一个事物的多种形态；父类的引用指向子类的对象。

②多态的使用：当调用子父类的同名同参的方法时，实际执行的是子类重写父类的方法---虚拟方法调用

在编译期，只能调用父类声明的方法。但在运行期，实际执行的是子类重写父类的方法。（编译看左边，运行看右边）

③多态的使用前提：类的继承关系、方法的重写

④对象的多态性，只适用于方法，不使用属性。

### 21、instanceof关键字

①向上转型：多态

②向下转型：强制类型转换（类型），使用instanceof判断类型是否一致！

### 22、Object类和包装类

Object类是所有Java类的根父类； 如果在类的声明中未使用extends关键字指明其父类，则默认父类为Object类。Object类中定义的功能具有通用性，只声明了空参的构造器和通用方法。

==运算符：

①可以使用在基本数据类型变量和引用数据类型变量中

②如果比较的是基本数据类型变量，比较两个变量保存的数据是否相等（不一定类型要相同）；

如果比较的是引用数据类型的变量，比较的是两个对象的地址值是否相同;

equals()方法：

只适用于引用数据类型，Object类中的equals方法与==相等。但是其他类重写了equals方法，比较的是两份对象的内容是否相等，例如String类

toString()方法：

①当我们输出一个对象的引用时，实际上调用当前对象的toString方法。

②例如String/Date/File、包装类等都重写了Obejct类中的toString方法，使得调用对象的toString时，返回对象的实体内容。

③自定义类也可以重写toString方法，当调用方法时，返回对象的实体内容。

包装类的使用：

①针对八种基本数据类型，定义相应的引用类型-----包装类，使得基本数据类型的变量具有类的特征。

②基本数据类型、包装类、String之间的相互转换：

③JDK5.0的新特性：自动装箱、自动拆箱

~~~ java
     	//基本数据类型转换包装类，调用包装类的构造器
        Integer in = new Integer(3);
        //基本数据类型转换包装类valueOf()方法
        int s = Integer.valueOf(1);
        System.out.println(in);

        //包装类转换成基本数据类型,xxxValue()
        int i = in.intValue();
        System.out.println(i);

        //基本数据类型、包装类，转换成String
        String str = 1 + "";
        String s1 = String.valueOf(123);

        //String 转换成基本数据类型或者包装类
        int i1 = Integer.parseInt("345");

        //自动装箱 自动拆箱
        Integer number = 1;  //自动装箱
        int count = number;  //自动拆箱
        System.out.println(number);
        System.out.println(count);

		//Integer内部定了一个-128-127之间的256个数的数组，当在此范围之间时，
		//直接使用数组中的元素，无需new，提升了效率。 
		Integer i3 = 1;
         Integer i4 = 1;
         System.out.println(i3 == i4);

         Integer i5 = 128;
         Integer i6 = 128;
         System.out.println(i5 == i6);

~~~

### 22、static关键字

①静态的，可以修饰属性、方法、代码块、内部类

②static修饰属性：静态变量，static修饰的属性为静态属性，每个对象公有此静态属性！没有被static修饰的属性为非静态属性（实例变量）每个对象独自拥有。

③静态变量随着类的加载而加载，静态变量的加载早于对象的创建。由于类只会被加载一次，则静态变量在内存中只会存在一份，存在方法区的静态域中。

④静态方法：使用static修饰的方法，随着类的加载而加载，可以使用类名.方法名（）的形式，直接调用！

静态方法中只能调用静态的方法或属性，非静态方法中既可以调用非静态的方法和属性又可以调用静态的方法和属性。

⑤在静态方法内不能使用this/supper关键字，

⑥在开发中如何确定属性和方法要不要声明成static的:

​	属性可以被多个对象共享，就可以声明成静态的。

​	操作静态属性的方法，通常声明为静态的。工具类中的方法通常声明为静态的。

~~~ java
 //常量的声明
public static final int NUM = 10;

~~~

### 23、单例设计模式

①所谓单例设计模式，就是采取一定的方式保证在整个软件系统中，对某个类只能存在一个对象的实例。

②饿汉式vs懒汉式

③区别：

​	饿汉式：好处：线程安全     坏处：对象加载时间过长

​	懒汉式：好处：延迟对象的创建   坏处：线程不安全

### 24、main方法的使用说明

①作为程序的入口

②也是一个普通的静态方法

③可以作为我们与控制台交互的方式

### 25、代码块

①代码块的作用：用来初始化类、对象

②代码块如果有修饰的话只能用static修饰：

静态代码块：随着类的加载而执行，而且只执行一次。可以初始化类的信息。如果一个类中定义了多个静态代码块，按声明的位置先后执行。只能调用静态的结构，不能调用非静态的结构。

非静态代码块：随着对象的创建而执行，每创建一个对象执行一次。可以在创建对象时对对象的属性等进行初始化。如果一个类中定义了多个非静态代码块，也按声明的位置先后执行。既可以调用非静态结构，又可以调用静态结构。

静态代码块的执行，优先于非静态的代码块。

对象属性赋值的先后顺序：

①默认初始化 ②显示初始化/代码块中赋值  ③构造器中初始化 ④创建对象后用：对象.属性 进行赋值

### 26、final关键字

①含义：最终的、最后的

②修饰类：此类不能被其他类继承，不能有子类。例如String/System/StringBuffer

③修饰方法：此方法不能被重写，例如Object类重的getClass()方法。

④修饰变量：此变量成为一个常量

final修饰属性： 考虑赋值的位置：显式初始化、 代码块中初始化、构造器中初始化、

final修饰局部变量和修饰形参时，表示是一个常量。当我们调用此方法时，给常量形参赋值，一旦赋值将再不能改变。

static final 修饰变量则为全局常量、修饰方法则为静态方法但是一般不加final，方法调用通过类型.方法（）调用。

~~~ java
//常量的声明
public static final String AGE = "28";

~~~

### 27、抽象类和抽象方法

①abstract抽象关键字，可以用来修饰类和方法。

②修饰类，叫做抽象类，此类不可实例化，抽象类中一定有构造器，便于子类实例化时使用。开发中都会提供抽象类的子类，当子类对象实例化，完成相关的操作。

③修饰方法，叫抽象方法，只有方法的声明没有方法体。包含抽象方法的类一定是一个抽象类，反之，抽象类中可以没有抽象方法。

④若子类重写了父类所有的抽象方法后方可实例化，如果没有全部重写，那么子类也是一个抽象类。

~~~ java
package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-01 15:18
 */
public class AbstractTest {
    public static void main(String[] args) {
        Man m = new Man();
        m.eat();
    }
}

//抽象类不能实例化，只能实例化子类
abstract class Person{
    //抽象方法只有方法的声明
    public abstract void eat();
}

class Man extends Person{
    public void eat(){
        System.out.println("我要吃好的！");
    }
}

~~~

⑤abstract不能修饰 属性、构造器等结构，不能修饰私有方法、静态方法、final方法、final类。

⑥抽象类的匿名子类：

~~~java
package com.ybjt.study06;
/**
 * @author zxh
 * @create 2019-11-01 15:44
 */
public class AbsTest {
    public static void main(String[] args) {
        //抽象类的匿名子类
        Animal a = new Animal() {
            @Override
            void eat() {
                System.out.println("饭后");
            }

            @Override
            void walk() {
                System.out.println("百步走");
            }
        };
       a.eat();
       a.walk();
    }
}

//抽象类
abstract class Animal{
    abstract void eat();
    abstract void walk();
}

~~~

### 28、模板方法的设计模式

~~~ java
package com.ybjt.study06;

/**
 * 抽象的应用模板方法
 * @author zxh
 * @create 2019-11-01 16:06
 */
public class TemplatesTest {
    public static void main(String[] args) {
        SubTemplate sub = new SubTemplate();
        sub.countTime();
    }
}


abstract class Template{
    public void countTime(){
        long start = System.currentTimeMillis();
        code();//不确定的部分、易变得部分
        long end = System.currentTimeMillis();
        System.out.println(end-start+"mm");
    }

    public abstract void code();
}


class SubTemplate extends Template{
    @Override
    public void code(){
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
    }
}

~~~

### 29、interface接口

①接口使用interface关键字定义，在java中接口和类是并列结构。

②接口的定义：

​	JDK7.0之前：只能定义全局常量和抽象方法。

~~~ java
public static fianl int NUM = 90;//全局常量，public static fianl书写时可以省略不写。
public abstract void sec();//抽象方法,public abstract书写时可以省略不写

~~~

​	JDK8.0：除了定义全局常量和抽象方法还能定义静态方法和默认方法

~~~ java
//接口中还可以定义静态方法和默认方法
public interface Compare{
    public static void method(){}//静态方法，public可以胜略，但是它还是public的。只能用接口去调用。
    public default void method2(){}//默认方法，public可以胜略，但是它还是public的。通过实现类的对象可以调用默认方法。如果实现类重写了接口中的默认方法，调用时，调用的是重写后的方法。
    //如果子类（或实现类）继承的父类和实现的接口中声明了同名同参的方法，那么子类在没有重写此方法的情况下，默认调用的是父类中同名同参的方法。如果重写了则调用重写后的方法。-->类优先原则
    //如果实现类实现了多个接口，接口中定义了同名同参的默认方法，那么在没有重写的情况下，报错-->冲突，那么就必须重写，则调用重写后的方法。
    //如何在子类（或实现类）的方法中调用父类或接口中被重写的方法
    Compare.supper().method();
}

~~~

③接口中不能定义构造器，不可以实例化。

④Java开发中让类去实现接口，使用implements关键字来实现，如果实现类覆盖了接口中的所有的抽象方法，此实现类就可以实例化，如果没有全部覆盖，那么此实现类就是抽象类。

~~~ java
package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-04 9:22
 */
public interface InterfaceTest {
    int AGE = 25;//省略public static final
    void song();//省略public abstract
}

class Inter implements InterfaceTest{
    //常量不可以改变
    @Override
    public void song(){
        System.out.println("我今年"+AGE+"岁！"+"我喜欢唱歌！");
    }
}

class mainTest{
    public static void main(String[] args) {
        Inter i = new Inter();
        i.song();
    }
}

~~~

⑤Java类可以实现多个接口，弥补了Java单继承性的局限性。先写继承父类再写实现接口。

⑥接口和接口之间可以继承，而且可以多继承。

⑦接口的具体使用，体现多态性。

⑧接口实际上可以看做是一种规范。开发中体会面向接口编程。

⑨接口的使用：静态代理模式

~~~ java
package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-04 10:37
 */
public class StaticProxy {
    public static void main(String[] args) {
        ChenHeProxy proxy = new ChenHeProxy(new ChenHe());
        proxy.work();
    }
}

//接口定义功能
interface Star{
    void song();
    void dance();
}

//实现功能的真是对象
class ChenHe implements Star{
    @Override
    public void song(){
        System.out.println("陈赫唱歌！");
    }

    @Override
    public void dance() {
        System.out.println("陈赫跳舞！");
    }
}
//代理对象
class ChenHeProxy implements Star{
    private Star realStar;

    ChenHeProxy(Star realStar){
        this.realStar = realStar;
    }

    @Override
    public void song(){
        realStar.song();
    }

    @Override
    public void dance(){
        realStar.dance();
    }

    public void work(){
        System.out.println("代理人准备舞台！");
        song();
        dance();
    }
}
//输出
/*
	代理人准备舞台！
	陈赫唱歌！
	陈赫跳舞！
*/

~~~

 ### 30、内部类

①当一个事物的内部，还有一个部分需要一个完整的结构进行描述，而这个内部的完整结构又为外部事物提供服务，那么整个内部的完整结构做好使用内部类。

②Java允许将一个类A声明在另一个类B中，则类A就是内部类，类B就是外部类。

③内部类的分类：成员内部类（静态和非静态）和局部内部类（方法内、代码块内、构造器内）

成员内部类：类内可以定义属性、方法、构造器等；可以被final修饰表示此类不能被继承，不使用final就能被继承；可以被abstract修饰；调用外部类的结构；权限修饰符修饰；static修饰；

④实例化成员内部类的对象：

~~~ java
//静态内部类
Person.Dog d = new Person.Dog();
//非静态内部类
Person p = new Person();
Person.Bird b = p.new Bird()


~~~

在局部内部类的方法中，如果调用局部内部类所在的方法中的局部变量，要求次局部变量要声明为final的。

~~~ java
package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-06 17:21
 */
public class InerClassTest {
    public static void main(String[] args) {
        Circle.Draw d= new Circle.Draw();
        d.drawSahpe();
    }
}

class Circle {
    double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    static class Draw {     //内部类
        public void drawSahpe() {
            System.out.println("drawshape");
        }
    }
}


~~~



### 31、异常处理

①Error：Java虚拟机无法解决的严重错误，如：JVM系统内部错误，资源耗尽等严重情况

②Exception:其他因编程错误或偶然的外在因素导致的一般性的问题，可以使用针对性的代码进行处理。例如：空指针、角标越界、文件不存在。。。

​	编译时异常（checked）:FileNotFindException

​	运行时异常（unchecked）:NullPointException

③异常处理

抓抛模型 过程一：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象，并将此对象抛出，一旦对象抛出后，其后的代码将不再继续执行。

过程二：异常的处理

try...catch...finally:try后面包含可能会出现异常的代码，可以包含多个catch，针对不同的异常情况进行不同的处理,匹配对应的异常类型后进入到catch内部进行处理，处理后跳出try...catch...结构，继续向下执行。finaliy中的代码最终会被执行，但是不一定要写可选。

catch中的异常类型如果没有子父类关系，则谁声明在上，谁在下无所谓；如果有子父类关系，那么子类一定声明在父类的上面，否则报错。

  使用try-catch-finally处理编译时异常，使得程序在编译时就不报错了，但是运行时仍可能报错。相当于将一个编译时异常推迟到运行时出现。

try-catch-finally结构可以嵌套，finally中声明的是一定会执行的代码，即时catch中又出现了异常，try中有return语句，catch中有return语句等情况。

像数据库连接，输入输出流，网络编程Socket等资源，JVM不会自动的回收，需要我们手动的进行资源的释放，此时的资源释放，就需要声明在finally中。

~~~ java
e.printStacktTrace();//异常信息输出至控制台

~~~

throws:"throws+异常类型"写在方法的声明处，指明此方法在执行时可能会抛出的异常，一旦当方法体执行时，出现异常,仍会在代码处生成一个异常类的对象，此对象满足throws后异常类型时，就会抛出异常，异常代码后续的代码就不再执行。throws的方式只是将异常抛给了方法的调用者，并没有真正处理异常。

子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常。

④开发中如何选择：

​	如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws,意味着如果子类重写的方法有异常，必须使用try-catch-finally进行处理。

​	层级调用的方法，底层结构先throws,顶层结构再try-catch。

⑤throw手动抛出异常：

~~~ java
throw new Exception("报错了。。。");

~~~

⑥自定义异常类：

​	继承RunTimeException或者Exception；提供serialVersionUID;提供重载的构造器；

~~~ java
package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-06 16:42
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("厉害");
        }
        System.out.println("就是这么厉害。。");
    }
}

~~~

~~~ java
package com.ybjt.study06;

/**
 * @author zxh
 * @create 2019-11-06 16:45
 */
public class MyExeption extends RuntimeException {

    private static final long serialVersionUID = 7575524614027820768L;

    public MyExeption(){
    }

    public MyExeption(String msg){
        super(msg);
    }
}

~~~

## 五、Java高级

### 1、多线程

①概念：程序、进行、线程、多核、单核、并行、并发

程序：为完成特定的任务，用某种语言，编写的一组指令的集合。即指一段静态的代码，静态对象。

进程：是程序的一次执行过程，或是正在运行的一个程序。

线程：进程可以进一步细化为线程，是一个程序内部的一条执行路径。若一个进程同时一时间并行执行多个线程，那么这个程序就是多线程的。

单核：只有一个cpu，假的多线程。

多核：多个cpu，更好的发挥多线程的效率。

并行：多个cpu同时执行多个任务、

并发：一个cpu同时执行多个任务、

②多线程的优点

提高应用程序的响应，对图形界面更有意义 ，增强用户体验；提高计算机系统的cpu的利用率；改善程序结构，将既长又复杂的的进程分为多个线程，独立运行，利于理解和修改。

③继承Thread类创建多线程

​	创建一个继承Thread类的子类；

​	重写Thread类的run方法；

​	创建子类对象，调用start()方法；

~~~ java
package com.ybjt.study07;
/**
 * @author zxh
 * @create 2019-11-11 14:12
 */
public class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i = 0 ;i<1000;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}

class Test{
    public static void main(String[] args) {
        ThreadTest thread = new ThreadTest();
        //启动当前线程；调用当前线程的run方法
        //不能直接调用run方法起动线程，一个线程只能启动一次。	
        thread.start(); 
        for(int i = 0 ;i<1000;i++){
            System.out.println(i+Thread.currentThread().getName());
        }
    }
}

~~~

④Thread类的常用方法：

start():启动当前线程；调用当前线程的run方法。

run():通常需要重写Thread类的run方法，将创建线程要执行的操作声明在重写的run方法内。

currentThread():静态方法，返回当前的代码的线程。

getName():获取当前线程的名字

setName()：设置当前线程的名字

yield():释放当前cpu的执行权，又有可能抢到执行权---->礼让

join()：在线程a中调用线程b的join方法，线程a就进入阻塞状态，直到线程b执行结束一会，线程a才会结束阻塞状态。

stop:已过时，结束当前线程

sleep（time）：让当前线程阻塞指定的时间，在这个时间内当前线程是阻塞状态。

isAlive():判断当前线程是否存活

⑤线程的调度

线程的优先等级：

MAX_PRIORITY:10

MIN_PRIORITY:1

NORM_PRIORITY:5 ---->默认优先级

方法：

```java
thread.getPriority();//获取当前线程的优先级
thread.setPriority();//设置当前线程的优先级

```

 高优先级的线程要抢占低优先级线程的cpu执行权，但只是从概率上讲，高优先级的线程被执行的概率较高，并不意味着只有当高优先级的线程执行完毕以后，低优先级的线程才开始执行。

⑥实现runable接口创建多线程

~~~ java
package com.ybjt.study07;

/**
 * @author zxh
 * @create 2019-11-11 15:43
 */
public class ThreadTest2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i+"####");
            }
        }
    }
}

class Test2{
    public static void main(String[] args) {
        ThreadTest2 thread = new ThreadTest2();
        Thread t1 = new Thread(thread);
        t1.start();
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(i+"----");
            }
        }
    }
}


~~~

⑦比较两种创建线程的方式

​	开发中优先使用实现runable接口的方式，实现的方式没有类的单继承性的限制，实现的方式更适合多个线程有共享数据的情况。

​	两种方式都需要重写run方法，将线程需要执行的代码，声明在run方法中。

⑧线程的生命周期

​	新建：当一个Thread类或其子类的对象被声明并创建时，新生的线程处于新建状态。

​	就绪：处于新建状态的线程被start()后，将进入线程队列等待cpu时间片，此时它已具备了运行条件，只是没有分配到cpu资源。

​	运行： 当就绪的线程被调度并获得cpu资源时，便处于运行状态。run()方法定义了线程的操作和功能。

​	阻塞：在某种特殊情况下，被人为的挂起或执行输入输出操作时，让出cpu的并临时中止自己的执行,进入阻塞状态。

​	死亡：当线程完成了它的全部工作或者线程被提前强制性的终止或出现异常导致结束。

⑨线程的安全问题

​	某个线程未完成时，另一个线程也参与进来，就会出现线程的安全问题。

​	如何解决：当一个线程操作共享数据的时候，其他线程不能参与进来；只能等到此线程操作完毕，其他线程才可以操作，即使此线程出现了阻塞也不能被改变。

⑩同步机制解决线程的安全问题

方式一：同步代码块 synchronized(同步监视器){需要被同步的代码}

操作共享数据（多个线程操作的变量）的代码，即为需要被同步的代码。

同步监视器：俗称锁，任何类的对象都可以充当这个锁；多个线程必须公用同一把锁；

在实现runable接口的方式中，可以考虑使用this充当同步监视器。

在继承thread类的方式中，可以使用类.Class对象充当同步监视器。

方法二：同步方法

​	如果操作共享数据的代码，完整的声明在一个方法中，那么不防将此方法声明为同步方法。

​	同步方法任然涉及同步监视器，只是不需要显式的声明。非静态的同步方法，同步监视器是this;静态方法的同步监视器是当前类。

好处：同步的方式解决了线程安全的问题；操作同步代码时，只能有一个线程参与，其他线程等待，相当于一个单线程的过程，效率较低（局限性）。

死锁：不同的线成分别占用对方需要的同步资源不放弃，都在等待对方放弃自己需要的同步资源，就形成了线程的死锁。

​	出现死锁后，不会出现异常，不会出现提示，只是所有的线程都处于阻塞状态，无法继续执行。

​	使用同步锁时避免出现死锁

解决方法：

​	专门的算法、原则；尽量减少同步资源的定义；尽量避免嵌套同步；

JDK5.0后线程的同步：

​	从JDK5.0以后开始，java提供了更强大的线程同步机制，通过显式的定义同步锁对象来实现同步，同步锁使用Lock对象充当。

①创建ReentrantLock对象

②在try...catch...finally结构中，手动加锁lock

③在finally结构中，手动的释放锁unclock.

面试题：synchronized与lock的异同？

相同：二者都可以解决线程安全的问题

不同：synchronized机制在执行完相应的代码以后，自动的释放同步监视器。lock需要手动的启动同步，同时结束时也需要手动的释放锁unlock。

线程的通信：

​	涉及到的三个方法：

​		wait():当前线程进入阻塞状态，并释放同步监视器。

​		notify():唤醒被wait的线程，如果有多个wait的线程，就唤醒优先级高的。

​		notifyAll():唤醒所有被wait的线程

​	三个方法的调用必须使用在同步代码块或者同步方法中；这三个方法的调用者必须是同步代码块或者同步方法中的同步监视器；这三个方法定义在Object类中；

sleep和wait方法的异同：

​	相同：都可以使得当前线程进入阻塞状态

​	不同：声明的位置不一样，sleep声明在thread类中，wait声明在Object类中；sleep可以在任何需要的场景下调用，wait必须在同步代码块或者同步方法中调用；如果两个方法都使用在同步代码块或者同步方法中，sleep不会释放同步监视器，wait会释放同步监视器；

JDK5.0新增的创建多线程的方式：

①实现callable的方式:创建一个实现callable方法的实现类；实现call方法，将此线程需要执行的操作声明早call方法内；创建callable接口实现类的对象；将此callable接口的实现类对象传递到FutrueTask的构造器中，创建FutrueTask的对象；将FutrueTask类的对象，传递到thread类的构造器中，创建Thread类的对象，并调用start()方法。获取call方法的返回值：FutrueTask的对象调用get()方法。

比实现runable接口方式的强大之处：

​	call：有返回值

​	call:可以抛出异常，被外面的操作捕获，获取异常的信息。

​	callable:支持泛型

②线程池的方式：

提前创建好多个线程，放入线程池中，使用时直接获取，使用完放回池中，可以避免频繁创建销毁、实现重复利用。

好处：提高响应速度，减少了创建新线程的时间；

​			降低资源消耗，重复利用线程池中的线程，不需要每次创建；

​			便于管理，可以设置池的大小、最大线程数、等待时间；

API：Executors和ExecutorService

~~~ java
package com.ybjt.study07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zxh
 * @create 2019-11-13 9:08
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //创建指定线程数的线程池ExecutorService是接口-->多态
        ExecutorService pool = Executors.newFixedThreadPool(10);
        //获取线程池的实现类，管理线程池，设置相应的属性
        ThreadPoolExecutor poolService = (ThreadPoolExecutor) pool;
        poolService.setCorePoolSize(5);
        poolService.setKeepAliveTime(100, TimeUnit.SECONDS);
        MyThread thread = new MyThread();
        poolService.execute(thread);
        poolService.execute(thread);
        poolService.shutdown();
    }
}


class MyThread implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            synchronized (this){
                notify();
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"售票"+ticket);
                    ticket--;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}

~~~

### 2、Java常用类

#### 1、String类

①String代表字符串，是一个final类，代表不可变的字符序列（当对字符串重新赋值时，需要重新指定内存区域赋值，不能使用原有的value赋值。当对现有的字符串进行连接操作时，也需要重新指定新的内存区域赋值，不能使用原有的value赋值。调用String类的replace的方法，修改字符串时，也是重新指定新的内存区域。）；String对象的字符内容是存储在一个字符数组中；继承了Serializable接口，表示字符串是支持序列化的；实现了Comparable接口，表示string可以比较大小；String内部定义了private final char value[],value用于存储字符串数据；

②通过字面量的方式（区别于new方式）给一个字符串赋值，此时的字符串声明在字符串常量池中，字符串常量池是不会存储相同内容的字符串的；

③String的实例化的方式：

​	字面量的方式：声明在字符串常量池中

​	new + 构造器的方式：在堆空间中创建对象，每new一个都是不同的一个。

常量与常量拼接的结果在常量池，且常量池中不会存在相同内容的常量，只要其中有一个是变量，结果就在堆中，相当于new了一个对象。如果拼接的结果调用intern()方法，返回值就在常量池。

④String类的常用方法：

 	str.length:返回字符串的长度

​	str.charAt(int index);返回指定索引处的字符

​	str.isEmpty():判断字符串是否为空，实际判断的是字符串的长度。

​	str.toLowerCase():转换为小写

​	str.toUpCase():转换为大写

​	str.trim():去除字符串前后的一个或多个空格

​	equals():比较字符串的内容是否相同

​	equalsIgnoreCase():忽略大小写比较字符串的内容是否相同

​	concat():将指定字符串拼接到此字符串的末尾，等价于"+"

​	compareTo():比较两个字符串的大小

​	substring(int index):返回新的字符串，是从此字符串的头开始到索引为index的截取。

​	substring(int start,int end):返回索引为start和end之间的子串，左闭右开。

​	 endsWith(String suffix):是否以指定的后缀结束。

​	startsWith(String preffix):是否以指定的前缀开始。

​	startsWith(String preffix,int offset):以指定索引开始的子串是否以指定的前缀开始

​	contains(String s):判断此字符串中是否包含指定的字符序列

​	indexOf(String s):返回指定字符串在此字符串中第一次出现处的索引，没有匹配到返回-1。

​	indexof(String s,int index):在此字符串中从指定的索引index开始，返回指定字符串在此字符串中第一次出现处的索引，没有匹配到返回-1。

​	lastIndexOf(String s)、lastIndexOf(String s,int index):从后往前找

​	replace():替换，将指定的字符或者字符串替换成指定的字符或者字符串

​	split(String regex):按照指定的规则分割，返回字符串数组。

⑤String与其他结构的转换

​	String-->基本数据类型、包装类：包装类的静态方法Integer.parseXxx();

​	基本数据类型、包装类-->String:调用String重载的valueOf()方法。

​	String-->char [] :str.tocharArray()返回一个char型数组

​	char [] -->String :调用String类的构造器new String(char);

​	String --> byte [] :str.getBytes()返回一个字节数组,可以指定字符集

​	 byte [] -->String:调用String类的构造器new String(char);

⑥Stringbuffer 和 Stringbuilder

​	String、Stringbuffer 和 Stringbuilder的异同？

​	效率：Stringbuilder > Stringbuffer > String

​	String :不可变的字符序列；底层使用char数组存储；默认空参构造器创建地层数组长度为0；

​	Stringbuffer:可变的字符序列；线程安全效率较低；底层使用char数组存储；默认空参构造器创建地层数组长度为16；

​	Stringbuilder：可变的字符序列；JDK5.0新增的，线程不安全效率高；底层使用char数组存储；默认空参构造器创建地层数组长度为16；

当append的字符长度大于了剩余的长度，就会自动扩容，新建一个数组，长度为原来长度的2倍加2，然后将原来的数据复制到新数组中。

StringBuffer与StringBuilder中的常用方法：

​	append():字符串拼接

​	delete():删除指定位置的内容

​	replace():替换

​	insert():在指定位置插入字符串

​	 reverse():把当前字符序列逆转

​	indexOf():返回首次出现的索引

​	substring():截取

​	length():长度

​	charAt():返回指定位置的字符

​	setChart():将指定位置的字符修改为新的字符

#### 2、JDK1.8之前时间API

①	java.lang.System

返回从1970年1月1日0时0分0秒到现在得时间毫秒数，时间戳！

``` 
System.currentTimeMillis();

```

②java.util.Date

~~~ java
package com.ybjt.study07;

import java.util.Date;

/**
 * @author zxh
 * @create 2019-11-13 16:00
 */
public class TimeTest {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());//Wed Nov 13 16:14:34 CST 2019
        System.out.println(d.getTime());//毫秒数

        Date date = new Date(456123354l);
        System.out.println(date.toString());
    }
}

~~~

③java.sql.Date

对应数据库中的日期变量的类型

```java
java.sql.Date d2 = new java.sql.Date(456123354l);

```

```java
//java.util.Date 转换为 java.sql.Date
java.sql.Date d2 = new java.sql.Date(date.getTime());

```

④SimpleDateFormat

格式化：日期---->字符串

解析：字符串---->日期

~~~ java
SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
Date date = new Date();
String str = format.format(date);//格式化
System.out.println(str);
try {
    format.parse("2020-11-13 08:52:46");//解析
} catch (ParseException e) {
    e.printStackTrace();
}

~~~

⑤Calendar日历类

实例化：创建其子类的对象GregorianCalendar；调用其静态方法getInstance();

~~~ java
Calendar instance = Calendar.getInstance();
System.out.println(instance.get(Calendar.DAY_OF_MONTH));
instance.set(Calendar.DAY_OF_MONTH,26);
System.out.println(instance.get(Calendar.DAY_OF_MONTH));
System.out.println(instance.getTime());
instance.setTime(new Date());
int i = instance.get(Calendar.DAY_OF_YEAR);
System.out.println(i);

~~~

#### 3、JDK1.8中的时间API

~~~　java
	    //当前的日期、时间、日期+时间
        LocalDate now = LocalDate.now();
        LocalTime now1 = LocalTime.now();
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now1);
        System.out.println(now2);

        //指定时间、不需要考虑偏移量
        LocalDateTime of = LocalDateTime.of(1992, 01, 13, 13, 12, 20);
        System.out.println(of);

        //获取
        System.out.println(now2.getDayOfMonth());//当月的第几天
        System.out.println(now2.getDayOfWeek());

        //设置，体现不可变性
        LocalDateTime localDateTime = now2.withMonth(12);
        System.out.println(localDateTime);
        System.out.println(now2);

        //增加相应数值
        LocalDateTime localDateTime1 = now2.plusDays(30);
        System.out.println(localDateTime1);

        //减去相应的数值
        LocalDateTime localDateTime2 = now2.minusDays(6);
        System.out.println(localDateTime2);

~~~

#### 4、instant 瞬时

时间线上的一个瞬时点

~~~ java
		Instant now = Instant.now();//获取本初子午线对应的标准时间
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));//根据时区，设置偏移量
        long l = now.toEpochMilli();//1970.1.1 开始的毫秒数
        long l1 = offsetDateTime.toEpochSecond();
        System.out.println(offsetDateTime);
        System.out.println(l);
        System.out.println(l1);

        Instant instant = Instant.ofEpochMilli(46564464542L);
        System.out.println(instant);

~~~

#### 5、DateTimeFormatter格式化解析时间日期

~~~ java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
String format = formatter.format(LocalDateTime.now());
System.out.println(format);

TemporalAccessor parse = formatter.parse("2019-11-13 10:28:40");
System.out.println(parse);

~~~

#### 6、Java比较器

​	java中的对象，正常情况下只能进行==或!=的比较，在实际开发场景中，我们需要对多个对象进行排序，从而比较大小。两个接口Comparable和Comparator。

①Comparable接口 --自然排序

​	例如String、包装类等实现了Comparable接口，重写了 compareTo(obj)方法，给出了比较两个对象大小的方式，从小到大排列。

​	对于自定义类，让自定义类实现Comparable接口，重写comparTo方法，在方法中指明如何排序。

重写compareTo(obj)方法的规则：

​	如果当前对象this大于形参对象obj，则返回正整数。

​	如果当前对象this小于形参对象obj，则返回负整数。

​	如果当前对象this等于形参对象obj，则返回零。

~~~ java
package com.ybjt.study07;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author zxh
 * @create 2019-11-14 9:11
 */
public class ComparableTest {

    @Test
    public void test1(){
        Goods [] arr = new Goods [5];
        arr[0] = new Goods("牛奶",5);
        arr[1] = new Goods("雪糕",2);
        arr[2] = new Goods("可乐",3);
        arr[3] = new Goods("鸡肉",25);
        arr[4] = new Goods("猪肉",50);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

class Goods implements Comparable{
    private String name;
    private int price;

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods g = (Goods)o;
            if(this.price > g.price){
                return 1;
            }else if(this.price < g.price){
                return -1;
            }else{
                return 0;
            }
        }
        //return Integer.compare(this.price ,g.price);包装类比较大小的方法
        throw new RuntimeException("传入的类型不一致，无法比较!");
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}

~~~

②Comparator接口--定制排序

​	当元素的类型某一实现java.lang.Compareable接口，而又不方便修改代码；或者实现了Compareable接口的排序规则不适合当前的操作，那么可以考虑使用Comparator来进行操作。

​	重写compare（Object o1,Object o2）方法，比较o1和o2的大小：

​		如果返回正正数，则o1大于o2

​		如果返回0，则o1等于o2

​		如果返回负正数，则o1小于o2

~~~ java
package com.ybjt.study07;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zxh
 * @create 2019-11-14 9:51
 */
public class CompartorTest {

    @Test
    public void test(){
        Car [] cars = new Car[3];
        cars[0] = new Car("手扶拖拉机",4);
        cars[1] = new Car("奔奔",3);
        cars[2] = new Car("摩托车",2);

        //Arrays.sort(cars);
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
               return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(Arrays.toString(cars));
    }
}


class Car implements Comparable{
    private String name;
    private int count;

    public Car(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof  Car){
            Car c = (Car)o;
            return Integer.compare(this.count,c.count);
        }
        throw new RuntimeException("类型不一致");
    }
}


~~~

#### 7、System、Math、BigInteger、BigDecimal

①System

​	代表系统，系统级的很多属性和控制方法都放置在改类内部。

~~~　java
long l = System.currentTimeMillis();//时间
String property = System.getProperty("java.version");//获取系统属性
System.gc();//通知垃圾回收机制回收
System.exit(0);//系统退出

~~~

②Math

数学操作相关

③BigInteger

不可变得任意精度的整数

④BigDecimal

在商业计算中，要求数字精度更高。支持不可变的任意精度的有符号十进制定点数。

### 3、枚举类

①类的对象只有有限个，确定的；当需要定义一组常量时，强烈建议使用枚举类。

②自定义枚举类

~~~ java
package com.ybjt.study07;

import org.junit.Test;

/**
 * @author zxh
 * @create 2019-11-14 11:21
 */
public class MyEnumTest {

    @Test
    public void test(){
        Week ewe = Week.EWE;
        System.out.println(ewe.getName());
    }
}

class Week{
    private final String name;
    private final String desc;
	
    //私有化类的构造器并给属性赋值
    public Week(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public static final Week MOD = new Week("星期一","好好上班");
    public static final Week EWE = new Week("星期二","好好学习");

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


~~~

③使用enum关键字

定义的枚举类默认继承与java.lang.Enum类；枚举类的多个对象之间用逗号分隔，末尾用分号结束。

~~~ java
package com.ybjt.study07;

import org.junit.Test;

/**
 * @author zxh
 * @create 2019-11-14 11:21
 */
public class MyEnumTest {

    @Test
    public void test(){
        Week ewe = Week.EWE;
        System.out.println(ewe.getName());
    }
}

enum  Week{

    MOD("星期一","好好上班"),
    EWE("星期二","好好学习");

    private final String name;
    private final String desc;

    private Week(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }


    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}


~~~

④Enum类中的常用方法

values():返回枚举类型的对象数组

valueof(String str):返回名为str的枚举对象

toString():返回当前枚举对象的常量名称

⑤使用enum关键字定义的枚举类实现接口的情况

 	情况一：实现接口，在枚举类中实现抽象方法。

​	 情况一:让枚举类的对象分别实现接口中的抽象方法。

### 4、注解（Annotation JDK5.0）

​	Annotation其实就是代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取，并执行相应的处理。可用于修饰包、类、构造器、方法、成员变量、参数、局部变量的声明，这些信息被保存在Annotation的name=value对中。通过使用注解，程序员可以在不改变原有逻辑的情况下，在源文件中嵌入一些补充信息。	

​	①JDK中提供的三个基本注解（编译时校验）

​	override：限定重写父类或者接口中的方法

​	deprecated:表示修饰的类、方法已过时

​	supperssWarnings:抑制编译器警告

​	②自定义注解

​	注解声明为@interface;内部定义成员，通常使用value表示；可以指定成员的默认值，使用default定义；如果自定义注解没有成员，表明是以个标识作用；如果注解有成员，在使用注解时，需要指明成员的值；

​	③JDK中的元注解

​	用于修饰注解的注解

​	Retention:指定所修饰的注解的生命周期。SOURCE/CLASS(默认行为)/RUNTIME

​		只有声明为RUNTIME生命周期的注解，才能通过反射获取。

​	Target:用于指定被修饰的注解能用于修饰那些元素

​	Documented:表示所修饰的注解，被javadoc解析是保留下来。

​	Inherited:被它修饰的注解具有继承性

④JDK8 注解的新特性

​	可重复注解：@Repeatable(MyAnnotations.class),Target/Retention/Inherited一致

​	类型注解：ElementType.TYPE_PARAMETER表示该注解能写在类型变量的声明语句中

​	ElementType.TYPE_USE表示该注解能写在使用类型的任何语句中

### 5、集合

①集合框架的概述

​	集合、数组都是对多个数据进行存储操作的结构，简称Java容器（此时的存储的值指的是内存层面的存储，不涉及到持久化的存储。）；

​	数组在存储数据时的特点：初始化后长度确定；一旦定义好其元素的类型也就确定了；

​	数组在存储数据时的缺点：数据的长度不能修改；数组中提供的方法非常有限，对于添加、删除、插入等操作，非常的不便，效率也不高 ；获取数组中实际元素的个数的需求，数组没有现成的属性或者方法可用。数组存储数据有序、可以重复，对于无序不可重复的需求不能满足。

②集合框架

-Collection接口：单列集合，用来存储一个一个的对象。

​	--List接口：存储有序的、可重复的数据。"动态数组" 

​		--ArrayList 	--LinkedList	--Vector

​	--Set接口：存储无序的、不可重复的数据。"数学中的集合"

​		--HashSet	--LinkedHashSet	--TreeSet

-Map接口：双列集合，用来存储一对（key-value）一对的数据。"数学中的函数 y = f(x)"

​	--HashMap	--LinkedHashMap:	--TreeMap:	--HashTable:	--Properties:

③Collection接口中的方法：

​	add():添加元素；size():元素的个数； addAll():将一个集合中的元素添加到另一个集合中；isEmpty():判断当前是否为空；clean():清空集合；contains():判断集合中是否包含元素；containsAll():判断集合中的元素是否全部包含在当前集合中；remove():移除某个元素；removeAll():集合中移除另一个集合中的全部元素；rerainAll():返回两个集合的交集；hashCode():返回集合的哈希值；toArray():集合转为数组；Arrays.asList():数组转集合；Iterator():返回遍历集合的迭代器。

结论：向Collecton接口的实现类的对象添加数据obj时,要求obj所在类要重写equals()方法

④集合元素的遍历

​	Iterator仅用于集合，集合对象每次调用Iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前。

~~~ java
public void test(){
        Collection col = new ArrayList();
        col.add(123);
        col.add("456");
        col.add(new Date());
		//迭代
        Iterator iterator = col.iterator();
        while (iterator.hasNext()){//判断是否有下一个元素
            Object next = iterator.next();//指针下移并返回指针对应的元素
            if("456".equals(next)){
                iterator.remove();//移除元素
            }
            System.out.println(next);
        }
    }

~~~

​	如果还未调用next()或在上次调用next()方法之后已经调用了remove方法，再调用remove都会报IllegalStateException。

for-each遍历：内部仍然调用迭代器，jdk 5.0新增，用于遍历集合和数组。

~~~ java
	    Collection col = new ArrayList();
        col.add(123);
        col.add("456");
        col.add(new Date());

        for(Object obj : col){
            System.out.println(obj);
        }

~~~

⑤List接口

​	ArrayList、LinkedLsit、Vector三者的异同？

​	同：都实现类List接口，存储数据的特点相同：存储有序的、可重复的数据。

​	不同：	 ArrayList:线程不安全、效率高；底层使用Object类型的数组；

​					LinkedLsit:底层使用双向链表；对于频繁的插入、删除操作使用比ArrayList效率高；

​					Vector:线程安全、效率高；底层使用Object类型的数组；

​	ArrayList源码分析：

​		JDK7.0的版本：

​			ArrayList list = new ArrayList():底层创建了一个长度为10的Object [] 数组；建议使用带参的构造器，				避免重复的扩容，提升效率。

​			list.add():如果此次的添加导致底层数组长度不够，就默认扩容为原来数组的1.5倍，同时需要将原有				数组中的数据复制到新数组。

​		JDK8.0的版本：

​			ArrayList list = new ArrayList():底层数组初始化为{}，并没有创建长度为10的数组。

​			list.add():第一次调用添加操作，底层才创建长度为10的数组，并将数据添加到容器中。后续的扩容与				jdk7.0中一致。

​		总结：jdk7中的ArrayList的对象创建类似于单例的饿汉式，jdk8中的ArrayList的对象创建类似于单例的懒汉式，延迟了数组的创建，节省了内存。

​	LinkedLsit源码分析：

​		LinkedList<> list = new LinkedList<>(); 内部声明了Node类型的first和last的属性，默认值为null;

​		list.add();将元素封装到Node中，创建了Node对象。

​		node的定义体现了双向链表的说法。

~~~ JAVA
 void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }

~~~

​	Vector源码分析：通过构造器创建对象时，底层都创建了长度为10的数组，在扩容时，默认扩容长度为原来的2倍。

​	常用方法：indexOf():返回指定元素第一次出现的索引

​					lastIndexOf():返回指定元素最后一次出现的索引

​					sublist()：返回start和end之间的子集，左闭右开。

​	list的遍历总结：迭代器；增强for;普通for(list.get(i));

​	list中的remove(int index)和remove(Object o)注意区分；

⑥Set接口(无序的、不可重复)

​	HashSet：线程不安全，可以存储null;底层数组加链表的结构；

​	LinkedHashSet：作为HashSet的子类，遍历其内部数据时，可以按照添加的顺序遍历。在添加数据的同时还维护了两个引用，记录此数据前一个数据和后一个数据，对于比较频繁的遍历操作，效率高于HashSet。

​	TreeSet：可以按照添加对象的指定属性进行排序；存放同一类型的数据。

​	无序的、不可重复的理解（以HashSet为例）：

​		set接口没有额外定义新的方法，全部使用Collection接口中的方法。

​		无序性不等于随机性，存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的hash	值。不可重复性保证添加的元素按照equals方法判断时，不能返回true，即相同的元素只能添加一个。

​		添加过程（数组+链表）：向HashSet中添加元素a，首先调用a所在类的hashCode()方法，计算a的哈希值，此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置（索引位置），判断数组此位置上是否已经有元素：

​	如果此位置上没有元素，则元素a添加成功；

​	如果此位置上有其他的元素b(或以链表形式存在多个元素)，则比较元素a与元素b的hash值：

​			如果哈希值不相同，则元素a添加成功；

​			如果哈希值相同，进而需要调用元素a所在类的equals()方法：

​					如果equals返回true,则元素a添加失败；

​					如果equals返回false,则元素a添加成功；

​	要求：向Set中添加的数据，其所在的类一定要重写hashCode和equals方法，重写的方法尽可能保持一致性，相同的对象具有相同的哈希值。重写技巧：两个方法使用相同的字段。

TreeSet：

​	向TreeSet中添加的数据，要求是同一类的对象；

​	两种排序：自然排序（Comparable）和定制排序（Comparator）。自然排序中比较两个对象是否相同的标准为：compareTo返回0，而不是equals方法。定制排序中比较两个对象是否相同的标准为：compare返回0，而不是equals方法。

⑦Map接口（双列数据，存储key-value数据）

​	--HashMap：线程不安全，效率高；可以存储null的key和value;底层结构：7 数组+链表  8 数组+链表+红黑树

​		--LinkedHashMap:保证在遍历map元素时，可以按照添加的顺序实现遍历。原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个，对于频繁的遍历操作，此类执行的效率高于HashMap。

​	--TreeMap:保证按照添加的key-value对进行排序，实现按key排序遍历，要求key必须是同一个类创建的对象；底层使用红黑树。排序：自然排序、定制排序

​	--HashTable:线程安全，效率低；不可以存储null的key和value；

​		--Properties:常用来处理配置文件，key和value都是String类型；

Map结构的理解：

​	Map中的key：无序的、不可重复的，使用Set存储所有的key，key所在的类要重写equals和HashCode方法（HashMap为例）；

​	Map中的value：无序的、可重复的，使用Collection存储所有的value；value所在的类要重写equals方法；

​	一个键值对：key-value构成了一个Entry对象；map中的Entry：无序、不可重复，使用set存储所有的entry;

HashMap底层实现原理（jdk 7）：

​	HashMap map =  new HashMap();在实例化以后，底层创建了长度是16的一维数组Entry [] table

​	map.put(key,value);首先调用key所在类的hashcode方法计算key的哈希值，此哈希值经过某种算法，得到Entry数组中的位置 ，如果此位置上的数据为空，此时添加成功；如果此位置上的数据不为空（此位置存在一个或者多个数据），比较key和已经存在的数据的哈希值，如果哈希值都不相同，此时添加成功；如果哈希值和已经存在的某个key的哈希值相同，此时调用key所在类的equals方法比较，如果返回false，此时添加成功，返回true，使用value替换存在的key对应的value。

​	在添加过程中会涉及扩容问题，扩容为原来容量的2倍，并将原有的数据复制过来。

jdk8相较与jdk7底层实现方面的不同：

​	new HashMap():底层没有创建一个长度为16的数组；jdk8底层的数组是Node不是Entry；首次调用put方法时，底层创建长度为16的数组；jdk7 数组+链表，jdk8 数组+链表+红黑树，当数组的某一个索引位置上的元素以链表形式存在的数据个数大于8且当前数组的长度大于64时，此时此索引位置上的所有数据改为红黑树存储。

LinkedHashMap底层（了解），每个node存储前一个和后一个的指针；

map接口中定义的方法：

​	put():添加；putAll():添加全部；remove():移除指定key的key-value对，并返回value;clear():清空当前map中的所有数据；get():根据key获取对应的value;containsKey():是否包含指定的key；containsValue():是否包含指定的value；size():返回map中的key-value对数；isEmpty():判断当前map是否为空；equals():判断当前map和参数对象是否相等；

map的遍历：

​	keySet():返回key构成的set集合

​	values():返回所有value构成的Collection集合

​	entrySet():返回key-value对构成的set集合

properties使用：

~~~ java
        Properties pro = new Properties();
        FileInputStream ins = null;
        try {
            ins = new FileInputStream("jdbc.properties");
            pro.load(ins);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        String name = pro.getProperty("name");
        System.out.println(name); 

~~~

⑧Collections工具类

​	操作Collection、map的工具类

​	面试题：Collection和Collections的区别？

​	常用方法：reverse(list):反转list中元素的顺序；sort():根据元素的自然顺序按升序排序；sort(list,comparator)：根据指定的规则对list进行排序；swap(list,i,j):交换i和j索引对应的元素； max():按自然顺序或者指定的规则，返回集合中最大的元素；min():按自然顺序或者指定的规则，返回集合中最小的元素；copy(List l,List k):将k中的内容复制到l中；synchronizedXXX():将指定集合包装成线程同步的集合，从而解决多线程并发访问集合时的线程安全问题；

~~~ java
	@Test
    public void test2(){
        List list = new ArrayList();
        list.add("123");
        list.add("456");
        list.add("789");

        System.out.println(list);

        List<Object> des = Arrays.asList(new Object[list.size()]);
        System.out.println(des);
        Collections.copy(des,list);
        System.out.println(des);
    }

~~~

### 6、泛型（JDK5.0）

什么是泛型：

​	标签---->就是允许在定义类、接口时通过一个标识表示类中某个属性的类型或者某个方法的返回值及参数类型。泛型是一个类，不能使用基本数据类型，可以使用基本数据类型的包装类。如果实例化时没有指定泛型的类型，默认为Object类型。

​	编译时就会进行类型检查，保证数据的安全。避免了类型的判断和强转操作。

自定义泛型结构：

​	泛型类、泛型接口：在类名后面使用一对<E>来表示这是一个泛型类，在类的内部结构中，可以使用E类型。继承时，如果泛型父类没有指定泛型的类型，那么子类也成了泛型类，如果父类指定了泛型的类型，那么子类也就确定了类型，不在需要声明泛型。

​	泛型类可能有多个参数，将多个参数一起放在一对<>内，用逗号分隔；泛型类的构造器不能使用泛型；泛型不同的引用不能相互赋值；如果泛型结构是一个接口或抽象类，则不可创建泛型类的对象；在类和接口中声明泛型时，不能在静态方法中使用泛型；异常类不是泛型的；不能使用T [] t = new T [10]，但是可以 T [] t = (T []) new Object [10];

​	泛型方法：在方法中出现了泛型的结构 ，泛型参数与类的泛型参数没有任何关系。泛型方法所属的类是不是泛型类都没有关系。 泛型方法可以声明为静态的，原因：泛型参数是在调用方法时确定的，并非在实例化类时确定的。

~~~ java
 public <E> List<E> toList(E e){
        return new ArrayList<E>();
    }

~~~

泛型类的使用场景：

​	封装一些工具类时，由于不确定一些类型，所有使用泛型。在实例化时或者继承时指明泛型的类型。

泛型在继承方面的体现：

​	类A是类B的父类，G<A>和G<B>二者不具备子父类关系，二者是并列关系。

​	泛型不同的引用不能相互赋值。

通配符的使用：

​	通配符 ?  匹配任意类型

​	G<A>和G<B>二者不具备子父类关系，二者是并列关系，二者共同的父类<?>

​	对于List<?> 就不能向其内部添加数据，除了null；允许读取数据，读取的数据类型为Object类型的；

有限制条件的通配符的使用：

​	？ extends A: G<? extends A>可以作为G<A>和G<B>的父类，其中B是A的子类。

​	? supper A: G<? supper A>可以作为G<A>和G<B>的父类，其中B是A的父类。

### 7、IO流

①File类的使用

​	File类的一个对象，代表一个文件或一个文件夹（目录）；

​	File类声明在java.io包下；

​	创建File类的实例：

​		File(String path);

​		File(String parentPath,String childPath);

​		File(File parrntFile,String childPath);

​	相对路径：相较与某个路径下，指明的路径。

​	绝对路径：包含盘符在内的文件或者文件目录路径。

​	文件路径分割符： String separator = File.separator;根据操作系统，动态的提供分隔符。

②File类的常用方法

​	lastModiFied():获取最后一次的修改时间，毫秒值

​	listFiles():获取指定目录下的所有文件或者文件目录的File数组

​	renameTo(File dest):把文件重命名为指定的文件路径，file1.renameTo(file2)为例说明：要想保证返回true，需要file1在硬盘中是存在的，且file2不能在硬盘中存在。

​	isDirectory():判断是否是文件目录

​	isFile():判断文件是否是文件

​	exists():判断是否存在

​	canRead():判断是否可读

​	isHidden():判断是否隐藏

​	creatNewFile():创建文件，若文件存在，则不创建，返回false。

​	mkdir():创建文件目录

​	mkdirs():创建文件目录，如果上层目录不存在将一起创建

​	delete():删除文件或者文件夹，不走回收站

③IO流原理及流的分类

​	input/output，I/O技术是非常实用的技术，用于设备之间的数据传输，Java程序中，对于数据的输入、输出都是以流的方式进行的。java.io包下提供了各种流类和接口，用以获取不同种类的数据，并通过标准的方法输入或输出数据。

按操作数据单位不同：字节流（8bit）、字符流(16bit)

按数据流的流向不同：输入流、输出流

按流的角色的不同：节点流、处理流

| 抽象基类 |    字节流    | 字符流 |
| :------: | :----------: | :----: |
|  输入流  |  InputSream  | Reader |
|  输出流  | OutputStream | Writer |

​	抽象基类                          节点流（或文件流）               缓冲流（处理流的一种）

 	InputStream					FileInputStream					BufferedInputStream

​	OutputStream                  FileOutputStream                  BufferedOutputStream

​	Reader				             FileReader                             BufferedReader

​	Writer								FileWriter                               BufferedWriter

④字符流

不能使用字符流处理图片、视频等文件

读取数据：

~~~ java
	public void test(){
        /**
         * read()返回读入的一个字符，如果达到文件末尾返回-1
         * 为了保证流资源一定可以执行关闭操作，需要使用try-catch-finally结构处理异常
         * 读入的文件一定要存在，否则报FileNotFoundException。
         */
        //实例化File类的对象，指明要操作的文件
       File file = new File("jdbc.properties");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            int data ;
            while((data = fr.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

~~~

~~~ java
	public void test2(){
        FileReader fr = null;
        try {
            File file = new File("jdbc.properties");
            fr = new FileReader(file);
            char [] buf = new char[1024];
            int lent;
            while((lent = fr.read(buf)) != -1){
               /* for (int i = 0; i < lent; i++) {
                    System.out.print(buf[i]);
                }*/
               String str = new String(buf,0,lent);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

~~~

写出数据：

​	输出操作，对应的File可以不存在，并不会报异常。如果不存在，在输出的过程中，会自动创建此文件；如果文件存在:FileWriter(file)/FileWriter(file,false)会对原有文件覆盖，FileWriter(file,true)不会覆盖原有文件，而是在原有文件的基础上追加内容；

~~~ java
	public void test3(){
        FileWriter fw = null;
        try {
            File file = new File("hello.txt");
            fw = new FileWriter(file,false);
            fw.write("good good study ! day day up !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

~~~

⑤字节流

图片的复制操作

~~~ java
	 public void test4(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file = new File("1.jpg");
            File dec = new File("2.jpg");

            fis = new FileInputStream(file);
            fos = new FileOutputStream(dec);

            byte [] by = new byte [1024];
            int len ;
            while((len = fis.read(by)) != -1){
                fos.write(by,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

~~~

⑥缓冲流

作用：提高流的读取、写入速度，原因是内部提供了一个缓冲区。

BufferedInputStream

BufferedOutputStream

BufferedReader

 BufferedWriter

关闭流时，外层流关闭后，内层流自动关闭，不再需要手动关闭。

~~~ java
	    File file = new File("2.jpg");
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);

~~~

⑦转换流（属于字符流）

​	转换流提供了字节流和字符流之间的转换

​	InputStreamReader 将InputStream转换为Reader  字节的输入流转换为字符的输入流

​	OutputStreamWriter将Writer转换为OutputStream  字符输出流转换为字节输出流

​	很多时候我们使用转换流来处理文件乱码问题，实现编码和解码的功能。

~~~ java
    @Test
    /**
     * 转换流测试
     */
    public void test(){
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File file = new File("古诗.txt");
            File dest = new File("复制.txt");

            isr = new InputStreamReader(new FileInputStream(file),"utf-8");

            osw = new OutputStreamWriter(new FileOutputStream(dest),"utf-8");

            char [] buf = new char[10];
            int lent ;
            while((lent = isr.read(buf)) != -1){
                osw.write(buf,0,lent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(osw != null){
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }	

~~~

⑧标准的输入、输出流

​	System.in 标准的输入流----> 键盘输入

​	System.out 标准的输出流----> 控制台输出

​	可以通过setIn()和setOut()两个方法，对默认设备进行改变。

~~~ java
/**
 * @author zxh
 * @create 2019-11-20 10:03
 */
public class Stream {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);//转换流
            br = new BufferedReader(isr);//缓冲流

            while(true){
                String s = br.readLine();
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

~~~

⑨打印流、数据流

PrintStream和PrintWriter: 提供一系列的print()和println()的方法，用于不同数据的输出。

DataInputStream和DataOutputStream:用于操作基本数据类型和String，读取数据的顺序要与写入数据的顺序一致，否则报错！

~~~ java
DataInputStream dataInputStream = new DataInputStream(new FileInputStream("data.text"));

~~~

⑩对象流 

​	ObjectInputStream 和 ObjectOutputStream 用于存储和读取基本数据类型和对象的处理流，它的强大之处就是可以把Java中的对象写入到数据源中，也能把对象从数据源中还原回来。

​	序列化：保存对象   反序列化：读取对象

对象序列化机制：允许把内存中的Java对象转换成平台无关的二进制流，从而允许数据的永久保存到磁盘或者通过网络传输，当其他程序获取了这个二进制流，就可以恢复成原来的Java对象。要求：java类实现了Serializable接口;但是不是序列化static和transient修饰的成员变量;提供了静态常量serialVersionUID，验证的版本一致。

```java
package com.ybjt.study08;

import java.io.Serializable;

/**
 * @author zxh
 * @create 2019-11-20 10:44
 */
public class Animal implements Serializable {
    private static final long serialVersionUID = -1666762942900923210L;

   private String name;
   private  int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


```

```java
public class ObjectStreamTest {
    @Test
    /**
     * 序列化
     */
    public void test(){
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream("obj.bat"));

            stream.writeObject(new Animal("猫咪",2));
            stream.writeObject(new Animal("猫咪2",3));

            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(stream != null){
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    /**
     * 反序列化
     */
    public void test2(){
        ObjectInputStream stream = null;
        try {
            stream = new ObjectInputStream(new FileInputStream("obj.bat"));
            Object o = stream.readObject();
            Object s = stream.readObject();
            if( o instanceof Animal){
                Animal an = (Animal)o;
                System.out.println(an);
            }
            if( s instanceof Animal){
                Animal an = (Animal)s;
                System.out.println(an);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(stream != null){
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

```

 11、随机存取文件流

​	RandomAccessFile 直接继承与Object类，且实现了DataInput和DataOutput，既可以读也可以写（即可作为输入流、也可作为输出流）。支持随机访问的方式，程序可以直接跳到文件的任意地方来读或者写；包含一个记录指针，用以标示当前读写的位置。

​	RandomAccessFile 作为输出流，如果写出到的文件不存在，则创建；如果文件存在，则会对原有文件内容进行覆盖（从头覆盖）。

### 8、网络编程

①网络编程的概述

​	网络编程中两个主要的问题：

​		1、如何准确的定位网络上的一台或者多台主机；定位主机上的应用。

​		2、找到主机后如何可靠高效的进行数据传输

​	网络编程中的两个要素：

​		1、对应问题一：IP和端口号

​		2、对应问题二：提供网络通信协议：TCP/IP参考模型（应用层、传输层、网络层、物理+数据链路层）

​	通信要素一：

​		IP:唯一的标识Internet上的计算机

​		在Java中使用InetAddress类来代表IP

​		IP分类：IPV4/IPV6 ; 万维网/局域网

​		域名：www.baidu.com

​		本地回环地址：localhost/127.0.0.1

​		实例化InetAddress：InetAddress.getByName();InetAddress.getLocalHost();

​		常用方法：getHostName()---->域名   getHostAddress() ---->ip

​		端口号：标识正在计算机上运行的进程，不同的进程有不同的端口号，规定为一个16位的正数0-65535。公认端口:0-1023;注册端口：1024-49151；动态/私有端口：49152-65535

​		端口号与IP地址的组合得出一个网络套接字：Socket

~~~ java
    public void test(){
        InetAddress address = null;
        try {
            address = InetAddress.getByName("www.baidu.com");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(address);
        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println(hostName);
        System.out.println(hostAddress);
    }

~~~

​	通信要素二：

​		传输层协议：

​			传输控制协议：TCP  先建立连接，再发送数据。---->打电话

​			数据报协议：UDP 无需连接，直接发送。---->对讲机

②TCP网络编程

~~~ java
public class TCPTest {
    @Test
    public void client(){
        System.out.println("客户端启动，开始发送数据。。。");
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            socket = new Socket("127.0.0.1",5639);
            outputStream = socket.getOutputStream();
            outputStream.write("你好！".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void server(){
        System.out.println("服务端启动成功！等待接受数据。。。。");
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        ByteArrayOutputStream ods = null;
        try {
            serverSocket = new ServerSocket(5639);
            accept = serverSocket.accept();
            inputStream = accept.getInputStream();
            ods = new ByteArrayOutputStream();
            byte [] dest = new byte[5];
            int lent;
            while ((lent = inputStream.read(dest)) != -1){
                ods.write(dest,0,lent);
            }
            System.out.println(ods.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(ods != null){
                try {
                    ods.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(accept != null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

~~~

③UDP网络编程

~~~ java
package com.ybjt.study09;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议编程
 * @author zxh
 * @create 2019-11-20 16:11
 */
public class UDPTest {
    @Test
    public void send(){
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
            String str = "我的天啊";
            byte[] bytes = str.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length,InetAddress.getLocalHost(),9090);
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(socket != null){
                socket.close();
            }
        }
    }

    @Test
    public void recive(){
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(9090);
            byte [] buff = new byte[20];
            DatagramPacket packet = new DatagramPacket(buff,0,buff.length);
            socket.receive(packet);
            System.out.println(new String(packet.getData(),0,packet.getLength()));
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(socket != null){
                socket.close();
            }
        }
    }
}

~~~

④URL编程

URL:统一资源定位符，它表示Internet上某一资源的地址。https://www.baidu.com

URI:统一资源标识符，www.baidu.com

~~~ java
package com.ybjt.study09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

/**
 * @author zxh
 * @create 2019-11-20 17:03
 */
public class URLTest {
    public static void main(String[] args) {
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        FileOutputStream stream = null;
        try {
            URL url = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1574250661866&di=4559a0b4220146da9fec6ee73a652ad3&imgtype=0&src=http%3A%2F%2Fimg01.mall.cmbchina.com%2FProductLongDesc%2F2017-12-18%2Fee8f0968-3256-48b2-9338-9b85578370e1.jpg");
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            inputStream = connection.getInputStream();
            stream = new FileOutputStream("2.jpg");
            byte [] dd = new byte[1024];
            int lent;
            while ((lent = inputStream.read(dd)) != -1){
                stream.write(dd,0,lent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(stream != null){
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(connection != null){
                connection.disconnect();
            }
        }
        System.out.println("下载完成！");
    }
}


~~~

### 9、反射

①反射机制概述

​	Java Reflection 反射被视为动态语言的关键，反射机制允许程序在执行期借助于Reflection API取得任何类的内部信息，并能直接操作任意对象的内部属性及方法。

​	通过反射，可以调用类的私有的结构。（不使用反射不能调用）

​	类的加载过程：程序经过javac.exe命令后，会生成一个或多个字节码文件（.calss）。接着我们使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中。此过程就成为类的加载。加载到内存中的类 ，我们就称为运行时类，此运行时类，就作为Class的一个实例。加载到内存中的运行时类，会缓存一定的时间，在此时间内，我们可以通过不同的方式来获取此运行时类。

②获取Class实例的方式

~~~ java
package com.ybjt.study10;

import com.ybjt.bean.User;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zxh
 * @create 2019-11-20 21:40
 */
public class ReflectTest {
    @Test
    public void test() throws Exception {
        Class<User> clazz = User.class;
        Constructor<User> constructor = clazz.getConstructor(String.class);
        User user = constructor.newInstance("张三");
        System.out.println(user);

        Method song = clazz.getMethod("song");
        song.invoke(user);

        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(user,"28");
        System.out.println(user);
    }

    /**
     * 获取Class类的实例
     */
    @Test
    public void test2() throws Exception {
        //方式一
        Class<User> userClass = User.class;
        System.out.println(userClass.toString());
        //方式二
        User user = new User("张三");
        Class<? extends User> aClass = user.getClass();
        System.out.println(aClass.toString());
        //方式三
        Class<?> aClass1 = Class.forName("com.ybjt.bean.User");
        Constructor<?> constructor = aClass1.getConstructor(String.class);
        Object o = constructor.newInstance("李四");
        Field age = aClass1.getDeclaredField("age");
        Field address = aClass1.getDeclaredField("address");
        address.setAccessible(true);
        address.set(o,"中关村");
        age.setAccessible(true);
        age.set(o,"28");
        System.out.println(o.toString());

        //方式四 使用类的加载器
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        Class<?> aClass2 = classLoader.loadClass("com.ybjt.bean.User");
        System.out.println(aClass2);

    }
}

~~~

说明：只要数组的元素与维度一样，就是同一个Class。

③类加载器

​	类的加载（将类的class文件读入到内存，并为之创建一个Class对象，此过程由类的加载器完成。）---->

​	类的链接（将类的二进制数据合并带JRE中）---->类的初始化（JVM负责对类进行初始化）

④获取类的结构

​	getFiles():获取当前运行时类及其父类中声明为public访问权限的属性。

​	getDeclaredFiles()::获取当前运行时类当中声明的所有属性，不包含父类的属性。

​	getMethods():获取当前运行时类及其父类中声明为public访问权限的方法。

​	getDeclaredMethods()::获取当前运行时类当中声明的所有方法，不包含父类的方法。

​	getConstructors():获取当前运行时类及其父类中声明为public访问权限的构造器。

​	getDeclaredConstructors()::获取当前运行时类当中声明的所有构造器。

⑤动态代理

​	使用一个代理将对象包装起来，然后用该代理对象取代原始对象。任何对原始对象的调用都要通过代理，代理对象决定是否以及何时将方法调用转到原始对象上。

~~~ java
package com.ybjt.study10;

/**
 * 静态代理
 * @author zxh
 * @create 2019-11-21 12:11
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        MacFactory mac = new MacFactory();
        CenterFactory center = new CenterFactory(mac);
        center.prodeuce();
    }
}


//接口定义功能
interface ComputerFactory{
    public void prodeuce();
}

class MacFactory implements ComputerFactory{
    @Override
    public void prodeuce() {
        System.out.println("生产16寸MacBook pro");
    }
}

class CenterFactory implements ComputerFactory{

    private ComputerFactory macfactory;

    public CenterFactory(ComputerFactory macfactory) {
        this.macfactory = macfactory;
    }

    @Override
    public void prodeuce() {
        System.out.println("生产包装配件");
        macfactory.prodeuce();
        System.out.println("售后服务");

    }
}

~~~

~~~ java
package com.ybjt.study10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 动态代理
 * @author zxh
 * @create 2019-11-21 12:24
 */
public class ProxyTest {
    public static void main(String[] args) {
        SupperMan supperMan = new SupperMan();
        Man proxyInstance = (Man) ProxyFactory.getProxyInstance(supperMan);
        proxyInstance.getBelive();
        proxyInstance.eat("麻辣汤");
    }
}

/**
 * 接口定义功能
 */
interface Man{
    public void getBelive();
    public void eat(String food);
}

/**
 * 被代理类
 */
class SupperMan implements Man{

    @Override
    public void getBelive() {
        System.out.println("I belive I can Fly");
    }

    @Override
    public void eat(String food) {
        System.out.println("超人喜欢吃"+food);
    }
}

/**
 * 获取代理类对象
 */
class ProxyFactory{
    public static Object getProxyInstance(Object obj){
        MyHandel handel = new MyHandel(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handel);
    }
}

class MyHandel implements InvocationHandler{

    private Object object;

    public MyHandel(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
    }
}


~~~

### 10 、JDK8 新特性

①Lambda表达式

​	格式： -> lambda操作符、箭头操作符

​				->左边：lambda形参列表（接口中抽象方法的形参列表）lambda形参列表的类型可以省略，只有一个参数其一对（）可以省略，其他情况都不能省略。

​				->右边：lambda体（重写的方法的方法体），lambda体使用一对{}包裹，如果内部只有一条执行语句（可能是return语句），可以省略{}和return关键字

​	Lambda表达式的本质作为接口的实例：函数式接口

~~~ java
package com.ybjt.study10;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author zxh
 * @create 2019-11-21 14:30
 */
public class LambdaTest {

    @Test
    public void test(){
        Comparator com =   new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        int compare = com.compare(23, 56);
        System.out.println(compare);

        System.out.println("***********************************");

        Comparator<Integer> c =(o1,o2)->o1.compareTo(o2);
        int pare = c.compare(99, 56);
        System.out.println(pare);
    }
}
~~~

②函数式接口

​	如果一个接口中只声明了一个抽象方法，就叫函数式接口。@FunctionalInterface ,匿名实现类都可以用Lambda表达式来写。

Java内置的4 大核心函数式接口：

​	消费型接口Consumer<T> 	void accept(T t)

​	供给型接口Supplier<T>		T get()

​	函数型接口Function<T,R>    R apply(T t)

​	断定型接口Predicate<T>      boolean test(T t)

③Stream API

​	关注的是数据的运算，与cpu交互。

④optional类

​	为了在程序中避免出现空指针异常