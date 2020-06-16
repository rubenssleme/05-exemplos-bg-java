public abstract class MaquinaDeMensagens {
    public abstract Mensagem entregaMensagem();

    public static Mensagem exibeMensagem(String criterio) {

        if (criterio.equals("aviso"))
            return new MensagemAviso();
        else if (criterio.equals("erro"))
            return new MensagemErro();
        return new MensagemNull();
    }

    /**
     * Método da fábrica de mensagens utilizando o padrão Strategy
     * @param criterio Tipo de mensagem a ser criada.
     * @return Mensagem criada.
     */
    public static Mensagem exibeMensagem(CriterioStrategy criterio) {

        if (criterio == null) {
            return new MensagemNull();
        }

        return criterio.getMensagem();
    }
}
