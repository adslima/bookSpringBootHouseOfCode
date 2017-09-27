package br.com.helo.microservices.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de set de 2017 10:32:30
 */
@Entity
public class Propriedade {

	/**
	 *
	 */
	@Id
	private String nome;

	private String valor;

	private String descricao;

	private String categoria;

	private String subcategoria;

	/**
	 * @return retorna o valor de {@link #valor}
	 */
	public String getValor() {
		return this.valor;
	}

	/**
	 * seta o valor do parametro valor no atributo {@link #valor}
	 *
	 * @param valor
	 */
	public void setValor(final String valor) {
		this.valor = valor;
	}

	/**
	 * @return retorna o valor de {@link #descricao}
	 */
	public String getDescricao() {
		return this.descricao;
	}

	/**
	 * seta o valor do parametro descricao no atributo {@link #descricao}
	 *
	 * @param descricao
	 */
	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return retorna o valor de {@link #categoria}
	 */
	public String getCategoria() {
		return this.categoria;
	}

	/**
	 * seta o valor do parametro categoria no atributo {@link #categoria}
	 *
	 * @param categoria
	 */
	public void setCategoria(final String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return retorna o valor de {@link #subcategoria}
	 */
	public String getSubcategoria() {
		return this.subcategoria;
	}

	/**
	 * seta o valor do parametro subcategoria no atributo {@link #subcategoria}
	 *
	 * @param subcategoria
	 */
	public void setSubcategoria(final String subcategoria) {
		this.subcategoria = subcategoria;
	}

}
