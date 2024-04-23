package fideflash.cs.server.service;

import fideflash.cs.server.model.Conversation;
import fideflash.cs.server.model.Message;

import java.math.BigInteger;
import java.util.Collection;

public interface ConversationService extends ModelService<Conversation> {
    public Collection<Message> obtenerMensajesPorOrdenDeEntrega();
}
