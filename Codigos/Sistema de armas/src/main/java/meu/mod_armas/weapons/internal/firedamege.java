package meu.mod_armas.weapons.internal;

// isso aqui e a programaçao do efeito que cada tipo de dano causa, ou seja , no de fogo aumenta o dano em 10
// e tira 3 da velocidade atual de onde firedamege foi chamado


class firedamege implements IDamegedStrategy {
    // isso quer dizer que sempre que firedemage for chamado, o basedamage sera aumentado em 10
    @Override
    public int calculateDamage(int basedamage) {
        return basedamage + 10;
    }
    // isso quer dizer que sempre que firedamege for chamado, a velocity sera reduzida em 3

    @Override
    public void imprimirStatus() {
        System.out.println("FireDemage APLICADO");
    }
}