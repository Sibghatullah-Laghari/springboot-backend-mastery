package com.learning.firstapi.API_SoftwareEngineers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/softwareEngineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(1, "John Doe", "john@cctrs.com", "java, python, c++"),
                new SoftwareEngineer(2, "Ali", "Ali@cctrs.com", "java, web, c++"),
                new SoftwareEngineer(3, "Victus", "victus@cctrs.com", "kotlin, ios, c++")
        );
    }
}
