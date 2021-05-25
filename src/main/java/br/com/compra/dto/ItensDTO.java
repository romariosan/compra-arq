package br.com.compra.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class ItensDTO {
    String nome;
    BigDecimal preco;
}
