package Ista.cursoM4A.model.services;

import java.util.List;
import Ista.cursoM4A.model.entity.Conyugue;

public interface IConyugueService {
    List<Conyugue> findAll();
    Conyugue findById(Long id);
    Conyugue save(Conyugue conyugue);
    void deleteById(Long id);
}
