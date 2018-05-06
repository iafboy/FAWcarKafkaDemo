package io.fawcar;

import io.fawcar.kafka.MsgProducer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(value = {"io.fawcar.kafka"})
public class Startup  {

    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }
    @Bean
    public ApplicationRunner runner(MsgProducer producer) {
        return (args) -> producer.sendMessage("fawcartopic", "fawcar topic messages");
    }
}
