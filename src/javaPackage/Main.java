package javaPackage;

import model.Cliente.Cliente;
import model.Cliente.EnderecoCliente;
import model.fornecedor.Fornecedor;
import model.Produto.Produto;

import java.time.LocalDate;



public class Main {	

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.Nome = "Gabriel";
		
		Fornecedor fornecedor = new Fornecedor();
		
		EnderecoCliente endereço = new EnderecoCliente();	
		
		Produto produto = new Produto();
		produto.validade = LocalDate.of(2020, 10, 30);
		produto.nomeProduto = "Biscoito";
		
		
		System.out.println(produto.nomeProduto + " com validade de: " + produto.validade + " , foi comprado pelo Cliente: " + cliente.Nome);
	}
}
