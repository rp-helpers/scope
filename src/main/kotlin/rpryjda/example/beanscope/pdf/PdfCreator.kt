package rpryjda.example.beanscope.pdf

import com.itextpdf.text.*
import com.itextpdf.text.pdf.PdfPCell
import com.itextpdf.text.pdf.PdfPTable
import com.itextpdf.text.pdf.PdfWriter
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.FileOutputStream
import java.io.InputStream

fun main(args: Array<String>) {
    println("Hello, world!")
    PdfCreator.createSTH()
}


class PdfCreator {

    companion object {
        fun createSTH() {
            val document: Document = Document()
            PdfWriter.getInstance(document, FileOutputStream("iHelloWorls.pdf"))
            document.open()
            val font: Font = FontFactory.getFont(FontFactory.COURIER, 16.0F, BaseColor.BLACK)
            val chunk: Chunk = Chunk("hello world pdf file", font)
            document.add(chunk)
            document.close()
        }

        fun createSTH2(): InputStream {
            val out: ByteArrayOutputStream = ByteArrayOutputStream()
            val document: Document = Document(PageSize.A4, 50f, 50f, 50f, 50f)
            val writer: PdfWriter = PdfWriter.getInstance(document, out)
            document.open()
            val table: PdfPTable = PdfPTable(1)
            val cell: PdfPCell = PdfPCell(Phrase("Pierwszy wpis"))
            cell.border = Rectangle.NO_BORDER
            cell.runDirection = PdfWriter.RUN_DIRECTION_RTL
            table.addCell(cell)
            document.add(table)
            document.close()
            return ByteArrayInputStream(out.toByteArray())
        }
    }
}