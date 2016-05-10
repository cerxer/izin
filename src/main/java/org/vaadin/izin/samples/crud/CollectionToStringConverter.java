package org.vaadin.izin.samples.crud;

import java.util.Collection;
import java.util.Locale;

import com.vaadin.data.util.converter.Converter;

/**
 * A converter that allows displaying a collection as a comma separated list of
 * strings.
 */
public class CollectionToStringConverter implements
        Converter<String, Collection> {

    
    public Collection convertToModel(String value,
            Class<? extends Collection> targetType, Locale locale)
            throws com.vaadin.data.util.converter.Converter.ConversionException {
        throw new UnsupportedOperationException(
                "Can only convert from collection to string");
    }

   
    public String convertToPresentation(Collection value,
            Class<? extends String> targetType, Locale locale)
            throws com.vaadin.data.util.converter.Converter.ConversionException {
        if (value == null)
            return "";
        StringBuilder b = new StringBuilder();
        for (Object o : value) {
            b.append(o.toString());
            b.append(", ");
        }
        return b.substring(0, b.length() - 2);

    }


    public Class<Collection> getModelType() {
        return Collection.class;
    }


    public Class<String> getPresentationType() {
        return String.class;
    }

}
