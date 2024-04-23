package fideflash.cs.server.service;

import fideflash.cs.server.model.Model;

public interface ModelService<M extends Model> {
    M save(M model);

    M update(M model);

    M getById(Long id);

    Boolean delete(M model);
}
