package design_pattern;

import design_pattern.singleton.AClazz;
import design_pattern.singleton.BClazz;
import design_pattern.singleton.SocketClient;

public class SingletonTest {
    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println((aClient.equals(bClient)));

    }
}
