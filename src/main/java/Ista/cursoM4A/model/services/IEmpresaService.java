package Ista.cursoM4A.model.services;

import java.util.List;
import Ista.cursoM4A.model.entity.Empresa;

public interface IEmpresaService {
    public List<Empresa> findAll();
    public Empresa findById(Long id);
    public Empresa save(Empresa empresa);
    public void deleteById(Long id);
}
