package services.impl;


import services.SecondSomeService;

public class SecondSomeServiceImpl implements SecondSomeService {

    @Override
    public void method() {
        System.out.println("test_data");
    }

    @Override
    public boolean secondMethod() {
        return false;
    }
}
