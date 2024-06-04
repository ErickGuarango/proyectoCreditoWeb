package Ista.cursoM4A.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import Ista.cursoM4A.model.entity.Negocio;
import Ista.cursoM4A.model.dao.INegocioDao;

public class INegocioServiceImpl implements  INegocioService {
	
	@Autowired
	private INegocioDao negocioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Negocio> finAll() {
		// TODO Auto-generated method stub
		return (List<Negocio>) negocioDao.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Negocio findById(Long id) {
		// TODO Auto-generated method stub
		return negocioDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public Negocio save(Negocio negocio) {
		// TODO Auto-generated method stub
		return negocioDao.save(negocio);
	}

	

	@Override
	@Transactional
	public void delete(long id) {
		// TODO Auto-generated method stub
		negocioDao.deleteById(id);
	}

}
