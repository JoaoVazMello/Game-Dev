package meu.mod_armas.api;

/*
isso quer dizer que vai ser o que a arma faz entao toda arma deve implementar todos esses metodos,
ou seja, toda arma tem que denfender e atacar, ja que estou criando um mod de armas entao aqui eu defino o comportamento
de toda arma, independete de qual ela seja, entao se eu tiver uma arma de fogo , ou de gelo, tanto faz por que o comportamento de atacar
sempre sera o mesmo, porem causando efeitos diferentes com cada tipo de arma
*/

public interface IWeapon {
    String getName();
    Entity atack(Entity target);
}
