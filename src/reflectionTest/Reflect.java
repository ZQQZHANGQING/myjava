package reflectionTest;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 假设的框架类
 */
public class Reflect {
    public int methodtest(){
        try {
            return 1;
        }catch (Exception e){
            return 2;
        }finally {
            return 3;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //可以创建任意类的对象，可以执行任意方法
        //半成品软件，不需要在修改
        //前提 不能改变类的任何代码，可以创建任意类的对象，可以执行任意方法

        //1.加载配置文件
        //1.1创建 Properties 对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2，1获取Class目录下的配置文件
       ClassLoader classLoader =  Reflect.class.getClassLoader();
       InputStream is =  classLoader.getResourceAsStream("pro.properties");//获取资源对应的字节流
       pro.load(is);

       //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //3.加载该类进内存
        Class cls = Class.forName(className);

        //4.创建对象
        Object obj = cls.newInstance();
        //获取方法
        Method method = cls.getMethod(methodName);
        method.invoke(obj);

        System.out.println(new Reflect().methodtest());

    }

}
