package design_pattern.singleton;

public class SocketClient {

    // 싱글톤 패턴은 자기 자신을 객체로 가지고 있어야 한다.
    private static SocketClient socketClient = null;

    private SocketClient() {

    }

    public static SocketClient getInstance() {

        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }

}
