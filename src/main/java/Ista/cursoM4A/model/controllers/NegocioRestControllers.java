package Ista.cursoM4A.model.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Ista.cursoM4A.model.entity.Negocio;
import Ista.cursoM4A.model.services.INegocioService;
import Ista.cursoM4A.model.services.ISocioService;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class NegocioRestControllers {
	
	
	   @Autowired
	    private INegocioService negocioService;
	   
	   
	   //LISTAR Negocio
	   @GetMapping("/negocio")
	   public List<Negocio> index(){
		   return negocioService.finAll();
		   
	   }
	   @GetMapping("/negocio/{id}")
	   public Negocio show(@PathVariable Long id) {
		   return negocioService.findById(id);
	   }
	   
	   @PostMapping("/negocio")
	   @ResponseStatus(HttpStatus.CREATED)
	   public Negocio create(@RequestBody Negocio negocio) {
		   return negocioService.save(negocio);
	   }
	   
	   @PutMapping("/negocio/{id}")
	   public Negocio update(@RequestBody Negocio negocio,@PathVariable Long  id) {
		   Negocio negocioactual= negocioService.findById(id);
		   negocioactual.setActividad(negocio.getActividad());
		   negocioactual.setAntiguedad(negocio.getAntiguedad());
		   negocioactual.setCiudad(negocio.getCiudad());
		   negocioactual.setDireccion(negocio.getDireccion());
		   negocioactual.setHipotecado(negocio.isHipotecado());
		   negocioactual.setLugar_ventas(negocio.getLugar_ventas());
		   negocioactual.setNum_casa(negocio.getNum_casa());
		   negocioactual.setNum_empleados(negocio.getNum_empleados());
		   negocioactual.setNum_telefono(negocio.getNum_telefono()); 
		   negocioactual.setRazon_Social(negocio.getRazon_Social());
		   negocioactual.setReferencia(negocio.getReferencia());
		   negocioactual.setRuc(negocio.getRuc()); 
		    negocioactual.setSocio(negocio.getSocio());
		   negocioactual.setSub_actividad(negocio.getSub_actividad());
		   negocioactual.setTiempo(negocio.getTiempo());
	       return negocioService.save(negocio);
		   
	   }
	   
	 @DeleteMapping("/negocio/{id}")
	 @ResponseStatus(HttpStatus.NO_CONTENT)
	 public void delete(@PathVariable Long id) {
		 negocioService.delete(id);
	 }

}
    