package Ista.cursoM4A.model.services;

import java.util.List;
import Ista.cursoM4A.model.entity.Conyugue;

public interface IConyugueService {
    public List<Conyugue> findAll();
    public Conyugue findById(Long id);
    public Conyugue save(Conyugue conyugue);
    public void deleteById(Long id);
}
