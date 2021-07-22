import lombok.AllArgsConstructor;
import org.ehcache.Cache;

@AllArgsConstructor
public class UserDao {
    private CacheHelper cache;

    public User getUserById(int id) throws InterruptedException {
        Cache ch = cache.getUserCache();
        if (ch.containsKey(id)) {
            System.out.println("get value from cache");
            return (User) ch.get(id);
        } else {
            System.out.println(String.format("value not found in cache with id : %s", id));
        }

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.print("#");
        }
        System.out.println();
        System.out.println("get value from DB");
        User user = new User(id, "Ivan", "Ivanov", 27, "phone", "email");
        ch.put(id, user);

        return user;
    }
}
