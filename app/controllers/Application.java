package controllers;

import com.google.inject.Inject;
import play.mvc.Controller;
import play.mvc.Result;
import services.SomeService;
import views.html.index;

public class Application extends Controller {

    @Inject
    private SomeService someService;

    public Result index() {
        someService.someMethod();

        return ok(index.render("Your new application is ready."));
    }

}
