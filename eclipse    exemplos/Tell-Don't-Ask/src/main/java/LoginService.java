public class LoginService {
Login login;

        public void autenticarLogin(String usuario, String senha){
        login = new LoginRepository().GetLoginByUsuario();
        login.autenticar(usuario, senha);
    }
}