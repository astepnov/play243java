package controllers;


import com.google.inject.Inject;
import play.mvc.Controller;
import play.mvc.Result;

import services.SomeService;
import views.html.common.index;

public class CommonController extends Controller {

    @Inject
    private SomeService someService;

    public Result index() {
        someService.getSomeInt();
        someService.getSomeString();
        someService.someMethod();

        return ok(index.render());
    }
}
