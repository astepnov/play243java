package forms;


import play.data.validation.Constraints.Required;

import javax.validation.GroupSequence;

public class FormWithGroups {

    public interface NameRequiredValidation {
    }

    public interface DescriptionValidation {
    }

    public interface TextValidation extends NameRequiredValidation, DescriptionValidation {
    }

    @GroupSequence({NameRequiredValidation.class, DescriptionValidation.class})
    public interface OrderValidationGroupSequence {
    }

    @Required
    public String withoutGroup;

    @Required(groups = NameRequiredValidation.class)
    public String name;

    @Required(groups = DescriptionValidation.class)
    public String description;

    @Required(groups = TextValidation.class)
    public String text;

    @Required(groups = OrderValidationGroupSequence.class)
    public String groupSequence;

}
