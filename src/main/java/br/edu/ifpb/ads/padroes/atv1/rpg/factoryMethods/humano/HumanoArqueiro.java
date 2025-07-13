package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods.humano;
import br.edu.ifpb.ads.padroes.atv1.rpg.constructors.PersonagemConstrutor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryAbstracts.humano.HumanoArqueiroAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods.PersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Personagem;

public class HumanoArqueiro implements PersonagemFactory {
    @Override
    public Personagem criar(String nome) {
        var factory = new HumanoArqueiroAF();
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
