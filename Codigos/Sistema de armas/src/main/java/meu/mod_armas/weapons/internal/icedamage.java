package meu.mod_armas.weapons.internal;

// isso aqui e a programaçao do efeito que cada tipo de dano causa, ou seja , no de fogo aumenta o dano em 10
// e tira 3 da velocidade atual de onde firedamege foi chamado

class icedamage implements IDamegedStrategy {
    // isso quer dizer que sempre que icedemage for chamado, o basedamage sera aumentado em 5
    @Override
    public int calculateDamage(int basedamage) {
        return basedamage + 5;
    }
    //isso quer dizer que sempre que o icedemage for chamado, a velocity sera reduzida em 8

    @Override
    public void imprimirStatus() {
        System.out.println("ICEDAMAGE APLICADO");
    }
}