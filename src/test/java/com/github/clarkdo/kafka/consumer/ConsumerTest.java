package com.github.clarkdo.kafka.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-kafka.xml")
public class ConsumerTest {

    @Resource
    Consumer consumer;

    @Test
    public void testConsume(){
        consumer.consume();
    }
}