package br.com.compra.client;

import br.com.compra.dto.CompraDTO;
import br.com.compra.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("estoque")
public interface EstoqueClient {
    @RequestMapping("/produto/novo-produto")
    ProdutoDTO vedificarEstoque(@RequestBody CompraDTO compraDTO);
}
