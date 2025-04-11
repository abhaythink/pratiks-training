package com.trainingspringboot.pratik.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Names {
   // @JsonIgnoreProperties({"name1","name3"})
    private String name1;
    //@JsonIgnore
    private String name2;
    private String name3;
    //@JsonProperty("Name")
    private String name4;

    public Names(String name2, String name1, String name3, String name4) {
        this.name2 = name2;
        this.name1 = name1;
        this.name3 = name3;
        this.name4 = name4;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    @Override
    public String toString() {
        return "Names{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", name3='" + name3 + '\'' +
                ", name4='" + name4 + '\'' +

                '}';
    }


}
