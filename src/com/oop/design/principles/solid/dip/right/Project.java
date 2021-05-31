package com.oop.design.principles.solid.dip.right;

import java.util.List;

public class Project {

    private final List<Developer> developers;

    public Project(List<Developer> developers) {
        this.developers = developers;
    }

    public void develop() {
        developers.forEach(Developer::develop);
    }
}
