package pl.podstawyjavy.KolkoIKrzyzyk;

/**
 * Created by RENT on 2016-12-12.
 */
public class FieldAllreadyOccupiendException extends Exception {
    private String fieldName;

    public FieldAllreadyOccupiendException(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}
