/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobfinder.model;

import java.util.Date;

/**
 *
 * @author JaimeCabrera
 */
public class Vacante {

    private int id;
    private String nombre;
    private String descripcion;
    private String destacado;
    private String estatus;
    private double salario;
    private String imagen;
    private Date fecha;
    private Categoria categoria;

    public Vacante() {
    }

    public Vacante(int id, String nombre, String descripcion, String destacado, String estatus, double salario, String imagen, Date fecha, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.destacado = destacado;
        this.estatus = estatus;
        this.salario = salario;
        this.imagen = imagen;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestacado() {
        return destacado;
    }

    public void setDestacado(String destacado) {
        this.destacado = destacado;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Vacante{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", destacado=" + destacado + ", estatus=" + estatus + ", salario=" + salario + ", imagen=" + imagen + ", fecha=" + fecha + ", categoria=" + categoria + '}';
    }

   
    
    

}
