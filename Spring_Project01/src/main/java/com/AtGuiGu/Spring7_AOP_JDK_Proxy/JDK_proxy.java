package com.AtGuiGu.Spring7_AOP_JDK_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Chaoqun Cheng
 * @date 2021-05-2021/5/3-17:18
 */

public class JDK_proxy {
    public static void main(String[] args) {
        //创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};
        //方法一: InvocationHandler 创建匿名内部代理对象
//        Proxy.newProxyInstance(JDK_proxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        UserDaoImpl userDao = new UserDaoImpl();
        //方法二: 写一个类, 再在其中写增强的方法
        //JDK_proxy.class.getClassLoader() 获取当前动态代理类的类加载器
        //interfaces 包含了需要被代理的类的实现的接口的数组,
        //new InvocationHandler() 需要增强的功能所实现的接口的实现类的对象,
        //该方法返回的是UserDao接口实现类的代理对象, 本质上也是实现UserDao接口, 所以需要强转成UserDao
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDK_proxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int res = dao.add(1,2);
        System.out.println("res="+res);

    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler{

    //1 创建的是谁的代理对象, 把谁传递进来
    //有参构造传递
    //在构造器的参数里, Object代表的就是所代理对象的类, 这样更加通用
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("被增强方法之前执行..."+method.getName()+":传递的参数..."+ Arrays.toString(args));

        //被增强的方法执行
        //(执行method方法的对象, 方法执行的参数)
        Object res = method.invoke(this.obj, args);

        //方法之后
        System.out.println("被增强方法之后执行..."+obj);
        return res;
    }
}
