package interfaces.AF;

import interfaces.protocolo.Protocolo;
import interfaces.protocolo.Request;
import interfaces.protocolo.Response;

public interface AFProtocolo {
    public Protocolo createProtocolo();
    public Response createResponse();
    public Request createRequest(); 
}
