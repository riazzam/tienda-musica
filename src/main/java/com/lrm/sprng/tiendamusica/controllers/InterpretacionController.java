package com.lrm.sprng.tiendamusica.controllers;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lrm.sprng.tiendamusica.models.entities.Estilo;
import com.lrm.sprng.tiendamusica.models.entities.Interpretacion;
import com.lrm.sprng.tiendamusica.models.entities.Interprete;
import com.lrm.sprng.tiendamusica.models.entities.Tema;
import com.lrm.sprng.tiendamusica.services.IInterpretacionService;
import com.lrm.sprng.tiendamusica.services.ITiendaService;



@Controller
@RequestMapping("/interpretacion")
@SessionAttributes("interpretacion")
public class InterpretacionController {
	
	@Autowired	
	private IInterpretacionService interpretacionService;
	@Autowired
	private ITiendaService tiendaService;

	@RequestMapping("/listar")
	public String listar(Model model) {
		
		model.addAttribute("titulo", "LISTADO DE INTERPRETACIONES:");
		model.addAttribute("interpretaciones", interpretacionService.findAll());
		
		return "interpretaciones/listar";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String crear(Map<String, Object> model) {
		
		Interpretacion interpretacion=new Interpretacion();
		model.put("titulo", "NUEVA INTERPRETACIÓN:");
		model.put("interpretacion", interpretacion);
		return "interpretaciones/form";

	}
	
	@GetMapping(value = "/cargarTemas/{term}", produces = { "application/json" })
	public @ResponseBody List<Tema> cargarTemas(@PathVariable String term) {

		return tiendaService.findByName(term);
	

	}
	@GetMapping(value = "/cargarEstilos/{term}", produces = { "application/json" })
	public @ResponseBody List<Estilo> cargarEstilos(@PathVariable String term) {

		return interpretacionService.findByNombreEstilo(term);

	}
	@GetMapping(value = "/cargarInterpretes/{term}", produces = { "application/json" })
	public @ResponseBody List<Interprete> cargarInterpretes(@PathVariable String term) {

		return interpretacionService.findByNombreInterprete(term);

	}
	
	
	@PostMapping (value = "/form")
	public String guardar(@Valid Interpretacion interpretacion, 
			BindingResult result,
			Model model,
			RedirectAttributes flash, 
			SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "NUEVA INTERPRETACIÓN:");
			return "interpretaciones/form";
			}
		
			
		interpretacionService.save(interpretacion);
		status.setComplete();
		flash.addFlashAttribute("success", "Interpretación "+interpretacion.getTemaInterpretacion().getNombreTema()+" creada con exito");
		
		return "redirect:/interpretacion/listar";
		
	}

	

}
