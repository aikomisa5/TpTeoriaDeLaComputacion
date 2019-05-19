/**
  * Created by PC on 15/05/2019.
  */

import scala.io.Source

object Main {

  def main (args: Array[String]): Unit = {

    try {
      val lines = Source.fromFile("C:/Users/PC/Desktop/automata.txt").getLines.toList

      imprimir(lines)
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



  }

}
