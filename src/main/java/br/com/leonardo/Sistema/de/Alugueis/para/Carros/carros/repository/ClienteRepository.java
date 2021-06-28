package br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.repository;

import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository< Cliente, Long> {


}
