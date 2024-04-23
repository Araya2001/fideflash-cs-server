package fideflash.cs.server.service;

import fideflash.cs.server.dao.GenericModelDAO;
import fideflash.cs.server.model.Package;
import fideflash.cs.server.model.Route;
import fideflash.cs.server.model.RouteLocation;

public class RouteServiceImpl extends ModelServiceImpl<Route> implements RouteService {
    public RouteServiceImpl(GenericModelDAO<Route> genericModelDAO) {
        super(genericModelDAO);
    }

    @Override
    public Boolean agregarPaquete(Package aPackage) {
        return null;
    }

    @Override
    public Boolean agregarPuntoDeUbicacion(RouteLocation routeLocation) {
        return null;
    }

    @Override
    public Boolean iniciarRuta() {
        return null;
    }

    @Override
    public Boolean finalizarRuta() {
        return null;
    }
}
