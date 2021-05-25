package br.com.compra.dto;

import lombok.Data;

import java.util.List;
@Data
public class CompraDTO {
    List<ItensDTO> itens;
    EnderecoDTO endereco;
}
