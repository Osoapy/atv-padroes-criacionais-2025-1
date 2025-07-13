package br.edu.ifpb.ads.padroes.atv1.rpg.prototypes;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Personagem;

public class PersonagemPrototipo {
    public static Personagem clone(Personagem personagem) {
        Personagem original = personagem;
        return original.clone();
    }
}
