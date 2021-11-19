package interfaceAndAbstraction.sayHello;

public abstract class BasePerson implements Person {

    private final String name;

    protected BasePerson(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello";
    }

    @Override
    public String getName() {
        return this.name;
    }

}
