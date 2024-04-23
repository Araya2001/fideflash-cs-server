package fideflash.cs.server.service;

import fideflash.cs.server.dao.GenericModelDAO;
import fideflash.cs.server.model.Conversation;
import fideflash.cs.server.model.Message;

import java.util.Collection;

public class ConversationServiceImpl extends ModelServiceImpl<Conversation> implements ConversationService {
    public ConversationServiceImpl(GenericModelDAO<Conversation> genericModelDAO) {
        super(genericModelDAO);
    }

    @Override
    public Collection<Message> obtenerMensajesPorOrdenDeEntrega() {
        return null;
    }
}
