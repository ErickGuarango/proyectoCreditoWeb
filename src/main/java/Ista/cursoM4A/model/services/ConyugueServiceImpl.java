package Ista.cursoM4A.model.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Ista.cursoM4A.model.entity.Conyugue;
import Ista.cursoM4A.model.dao.IConyugueDao;

@Service
public class ConyugueServiceImpl implements IConyugueService {

    @Autowired
    private IConyugueDao conyugueDao;

    @Override
    @Transactional(readOnly = true)
    public List<Conyugue> findAll() {
        return StreamSupport.stream(conyugueDao.findAll().spliterator(), false)
                            .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Conyugue findById(Long id) {
        Optional<Conyugue> conyugue = conyugueDao.findById(id);
        return conyugue.orElse(null);
    }

    @Override
    @Transactional
    public Conyugue save(Conyugue conyugue) {
        return conyugueDao.save(conyugue);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        conyugueDao.deleteById(id);
    }
}
