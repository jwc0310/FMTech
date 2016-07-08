package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kate on 2015/4/8
 */
public class FormData {
    public int id;
    public List<FormBlock> form_block;

    public static class FormBlock {
        public String key;
        public String title;
        public List<FormField> form_field;
    }

    public static class FormField {
        public String key;
        public String title;
        public String type; //number, phone, plain_text, secure_text, picker, date
        public String place_holder;
        public List<FormFieldOption> options;
        public boolean required;
        public String value;

        public FormFieldType getType() {
            if (type == null || type.isEmpty() || type.equals("plain_text")) {
                return FormFieldType.PLAIN_TEXT;
            }
            switch (type.charAt(0)) {
                case 'n':
                    return FormFieldType.NUMBER;
                case 'p':
                    if (type.equals("picker")) {
                        return FormFieldType.PICKER;
                    }
                    else {
                        return FormFieldType.PHONE;
                    }
                case 's':
                    return FormFieldType.SECURE_TEXT;
                case 'd':
                    return FormFieldType.DATE;
                default:
                    return FormFieldType.PLAIN_TEXT;
            }
        }

        public String[] getOptions() {
            if (options == null) {
                return new String[0];
            }

            List<String> values = new ArrayList<String>();
            for (FormFieldOption option : options) {
                values.add(option.title);
            }
            return values.toArray(new String[values.size()]);
        }
    }

    public static class FormFieldOption {
        public String key;
        public String value;
        public String title;
    }

    public enum FormFieldType {
        NUMBER,
        PHONE,
        PLAIN_TEXT,
        SECURE_TEXT,
        PICKER,
        DATE
    }
}
