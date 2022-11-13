package com.ceub.aplicacaoteste.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceub.aplicacaoteste.dto.ProdutoDto;
import com.ceub.aplicacaoteste.model.Produto;
import com.ceub.aplicacaoteste.repository.ProdutoRepository;

@RestController

public class ProdutoController {
	


		@Autowired
		ProdutoRepository produtoRepository;

//		@RequestMapping("/clientes")
//		public List<ClienteDto> listarClientes(String nome){
//			List<Cliente> clientes;
//			if(nome == null) {
//				clientes = clienteRepository.findAll();
//			}else {
//				clientes = clienteRepository.findByNome(nome);
//			}
//			return ClienteDto.converterCliente(clientes);
//		}

		@RequestMapping("/produtos")
		public List<ProdutoDto> listarProdutos(Integer numero) {
			List<Produto> produtos;
			if (numero == null) {
				produtos = produtoRepository.findAll();
			} else {
			    produtos = produtoRepository.findByProdutos_Numero(numero);
			}
			return ProdutoDto.converterProduto(produtos);
		}

		@RequestMapping("/produtos_completo")
		public List<Produto> listarProdutosCompleto() {
			List<Produto> clientes = produtoRepository.findAll();
			return clientes;
		}
	}


