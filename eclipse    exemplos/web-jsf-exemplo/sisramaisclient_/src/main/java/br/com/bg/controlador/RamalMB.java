package br.com.bg.controlador;

import br.com.bg.dto.Ramal;
import br.com.bg.servico.RamalService;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = "dtRamalMB")
@ViewScoped
public class RamalMB implements Serializable {

    private List<Ramal> ramais;

    @ManagedProperty("#{ramalService}")
    private RamalService ramalService;

    @PostConstruct
    public void init() {
        ramais = ramalService.criarRamais(10);
    }

    public List<Ramal> obterRamais() {
        return ramais;
    }

    public void setRamalService(RamalService ramalService) {
        this.ramalService = ramalService;
    }

    public List<Ramal> getRamais() {
        return ramais;
    }

    public List<String> obterNome() {
        return ramalService.getNOMES();
    }

    public List<String> obterTelefone() {
        return ramalService.getTELEFONES();
    }

    public List<String> obterDeptos() {
        return ramalService.getDEPTOS();
    }

    public List<String> obterEmpresas() {
        return ramalService.getEMPRESAS();
    }

}
