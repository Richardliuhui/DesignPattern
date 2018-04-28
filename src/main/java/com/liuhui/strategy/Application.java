package com.liuhui.strategy;

/**
 * @author liuhui
 * @date 2018-04-28 下午4:06
 */
public class Application {
    public static void main(String[] args) {
        BusinessMan man = new BusinessMan(new TransportationAirplane());
        man.transport();

        man.changetStrategy(new TransportationTrain());
        man.transport();

        man.changetStrategy(new TransportationVehicle());
        man.transport();
    }
}
