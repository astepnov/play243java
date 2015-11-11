package services.impl;


import services.SomeService;

public class SomeServiceImpl implements SomeService {

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
}
