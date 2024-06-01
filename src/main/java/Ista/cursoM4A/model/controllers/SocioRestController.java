package Ista.cursoM4A.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ista.cursoM4A.model.entity.Socio;
import Ista.cursoM4A.model.services.ISocioService;

@RestController
@RequestMapping("/api")
public class SocioRestController {

    @Autowired
    private ISocioService socioService;

    @GetMapping("/socios")
    public List<Socio> index() {
        return socioService.findAll();
    }
}
