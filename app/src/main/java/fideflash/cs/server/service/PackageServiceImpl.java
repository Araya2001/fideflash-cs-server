package fideflash.cs.server.service;

import fideflash.cs.server.dao.GenericModelDAO;
import fideflash.cs.server.model.Package;

public class PackageServiceImpl extends ModelServiceImpl<Package> implements PackageService {
    public PackageServiceImpl(GenericModelDAO<Package> genericModelDAO) {
        super(genericModelDAO);
    }

    @Override
    public Long generarIdentificadorUnico() {
        return null;
    }

    @Override
    public Boolean cambiarEstadoDePaquete(String estadoACambiar) {
        return null;
    }

    @Override
    public Boolean calificarEntrega(Double calificacion) {
        return null;
    }
}
