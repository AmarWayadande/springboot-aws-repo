package com.example.springboot_aws_ecs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
@GetMapping("/get")
    public String get()
{
    return "Hello Test AWS ECS";
}

}
