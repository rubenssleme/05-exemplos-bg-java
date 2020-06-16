package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	/*
    private static final String template = "Carlos Kafka, %s!";
    private final AtomicLong counter = new AtomicLong();
   */

   /* @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }*/
	
	@Autowired
	ContatoMB contatoMB;
    
    @RequestMapping("/greeting")
    public List<Contato> greeting() {
        return contatoMB. getContatos();
    }
}
