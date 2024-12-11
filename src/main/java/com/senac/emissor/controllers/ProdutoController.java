package com.senac.emissor.controllers;

import com.senac.emissor.dtos.ProdutoDTO;
import com.senac.emissor.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value ="/produtos")
public class ProdutoController {
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> listarProdutos(){
        return new ResponseEntity<List<ProdutoDTO>>(this.produtoService.listarProdutos(), HttpStatus.OK);
    }
}
