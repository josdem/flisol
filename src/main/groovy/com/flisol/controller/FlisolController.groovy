package com.flisol.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class FlisolController {

  @RequestMapping("/")
  String index(){
    'Hello from Flisol!'
  }
}
