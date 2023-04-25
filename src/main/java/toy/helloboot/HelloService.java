package toy.helloboot;

public interface HelloService {
    String sayHello(String name);

    default Integer countOf(String name) {
        return 0;
    }
}
