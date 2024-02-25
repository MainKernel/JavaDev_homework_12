package service;

import dao.*;
import entity.ClientEntity;
import interfaces.dao.Create;
import interfaces.dao.Delete;
import interfaces.dao.Read;
import interfaces.dao.Update;

import java.util.List;
import java.util.Optional;

public class ClientCrudService implements Create<ClientEntity>, Read<ClientEntity, Long>,
        Update<ClientEntity>, Delete<ClientEntity, Long> {
    ClientDao dao = new ClientDao();


    @Override
    public void save(ClientEntity client) {
        dao.save(client);
    }

    @Override
    public void deleteById(Long aLong) {
        dao.deleteById(aLong);
    }

    @Override
    public void delete(ClientEntity client) {
        dao.delete(client);
    }

    @Override
    public Optional<ClientEntity> findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<ClientEntity> findAll() {
        return dao.findAll();
    }

    @Override
    public void update(ClientEntity client) {
        dao.update(client );
    }
}
