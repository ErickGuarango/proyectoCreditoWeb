package Ista.cursoM4A.model.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Ista.cursoM4A.model.entity.Empresa;
import Ista.cursoM4A.model.dao.IEmpresaDao;

@Service
public class EmpresaServiceImpl implements IEmpresaService {

    @Autowired
    private IEmpresaDao empresaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empresa> findAll() {
        return StreamSupport.stream(empresaDao.findAll().spliterator(), false)
                            .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public Empresa findById(Long id) {
        Optional<Empresa> empresa = empresaDao.findById(id);
        return empresa.orElse(null);
    }

    @Override
    @Transactional
    public Empresa save(Empresa empresa) {
        return empresaDao.save(empresa);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        empresaDao.deleteById(id);
    }
}
