package toy.helloboot;

public class Hello {

    private String name;
    private Integer count;

    public Hello(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }
}
