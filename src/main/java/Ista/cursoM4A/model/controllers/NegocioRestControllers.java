package Ista.cursoM4A.model.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Ista.cursoM4A.model.services.ISocioService;

@RestController
@RequestMapping("/api")
public class NegocioRestControllers {
	
	
	   @Autowired
	    private ISocioService socioService;

}
