package Publish_Subscribe;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Publisher {
    private final static String QUEUE_NAME_1 = "hillel_java_PS_1";
    private final static String QUEUE_NAME_2 = "hillel_java_PS_2";

    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel1 = connection.createChannel();
        channel1.queueDeclare(QUEUE_NAME_1, false, false, false, null);
        Channel channel2 = connection.createChannel();
        channel2.queueDeclare(QUEUE_NAME_2, false, false, false, null);

        for (int i = 0; i < 50; i++) {
            String message = String.valueOf(getRandomValue());
            channel1.basicPublish("", QUEUE_NAME_1, null, message.getBytes());
            channel2.basicPublish("", QUEUE_NAME_2, null, message.getBytes());

            System.out.println(" [x] Sent '" + message + "'");
           Thread.sleep(2000);
        }
        channel1.close();
        channel2.close();
        connection.close();
    }

    private static int getRandomValue() {
        return (int) (Math.random() * 20 + 1);
    }
}
