package com.coverity.pie.policy.securitymanager.fact;

import com.coverity.pie.core.EqualityStringMatcher;
import com.coverity.pie.core.FactMetaData;
import com.coverity.pie.core.NullStringCollapser;
import com.coverity.pie.core.StringCollapser;
import com.coverity.pie.core.UnsupportedFactMetaData;

public class PermissionActionFactMetaData implements FactMetaData {

    private static final PermissionActionFactMetaData instance = new PermissionActionFactMetaData();
    
    private PermissionActionFactMetaData() {
    }
    
    public static PermissionActionFactMetaData getInstance() {
        return instance;
    }
    
    @Override
    public StringCollapser getCollapser() {
        return NullStringCollapser.getInstance();
    }

    @Override
    public boolean matches(String matcher, String matchee) {
        return EqualityStringMatcher.getInstance().matches(matcher, matchee);
    }

    @Override
    public FactMetaData getChildFactMetaData(String fact) {
        return UnsupportedFactMetaData.getInstance();
    }

}