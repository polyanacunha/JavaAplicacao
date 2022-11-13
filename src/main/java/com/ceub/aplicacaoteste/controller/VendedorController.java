package com.ceub.aplicacaoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ceub.aplicacaoteste.dto.VendedorDto;
import com.ceub.aplicacaoteste.model.Vendedor;
import com.ceub.aplicacaoteste.repository.VendedorRepository;

@RestController
public class VendedorController {



		@Autowired
		VendedorRepository vendedorRepository;


		@RequestMapping("/clientes")
		public List<VendedorDto> listarVendedores(Integer numero) {
			List<Vendedor> vendedores;
			if (numero == null) {
				vendedores = vendedorRepository.findAll();
			} else {
				vendedores = vendedorRepository.findByVendedores_Numero(numero);
			}
			return VendedorDto.converterVendedor(vendedores);
		}

		@RequestMapping("/vendedores_completo")
		public List<Vendedor> listarVendedoresCompleto() {
			List<Vendedor> vendedores = vendedorRepository.findAll();
			return vendedores;
		}
	}


