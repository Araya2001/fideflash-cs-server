package fideflash.cs.server.service;

import fideflash.cs.server.model.Profile;

public interface ProfileService<P extends Profile> extends ModelService<P>{
    Boolean actualizarPerfil(P profile);
}
