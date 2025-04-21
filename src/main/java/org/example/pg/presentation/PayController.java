package org.example.pg.presentation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
public class PayController {

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/pay")
    public String pay() {
        return "paySample";
    }
}
