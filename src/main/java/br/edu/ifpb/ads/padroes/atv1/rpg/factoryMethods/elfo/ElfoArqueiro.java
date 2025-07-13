package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods.elfo;
import br.edu.ifpb.ads.padroes.atv1.rpg.constructors.PersonagemConstrutor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryAbstracts.elfo.ElfoArqueiroAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods.PersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Personagem;

public class ElfoArqueiro implements PersonagemFactory {
    public Personagem criar(String nome) {
        var factory = new ElfoArqueiroAF();
        return new PersonagemConstrutor()
                .comNome(nome)
                .comRaca(factory.getRaca())
                .comClasse(factory.getClasse())
                .comAtributos(factory.getForca(), factory.getInteligencia(), factory.getAgilidade(), factory.getVida(), factory.getMana())
                .comEquipamentos(factory.criarArma(), factory.criarArmadura())
                .comHabilidades(factory.getHabilidades())
                .construir();
    }
}
