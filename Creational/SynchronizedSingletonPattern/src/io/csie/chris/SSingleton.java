package io.csie.chris;

/**
 * Title: io.csie.chris.SSingleton <br/>
 * Description: decorate the method, getInstance(), with synchronized and static.
 *
 * @author chris
 * @version 1.0
 */
public class SSingleton {

    private static SSingleton instance = null;

    private SSingleton() {
    }

    // Make sure that only one thread can access the instance
    synchronized static public SSingleton getInstance() {

        if (instance == null) {
            instance = new SSingleton();
        }
        return instance;
    }
}
