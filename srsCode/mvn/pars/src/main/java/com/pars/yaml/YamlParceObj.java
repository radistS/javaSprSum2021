package com.pars.yaml;

import com.pars.ReadFromFile;
import com.pars.UserExt;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.extensions.compactnotation.CompactConstructor;

import java.util.Map;

public class YamlParceObj {
    public static void main(String[] args) {
        Yaml yaml = new Yaml(new Constructor(UserExt.class));
        String yamlStr = ReadFromFile.readToString("/Users/stepurkoolksandr/javaSprSum2021/srsCode/mvn/pars/src/main/resources/userClass.yaml");
        UserExt user = yaml.load(yamlStr);
        System.out.println(user);
    }
}
