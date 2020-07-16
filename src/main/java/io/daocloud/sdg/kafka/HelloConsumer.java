package io.daocloud.sdg.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


/**
 * @Author: gaoqiang
 * @Date: 2020/7/15 4:25 下午
 */
@SpringBootApplication
public class HelloConsumer implements CommandLineRunner {

    //public static Logger logger = LoggerFactory.getLogger(HelloConsumer.class);

    public static void main(String[] args) {
        SpringApplication.run(HelloConsumer.class, args).close();
    }

    @Autowired
    private KafkaTemplate<String, String> template;

    private final CountDownLatch latch = new CountDownLatch(3);

    @Override
    public void run(String... args) throws Exception {
        this.template.send("hello", "foo1");
        this.template.send("hello", "foo2");
        this.template.send("hello", "foo3");
        latch.await(20, TimeUnit.SECONDS);
        System.out.println("All received");
    }

    @KafkaListener(topics = "hello")
    public void listen(ConsumerRecord<?, ?> cr) throws Exception {
        System.out.println(cr.toString());
        latch.countDown();
    }
}

