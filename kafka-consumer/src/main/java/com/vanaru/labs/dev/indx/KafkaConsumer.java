/**
 * @author Varun
 *
 */
package com.vanaru.labs.dev.indx;

import java.util.function.Consumer;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Varun
 *
 */
@Configuration
public class KafkaConsumer {

    /*
    *   consume the numbers received via kafka topic
    *   Consumer<T> makes this as kafka consumer of T
    * */

    @Bean
    public Consumer<KStream<String, Long>> squaredNumberConsumer(){
        return stream -> stream.foreach((key, value) -> System.out.println("Square Number Consumed : " + value));
    };

}
