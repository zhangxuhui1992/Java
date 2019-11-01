# Java
# JavaSE学习代码Demo

## 书山有路勤为径 学海无涯苦作舟
### dos 命令 cls 清空命令行窗口、start新建窗口、exit关闭当前命令行
### path环境变量必须配置，告诉操作系统去哪里找java的可执行程序java/javac，配到bin目录即可
### classpath可以不用配置，告诉java的jvm虚拟机，去哪里找编写的java程序
### 标识符的命名规则：1、可以由大小写字母、数字、下划线、美元$组成。2、数字不能开头。3、java中的关键字、保留字不能使用。4、严格区分大小写。5、使用驼峰命名法，类名XxxYyy,变量名xxxYyy,方法名同变量名，常量名全部大写。
### 进制：二进制加前缀0b,八进制加前缀0，十进制默认没有前缀，十六进制加前缀0x
### Java是强类型语言。对于每种数据都定义了明确的具体的数据类型，在内存中分配了不同大小的内存空间。
### 整数类型：byte 1字节（bit,1bit = 8byte位）-128-127，short2个字节，int4个字节，long8个字节
### 浮点类型：float4个字节、double8个字节 字符类型：char两个字节0-65535。布尔类型：true false
### 整型默认为int类型的，声明long类型的数据，需在后面加L,long num = 562L.
### 浮点型默认为double.声明float类型的数据，需在后面加F，float nums = 56.23F.
### 除取整 模取余
### ａ＝ａ＋ｂ　相当于ａ＋＝ｂ　但是＋＝有自动进行的强制类型转换
### 异或运算符^ 两边的数据不一样为true.否则为false  短路与、短路或只计算左边。
### 三元运算符 变量名 = 布尔表达式？表达式一：表达式二；
### 位运算直接对二进制进行运算 <<左移乘 >>右移除 >>>无符号右移
### 按位异或 ^ 一个数按位异或另一个数两次，结果还是原来的数 9^7^7 = 9
### 静态方法只能调用静态方法，非静态方法既能调用静态方法又能调用非静态方法。
### 重载：overload在一个类中，可以定义多个名称相同、参数列表不同的函数，这种情况就叫做函数的重载。（通过函数明和参数列表确定调用的函数）
### 静态代码块在类加载的时候就执行完毕，类只加载一次，静态代码也就执行一次
### 创建对象的时候，先执行构造代码块，再执行构造函数。每创建一个对象都要执行一次。
### 如果在子类中定义了和父类中一样的成员函数，在子类对象中使用的就是子类中定义的函数，这种情况叫做方法的重写。
### final关键字：修饰类该类不能被其他类继承，直接写在class关键字前面；修饰的函数方法不能被重写，直接写在函数返回值类型前面。修饰变量，变量的值不能被修改，此时的变量就成为了常量。final修饰属性可以考虑的赋值位置：显示赋值、构造代码块、构造器中。修饰局部变量：方法内的变量成为常量，修饰形参，调用此方法时对变量赋值，此形参为常量。
### abstract 抽象类不能被实例化，子类继承抽象类。必须实现父类所有的抽象函数，否则，子类也是抽象的 。
### 对象的内存结构，栈(方法)、堆（对象），
### boolean 默认值为false
### 成员变量即类的属性，有默认初始化值，局部变量声明在方法内、方法形参、代码块内、构造器形参、构造器内的变量(局部变量没有初始化值，使用前必须赋值)。变量都有其作用域
### 权限修饰符 public protected default private  -->封装  局部变量不能使用权限修饰符
### return 结束方法；返回结果。
### "万物皆对象" ：在java语言中，我们将功能和结构封装到类中，通过类的实例化，来调用具体的功能结构来实现功能。
### 匿名对象：对象只使用一次
### 基本数据类型传值赋值传递的变量保存的实际值、引用数据类型传值赋值的是引用地址。
### 递归方法即方法自己调用自己形成循环，但是要有退出条件，否则栈内存溢出报错！
### 封装：隐藏实现细节，对外提供公共的访问方式！即get/set方法
### 如果没有定义构造器，编译器会默认添加一个构造器，如果自己定义了构造器，那么系统将不再提供默认的构造器！
### 3w what?why?who? 学习三部曲
### this关键字，当前对象或当前正在创建的对象，谁调用谁就是this，可以修饰属性、构造器（this(参数列表)，通过这样的方式调用本类中其他的构造器，并且要放在首行！只能调用另一个构造器）、方法 this.name = name;
### super关键字，当前对象的父类。super. 显示的调用父类中的属性或者方法。 super(形参列表)；调用父类的构造器。必须声明在首行。子类构造器会隐式super();调用父类的空参构造器！
### package 包 结构管理 类管理 声明在源文件的首行   命名规范 xxx.zzz.yyy  "见名知意"
### MVC设计模式 model模型层 view视图层 control控制层。分层开发、降低耦合性、程序员只需关注自己负责的部分，提高代码的关注度，从而提高代码质量。
### 面对对象的继承性extends(继承关键字)：子类拥有父类所有的属性和方法，相同的属性和功能向上抽取，造一个类，称为父类！继承了父类的类叫做子类。优点：减少代码冗余、提高代码复用性、便于功能的拓展（父类添加子类继承）、多态性的前提，父类中声明为私有的属性和方法，都能获取，只是因为封装性的影响，使得子类不能直接调用！（private）
### 关于继承性的规定：一个父类可以有多个子类、一个类只能有一个父类（类的单继承，类可以实现多个接口）、类可以多层继承，子父类是相对的。子类直接继承的类叫做直接父类，间接继承的类叫做间接父类。
### 基类：Object 所有的类都直接或间接的继承Object,所有的java类都具有Object类中的功能：toString()，clone(),equles(),wait().notify().hashcode(),finalize() ,getclass().
### 重写：overwrite,子类继承父类，对父类中同名同参的方法进行覆盖，这叫做重写。创建子类对象，调用子父类中同名同参的方法，调用的是子类重写后的方法。父类对象调用的是父类中的方法。
### 重写的规定：重写方法的方法名和形参列表与父类中被重写的方法相同，重写方法权限修饰符不小于父类中的权限修饰符，父类中私有的方法不能被重写。返回值类型：父类是void子类也只能是void，父类的返回值是a类型，子类的返回值是a类或者a类的子类。父类返回值是基本数据类型，之类重写的方法的返回值类型必须为相同的基本数据类型。throws 异常，子类抛出的异常类型不大于父类抛出的异常。父类中static的静态方法是不能被重写的。
### 面对对象：多态性；一个事物的多种形态，父类的引用指向子类的对象。当创建的对象调用子父类中同名的方法时，实际执行的是子类重写父类的方法（虚拟方法调用）。编译看左边、运行看右边。多态的前提是：有继承，有方法的重写。对象的是多态性只适用于方法，不适用于属性（编译运行都看左边）。多态性是运行时的行为。
### instanceof 关键字 用于判断某一对象是否是某个类的实例。避免向下转型的时候出现ClassCsatException，需要使用instanceof 进行判断。
### Object类的使用：所有类的根父类、java.lang.Object类默认被使用类继承
### == 和equals： "==" 判断基本类型数据的实际值，引用数据类型比较的是内存地址值是否相同。equals方法只适用于引用数据类型，object类中比较的是内存地址，部分类重写了equals方法，比较的对象的内容是否相等。例如string类 
### 自定义类中使用equals，都需要重写，让其比较对象的内容。
### java.lang.Object.toString();方法的使用：输出的对象的内存地址（getClass().getName() + '@' + Integer.toHexString(hashCode())），部分类重写了toString方法，输出的是对象的详细信息。
### 包装类：让基本数据类型具有类的特征和功能，Integer in = new Integer(123); int num = in.IntValue();Integer内部维护了一个缓存数组，存放-128-127之间的数，在此范围之间不需要创建，直接获取去用。
### static修饰变量，多个对象共享。静态变量随着类的加载而加载，由于类只加载一次，存放在方法区的静态域中，只有一份。
### static修饰方法，随类的加载加载，只有一份存在于静态方法区。静态方法只能调用静态方法。静态方法内不能使用thsi和super关键字。非静态方法既能调用静态方法，又能调用非静态方法。静态属性和静态方法可以从生命周期的角度去理解。
### 在开发中如何使用static: 属性和功能不会随着对象的不同而不同的。共享！操作静态属性的方法声明为静态的，工具类声明为静态的。
### 面对对象：抽象性abstract，抽象类：将父类设计的非常抽象，没有具体的实现，只定义功能,抽象类不能创建对象（不能实例化），抽象类中一定有构造器，便于子类对象实例化的时候调用。；抽象方法：用abstract修饰，只有方法的声明，没有方法体，包含抽象方法的类一定是抽象类，抽象类中不一定有抽象方法；
### 子类重写了父类所有的抽象方法，那么子类可以被实例化；子类没有全部重写父类的抽象方法，那么子类也是抽象的，需要使用abstract修饰。
### 抽象的应用场景：抽象类是用来模型化那些父类无法确定的实现，而是由其子类提供具体实现的对象的类。abstract不能修饰属性、构造器、不能修饰私有方法、不能修饰静态方法、不能修饰final方法。
### 抽象类的匿名子类：Person p = new Person(){ 重写父类的抽象方法};
### 模板方法的设计模式:当功能内部的一部分功能是确定的，一部分是不确定，那么将不确定的部分暴露出去，让子类去实现。
### interface接口：接口与类可以多实现，弥补了java单继承的局限性，先写继承再写实现，接口与接口之间可以多继承。接口的本质是标准、规范，接口不能定义构造器，不能实例化,使用implements关键字和类产生关系，如果实现类覆盖了所有的抽象方法，那么实现类可以实例化，如果没有全部覆盖，那么子类也是抽象的。jdk1.7：定义全局常量（public static final可以省略不写，默认添加）、抽象方法（public abstract void method();可以省略public abstract）。
### 接口的具体使用，体现多态性。接口实际上可以看做是一种规范。
### 代理proxy设计模式：为其他对象提供一种代理以控制对这个对象的访问，保护了真实对象！
### jdk1.8中接口的新特性：接口中还可以定义静态方法（只能通过接口来调用）和默认方法，
### 将程序执行中发生的不正常情况称为“异常” （语法错误和逻辑错误不是异常） error:java虚拟机无法解决的问题，例如jvm内部错误、资源耗尽。一般不编写针对编码进行处理。exception异常，因编程或偶然的外在因素导致的一般性问题。可以使用针对性的代码进行处理：空指针、读取不存在的文件、网络中断、角标越界
### 异常又分为：运行时异常（runtimeException）和编译时异常(IOException/classnotfindException)
### try-catch-finally :捕获异常
### throws:抛出异常
### 多线程：优点:提高应用程序的响应，提高计算机系统cpu的利用率，改善程序结构。应用场景：需要同时执行两个或者多个任务、程序需要一些等待的任务、需要一些后台的程序。
### Thread类的常用方法start()启动线程，run()线程需要操作的内容写在重写了的run方法内。yield()礼让释放cpu的执行权。join（）插队、stop()结束线程、sleep()等待、isAlive()判断当前线程是否存活。
---
itle: Java基础复习
date: 2019-08-27 17:07:18
tags: 一时学习一时爽、一直学习一直爽、代码虐我千百遍、我视代码如初恋。

---

# Java基础复习

<!-- more -->

## 一、绪论（2019.08.27）

### １、计算机包括硬件和软件两个部分。

硬件就是看得见的部分例如鼠标、键盘、主机、显示器。软件就是看不见的指令，例如操作系统、应用软件。

### 2、世界上没有最好的语言，每种语言都有各自的优点和缺点。（其实Java是世界上最好的语言）。

### 3、冯诺依曼体系结构

现代计算机的基础，现代大多数计算机仍然是冯诺依曼体系的组织结构，只是做了部分改进，并没有从根本上挣脱此体系的束缚。我们称冯诺依曼为计算机之父。中央处理器cpu以频率为衡量标准：1024hz = 1khz,1024khz=1mhz,1024mhz=1ghz（兆赫兹）。

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

```java
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
```

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

```java
JAVA_HOME D:\SystemForJava\java_1.8
Path %JAVA_HOME%\bin
```

### 8、第一个Java程序

```java
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
```

### 9、Java中的注释

```java
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

```

### 10、API

Java提供的基本编程接口，API文档即API的使用说明书。一个java源文件可以声明多个class，但是只能有一个类是被public修饰的，且只能加在和文件名同名的类上。即public修饰的类名和文件名相同。程序的入口是main方法，格式固定。每一个语句都以；结尾。每一个语句单独占一行。

## 三、Java基础

### 1、关键字与保留字

关键字：被java语言赋予了特殊含义，用作专门用途的单词，关键字中的所有单词都小写。calss public 等..

保留字：现有的java版本没有使用，以后的版本有可能使用。goto，const

### 2、标识符

定义：变量、方法和类等要素命名时使用的字符序列。凡是可以自己定义名字的地方都叫标识符。

定义规则：1.由26个英文大小写字母、数字0-9，_ 或$组成。2.数字不可以开头 3.不可以使用关键字和保留字但能包含。4.严格区分大小写，长度无限制。5.不能包含空格。驼峰原则，见名知意。

```XML
java中命名规范：
    包名：xxx 全部小写
    类名、接口名：XxxYyy
    方法名：xxYyy
    变量名：xxxYyyy
    常量名：XXX_YYY
```

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

```java
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
```

### 4、字符集

​	字符编码（英语：Character encoding）也称字集码，是把[字符集](https://baike.baidu.com/item/字符集)中的[字符](https://baike.baidu.com/item/字符/4768913)[编码](https://baike.baidu.com/item/编码)为指定[集合](https://baike.baidu.com/item/集合)中某一[对象](https://baike.baidu.com/item/对象/17158)（例如：[比特](https://baike.baidu.com/item/比特/3431582)模式、[自然数](https://baike.baidu.com/item/自然数/385394)[序列](https://baike.baidu.com/item/序列/1302588)、8位组或者[电脉冲](https://baike.baidu.com/item/电脉冲/10706490)），以便[文本](https://baike.baidu.com/item/文本/5443630)在[计算机](https://baike.baidu.com/item/计算机/140338)中存储和通过[通信](https://baike.baidu.com/item/通信)[网络](https://baike.baidu.com/item/网络)的传递。unicode，utf-8，gbk 

### 5、类型转换（不包含boolean）

#### 1、自动类型转换

当容量小的数据类型的变量与容量大的数据类型的变量做运算，结果自动提升为容量大的数据类型。当byte/short/chart三种变量做运算时提升为int类型。

byte 、  short   、chart  -->  int  -->  long  -->  float  -->  double

#### 2、强制类型转换

大容量的数据类型的变量赋值给小容量的数据类型，通过一对"(被转数据类型)"进行强转。

```java
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
```

说明：容量大小指的是表示数的范围。

### 6、String 字符串类型

String是引用数据类型，不是基本数据类型，声明使用一对"内容"。

String可以和8种数据类型做运算  +  法，连接运算，运算的结果为String类型。

```java
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
```

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

```java
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
```

### 8、运算符

#### 1、算术运算符

```java
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
```

#### 2、赋值运算符

```java
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
```

#### 3、比较运算符（关系运算符）

```java
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
```

#### 4、逻辑运算符

|   a   |   b   |  a&b  | a&&b  | a\|b  | a\|\|b |  !a   |  a^b  |
| :---: | :---: | :---: | :---: | :---: | :----: | :---: | :---: |
| true  | fasle | fasle | fasle | true  |  true  | fasle | true  |
| true  | true  | true  | true  | true  |  true  | fasle | fasle |
| false | true  | false | false | true  |  true  | true  | true  |
| false | false | false | false | false | false  | true  | fasle |

```java
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
```

#### 5、位运算符

```java
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
```

#### 6、三元运算符

```java
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
```

#### 7、运算符的优先级

如果想要部分运算优先，可以使用（）括起来，使其优先级提高。具体的优先级排序没有必要记。

### 9、流程控制（顺序结构、分支结构、循环结构）

#### 1、if...else..

```java
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
```

#### 2、switch...case...

```java
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
```

#### 3、for

```java
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
```

#### 4、while

```java
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
```

#### 5、do...while...

```java
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
```

```java
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
```

#### 6、嵌套循环

​	将一个循环结构声明在另一个循环的循环体中，分为内层循环和外层循环。

​	注意：尽量不要超过三层

```java
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
```

```java
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
```

#### 7、break/continue

```java
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
```

```java
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
```

### 10、数组

概念：数组是相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理。

特点：数组是有序排列的，数组的长度就是数组能保存元素的个数。 使用角标、索引来操作数组中的元素。

数组本身是引用类型的数据，而数组中的元素可以是任意数据类型，包括基本数据类型和引用数据类型。

创建数组对象会在内存中开辟一块连续的空间，而数组名中引用的是这块空间的首地址。

数组的长度一旦确定，就不能修改。

数组的分类：一维数组、二维数组/基本数据类型的数组、引用数据类型的数组。

数组异常：角标越界ArrayIndexOutOfBoundsExcetion、空指针异常NullPointerExcetion

```java
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
```

```java
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
```

```java
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
```

```java
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
```

```java
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
```

```java
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
```

## 四、面向对象

### １、面向过程与面向对象对比

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

```java
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
```

```java
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
```

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

```java
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
```

### 12、this关键字

三W学习法，what?why?how?

①this可以修饰属性和方法：当前对象或者当前正在创建的对象  this.name （属性）= name（形参）;

②this调用构造器：this(形参列表);通过形参列表指定调用本类的其他构造器（不能调用自己）。必须声明在当前构造器的首行！简化代码降低冗余！

### 13、package 

package 包 ：实现项目中类的管理，引入包的概念。声明类或者接口所属的包，声明在源文件带首行。属于标识符，遵循标识符的命名规范（全小写），见名知意。xxx.yyy.zzz 每"."一次表示一层文件目录。同一个包下不能定义同名的类或者接口。

### 14、MVC

MVC设计模式，M模型层、V视图层、C控制层。将程序输入输出、数据处理、一级数据展示分离开来的设计模式是程序结构变得灵活且清晰，同时也描述了各个程序之间的通信方式，降低了程序的耦合性。分层开发各司其职，程序员只需关注自己负责的部分代码，提高了代码的关注度，从而提高开发质量。

### 15、import

导入：在源文件中，显示的导入指定包下的结构（类或接口）。

```java
import java.until.String;
import java.util.*;//*表示导入包下的所有结构
import static XXX;//导入指定类或者接口中的静态结构：属性和方法
```

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

②在子类方法或者构造器中，使用supper.属性或者supper.方法（）的方式，显式调用父类声明中的方法和属性，通常情况下省略supper.结构，但是当子父类中定义了同名的属性，如果使用父类的属性，就要显式的使用supper.属性的形式调用。父类方法的调用与属性相同！

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

```java
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
```

### 22、static关键字

①静态的，可以修饰属性、方法、代码块、内部类

②static修饰属性：静态变量，static修饰的属性为静态属性，每个对象公有此静态属性！没有被static修饰的属性为非静态属性（实例变量）每个对象独自拥有。

③静态变量随着类的加载而加载，静态变量的记载早于对象的创建。由于类只会被加载一次，则静态变量在内存中只会存在一份，存在方法区的静态域中。

④静态方法：使用static修饰的方法，随着类的加载而加载，可以使用类名.方法名（）的形式，直接调用！

静态方法中只能调用静态的方法或属性，非静态方法中既可以调用非静态的方法和属性又可以调用静态的方法和属性。

⑤在静态方法内不能使用this.supper关键字，

⑥在开发中如何确定属性和方法要不要声明成static的:

​	属性可以被多个对象共享，就可以声明成静态的。

​	操作静态属性的方法，通常声明为静态的。工具类中的方法通常声明为静态的。

```java
 //常量的声明
public static final int NUM = 10;
```

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

```java
//常量的声明
public static final String AGE = "28";
```

### 27、抽象类和抽象方法

①abstract抽象关键字，可以用来修饰类和方法。

②修饰类，叫做抽象类，此类不可实例化，抽象类中一定有构造器，便于子类实例化时使用。开发中都会提供抽象类的子类，当子类对象实例化，完成相关的操作。

③修饰方法，叫抽象方法，只有方法的声明没有方法体。包含抽象方法的类一定是一个抽象类，反之，抽象类中可以没有抽象方法。

④若子类重写了父类所有的抽象方法后方可实例化，如果没有全部重写，那么子类也是一个抽象类。

```java
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
```

⑤abstract不能修饰 属性、构造器等结构，不能修饰私有方法、静态方法、final方法、final类。

⑥抽象类的匿名子类：

```java
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
```

### 28、模板方法的设计模式





 



















