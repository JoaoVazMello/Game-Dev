package meu.mod_armas.weapons.internal; // MESMO pacote das espadas

import meu.mod_armas.api.IWeapon;

public class WeaponFactory {

    // O método é STATIC para você não precisar dar "new WeaponFactory()"
    public static IWeapon getFireSword() {
        // Como estou na mesma pasta, eu posso dar "new" na classe escondida!
        return new FireSword();
    }

    public static IWeapon geticeSword() {
        // Como estou na mesma pasta, eu posso dar "new" na classe escondida!
        return new IceSword();
    }

    public static IWeapon getPoisonSword() {
        // Como estou na mesma pasta, eu posso dar "new" na classe escondida!
        return new PoisonSword();
    }
}