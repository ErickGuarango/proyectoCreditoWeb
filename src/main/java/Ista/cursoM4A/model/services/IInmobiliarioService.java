package Ista.cursoM4A.model.services;

import java.util.List;
import Ista.cursoM4A.model.entity.Inmobiliario;

public interface IInmobiliarioService {
    public List<Inmobiliario> findAll();
    public Inmobiliario findById(Long id);
    public Inmobiliario save(Inmobiliario inmobiliario);
    public void deleteById(Long id);
}
