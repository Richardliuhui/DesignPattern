package com.liuhui.chain;

/**
 * @author liuhui
 * @date 2018-04-26 下午4:27
 */
public class Request {

    private String name;

    public Request(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void proceed(){
        System.out.println(name+"proceed");
    }

}
