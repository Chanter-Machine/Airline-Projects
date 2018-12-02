package com.airline.security;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Validator {
    private Object obj;
    private boolean isInvalid=false;

    public Validator(Object obj) {
        this.obj = obj;
    }

    public boolean validate(){

        Field[] fields = obj.getClass().getDeclaredFields();

        Arrays.asList(fields).forEach(o->checkFieldValue(o));

        //long invalids = Arrays.stream(fields).filter(o -> o.getType().equals(String.class)  && (checkFieldValue(o))).count();
        //if (invalids>0) isValid=false;
        return isInvalid;
    }

    public void checkFieldValue(Field field){

        field.setAccessible(true);
        if (field.getType().equals(String.class)) {
            try {
                String val = field.get(obj).toString();
                //check for javascript functions
                String regex = ".*((alert|on\\w+|function\\s+\\w+)\\s*\\(\\s*(['+\\d\\w](,?\\s*['+\\d\\w]*)*)*\\s*\\))";

                //check for disallowed html tags
                regex+="|(<(script|iframe|embed|frame|frameset|object|img|applet|body|html|style|layer|link|ilayer|meta|bgsound)).*";

                //check for illegal characters: checkDisallowedCharacters
                isInvalid = isInvalid || val.matches(regex) || checkDisallowedCharacters(val);

            } catch (Exception e) {
            }

        }
    }

    public boolean checkDisallowedCharacters(String string){
        String[] spechar = { "%", "&", "#", "<", ">", "\"", "?", "="};

        for (int i=0; i<spechar.length;i++){
            if (string.contains(spechar[i])) return true;
        }

        return false;
    }


}
