package meu.mod_armas.weapons.internal;

import meu.mod_armas.api.*;

/*
explicaçao do que faz a linha de codigo:

private final IDamegedStrategy poisonStatus = new poisonDamege(); // polimorfismo de interface

* 🔍 A Anatomia da Linha de Código
private final IDamegedStrategy:

Aqui você define o Tipo da Referência.

Você está dizendo ao Java: "Esta variável é um contrato do tipo IDamegedStrategy. Eu não sei qual classe será, mas garanto que ela terá o método calculateDamage."

O final garante que, uma vez que essa referência aponte para um objeto, ela nunca poderá apontar para outro (Imutabilidade da referência).

poisonStatus:

Este é o nome do seu "ponteiro" ou controle remoto.

new poisondamege():

Aqui ocorre a Instanciação. O Java cria o objeto real na memória (o "motor" que realmente faz a conta do veneno).

O sinal de =:

É o momento em que você faz a referência (IDamegedStrategy) apontar para o objeto real (poisondamege).

*/

class GenericSword implements IWeapon{
    private final String name = "GenericSword";

    @Override
    public String getName() {
        return "Generic Sword";
    }

    @Override
    public Entity atack(Entity target) {
        System.out.println("atacando com alguma espada generica");
        target.TakeDemage(10);
        return target;
    }
}

class FireSword implements IWeapon{
    private final IDamegedStrategy firestatus = new firedamege();
    private final String name = "Fire Sword";

    @Override
    public String getName() {
        return "Fire Sword";
    }

    // quando ataca o dano causado a entidade e total
    @Override
    public Entity atack(Entity target) {
        target = target.TakeDemage(firestatus.calculateDamage(10));
        firestatus.imprimirStatus();
        return target;
    }
}


class IceSword implements IWeapon{
    private final IDamegedStrategy icestatus = new icedamage();
    private final String name = "Ice Sword";

    @Override
    public String getName() {
        return "Ice Sword";
    }

    // quando ataca o dano causado a entidade e total
    @Override
    public Entity atack(Entity target) {
        target = target.TakeDemage(icestatus.calculateDamage(10));
        icestatus.imprimirStatus();
        return target;
    }
}

class PoisonSword implements IWeapon{
    private final IDamegedStrategy poisonStatus = new poisondamege();
    private final String name = "Poison Sword";

    @Override
    public String getName() {
        return "Poison Sword";
    }

    // quando ataca o dano causado a entidade e total
    @Override
    public Entity atack(Entity target) {
        target = target.TakeDemage(poisonStatus.calculateDamage(10));
        poisonStatus.imprimirStatus();
        return target;
    }
}

