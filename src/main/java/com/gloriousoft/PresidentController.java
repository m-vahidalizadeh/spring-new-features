package com.gloriousoft;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("presidents")
public class PresidentController {

    /*
    curl -X POST localhost:8080/presidents -H "Content-Type: application/json" -d '{"id":1, "firstName": "George", "lastName": "Washington"}'
    http POST localhost:8080/presidents id:=1 firstName=George lastName=Washington -v
     */

    List<President> presidents = new ArrayList<>();

    @PostMapping
    public President addPresident(@RequestBody President president) {
        presidents.add(president);
        return president;
    }

    /*
    http localhost:8080/presidents -v
     */

    @GetMapping
    public List<President> getAllPresidents() {
        return presidents;
    }

}
