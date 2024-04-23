package fideflash.cs.server.service;

import fideflash.cs.server.model.BusinessPartnerProfile;
import fideflash.cs.server.model.Package;

public interface PackageService extends ModelService<Package> {
    Long generarIdentificadorUnico();

    Boolean cambiarEstadoDePaquete(String estadoACambiar);

    Boolean calificarEntrega(Double calificacion);
}
