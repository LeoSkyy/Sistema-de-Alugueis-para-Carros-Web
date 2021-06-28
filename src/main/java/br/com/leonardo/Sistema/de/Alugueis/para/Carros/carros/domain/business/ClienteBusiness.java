package br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.domain.business;

import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.domain.Cliente;
import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.repository.ClienteRepository;
import br.com.leonardo.Sistema.de.Alugueis.para.Carros.pedido.repository.PedidoRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class ClienteBusiness {

    @Autowired
    private ClienteRepository repository;
    private PedidoRepostory clienteRepositry;

    public Cliente create(@RequestBody Cliente cliente)
    {
        return repository.save(cliente);
    }

    public Cliente listarCliente() {
        return (Cliente) PedidoRepostory.findAll();

    }
   public void cadastrarCliente( Cliente cliente ){
        PedidoRepostory.save(cliente);

   }
public void editarCliente (Cliente cliente){
        PedidoRepostory.save(cliente);
}
public @ResponseBody
    void deletarCliente( long id ){
        clienteRepositry.deleteById(id);

}
    public boolean validarCpf(Cliente cliente){
        boolean valido = false;
        return valido;

    }


}


