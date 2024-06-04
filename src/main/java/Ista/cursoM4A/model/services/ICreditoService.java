package Ista.cursoM4A.model.services;

import java.util.List;

import Ista.cursoM4A.model.entity.Credito;

public interface ICreditoService {
	
	public List<Credito> findAll();
	
	public Credito save(Credito credito);
	
	public Credito findById(Long id);
	
	public void delete (long id);  
}
