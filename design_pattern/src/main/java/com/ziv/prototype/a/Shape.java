package com.ziv.prototype.a;

/**
 * <p>title: Shape</p>
 * <p>package: com.ziv.prototype</p>
 * <p>description: 图形类</p>
 *
 * @author zhangzong
 * @version 1.0
 * @date 2019/10/29 8:44
 */
public abstract class Shape implements Cloneable{

    private String id;

    protected String type;

    /**
     * 画
     */
    public abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    /**
     * 此方法的定义实现了新对象的复制
     * @return
     */
    @Override
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
