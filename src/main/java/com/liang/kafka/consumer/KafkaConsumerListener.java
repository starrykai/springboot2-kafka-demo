package com.liang.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author lianghaiyang 2018/11/22 10:37
 */
@Slf4j
public class KafkaConsumerListener {
    /**
     * 消费消息统一处理
     */
    @KafkaListener(topics = "${spring.kafka.consumer.topic}")
    public void listen(ConsumerRecord<?, ?> record) {
        log.info("消费kafka的key: " + record.key());
        log.info("消费kafka的value: " + record.value().toString());
    }
}