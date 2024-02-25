package dao;

import entity.PlanetEntity;

import java.util.List;
import java.util.Optional;

public class PlanetDao implements Create<PlanetEntity>,Read<PlanetEntity, String>,
        Update<PlanetEntity>,Delete<PlanetEntity, String > {
    @Override
    public void save(PlanetEntity planetEntity) {

    }

    @Override
    public Optional<PlanetEntity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public List<PlanetEntity> findAll() {
        return null;
    }

    @Override
    public void update(PlanetEntity planetEntity) {

    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(PlanetEntity planetEntity) {

    }
}
