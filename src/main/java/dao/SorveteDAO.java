package dao;

import entidade.Sorvete;

public interface SorveteDAO {

	void listarSorvete(String nome);
	void adicionarSorvete(Sorvete sabor);
	void removerSorvete(Sorvete sabor);
	
}
