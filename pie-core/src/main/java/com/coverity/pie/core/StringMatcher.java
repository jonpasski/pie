package com.coverity.pie.core;

/**
 * An interface which represents logic for string matching. The abstracts implementations such as strict equality
 * matching or wildcard path matching.
 */
public interface StringMatcher {
    /**
     * Does the matcher string match the matchee string, according to the implementation's ruleset.
     *
     * @param matcher The matcher pattern.
     * @param matchee The string against which the match is being performed.
     * @return
     */
    public boolean matches(String matcher, String matchee);
}
