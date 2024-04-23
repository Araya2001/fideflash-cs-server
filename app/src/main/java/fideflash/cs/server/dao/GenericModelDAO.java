package fideflash.cs.server.dao;

import fideflash.cs.server.model.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

public class GenericModelDAO<M extends Model> {
    private final Collection<M> modelCollection;

    public GenericModelDAO() {
        this.modelCollection = new ArrayList<>();
    }

    public Boolean createModel(M model) {
        if (model != null) {
            modelCollection.add(model);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean updateModel(M model) {
        if (modelCollection.stream().anyMatch(m -> m.getId().equals(model.getId()))) {
            modelCollection.stream().filter(m -> m.getId().equals(model.getId())).findFirst().ifPresent(modelCollection::add);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Boolean deleteModel(M model) {
        if (modelCollection.stream().anyMatch(m -> m.getId().equals(model.getId()))) {
            modelCollection.stream().filter(m -> m.getId().equals(model.getId())).findFirst().ifPresent(modelCollection::remove);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public Optional<M> getModelByPredicate(Predicate<M> modelPredicate) {
        return modelCollection.stream().filter(modelPredicate).findFirst();
    }
}
