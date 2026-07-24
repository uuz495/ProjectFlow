package io.github.uuz495.projectflow.controller;
import io.github.uuz495.projectflow.model.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController 
public class ProjectController {
    @GetMapping("/api/projects")
    public List<Project> getProjects() {
        return List.of(
            new Project(1,"Learn ProjectFlow")
        );
    }  
}
