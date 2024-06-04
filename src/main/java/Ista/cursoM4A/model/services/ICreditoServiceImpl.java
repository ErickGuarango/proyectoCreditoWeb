package Ista.cursoM4A.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import Ista.cursoM4A.model.dao.ICreditoDao;
import Ista.cursoM4A.model.entity.Credito;

public class ICreditoServiceImpl implements ICreditoService  {
	
	@Autowired
	private ICreditoDao creditoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Credito> findAll() {
		// TODO Auto-generated method stub
		return (List<Credito>) creditoDao.findAll();
	}

	@Override
	@Transactional
	public Credito save(Credito credito) {
		// TODO Auto-generated method stub
		return creditoDao.save(credito);
	}

	@Override
	@Transactional
	public Credito findById(Long id) {
		// TODO Auto-generated method stub
		return creditoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		// TODO Auto-generated method stub
		creditoDao.deleteById(id);
		
	}

}
