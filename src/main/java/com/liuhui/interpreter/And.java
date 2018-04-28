package com.liuhui.interpreter;

/**
 * @author liuhui
 * @date 2018-04-28 上午10:03
 */
public class And  extends Expression{
    private Expression left;
    private Expression right;

    public And(Expression left,Expression right){
        this.left=left;
        this.right=right;
    }
    /**
     * 检验两个表达式在结构上是否相同
     *
     * @param obj
     */
    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof And) {
            return left.equals(((And)obj).left) &&
                    right.equals(((And)obj).right);
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
        return left.interpret(ctx) && right.interpret(ctx);
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
        return "(" + left.toString() + " AND " + right.toString() + ")";
    }
}
