package Ista.cursoM4A.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ista.cursoM4A.model.entity.Empresa;
import Ista.cursoM4A.model.services.IEmpresaService;

@RestController
@RequestMapping("/api")
public class EmpresaRestController {

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping("/empresas")
    public List<Empresa> index() {
        return empresaService.findAll();
    }
}
