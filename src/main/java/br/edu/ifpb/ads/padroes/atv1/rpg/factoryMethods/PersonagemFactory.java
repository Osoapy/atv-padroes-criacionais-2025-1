package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Personagem;

public interface PersonagemFactory {
    Personagem criar(String nome);
}
