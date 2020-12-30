/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobfinder.service;

import com.jobfinder.model.Vacante;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author JaimeCabrera
 */
@Service
public class VacanteService implements IVacanteService {

	private List<Vacante> vacantes = null;

	public VacanteService() {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			this.vacantes = new LinkedList<>();
			// Categoria categoria = new Categoria();
			Vacante v1 = new Vacante();
			v1.setId(1);
			v1.setNombre("Desarrollador Full Stack");
			v1.setDescripcion("o Springboot\n" + "\n" + "o Angular\n" + "\n" + "o Nodejs\n" + "\n" + "o Java\n" + "\n"
					+ "o Microservicios\n" + "\n" + "o Integración\n" + "\n" + "o Servicios Web\n" + "\n" + "o Soap\n"
					+ "\n" + "o Rest\n" + "\n" + "o Metodologías agile");
			v1.setImagen("logo1");
			v1.setFecha(dateFormat.parse("12-12-2020"));
			v1.setEstatus("Creado");
			v1.setSalario(5000000);
			v1.setDestacado(true);
			v1.setCategoria(null);

			Vacante v2 = new Vacante();
			v2.setId(2);
			v2.setNombre("Desarrollador Java Senior");
			v2.setDescripcion(
					"Profesional en: Ingeniería Eléctrica, Ingeniería Electrónica, Ingeniería de Telecomunicaciones, Ingeniería Telemática, Ingeniería de Sistemas, Ingeniería Informática o carreras afines.\n"
							+ "\n"
							+ "Experiencia mínima de un (1) año en Java 1.7 y 1.8, Frameworkjsp, Java Script, SQL, ORACLEDB, Angularjs, WebLogic, GlassFish, HTML5, CSS3, Servicios Web SOAP y Rest, EJB.\n"
							+ "\n" + "Experiencia específica como desarrollador en Java, Base de datos Oracle.");
			v2.setImagen("logo2");
			v2.setFecha(dateFormat.parse("28-12-2020"));
			v2.setEstatus("Creado");
			v2.setSalario(4500000);
			v2.setDestacado(false);
			v2.setCategoria(null);

			Vacante v3 = new Vacante();
			v3.setId(3);
			v3.setNombre("Desarrollador Java");
			v3.setDescripcion(
					"Empresa de Tecnologia require Desarrollador Java ingenieros de Sistemas, ingeniero electronicos, ingeneiros de Software o afines con experiencia y conocimientos de 3 años en\n"
							+ "\n"
							+ "Spring Framework: Servicios REST,JPA, Spring Boot, Eclipse y/o Spring Tool Suite.Servidores de bases de datos de alguna de las siguientes: Postgresql, MS SQL Server, Oracle.\n"
							+ "\n"
							+ "sistema de control de versiones, pruebas automáticas e integración continua: GIT, Junit, Jenkins.Experiencia en proyectos ágiles de desarrollo.\n"
							+ "\n" + "Altamente deseable: Conocimientos en Maven, SonarQube, Artifactory.\n" + "\n");
			v3.setImagen("logo3");
			v3.setFecha(dateFormat.parse("28-12-2020"));
			v3.setEstatus("Creado");
			v3.setSalario(5500000);
			v3.setDestacado(true);
			v3.setCategoria(null);

			vacantes.add(v1);
			vacantes.add(v2);
			vacantes.add(v3);
		} catch (ParseException ex) {
			ex.printStackTrace(System.out);
		}
	}

	@Override
	public List<Vacante> listarTodo() {
		return vacantes;
	}

	@Override
	public void guardar(Vacante vacante) {
		vacantes.add(vacante);
	}

	@Override
	public Vacante buscarPorId(int id) {
		for (Vacante vacante : vacantes) {
			if (vacante.getId() == id) {
				return vacante;
			}
		}
		return null;
	}
}
