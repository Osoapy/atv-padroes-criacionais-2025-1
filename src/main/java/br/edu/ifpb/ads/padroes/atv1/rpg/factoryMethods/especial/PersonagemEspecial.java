package br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods.especial;
import br.edu.ifpb.ads.padroes.atv1.rpg.constructors.PersonagemConstrutor;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryAbstracts.humano.PersonagemEspecialAF;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods.PersonagemFactory;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Personagem;

public class PersonagemEspecial implements PersonagemFactory {

    private final String nomeBase;

    public PersonagemEspecial(String nomeBase) {
        this.nomeBase = nomeBase;
    }

    @Override
    public Personagem criar(String ignorado) {
        var factory = new PersonagemEspecialAF(nomeBase);
        return new PersonagemConstrutor()
                .comNome(factory.getNome())
                .comRaca(factory.getRaca())
                .comClasse(factory.getClasse())
                .comAtributos(
                        factory.getForca(),
                        factory.getInteligencia(),
                        factory.getAgilidade(),
                        factory.getVida(),
                        factory.getMana()
                )
                .comEquipamentos(factory.criarArma(), factory.criarArmadura())
                .comHabilidades(factory.getHabilidades())
                .construir();
    }
}
