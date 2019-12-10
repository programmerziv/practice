package prototype.framework;

/**
 * 每多一个实现类 都要向管理层注册一遍
 * 因为管理层是map集合存储，因此不需要动啥东西
 * 只要子类实现此接口就行
 * 什么时候用什么时候注册
 */
public interface Product extends Cloneable{

    void user(String s);

    Product createClone();
}
