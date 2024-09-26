package com.app.lab5_20197122_gtics.controller;

import com.app.lab5_20197122_gtics.entity.Profesional;
import com.app.lab5_20197122_gtics.repository.AreaRepository;
import com.app.lab5_20197122_gtics.repository.FechaRepository;
import com.app.lab5_20197122_gtics.repository.ProfesionalRepository;
import com.app.lab5_20197122_gtics.repository.SedeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/app")
public class AppController {
    //Repository
    final ProfesionalRepository profesionalRepository;
    final AreaRepository areaRepository;
    final SedeRepository sedeRepository;
    final FechaRepository fechaRepository;

    public AppController(ProfesionalRepository profesionalRepository, AreaRepository areaRepository, SedeRepository sedeRepository, FechaRepository fechaRepository) {
        this.profesionalRepository = profesionalRepository;
        this.areaRepository = areaRepository;
        this.sedeRepository = sedeRepository;
        this.fechaRepository = fechaRepository;
    }
    //Mapeo
    @GetMapping("/catalogo")
    public String catalogo(Model model,
                           @RequestParam(value = "area", required = false) Integer areaId,
                           @RequestParam(value = "sede", required = false) Integer sedeId,
                           @RequestParam(value = "fecha", required = false) Integer fechaId) {
        //Condiciones de filtrado
        //Lista de profesionales
        List<Profesional> profesionales = profesionalRepository.findAll();
        //Enviar lista de areas
        model.addAttribute("areas", areaRepository.findAll());
        //Enviar lista de sedes
        model.addAttribute("sedes", sedeRepository.findAll());
        //Enviar lista de fechas
        model.addAttribute("fechas", fechaRepository.findAll());
        //Enviar a la vista
        model.addAttribute("profesionales", profesionales);
        return "catalogo";
    }

}
