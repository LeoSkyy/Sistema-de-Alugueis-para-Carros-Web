package br.com.leonardo.Sistema.de.Alugueis.para.Carros.carros.domain;
import br.com.leonardo.Sistema.de.Alugueis.para.Carros.pedido.domain.Pedido;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;
    private String telephone;

    @CreationTimestamp
    private Date createdAt;

    @Column(unique = true, nullable = false)
    private String cpf;
    private LocalDate dataNascimento;
    private int versao;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pedido> pedidos;


    public Cliente() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

