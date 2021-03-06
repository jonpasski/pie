package com.coverity.security.pie.policy.csp.fact;

import com.coverity.security.pie.core.EqualityStringMatcher;
import com.coverity.security.pie.core.FactMetaData;
import com.coverity.security.pie.core.NullStringCollapser;
import com.coverity.security.pie.core.PolicyConfig;
import com.coverity.security.pie.core.StringCollapser;

public class DirectiveFactMetaData implements FactMetaData {

    private static final DirectiveFactMetaData instance = new DirectiveFactMetaData();
    
    private DirectiveFactMetaData() {
    }
    
    public static DirectiveFactMetaData getInstance() {
        return instance;
    }
    
    @Override
    public StringCollapser getCollapser(PolicyConfig policyConfig) {
        return NullStringCollapser.getInstance();
    }

    @Override
    public boolean matches(String matcher, String matchee) {
        return EqualityStringMatcher.getInstance().matches(matcher, matchee);
    }

    @Override
    public FactMetaData getChildFactMetaData(String fact) {
        return HostFactMetaData.getInstance();
    }

}
