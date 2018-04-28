package com.liuhui.flyweight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author liuhui
 * @date 2018-04-26 下午3:46
 */
public class WeaponShop {


    private List<Shooting> shelfA;
    private List<Shooting> shelfB;

    public WeaponShop() {
        shelfA = new ArrayList<Shooting>();
        shelfB = new ArrayList<Shooting>();
        fillShelves();
    }

    private void fillShelves() {
        GunFactory factory = new GunFactory();

        shelfA.add(factory.createGun(GunType.HANDGUN));
        shelfA.add(factory.createGun(GunType.HANDGUN));
        shelfA.add(factory.createGun(GunType.MUSKET));
        shelfA.add(factory.createGun(GunType.MUSKET));
        shelfA.add(factory.createGun(GunType.SNIPER));
        shelfA.add(factory.createGun(GunType.SNIPER));
        shelfA.add(factory.createGun(GunType.MUSKET));
        shelfA.add(factory.createGun(GunType.HANDGUN));

        shelfB.add(factory.createGun(GunType.SUBMACHINE));
        shelfB.add(factory.createGun(GunType.SUBMACHINE));
        shelfB.add(factory.createGun(GunType.SUBMACHINE));
        shelfB.add(factory.createGun(GunType.SNIPER));
    }

    public final List<Shooting> getGunsOnShelfA() {
        return Collections.unmodifiableList(shelfA);
    }

    public final List<Shooting> getGunOnShelfB() {
        return Collections.unmodifiableList(shelfB);
    }

    public void enumrateShelves() {
        enumerateShelfA();
        enumerateShelfB();
    }

    private void enumerateShelfA() {
        System.out.println("从A货架上拿走所有武器");
        for (Shooting gun : shelfA) {
            gun.shoot();
        }
    }

    private void enumerateShelfB() {
        System.out.println("从B货架上拿走所有武器");
        for (Shooting gun : shelfB) {
            gun.shoot();
        }
    }
}
