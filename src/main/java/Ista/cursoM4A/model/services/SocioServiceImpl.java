package Ista.cursoM4A.model.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Ista.cursoM4A.model.entity.Conyugue;
import Ista.cursoM4A.model.entity.Socio;
import Ista.cursoM4A.model.dao.ISocioDao;

@Service
public class SocioServiceImpl implements ISocioService {

    @Autowired
    private ISocioDao socioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Socio> findAll() {
    	return (List<Socio>) socioDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Socio findById(Long id) {
        Optional<Socio> socio = socioDao.findById(id);
        return socio.orElse(null);
    }

    @Override
    @Transactional
    public Socio save(Socio socio) {
        return socioDao.save(socio);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        socioDao.deleteById(id);
    }
}
