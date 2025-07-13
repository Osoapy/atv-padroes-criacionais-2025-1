package br.edu.ifpb.ads.padroes.atv1.rpg;

import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods.humano.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods.elfo.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods.orc.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.factoryMethods.especial.*;
import br.edu.ifpb.ads.padroes.atv1.rpg.entities.Personagem;
import br.edu.ifpb.ads.padroes.atv1.rpg.prototypes.PersonagemPrototipo;

public class Main {
    public static void main(String[] args) {
        // Fazendo um de cada
        // HUMANOS
        Personagem personagem1 = new HumanoGuerreiro().criar("Jo");
        Personagem personagem2 = new HumanoArqueiro().criar("ão");
        Personagem personagem3 = new HumanoMago().criar("Ga");
        // ELFO
        Personagem personagem5 = new ElfoGuerreiro().criar("bri");
        Personagem personagem6 = new ElfoArqueiro().criar("el");
        Personagem personagem7 = new ElfoMago().criar("Vi");
        // ORCS
        Personagem personagem9 = new OrcGuerreiro().criar("ei");
        Personagem personagem10 = new OrcArqueiro().criar("ra");
        Personagem personagem11 = new OrcMago().criar("Sil");
        // ESPECIAL
        Personagem personagem12 = new PersonagemEspecial("va").criar("");

        // Imprimindo
        System.out.println(personagem1);
        System.out.println(personagem2);
        System.out.println(personagem3);
        System.out.println(personagem5);
        System.out.println(personagem6);
        System.out.println(personagem7);
        System.out.println(personagem9);
        System.out.println(personagem10);
        System.out.println(personagem11);
        System.out.println(personagem12);

        // Clone
        Personagem clonePersonagem = PersonagemPrototipo.clone(personagem6);

        // Imprimindo
        System.out.println(clonePersonagem);
    }
}
