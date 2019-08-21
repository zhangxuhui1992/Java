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
###Thread类的常用方法start()启动线程，run()线程需要操作的内容写在重写了的run方法内。yield()礼让释放cpu的执行权。join（）插队、stop()结束线程、sleep()等待、isAlive()判断当前线程是否存活。