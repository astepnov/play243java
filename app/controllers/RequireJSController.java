package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.rjs.index;


public class RequireJSController extends Controller {

    public Result index() {
        return ok(index.render());
    }
}
