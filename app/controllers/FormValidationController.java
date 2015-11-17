package controllers;


import forms.FormWithGroups;
import forms.FormWithGroups.DescriptionValidation;
import forms.FormWithGroups.NameRequiredValidation;
import forms.FormWithGroups.OrderValidationGroupSequence;
import forms.FormWithGroups.TextValidation;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.formValidation.formTemplate;

public class FormValidationController extends Controller {

    public Result formValidatePage() {
        return ok(formTemplate.render(Form.form(FormWithGroups.class)));
    }

    public Result formValidate() {
        Form<FormWithGroups> form1 = Form.form(FormWithGroups.class).bindFromRequest();
        Form<FormWithGroups> form2 = Form.form(FormWithGroups.class, NameRequiredValidation.class).bindFromRequest();
        Form<FormWithGroups> form3 = Form.form(FormWithGroups.class, DescriptionValidation.class).bindFromRequest();
        Form<FormWithGroups> form4 = Form.form(FormWithGroups.class, TextValidation.class).bindFromRequest();
        Form<FormWithGroups> form5 = Form.form(FormWithGroups.class, OrderValidationGroupSequence.class).bindFromRequest();

        System.out.println();
        System.out.println("v1:" + form1.errors());
        System.out.println("v2:" + form2.errors());
        System.out.println("v3:" + form3.errors());
        System.out.println("v4:" + form4.errors());
        System.out.println("v5:" + form5.errors());
        System.out.println();

        return ok(formTemplate.render(Form.form(FormWithGroups.class)));
    }
}
