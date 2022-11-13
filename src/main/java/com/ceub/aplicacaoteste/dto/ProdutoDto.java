package com.ceub.aplicacaoteste.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ceub.aplicacaoteste.model.Produto;

public class ProdutoDto {
	
		private Integer cod_produto ;
		private String unidade;
		private String descricao;
		private Float valor;
		
		public ProdutoDto() {
			
		}
		
		public ProdutoDto(Produto produto) {
			this.cod_produto = produto.getCod_produto();
			this.unidade = produto.getUnidade();
			this.descricao = produto.getDescricao();
			this.valor = produto.getValor();
			
		}
		public Integer getCod_produto() {
			return cod_produto;
		}
		
		public String getUnidade() {
			return unidade;
		}

		public String getDescricao() {
			return descricao;
		}

		public Float getValor() {
			return valor;
		}
		public static List<ProdutoDto> converterProduto(List<Produto> produtos) {
			// TODO Auto-generated method stub
			return produtos.stream().map(ProdutoDto::new).collect(Collectors.toList());
		}
		
	}


