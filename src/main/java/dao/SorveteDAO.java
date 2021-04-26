package dao;

import java.util.List;

import entidade.Sorvete;

public interface SorveteDAO {

	public List<Sorvete> listarSorvete();
	public void adicionarSorvete(Sorvete sorvete);
	public void removerSorvete(String nomeRemove);
	
}
