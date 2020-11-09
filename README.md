# jdk8

jdk8源码的阅读理解

导入idea步骤:

![](https://cdn.jsdelivr.net/gh/xirui0920/images/public/1603179391571-1603179391568.png)

![](https://cdn.jsdelivr.net/gh/xirui0920/images/public/1603179401883-1603179401879.png)

![](https://cdn.jsdelivr.net/gh/xirui0920/images/public/1603179886142-1603179886137.png)

## 阅读顺序:

### 大致思路

1. 基本类型的包装类（Character放在最后）

1. String、StringBuffer、StringBuilder、StringJoiner、StringTokenizer（补充正则表达式的知识）

1. CharacterIterator、StringCharacterIterator、CharsetProvider、CharsetEncoder、CharsetDecoder（较难）

1. java.util.function下的函数表达式

1. java.nio下的各种Buffer实现

1. java.lang.ref和jdk.internal.ref下的各种引用：软引用/弱引用/虚引用

1. Unsafe的实现（JDK9之后有两个同名类，一个引用了另一个，建议放在一起阅读）

1. java.util.stream下的流式编程的实现（很难）

1. Thread和ThreadLocal

1. Math、Random、BigInteger、BigDecimal

1. java.lang.reflect下反射的实现（先掌握JDK 9之后引入的模块系统）

1. ClassLoader的实现

1. javax.lang.model下Java语言模型的实现（可以参考Java官方语法文档）

1. 注解（需要彻底掌握）Timer、ResourceBundle、Properties

1. 时间日期类型（尤其是Java8新增的部分）

1. java.lang.reflect.Proxy， JDK默认的动态代理

1. java.util.concurrent并发包。先读原子类，再读锁的实现类，最后阅读那些并发工具的实现（很难）

1. 集合框架，主要是三大类：List、Set、Map（先读非线程安全的实现，再读线程安全的实现）

1. 网络编程（主要阅读Socket通信部分，后续可以阅读HttpClient的实现）

1. IO，包含BIO/NIO/AIO（很难）

1. Files、Path等文件操作工具类

1. sql、xml处理类/接口

### 阅读明细类(看情况补充)

一、java.lang

1) Object 1
2) String 1
3) AbstractStringBuilder 1
4) StringBuffer 1
5) StringBuilder 1
6) Boolean 2
7) Byte 2
8) Double 2
9) Float 2
10) Integer 2
11) Long 2
12) Short 2
13) Thread 2
14) ThreadLocal 2
15) Enum 3
16) Throwable 3
17) Error 3
18) Exception 3
19) Class 4
20) ClassLoader 4
21) Compiler 4
22) System 4
23) Package 4
24) Void 4

二、java.util

1) AbstractList 1
2) AbstractMap 1
3) AbstractSet 1
4) ArrayList 1
5) LinkedList 1
6) HashMap 1
7) Hashtable 1
8) HashSet 1
9) LinkedHashMap 1
10) LinkedHashSet 1
11) TreeMap 1
12) TreeSet 1
13) Vector 2
14) Queue 2
15) Stack 2
16) SortedMap 2
17) SortedSet 2
18) Collections 3
19) Arrays 3
20) Comparator 3
21) Iterator 3
22) Base64 4
23) Date 4
24) EventListener 4
25) Random 4
26) SubList 4
27) Timer 4
28) UUID 4
29) WeakHashMap 4

三、java.util.concurrent

1) ConcurrentHashMap 1
2) Executor 2
3) AbstractExecutorService 2
4) ExecutorService 2
5) ThreadPoolExecutor 2
6) BlockingQueue 2
7) AbstractQueuedSynchronizer 2
8) CountDownLatch 2
9) FutureTask 2
10) Semaphore 2
11) CyclicBarrier 2
12) CopyOnWriteArrayList 3
13) SynchronousQueue 3
14) BlockingDeque 3
15) Callable 4

四、java.util.concurrent.atomic

1) AtomicBoolean 2
2) AtomicInteger 2
3) AtomicLong 2
4) AtomicReference 3

五、java.lang.reflect

1) Field 2
2) Method 2

六、java.lang.annotation

1) Annotation 3
2) Target 3
3) Inherited 3
4) Retention 3
5) Documented 4
6) ElementType 4
7) Native 4
8) Repeatable 4

七、java.util.concurrent.locks

1) Lock 2
2) Condition 2
3) ReentrantLock 2
4) ReentrantReadWriteLock 2

八、java.io

1) File 3
2) InputStream   3
3) OutputStream  3
4) Reader  4
5) Writer  4

九、java.nio

1) Buffer 3
2) ByteBuffer 4
3) CharBuffer 4
4) DoubleBuffer 4
5) FloatBuffer 4
6) IntBuffer 4
7) LongBuffer 4
8) ShortBuffer 4

十、java.sql

1) Connection 3
2) Driver 3
3) DriverManager 3
4) JDBCType 3
5) ResultSet 4
6) Statement 4

十一、java.net

1) Socket 3
2) ServerSocket 3
3) URI 4
4) URL 4
5) URLEncoder 4