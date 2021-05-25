package br.com.compra.entity;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Itens {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @ManyToOne
    @JoinColumn(name = "compraID")
    Compra compra;
    String nome;
    BigDecimal preco;
}
