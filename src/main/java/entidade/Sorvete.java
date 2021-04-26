package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sorvete")
public class Sorvete {
	
	@Id
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "TIPO", nullable = false)
	private String tipo;
	
	@Column(name = "MARCA", nullable = false)
	private String marca;
	
	@Column(name = "INGREDIENTES", nullable = false)
	private String ingredientes;
	
	@Column(name = "VALIDADE", nullable = false)
	private String validade;
	
	@Column(name = "FABRICACAO", nullable = false)
	private String fabricacao;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(String fabricacao) {
		this.fabricacao = fabricacao;
	}

	@Override
	public String toString() {
		return "Nome " + nome + ", tipo: " + tipo + ", marca =" + marca + ", ingredientes =" + ingredientes
				+ ", validade =" + validade + ", fabricacao =" + fabricacao;
	}

	

}