/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobfinder.service;

import com.jobfinder.model.Vacante;
import java.util.List;

/**
 *
 * @author JaimeCabrera
 */
public interface IVacanteService {
    
    public List<Vacante> listarTodo();
    
    public void guardar(Vacante vacante);
}
