package com.example.springdicoverycli;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

@RestController
public class RestCtl {

    @RequestMapping(method = RequestMethod.GET, value = "/check-api/{name}")
    public Map<String, String> checkApi(@PathVariable String name,
                                        @RequestHeader(value = "X-CNJ-Name", required = false) Optional<String> cn) {
        String resolvedName = cn.orElse(name);
        return Collections.singletonMap("greeting", "Hello: " + resolvedName);
    }
}
