package meu.mod_armas.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// classse imutavel (para garantir que nenhum outra parte do codigo altere os atributos de uma entidade)
public final class Entity{

    // atributos da classe
    private final String name;
    private final int health;
    private final int velocity;
    private final boolean defending;
    private final List<IWeapon> armamento;

    // construtor da classe
    public Entity(String name, int health, int velocity, boolean defending, List<IWeapon> armamento) {
        this.name = name;
        this.health = health;
        this.velocity = velocity;
        this.armamento = new ArrayList<IWeapon>(armamento);
        this.defending = false;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getVelocity() {
        return velocity;
    }
    public boolean isDefending() { return defending; }
    public List<IWeapon> getArmamento() { return armamento; }

    // ---------------------------------------------------------
    // comportamentos entidade de tomar dano
    public Entity TakeDemage(int damage) {

        int newhealth;
        int newvelocity;

       // logica para verificar se a entidade esta defendendo, se estiver, reduz a quantidade de dano senao aplica o dano total
        if (isDefending()){
            newhealth = getHealth() - (damage - 4);
            newvelocity = getVelocity() - 3;
        }else{
            newhealth = getHealth() - damage;
            newvelocity = getVelocity() - 2;
        }

       System.out.println("vida apos dano aplicado: " + newhealth + " \nvelocidade apos dano aplicado: " + newvelocity);
       System.out.println("===============================================");   

       return new Entity(this.name, newhealth, newvelocity, this.defending, this.armamento);
    }

    public Entity CausarDemage(Entity SofrendoDano, IWeapon arma){
        // calcular aleatoriedade da defesa -- pensar em como implementar --
        // Random rand = new Random();

        // Atacar a entidade e sobre-escrever a entidade e devolver para onde foi chamado
        SofrendoDano = arma.atack(SofrendoDano);

        return SofrendoDano;
    }

    // -----------------------------------------------------------------------------------------------------

    // interaçoes com as armas

    public boolean possuiArma(String nomeProcurado) {
        for (IWeapon arma : this.armamento) {
            if (arma.getName().contains(nomeProcurado)) {
                return true;
            }
        }
        return false;
    }

    // E para pegar a arma específica:
    public IWeapon getArmaPorNome(String nomeProcurado) {
        for (IWeapon arma : this.armamento) {
            if (arma.getName().contains(nomeProcurado)) return arma;
        }
        return null;
    }

    public void AdicionarArmamento(Entity player, IWeapon arma){
        player.getArmamento().add(arma);
    }

    public void listarArmamento(Entity player){
        if(!player.getArmamento().isEmpty()){
            for(IWeapon e : player.getArmamento()){
                System.out.println("Nome Arma: " + e.getName());
            }
        }else{
            System.out.println("Nenhum armamento encontrado. Adicione algum!");
            System.out.println("============================================");
            System.out.println(" ");
        }

    }

}
