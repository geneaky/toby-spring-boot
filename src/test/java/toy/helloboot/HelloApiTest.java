package toy.helloboot;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class HelloApiTest {

    @Test
    void helloApi() throws Exception {
        TestRestTemplate rest = new TestRestTemplate();

        ResponseEntity<String> res = rest.getForEntity("http://localhost:9090/app/hello?name={name}",
            String.class, "Spring");


        //status code
        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);
        //content-type
        assertThat(res.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE).startsWith(MediaType.TEXT_PLAIN_VALUE));
        //body content
        assertThat(res.getBody()).isEqualTo("*Hello Spring*");
    }

    @Test
    void helloDecorator() throws Exception {
        HelloDecorator decorator = new HelloDecorator(name -> name);

        String ret = decorator.sayHello("Test");

        Assertions.assertThat(ret).isEqualTo("*Test*");
    }
}
