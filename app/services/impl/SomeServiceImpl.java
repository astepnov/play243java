package services.impl;


import com.google.inject.Inject;
import services.SecondSomeService;
import services.SomeService;

public class SomeServiceImpl implements SomeService {

    @Inject
    private SecondSomeService secondSomeService;

    @Override
    public void someMethod() {
        System.out.println("SomeServiceImpl -> someMethod()");
    }

    @Override
    public String getSomeString() {
        return "some_string";
    }

    @Override
    public int getSomeInt() {
        return 9;
    }

    @Override
    public void useSecondSomeService() {
        secondSomeService.method();
    }
}
