package Ista.cursoM4A.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ista.cursoM4A.model.entity.Conyugue;
import Ista.cursoM4A.model.services.IConyugueService;

@RestController
@RequestMapping("/api")
public class ConyugueRestController {

    @Autowired
    private IConyugueService conyugueService;

    @GetMapping("/conyugues")
    public List<Conyugue> index() {
        return conyugueService.findAll();
    }
}
