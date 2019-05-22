package rpryjda.example.beanscope

import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import rpryjda.example.beanscope.component.BeanTest
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

//https://www.baeldung.com/spring-boot-add-filter

@Component
@Order(2)
class SecondFilter(val beanTest: BeanTest) : Filter {


    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {

        println("bean name: ${beanTest.randomName}")
        chain?.doFilter(request, response);
    }


}