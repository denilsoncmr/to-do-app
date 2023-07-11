/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cmr.todoapp;

import controller.ProjectController;
import model.Project;

/**
 *
 * @author Denilson
 */
public class ToDoApp {
    public static void main(String[] args) {
        
        ProjectController controller = new ProjectController();
        
        Project project = new Project();
        
        project.setName("projeto teste");
        project.setDescription("Testando");
        
        controller.save(project);
    }
}
