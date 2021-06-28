package br.com.leonardo.Sistema.de.Alugueis.para.Carros.pedido.domain;

import br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.domain.Cliente;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate dataCriacaoPedido;
    private LocalDate dataUltimaAtualizacao;
    private LocalDate dataConclusao;

    @Column (nullable = false)
    private BigDecimal subtotal;
    private BigDecimal total;

    @ManyToOne
    private Cliente cliente;

    public Pedido() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataCriacaoPedido() {
        return dataCriacaoPedido;
    }

    public void setDataCriacaoPedido(LocalDate dataCriacaoPedido) {
        this.dataCriacaoPedido = dataCriacaoPedido;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }


    public void setCliente(Cliente cliente) {
    }
}
