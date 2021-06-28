package br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.service;

import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.domain.Cliente;

import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.domain.business.ClienteBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteBusiness clienteBusiness;

   @GetMapping(path = "/test")
    public String test() {
        return"ok";

    }
    @PostMapping(path ="criar")
    public Cliente create(@RequestBody Cliente cliente)
    {
        return clienteBusiness.listarCliente();
    }


}
