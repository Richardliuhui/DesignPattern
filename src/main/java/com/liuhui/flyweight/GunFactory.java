package com.liuhui.flyweight;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author liuhui
 * @date 2018-04-26 下午3:44
 */
public class GunFactory {
    private Map<GunType, Shooting> gunRepo;
    public GunFactory() {
        gunRepo = new EnumMap<GunType, Shooting>(GunType.class);
    }
    public Shooting createGun(GunType type) {
        Shooting gun = gunRepo.get(type);
        if (null == gun) {
            switch (type) {
                case HANDGUN: {
                    gun = new HandGun();
                    gunRepo.put(GunType.HANDGUN, gun);
                    break;
                }
                case MUSKET: {
                    gun = new Musket();
                    gunRepo.put(GunType.MUSKET, gun);
                    break;
                }
                case SNIPER: {
                    gun = new Sniper();
                    gunRepo.put(GunType.SNIPER, gun);
                    break;
                }
                case SUBMACHINE: {
                    gun = new Submachine();
                    gunRepo.put(GunType.SUBMACHINE, gun);
                    break;
                }
            }
        }
        return gun;
    }
}
