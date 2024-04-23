package fideflash.cs.server.service;

import fideflash.cs.server.model.Package;
import fideflash.cs.server.model.Route;
import fideflash.cs.server.model.RouteLocation;

public interface RouteService extends ModelService<Route> {
    Boolean agregarPaquete(Package aPackage);

    Boolean agregarPuntoDeUbicacion(RouteLocation routeLocation);

    Boolean iniciarRuta();

    Boolean finalizarRuta();
}
