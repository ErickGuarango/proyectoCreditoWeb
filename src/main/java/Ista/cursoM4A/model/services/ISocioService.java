package Ista.cursoM4A.model.services;

import java.util.List;
import Ista.cursoM4A.model.entity.Socio;

public interface ISocioService {
    public List<Socio> findAll();
    public Socio findById(Long id);
    public Socio save(Socio socio);
    public void deleteById(Long id);
}
