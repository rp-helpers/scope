package rpryjda.example.beanscope.controller

import org.springframework.core.io.InputStreamResource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import rpryjda.example.beanscope.pdf.PdfCreator

//https://twilblog.github.io/java/spring/rest/file/stream/2015/08/14/return-a-file-stream-from-spring-rest.html
//itext return inputstream
//https://stackoverflow.com/questions/31430465/how-to-get-the-outputstream-of-a-written-pdf-from-itext
//https://www.leveluplunch.com/java/tutorials/032-return-file-from-spring-rest-webservice/
//https://stackoverflow.com/questions/13238181/how-can-convert-inputstream-to-inputstreamsource-or-datasource-to-attach-in-spri

@RestController
class PdfController {

    @GetMapping("/pdf", produces = ["application/pdf"])
    fun getPdf() = InputStreamResource(PdfCreator.createSTH2())

}