public enum CriterioStrategy {
    AVISO {
        public Mensagem getMensagem() {
            return new MensagemAviso();
        }
    },
    ERRO {
        public Mensagem getMensagem() {
            return new MensagemErro();
        }
    },
    INFO {
        public Mensagem getMensagem() {
            return new MensagemInfo();
        }
    };

    public abstract Mensagem getMensagem();
}
