package memcache;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;
import net.rubyeye.xmemcached.XMemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class MemcacheExampleWrite {
    public static void main(String[] args) {
        implementXMemCachedClient();
    }

    private static void implementXMemCachedClient() {
        String city = "New York 12123";
        String city2 = "San Francisco 12121234";
        try {

            // XMemcached constructor,default weight is 1
            XMemcachedClient xMemCachedclient = new XMemcachedClient("localhost", 11211);

            // Set a value
            xMemCachedclient.set("Crunchify", 1000, city);
            xMemCachedclient.set("Twitter", 1000, city2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MemcachedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish");
    }
}
