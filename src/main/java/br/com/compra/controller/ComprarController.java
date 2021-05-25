package br.com.compra.controller;


import br.com.compra.entity.Compra;
import br.com.compra.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.compra.dto.CompraDTO;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/compra")
public class ComprarController {

    @Autowired
    private CompraService compraService;

   // @RolesAllowed("user")
    @PostMapping("/realizar-compra")
    public Compra realizaCompra(@RequestBody  CompraDTO compraDTO){
        return compraService.novoPedido(compraDTO);

    }
}
