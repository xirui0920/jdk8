package basicTypes;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: Cyrus
 * @date: 2020/10/22 11:17 上午
 * @description:
 */
public class ObjectTest {

    @Test
    public void test() throws CloneNotSupportedException {
        String a = "100";
        System.out.println(a.getClass());
        //数组默认继承Cloneable接口,可以使用clone方法,clone是浅拷贝
        String[] as = {"1", "2", a};
        String[] bs = as.clone();
        System.out.println(as.getClass());
        System.out.println(Arrays.equals(as, bs));
        System.out.println(as == bs);
        //浅克隆是指拷贝对象时仅仅copy对象本身和对象中的基本变量,而不拷贝对象包含的引用指向的对象
        //所以下例中demo对象的info还是原引用
        Demo demo = new Demo();
        demo.setA("a");
        demo.setB(true);
        demo.setC(1.2);
        Info info = new Info();
        info.setInfo("a");
        demo.setInfo(info);
        System.out.println("demo: " + demo.toString());
        Demo demoClone = demo.clone();
        System.out.println("demoClone: " + demoClone.toString());

    }
}
