package com.stream.pojos;

import java.util.List;

public class Client {

    private String name;
    private List<Project> projects;

    public Client(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", projects=" + projects +
                '}';
    }
}
