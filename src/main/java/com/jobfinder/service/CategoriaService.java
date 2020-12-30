package com.jobfinder.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jobfinder.model.Categoria;

@Service
public class CategoriaService implements ICategoriaService {

	private List<Categoria> lista = null;

	public CategoriaService() {
		lista = new LinkedList<Categoria>();
		Categoria categoria1 = new Categoria();
		categoria1.setId(1);
		categoria1.setNombre("Backend");
		Categoria categoria2 = new Categoria();
		categoria2.setId(2);
		categoria2.setNombre("Frontend");
		Categoria categoria3 = new Categoria();
		categoria3.setId(3);
		categoria3.setNombre("Analista Programador");
		lista.add(categoria1);
		lista.add(categoria2);
		lista.add(categoria3);
	}

	@Override
	public List<Categoria> listarTodo() {
		return lista;
	}

	@Override
	public void guardar(Categoria categoria) {
		lista.add(categoria);
	}

	@Override
	public Categoria buscarPorId(int id) {
		for (Categoria categoria : lista) {
			if (categoria.getId() == id) {
				return categoria;
			}
		}
		return null;
	}

	@Override
	public void eliminar(int id) {
		Categoria categoria = buscarPorId(id);
		lista.remove(categoria);
	}
}
