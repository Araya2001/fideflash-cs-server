package fideflash.cs.server.service;

import fideflash.cs.server.dao.GenericModelDAO;
import fideflash.cs.server.model.Message;
import fideflash.cs.server.model.Model;

public class MessageServiceImpl extends ModelServiceImpl<Message> implements MessageService {
    public MessageServiceImpl(GenericModelDAO<Message> genericModelDAO) {
        super(genericModelDAO);
    }

    @Override
    public Boolean enviarMensaje() {
        return null;
    }

    @Override
    public Boolean eliminarMensaje() {
        return null;
    }
}
