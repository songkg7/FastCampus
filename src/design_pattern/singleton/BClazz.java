package design_pattern.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }
}
