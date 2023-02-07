package di_framework;


public class Main {
    public static void main(String[] args) {
        Mountain mountain = new Mountain();

        Injector injector = new Injector(mountain);

        injector.getClassesAnnotated();

        injector.injectAll();

        System.out.println(mountain);
    }
}