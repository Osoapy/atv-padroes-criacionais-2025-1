package br.edu.ifpb.ads.padroes.atv1.rpg.factoryAbstracts.humano;



import br.edu.ifpb.ads.padroes.atv1.rpg.factoryAbstracts.PersonagemAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Arma;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Armadura;

public class HumanoMagoAF implements PersonagemAF {

    public String getNome() {
        return "Mago Humano";
    }

    public String getRaca() {
        return "Humano";
    }

    public String getClasse() {
        return "Mago";
    }

    public int getForca() {
        return 6;
    }

    public int getInteligencia() {
        return 18;
    }

    public int getAgilidade() {
        return 8;
    }

    public int getVida() {
        return 80;
    }

    public int getMana() {
        return 150;
    }

    public Arma criarArma() {
        return new Arma("Cajado Mágico", 15, "Cajado");
    }

    public Armadura criarArmadura() {
        return new Armadura("Vestes Mágicas", 8, "Leve");
    }

    public String[] getHabilidades() {
        return new String[]{"Bola de Fogo", "Cura"};
    }
}
