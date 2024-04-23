package fideflash.cs.server.service;

import fideflash.cs.server.model.BusinessPartnerProfile;
import fideflash.cs.server.model.Message;

public interface MessageService extends ModelService<Message>{
    public Boolean enviarMensaje();

    public Boolean eliminarMensaje();
}
