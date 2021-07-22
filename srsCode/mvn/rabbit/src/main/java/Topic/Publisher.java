package Topic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Publisher {

    public static String EXCHANGE_NAME = "topic-exchange";

    private final static String QUEUE_NAME_1 = "1-berlin";
    private final static String QUEUE_NAME_2 = "1-paris";
    private final static String QUEUE_NAME_3 = "1-all";

    public static String ROUTING_PATTERN_1 = "europe.1-berlin";
    public static String ROUTING_PATTERN_2 = "europe.1-paris";
    public static String ROUTING_PATTERN_3 = "europe.*";

    public static String ROUTING_KEY_1 = "europe.1-berlin";
    public static String ROUTING_KEY_2 = "europe.1-paris";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "topic", true);

        //Q_1 - BERLIN
        channel.queueDeclare(QUEUE_NAME_1, true, false, false, null);
        channel.queueBind(QUEUE_NAME_1, EXCHANGE_NAME, ROUTING_PATTERN_1);

        // Q_2 - PARIS
        channel.queueDeclare(QUEUE_NAME_2, true, false, false, null);
        channel.queueBind(QUEUE_NAME_2, EXCHANGE_NAME, ROUTING_PATTERN_2);

        // Q_3 - ALL
        channel.queueDeclare(QUEUE_NAME_3, true, false, false, null);
        channel.queueBind(QUEUE_NAME_3, EXCHANGE_NAME, ROUTING_PATTERN_3);


        for (int i = 0; i < 50; i++) {
            int value = getRandomValue();
            String key = ROUTING_KEY_1;
            if (value%2 == 0) key = ROUTING_KEY_2;

            String message = String.valueOf(getRandomValue());
            channel.basicPublish(EXCHANGE_NAME, key, null, message.getBytes());

            System.out.println(" [x] Sent '" + message + "'" + " >> " + key);
            Thread.sleep(2000);
        }
        channel.close();
        connection.close();
    }

    private static int getRandomValue() {
        return (int) (Math.random() * 20 + 1);
    }
}
