package rpryjda.example.beanscope

import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import rpryjda.example.beanscope.component.BeanTest
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest

//https://www.baeldung.com/spring-boot-add-filter
//https://stackoverflow.com/questions/25247218/servlet-filter-how-to-get-all-the-headers-from-servletrequest

@Component
@Order(1)
class FirstFilter(val beanTest: BeanTest) : Filter {


    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        request as HttpServletRequest
        beanTest.randomName = request.getHeader("Me")
        chain?.doFilter(request, response);
    }


}