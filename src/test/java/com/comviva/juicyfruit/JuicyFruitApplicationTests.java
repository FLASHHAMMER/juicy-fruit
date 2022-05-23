package com.comviva.juicyfruit;

import com.comviva.juicyfruit.controller.TestHelloController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class JuicyFruitApplicationTests {

    // TODO
//    public CassandraController getCassandraController(){
//        return new CassandraController();
//    }

    public TestHelloController getTestHelloController(){
        return new TestHelloController();
    }

    // TODO
//    @Test
//    void contextLoads() {
//        assertThat(this.getCassandraController()).isNotNull();
//    }

    @Test
    void hello() {
        assertThat(this.getTestHelloController().hello().getResponse().size()).isEqualTo(1);
    }

}
