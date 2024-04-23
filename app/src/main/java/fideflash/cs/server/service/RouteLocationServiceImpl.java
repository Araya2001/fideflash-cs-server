package fideflash.cs.server.service;

import fideflash.cs.server.dao.GenericModelDAO;
import fideflash.cs.server.model.RouteLocation;

public class RouteLocationServiceImpl extends ModelServiceImpl<RouteLocation> implements RouteLocationService {
    public RouteLocationServiceImpl(GenericModelDAO<RouteLocation> genericModelDAO) {
        super(genericModelDAO);
    }
}
