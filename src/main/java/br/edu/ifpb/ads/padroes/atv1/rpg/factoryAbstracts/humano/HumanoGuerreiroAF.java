package br.edu.ifpb.ads.padroes.atv1.rpg.factoryAbstracts.humano;


import br.edu.ifpb.ads.padroes.atv1.rpg.factoryAbstracts.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.*;

public class HumanoGuerreiroAF implements PersonagemAF {

    @Override
    public String getNome() {
        return "Guerreiro Humano";
    }

    @Override
    public String getRaca() {
        return "Humano";
    }

    @Override
    public String getClasse() {
        return "Guerreiro";
    }

    @Override
    public int getForca() {
        return 15;
    }

    @Override
    public int getInteligencia() {
        return 8;
    }

    @Override
    public int getAgilidade() {
        return 10;
    }

    @Override
    public int getVida() {
        return 120;
    }

    @Override
    public int getMana() {
        return 30;
    }

    @Override
    public Arma criarArma() {
        return new Arma("Espada de Ferro", 25, "Espada");
    }

    @Override
    public Armadura criarArmadura() {
        return new Armadura("Armadura de Placas", 20, "Pesada");
    }

    @Override
    public String[] getHabilidades() {
        return new String[]{"Investida", "Bloqueio"};
    }
}
