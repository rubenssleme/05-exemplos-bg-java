public class Cliente {

    public static void main(String[] args) {

        /**
         *  criação de uma mensagem Expecifica usando padrão Factory variação:
         *  Padrão Factory Method
         */
        Mensagem aviso = MaquinaDeMensagens.exibeMensagem("aviso");
        aviso.mensagem();

        Mensagem erro = MaquinaDeMensagens.exibeMensagem("erro");
        erro.mensagem();

        /**
         * criação de uma mensagem com um parâmetro inesperado.
         */
        Mensagem falha = MaquinaDeMensagens.exibeMensagem("falha");
        falha.mensagem();


        /**
         * criação de uma mensagem específica usando os padrões: Factory Method + Strategy
         */
        aviso = MaquinaDeMensagens.exibeMensagem(CriterioStrategy.AVISO);
        aviso.mensagem();

        erro = MaquinaDeMensagens.exibeMensagem(CriterioStrategy.ERRO);
        erro.mensagem();

    }


}
