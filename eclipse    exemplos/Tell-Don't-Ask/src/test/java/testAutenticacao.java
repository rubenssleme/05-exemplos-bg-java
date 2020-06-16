public class testAutenticacao {
    private static LoginService loginService;


    public static void main(String[] args) {
        testSucessoLogin();
        testSemSucessoSenhaIncorretaLogin();
        testSemSucessoUsuarioIncorretaLogin();
    }


    public static void testSucessoLogin(){
        loginService = new LoginService();
        loginService.autenticarLogin("rubens","123");
    }
    public static void testSemSucessoSenhaIncorretaLogin(){
        loginService = new LoginService();
        loginService.autenticarLogin("rubens","1234");
    }
    public static void testSemSucessoUsuarioIncorretaLogin(){
        loginService = new LoginService();
        loginService.autenticarLogin("rubens2","123");
    }
}
