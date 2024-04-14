package interfaces.protocolo;

public interface Protocolo {
    public void open();
    public void message(Response response, Request request);
    public void close();
}
