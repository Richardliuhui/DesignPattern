package com.liuhui.mediator;

/**
 * @author liuhui
 * @date 2018-04-28 下午2:51
 */
public  abstract class AbstractMediator {

    protected AbstractColleague A;
    protected AbstractColleague B;

    public AbstractMediator(AbstractColleague a, AbstractColleague b) {
        A = a;
        B = b;
    }

    public abstract void AaffectB();

    public abstract void BaffectA();
}
