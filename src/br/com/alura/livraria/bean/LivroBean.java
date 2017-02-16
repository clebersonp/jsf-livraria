package br.com.alura.livraria.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public void gravar() {
		System.out.println("Gravando Livro: " + this.getLivro().getTitulo());
	}

	public Livro getLivro() {
		return livro;
	}
}
