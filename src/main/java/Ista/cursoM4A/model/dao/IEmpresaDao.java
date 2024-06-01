package Ista.cursoM4A.model.dao;

import org.springframework.data.repository.CrudRepository;
import Ista.cursoM4A.model.entity.Empresa;

public interface IEmpresaDao extends CrudRepository<Empresa, Long> {

}

