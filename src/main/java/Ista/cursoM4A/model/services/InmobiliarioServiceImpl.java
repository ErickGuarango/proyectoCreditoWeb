package Ista.cursoM4A.model.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Ista.cursoM4A.model.entity.Inmobiliario;
import Ista.cursoM4A.model.dao.IInmobiliarioDao;

@Service
public class InmobiliarioServiceImpl implements IInmobiliarioService {

    @Autowired
    private IInmobiliarioDao inmobiliarioDao;

    @Override
    @Transactional(readOnly = true)
    public List<Inmobiliario> findAll() {
        return StreamSupport.stream(inmobiliarioDao.findAll().spliterator(), false)
                            .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Inmobiliario findById(Long id) {
        Optional<Inmobiliario> inmobiliario = inmobiliarioDao.findById(id);
        return inmobiliario.orElse(null);
    }

    @Override
    @Transactional
    public Inmobiliario save(Inmobiliario inmobiliario) {
        return inmobiliarioDao.save(inmobiliario);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        inmobiliarioDao.deleteById(id);
    }
}
