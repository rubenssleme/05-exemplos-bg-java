package br.com.bg.siscad;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
        ServletContext servletContext = null;


    }
    @SuppressWarnings("CatchAndPrintStackTrace")
    public static void onStartup(ServletContext servletContext) throws ServletException, ClassNotFoundException {
        try {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            Class<?> webServlet = Class.forName("org.h2.server.web.WebServlet", true, classLoader);
            Servlet servlet = (Servlet) webServlet.getDeclaredConstructor().newInstance();

            ServletRegistration.Dynamic h2cs = servletContext.addServlet("h2-console", servlet);
            h2cs.addMapping("/actuator/h2-console/*");
            h2cs.setLoadOnStartup(1);

        } catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }

}
