package controllers;


import forms.WithFileForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.uploadFile.uploadFileForm;


public class UploadFileController extends Controller {

    public Result uploadFilePage() {
        return ok(uploadFileForm.render(
                Form.form(WithFileForm.class).fill(new WithFileForm())
        ));
    }

    public Result upload() {
        return ok();
    }
}
