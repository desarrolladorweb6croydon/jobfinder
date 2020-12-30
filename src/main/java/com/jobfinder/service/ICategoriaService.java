package com.jobfinder.service;

import java.util.List;

import com.jobfinder.model.Categoria;

public interface ICategoriaService {
	
	public List<Categoria>listarTodo();
	
	public void guardar(Categoria categoria);

	public Categoria buscarPorId(int id);

	public void eliminar(int id);

}
