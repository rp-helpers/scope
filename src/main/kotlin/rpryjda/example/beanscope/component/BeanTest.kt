package rpryjda.example.beanscope.component

import org.springframework.context.annotation.Scope
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.stereotype.Component
import java.util.*

@Component
//@Scope("request", proxyMode = ScopedProxyMode.TARGET_CLASS)
class BeanTest{
    var randomName: String? = null
}