package toy.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleHelloServiceTest {


    @Test
    void simpleHelloService() throws Exception {
        SimpleHelloService helloService = new SimpleHelloService(helloRepositoryStub);

        String ret = helloService.sayHello("Test");

        Assertions.assertThat(ret).isEqualTo("Hello Test");
    }

    private static HelloRepository helloRepositoryStub = new HelloRepository() {
            @Override
            public Hello findHello(String name) {
                return null;
            }

            @Override
            public void increaseCount(String name) {

            }
        };
}