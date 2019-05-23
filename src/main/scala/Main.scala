/**
  * Created by PC on 15/05/2019.
  */

import scala.io.Source
import scala.util.matching.Regex

object Main {

  def main (args: Array[String]): Unit = {

    try {
      val lines = Source.fromFile("C:/Users/PC/Desktop/automata.txt").getLines.toList

      val input = "SANDIA"

      imprimir(lines)

      val pattern = new Regex("(S|s)cala")
      val str = "Scala is Scalable and cool"

      println((pattern findAllIn str).mkString(","))

      println(input.charAt(1))

    }
    catch{
      case _: Throwable => println ("Ha ocurrido un error al intentar leer el archivo .txt")
    }
    finally{

    }

    //lines.foreach( (c: String) => println(c) )
    @annotation.tailrec
    def imprimir[A](l: List[A]): Unit = {
      if (!l.isEmpty){
        println(l.head)
        imprimir(l.tail)
      }
    }

    def verificarInput (input : String): Boolean = {

    }

    def recursionInput (input : String, i : Int): Boolean = {
      if (i == 0) {
        false
      }
      else{
        recursionInput()
    }

    }

    /*
    def obtenerAlfabeto[A](s: List[A]): List[A] ={
      if (s.length != 0)
        s.head
    }
    */



  }

}
