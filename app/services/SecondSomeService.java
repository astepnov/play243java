package services;

import com.google.inject.ImplementedBy;
import services.impl.SecondSomeServiceImpl;

@ImplementedBy(SecondSomeServiceImpl.class)
public interface SecondSomeService {

    void method();

    boolean secondMethod();
}
