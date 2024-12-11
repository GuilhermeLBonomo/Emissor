package com.senac.emissor.service;

import com.senac.emissor.dtos.ProdutoDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public List<ProdutoDTO> listarProdutos() {
        rabbitTemplate.convertAndSend("fila-get-produto", "listarProdutos");
        return null;
    }
}
