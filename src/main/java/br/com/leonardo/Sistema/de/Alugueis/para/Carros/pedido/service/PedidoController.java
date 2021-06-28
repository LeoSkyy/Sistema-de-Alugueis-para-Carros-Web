package br.com.leonardo.Sistema.de.Alugueis.para.Carros.pedido.service;

import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.domain.Cliente;
import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.repository.ClienteRepository;
import br.com.leonardo.Sistema.de.Alugueis.para.Carros.pedido.domain.Pedido;
import br.com.leonardo.Sistema.de.Alugueis.para.Carros.pedido.repository.PedidoRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/pedido")
public class PedidoController {
    @Autowired
    private ClienteRepository pedidoRepository;
    private Object Pedido;


    @GetMapping (produces = MediaType.APPLICATION_JSON_VALUE)
   public Iterable<Pedido>listarPedido(){ return PedidoRepostory.findAll(); }

    @PostMapping(path="/add")
    public void cadastrarPedido(@RequestBody Pedido pedido ) {
        PedidoRepostory.save((Cliente) Pedido);
    }
}
