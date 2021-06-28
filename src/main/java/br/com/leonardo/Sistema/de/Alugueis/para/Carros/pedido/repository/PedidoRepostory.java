package br.com.leonardo.Sistema.de.Alugueis.para.Carros.pedido.repository;

import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.domain.Cliente;
import br.com.leonardo.Sistema.de.Alugueis.para.Carros.pedido.domain.Pedido;

public interface PedidoRepostory {
    static Iterable<Pedido> findAll() {

        return null;
    }

    static void save(Cliente pedido) {
    }

    void deleteById(long id);
}
