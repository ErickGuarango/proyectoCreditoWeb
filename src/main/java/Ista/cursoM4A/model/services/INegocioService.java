package Ista.cursoM4A.model.services;

import java.util.List;

import Ista.cursoM4A.model.entity.Negocio;


public interface INegocioService {
	
  public List<Negocio> finAll();
  
  public Negocio save(Negocio cliente);
	
  public Negocio findById(Long id);
	
  public void delete (long id);

}
