package com.ceub.aplicacaoteste.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ceub.aplicacaoteste.model.Vendedor;

public class VendedorDto {

	
		private String nome;
		private Integer cod_vendedor;
		private Float salario;
		private String faixa_comissao;
		
		public VendedorDto() {
			
		}
		
		public VendedorDto(Vendedor vendedor) {
			this.cod_vendedor = vendedor.getCod_vendedor();
			this.nome = vendedor.getNome();
			this.salario = vendedor.getSalario();
			this.faixa_comissao = vendedor.getFaixa_comissao();
		}
		public Integer getCod_vendedor() {
			return cod_vendedor;
		}
		
		public String getNome() {
			return nome;
		}

		public float getSalario() {
			return salario;
		}

		public String getFaixa_comissao() {
			return faixa_comissao;
		}

		public static List<VendedorDto> converterVendedor(List<Vendedor> vendedores) {
			// TODO Auto-generated method stub
			return vendedores.stream().map(VendedorDto::new).collect(Collectors.toList());
		}
		
	}


