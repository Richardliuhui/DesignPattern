package com.liuhui.interpreter;

/**
 * @author liuhui
 * @date 2018-04-28 上午9:59
 */
public class Constant extends Expression {

    private boolean value;

    public Constant(boolean value){
        this.value=value;
    }
    /**
     * 检验两个表达式在结构上是否相同
     *
     * @param obj
     */
    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Constant){
            return this.value == ((Constant)obj).value;
        }
        return false;
    }

    /**
     * 以环境为准，本方法解释给定的任何一个表达式
     *
     * @param ctx
     */
    @Override
    public boolean interpret(Context ctx) {
        return value;
    }

    /**
     * 返回表达式的hash code
     */
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    /**
     * 将表达式转换成字符串
     */
    @Override
    public String toString() {
        return new Boolean(value).toString();
    }
}
