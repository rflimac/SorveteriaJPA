package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SORVETE")
public class Sorvete {

	@Id
	@Column(name = "NOME", nullable = false)
	private String nome;
	@Column(name = "TIPO", nullable = false)
	private String tipo;
	@Column(name = "MARCA", nullable = false)
	private String marca;
	@Column(name = "INGREDIENTES", nullable = false)
	private String Ingredientes;
	@Column(name = "VALIDADE", nullable = false)
	private String validade;
	@Column(name = "FABRICACAO", nullable = false)
	private String fabricacao;

	public String getIngredientes() {
		return Ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		Ingredientes = ingredientes;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Sorvete [nome=" + nome + ", tipo=" + tipo + ", marca=" + marca + ", Ingredientes=" + Ingredientes
				+ ", validade=" + validade + ", fabricacao=" + fabricacao + "]";
	}

	
	
}
