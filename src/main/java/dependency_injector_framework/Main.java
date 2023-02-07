package dependency_injector_framework;


public class Main {
    public static void main(String[] args) {
        Mountain mountain = new Mountain();

        Injector.getInstance().injectTo(mountain);

        System.out.println(mountain);
    }
}