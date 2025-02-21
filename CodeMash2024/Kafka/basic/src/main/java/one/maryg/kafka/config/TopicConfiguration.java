package one.maryg.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfiguration {

     @Bean
         public NewTopic balance() {
             return TopicBuilder.name("balance")
                     .partitions(1)
                     .replicas(1)
                     .compact() // cleanup policy of delete or compact
                     .build();
         }

         @Bean
         public NewTopic payments() {
             return TopicBuilder.name("payments")
                     .partitions(1)
                     .replicas(1)
                     .compact()
                     .build();
         }

         @Bean
         public NewTopic fraud() {
             return TopicBuilder.name("fraud")
                     .partitions(1)
                     .replicas(1)
                     .compact()
                     .build();
         }

         @Bean
         public NewTopic blacklist() {
             return TopicBuilder.name("blacklist")
                     .partitions(1)
                     .replicas(1)
                     .compact()
                     .build();
         }

         @Bean
         public NewTopic rewards() {
             return TopicBuilder.name("rewards")
                     .partitions(1)
                     .replicas(1)
                     .compact()
                     .build();
         }

}
