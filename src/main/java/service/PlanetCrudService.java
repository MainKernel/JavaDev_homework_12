package service;

import dao.PlanetDao;
import entity.PlanetEntity;
import interfaces.dao.Create;
import interfaces.dao.Delete;
import interfaces.dao.Read;
import interfaces.dao.Update;

import java.util.List;
import java.util.Optional;

public class PlanetCrudService implements Create<PlanetEntity>, Read<PlanetEntity, String>,
        Update<PlanetEntity>, Delete<PlanetEntity,String> {
    PlanetDao dao = new PlanetDao();

    @Override
    public void save(PlanetEntity planetEntity) {
        dao.save(planetEntity);
    }

    @Override
    public void deleteById(String s) {
        dao.deleteById(s);
    }

    @Override
    public void delete(PlanetEntity planetEntity) {
        dao.delete(planetEntity);
    }

    @Override
    public Optional<PlanetEntity> findById(String s) {
        return dao.findById(s);
    }

    @Override
    public List<PlanetEntity> findAll() {
        return dao.findAll();
    }

    @Override
    public void update(PlanetEntity planetEntity) {
        dao.update(planetEntity);
    }
}
