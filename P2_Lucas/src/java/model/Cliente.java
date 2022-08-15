/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.ClienteDAO;

public class Cliente {

	private int idCliente;
        private String nome;
        private String telefone;
	private String usuario;
	private String senha;
        
	public Cliente() {
		
	}
	
	public Cliente(String nome, String telefone, String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
		this.nome = nome;
		this.telefone = telefone;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
        
        public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
        
        public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
        
        public void salvar() {
            new ClienteDAO().cadastrarCliente(this);
        }
	
}