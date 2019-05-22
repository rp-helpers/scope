package rpryjda.example.beanscope.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import rpryjda.example.beanscope.component.RequestBean


@RestController
class ScopeController(val requestBean: RequestBean) {

    @GetMapping("/test")
    fun method() = requestBean.randomName


}