package br.com.example.conexadocker.controller;

import java.util.List;

public interface IRepositorioBase<T> {
	
	//Assinatura dos Metodos a ser implementados
	public boolean salvar(T entidade);
	/*public boolean altera(T entidade);
	public boolean excluir(Long id);
	public List<T> obterTodos();
	public T obterPorId(Long id);*/
	
	

}
