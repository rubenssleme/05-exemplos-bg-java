package br.bg;

import java.util.List;

public interface IRepositorioBase<T> {
	public boolean incluir(T objeto);
	public boolean alterar(T objeto);
	public boolean excluir(Long id);
	public List<T> obterTodos();
	public T obterPorId(Long id);		
}
