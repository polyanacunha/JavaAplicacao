package com.ceub.aplicacaoteste.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.ceub.aplicacaoteste.model.Cliente;
import com.ceub.aplicacaoteste.model.Pedido;
import com.ceub.aplicacaoteste.model.Vendedor;

public class PedidoDto {


		private Object prazo_entrega;
		private Integer numero;
		private Vendedor vendedor;
		private Cliente cliente;
		public PedidoDto() {
			
		}
		
		public PedidoDto(Pedido pedido) {
			this.prazo_entrega = pedido.getPrazo_entrega();
			this.numero = pedido.getNumero();
			this.vendedor = pedido.getVendedor();
			this.cliente = pedido.getCliente();
		}
		public Object getPrazo_entrega() {
			return prazo_entrega;
		}
		public Integer getNumero() {
			return numero;
		}
		public Cliente getCliente() {
			return cliente;
		}
		public Vendedor getVendedor() {
			return vendedor;
		}

		public static List<PedidoDto> converterPedido(List<Pedido> pedidos) {
			// TODO Auto-generated method stub
			return pedidos.stream().map(PedidoDto::new).collect(Collectors.toList());
		}
		
	}


