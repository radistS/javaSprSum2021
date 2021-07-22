package memcache;

import net.rubyeye.xmemcached.XMemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class MemcacheExampleRead {
    public static void main(String[] args) {
        implementXMemCachedClient();
    }

    private static void implementXMemCachedClient() {
        try {


            // XMemcached constructor,default weight is 1
            XMemcachedClient xMemCachedclient = new XMemcachedClient("localhost", 11211);

            // Get a value for specify key
            log("=====> Key: Twitter, Value: " + xMemCachedclient.get("Twitter") + "\n");

            // Get a value for specify key (set timeout of three seconds)
            log("=====> Key: Crunchify, Value: " + xMemCachedclient.get("Crunchify", 3000) + "\n");

            log("=====> Key: Odesa, Value: " + xMemCachedclient.get("Odesa", 3000) + "\n");


            System.out.println(xMemCachedclient.get(List.of("Twitter", "Crunchify", "Odesa")));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MemcachedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Simple log utility
    private static void log(Object object) {
        System.out.println(object);

    }
}
