package fideflash.cs.server.service;

import fideflash.cs.server.dao.GenericModelDAO;
import fideflash.cs.server.model.Model;

import java.util.Optional;

public class ModelServiceImpl<M extends Model> implements ModelService<M> {
    private final GenericModelDAO<M> genericModelDAO;

    public ModelServiceImpl(GenericModelDAO<M> genericModelDAO) {
        this.genericModelDAO = genericModelDAO;
    }

    @Override
    public M save(M model) {
        return genericModelDAO.createModel(model) ? model : null;
    }

    @Override
    public M update(M model) {
        return genericModelDAO.updateModel(model) ? model : null;
    }

    @Override
    public M getById(Long id) {
        Optional<M> optionalOfModel = genericModelDAO.getModelByPredicate(m -> m.getId().equals(id));
        return optionalOfModel.orElse(null);
    }

    @Override
    public Boolean delete(M model) {
        return genericModelDAO.deleteModel(model);
    }
}
