package com.lrm.sprng.tiendamusica.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lrm.sprng.tiendamusica.models.entities.Tema;
import com.lrm.sprng.tiendamusica.services.ITiendaService;


@Controller
@RequestMapping("/tema")
@SessionAttributes("temas")
public class TemaController {
	@Autowired	
	private ITiendaService tiendaService;

	@RequestMapping("/listar")
	public String listar(Model model) {
		
		model.addAttribute("titulo", "LISTADO DE TEMAS:");
		model.addAttribute("temas", tiendaService.findAll());
		
		return "temas/listar";
	}
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String crear(Map<String, Object> model) {
		
		Tema tema=new Tema();
		model.put("titulo", "NUEVO TEMA:");
		model.put("tema", tema);
		return "temas/form";

	}
	
	
	@PostMapping (value = "/form")
	public String guardar(@Valid Tema tema, 
			BindingResult result,
			Model model,
			RedirectAttributes flash, 
			SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "NUEVO TEMA:");
			return "temas/form";
			}
		
			
		tiendaService.save(tema);
		status.setComplete();
		flash.addFlashAttribute("success", "Tema "+tema.getNombreTema()+" creado con exito");
		
		return "redirect:/tema/listar";
		
	}

}
