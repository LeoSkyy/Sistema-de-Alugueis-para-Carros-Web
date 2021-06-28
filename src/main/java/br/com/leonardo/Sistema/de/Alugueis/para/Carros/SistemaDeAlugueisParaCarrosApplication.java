package br.com.leonardo.Sistema.de.Alugueis.para.Carros;

import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.domain.Cliente;
import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.repository.ClienteRepository;
import br.com.leonardo.Sistema.de.Alugueis.para.Carros.pedido.domain.Pedido;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootApplication
public class SistemaDeAlugueisParaCarrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeAlugueisParaCarrosApplication.class, args);
	}

	@Bean
	InitializingBean sendDatabase(){
		Cliente cliente = new Cliente() ;
		cliente.setName("Cliente");
		cliente.setEmail("lwarior12@gmail.com");
		cliente.setPassword("202810");
		cliente.setTelephone("67996613748");
		Cliente save;


		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		pedido.setDataCriacaoPedido(LocalDate.now());
		pedido.setDataUltimaAtualizacao(LocalDate.now());
		pedido.setDataConclusao(LocalDate.now());
		pedido.setSubtotal(BigDecimal.ZERO);
		pedido.setTotal(BigDecimal.ZERO);



		return null;
	}
}
