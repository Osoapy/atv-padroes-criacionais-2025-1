package br.edu.ifpb.ads.padroes.atv1.rpg.constructors;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.*;

public class PersonagemConstrutor {
    private String nome, raca, classe;
    private int forca, inteligencia, agilidade, vida, mana;
    private Arma arma;
    private Armadura armadura;
    private String[] habilidades;

    public PersonagemConstrutor comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public PersonagemConstrutor comRaca(String raca) {
        this.raca = raca;
        return this;
    }

    public PersonagemConstrutor comClasse(String classe) {
        this.classe = classe;
        return this;
    }

    public PersonagemConstrutor comAtributos(int forca, int inteligencia, int agilidade, int vida, int mana) {
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vida = vida;
        this.mana = mana;
        return this;
    }

    public PersonagemConstrutor comEquipamentos(Arma arma, Armadura armadura) {
        this.arma = arma;
        this.armadura = armadura;
        return this;
    }

    public PersonagemConstrutor comHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
        return this;
    }

    public Personagem construir() {
        return new Personagem(nome, raca, classe, forca, inteligencia, agilidade, vida, mana, arma, armadura, habilidades);
    }
}
