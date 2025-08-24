package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter2 {
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}