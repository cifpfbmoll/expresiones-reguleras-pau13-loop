package edu.pingpong.romansgohome.domain.regex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RegexRomanNumber {
    
    // Creation of a HashMap(Array) to be able to include all regex with name and identify each regex by it's own name
    private Map<String, String> regexDictionary = new HashMap<>();

    // Constructor
    public RegexRomanNumber() {}

    // GET Regex Dictionary
    public Map<String, String> getRegexMap() {
        return this.regexDictionary;
    }

    // GET KEY Regex Dictionary
    public String getNameRegex(String key) {
        return this.regexDictionary.get(key);
    }

    // GET VALUES Regex Dictionary
    public Collection<String> getValueRegex() {
        return this.regexDictionary.values();
    }
}
