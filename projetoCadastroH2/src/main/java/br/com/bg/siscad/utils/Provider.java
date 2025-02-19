package br.com.bg.siscad.utils;

import br.com.bg.siscad.service.UsuarioServico;
import br.com.bg.siscad.tela.TelaLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Provider {

    private static ApplicationContext context;

    @Autowired
    private UsuarioServico usuarioServico;

    public static void initContext(ApplicationContext context) {
        Provider.context = context;
    }

    public static <T> T getBean(Class<T> classeBean) {
        return context.getBean(classeBean);
    }

    @Bean
    public TelaLogin frame() {
        return new TelaLogin(usuarioServico);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
