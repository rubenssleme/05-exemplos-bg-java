package br.ufscar.si.catalogo;
/**
*
* @author Ana Paula
*/
public class TestaCatalogo {

    private static CD cd1, cd2;
    private static DVD dvd1, dvd2;
    private static Jogo jogo1, jogo2;

    private static boolean contains(Midia[] cjto, Midia m) {
        boolean achou = false;

        for (int i = 0; i < cjto.length && !achou; i++) {
            achou = cjto[i].equals(m);
        }

        return achou;
    }

    private static boolean ehIgual(Midia[] a, Midia[] b) {
        boolean ehIgual = a.length == b.length;

        for (int i = 0; i < b.length && ehIgual; i++) {
            ehIgual = contains(a, b[i]);
        }
        return ehIgual;
    }

    private static void inicializarVariveis() {
        cd1 = new CD("X & Y", 2005, "Cold Play");
        cd1.adicionaFaixa("Square One", 287); // 4:47
        cd1.adicionaFaixa("What If", 297); // 4:57
        cd1.adicionaFaixa("White Shadows", 328); // 5:28
        cd1.adicionaFaixa("Fix You", 294); // 4:54
        cd1.adicionaFaixa("Talk", 311); // 5:11
        cd1.adicionaFaixa("X&Y", 274); // 4:34

        dvd1 = new DVD("O Senhor dos Anéis - A Sociedade dos Anel", 2001,"Peter Jacson");
        dvd1.adicionaArtista("Elijah Wood", "Frodo Baggins");
        dvd1.adicionaArtista("Viggo Mortensen", "Aragorn");
        dvd1.adicionaArtista("Orlando Bloom", "Legolas Greenleaf");
        dvd1.adicionaArtista("Christopher Lee", "Saruman");
        dvd1.adicionaArtista("Ian McKellen", "Gandalf");

//        jogo1 = new Jogo("Need For Speed - Underground II", 2005, "Corrida");

        cd2 = new CD("Bachianas Brasileiras No.2", 2004,
                "Orquestra de Câmara da Universidade de São Paulo");
        cd2.adicionaFaixa("(Prelúdio) O Canto do Capadócio", 512); // 4:32
        cd2.adicionaFaixa("(�ria) O Canto da Nossa Terra", 389); // 6:29
        cd2.adicionaFaixa("(Dança) Lembranca do Sertão", 324); // 5:24
        cd2.adicionaFaixa("(Tocata) O Trenzinho do Caipira", 284); // 4:44

        dvd2 = new DVD("Matrix", 1999, "Andy & Larry Wachoski");
        dvd2.adicionaArtista("Keanu Reeves", "Neo");
        dvd2.adicionaArtista("Laurence Fishburne", "Morpheus");
        dvd2.adicionaArtista("Carrie-Anne Moss", "Trinity");
        dvd2.adicionaArtista("Hugo Weaving", "Agente Smith");
        dvd2.adicionaArtista("Gloria Foster", "Óraculo");

//        jogo2 = new Jogo("Fifa 2008", 2008, "Esporte");
    }
/*
    private static void testaRecuperacao(Catalogo catalogo) {

        assert (jogo2.equals(catalogo("Fifa 2008")));
        assert (dvd2.equals(catálogo.obtemMídia("Matrix")));
        assert (cd1.equals(catálogo.obtemMídia("X & Y")));
        assert (jogo1.equals(catálogo.obtemMídia("Need For Speed - Underground II")));
        assert (dvd1.equals(catálogo.obtemMídia("O Senhor dos Anéis - A Sociedade dos Anel")));
        assert (cd2.equals(catálogo.obtemMídia("Bachianas Brasileiras No.2")));

        // Catálogo cheio
        assert (catálogo.adicionaMídia(jogo2) == false);

        // Verificando lista (todos)

        assert (catálogo.quantidadeDeMídias() == 6);

        assert (catálogo.quantidadeDeMídias() == catálogo.quantidadeMáximaDeMídias());

        assert (ehIgual(catálogo.coleção(), new Mídia[]{cd2, jogo2, dvd2,
                    jogo1, dvd1, cd1}));

        // Verificando lista (seleciona pelo tipo - CD de música - implementada
        // pela classe CD)

        assert (catálogo.quantidadeDeCDs() == 2);

        assert (ehIgual(catálogo.coleçãoPorTipo(1), new Mídia[]{cd2, cd1}));

        // Verificando lista (seleciona pelo tipo - DVD de filme - implementada
        // pela classe DVD)

        assert (catálogo.quantidadeDeDVDs() == 2);

        assert (ehIgual(catálogo.coleçãoPorTipo(2), new Mídia[]{dvd2, dvd1}));

        // Verificando lista (seleciona pelo tipo - Jogo Eletronico -
        // implementada pela classe Jogo)

        assert (catálogo.quantidadeDeJogos() == 2);

        assert (ehIgual(catálogo.coleçãoPorTipo(3), new Mídia[]{jogo1, jogo2}));
    }

    private static void realizaTestes() {

        inicializarVariveis();

        /**
         * Testa se o assert está habilitado. No Java o assert não é habilitado
         * por padrão.
         *
         * Para executar inclua a opção -ea
         *
         * Exemplo: java -ea TestaCatálogo
         */
/*
        int a = 0;
        assert (a++ == 0);
        if (a == 0) {
            System.out.println("Assertions desabilitados. O programa não foi testado!");
            System.exit(-1);
        }

        // Criar uma classe cadastro e tenta buscar uma midia na lista vazia
        Catálogo catálogo = new Catálogo(6);

        assert (catálogo.obtemMídia("Senhor dos Aneis") == null);

        // adiciona 6 midias

        assert (catálogo.adicionaMídia(cd1));
        assert (catálogo.adicionaMídia(dvd1));
        assert (catálogo.adicionaMídia(jogo1));
        assert (catálogo.adicionaMídia(cd2));
        assert (catálogo.adicionaMídia(dvd2));
        assert (catálogo.adicionaMídia(jogo2));

        // Tenta recuperar cadastros

        testaRecuperação(catálogo);

        System.out.println("Testes executados com sucesso !!");
    }

    public static void main(String[] args) {
        try {
            realizaTestes();
        } catch (AssertionError e) {
            System.out.println("Erros durante os testes !!");
        }
    }*/
}
