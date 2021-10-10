package beans;

import javax.ejb.Stateless;

@Stateless
public class OlaMundoEJB {
    public int somar(int a, int b) {
        return a+b;
    }
    
}
