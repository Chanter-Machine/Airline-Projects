package com.airline.enums;

public enum UserType {
    PASSENGER (1),
    AIRLINE (2)
    ;

    private final int userTypeCode;

    private UserType(int userTypeCode) {
        this.userTypeCode = userTypeCode;
    }

    public boolean Compare(int i){return userTypeCode == i;}
    public static UserType GetValue(int code)
    {
        UserType[] utc = UserType.values();
        for(int i = 0; i < utc.length; i++)
        {
            if(utc[i].Compare(code))
                return utc[i];
        }
        return UserType.PASSENGER;
    }
}
