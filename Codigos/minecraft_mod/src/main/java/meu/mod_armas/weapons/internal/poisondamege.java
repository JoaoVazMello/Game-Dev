package meu.mod_armas.weapons.internal;

// isso aqui e a programaçao do efeito que cada tipo de dano causa, ou seja , no de fogo aumenta o dano em 10
// e tira 3 da velocidade atual de onde firedamege foi chamado


class poisondamege implements IDamegedStrategy {
    // isso quer dizer que sempre que poisondemage for chamado, o basedamage sera aumentado em 10
    @Override
    public int calculateDamage(int basedamage) {
        return basedamage + 8;
    }

    @Override
    public void imprimirStatus(){
        System.out.println("Poisondamege APLICADO");
    }
}