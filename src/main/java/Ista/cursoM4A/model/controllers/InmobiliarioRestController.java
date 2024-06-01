package Ista.cursoM4A.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ista.cursoM4A.model.entity.Inmobiliario;
import Ista.cursoM4A.model.services.IInmobiliarioService;

@RestController
@RequestMapping("/api")
public class InmobiliarioRestController {

    @Autowired
    private IInmobiliarioService inmobiliarioService;

    @GetMapping("/inmobiliarios")
    public List<Inmobiliario> index() {
        return inmobiliarioService.findAll();
    }
}
