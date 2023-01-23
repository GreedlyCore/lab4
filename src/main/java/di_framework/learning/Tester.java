package di_framework.learning;

public class Tester {

    @TestDocumented(temp="Hello DOC with annotation")
    public void doSomeTest(){
        System.out.println("test for documented");
    }
    @TestNotDocumented(temp="Hello DOC without annotation")
    public void doNotSomeTest(){
        System.out.println("test for non documented");
    }

}
