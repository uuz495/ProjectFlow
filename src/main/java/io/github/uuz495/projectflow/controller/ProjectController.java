package io.github.uuz495.projectflow.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController 
public class ProjectController {
    @GetMapping("/api/projects")
    public List<String> getProjects() {
        return List.of();
    }  
}
