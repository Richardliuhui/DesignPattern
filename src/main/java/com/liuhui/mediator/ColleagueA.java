package com.liuhui.mediator;

/**
 * @author liuhui
 * @date 2018-04-28 下午2:51
 */
public class ColleagueA extends AbstractColleague {
    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.AaffectB();
    }
}
