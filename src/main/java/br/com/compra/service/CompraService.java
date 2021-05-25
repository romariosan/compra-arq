package br.com.compra.service;

import br.com.compra.client.EstoqueClient;
import br.com.compra.dto.CompraDTO;
import br.com.compra.dto.ProdutoDTO;
import br.com.compra.entity.Compra;
import br.com.compra.repository.CompraRepository;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private ModelMapper map;

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private EstoqueClient estoqueClient;
    @HystrixCommand(fallbackMethod = "erroRetorno")
    public Compra novoPedido(CompraDTO dto){
            Compra compra=map.map(dto,Compra.class);
            compra = compraRepository.save(compra);
            if(compra!=null){
                ProdutoDTO produtoDTO=estoqueClient.vedificarEstoque(dto);
                System.out.println("valor recebido da API: "+produtoDTO.getNome());
            }
        return  compra;
    }

    public Compra erroRetorno(CompraDTO dto){
        Compra compra=new Compra();
        compra.setId(100);
        return  compra;
    }

}
