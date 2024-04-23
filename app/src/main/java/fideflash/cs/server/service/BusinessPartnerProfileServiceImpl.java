package fideflash.cs.server.service;

import fideflash.cs.server.dao.GenericModelDAO;
import fideflash.cs.server.model.BusinessPartnerProfile;

public class BusinessPartnerProfileServiceImpl extends ModelServiceImpl<BusinessPartnerProfile> implements BusinessPartnerProfileService {
    public BusinessPartnerProfileServiceImpl(GenericModelDAO<BusinessPartnerProfile> genericModelDAO) {
        super(genericModelDAO);
    }

    @Override
    public Boolean actualizarPerfil(BusinessPartnerProfile profile) {
        return null;
    }
}
