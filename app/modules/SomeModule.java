package modules;


import com.google.inject.AbstractModule;
import services.SomeService;
import services.impl.SomeServiceImpl;

public class SomeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SomeService.class)
                .to(SomeServiceImpl.class);
    }
}
