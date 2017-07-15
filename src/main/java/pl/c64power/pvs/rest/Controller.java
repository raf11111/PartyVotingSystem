package pl.c64power.pvs.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RS
 */
@RestController
public class Controller {

    public Controller() {
    }

    @RequestMapping("/test")
    public String Test() {
        return "x";
    }
}
