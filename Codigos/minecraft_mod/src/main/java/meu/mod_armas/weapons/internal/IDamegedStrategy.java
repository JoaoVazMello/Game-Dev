package meu.mod_armas.weapons.internal;

/* isso quer dizer que toda vez que eu precisar causar dano em algo eu uso essa interface, ou seja, nao importa
pelo o que o dano vai ser causado importa e que ele deve ser calculado sempre que uma arma usar o metodo atack() da interface
Iweapon,

aqui esta no packge-private, ou seja, o resto do mod nao precisa saber que existe uma estrategia de dano
*/

interface IDamegedStrategy {
    int calculateDamage(int basedamage);
    void imprimirStatus();
}

