package com.pb.design_patterns.proxy;

/**
 * 代理对象,静态代理
 * 静态代理在使用时,
 * 需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类.
 */
public class UserDaoProxy implements IUserDao{
    //接收保存目标对象
    private IUserDao target;
    public UserDaoProxy(IUserDao target){
        this.target=target;
    }

    public void save() {
        System.out.println("静态代理,开始事务...");
        target.save();//执行目标对象的方法
        System.out.println("静态代理,提交事务...");
    }
}
