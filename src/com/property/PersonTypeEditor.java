package com.property;

import java.beans.PropertyEditorSupport;

import com.property.classes.PersonType;

public class PersonTypeEditor extends PropertyEditorSupport  {
	public void setAsText(String text) {
        setValue(new PersonType(text.toUpperCase()));
    }

}
