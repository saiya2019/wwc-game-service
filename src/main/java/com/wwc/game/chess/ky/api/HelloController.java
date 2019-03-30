package com.wwc.game.chess.ky.api;

import com.wwc.common.request.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloController extends BaseController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
