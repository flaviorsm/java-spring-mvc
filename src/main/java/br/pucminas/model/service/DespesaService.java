package br.pucminas.model.service;

import java.util.List;

import br.pucminas.model.entity.Despesa;

public interface DespesaService {
	
	void salvar(Despesa categoria);

	void editar(Despesa categoria);

	void excluir(Long id);

	Despesa buscarPorId(Long id);

	List<Despesa> buscarTodos();

	List<Despesa> buscarPorCategoria(Long id);
}
