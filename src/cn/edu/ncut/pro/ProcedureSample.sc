package cn.edu.ncut.pro

import scala.io.Source._
import java.io._

object ProcedureSample {
  def sayHelloNoProce(name: String) = { "Hello" + name }
                                                  //> sayHelloNoProce: (name: String)String
  sayHelloNoProce("Ocaen")                        //> res0: String = HelloOcaen

  def sayHelloProce(name: String) { print("Hello" + name); "Hello" + name }
                                                  //> sayHelloProce: (name: String)Unit
  sayHelloProce("Person")                         //> HelloPerson

  def sayHelloProceStatement(name: String): Unit = { "Hello" + name }
                                                  //> sayHelloProceStatement: (name: String)Unit
  sayHelloProceStatement("Alex")
  /**********************Lzay**************************/
  lazy val line = fromFile("d://a.txt").mkString  //> line: => String = <lazy>
  line                                            //> res1: String = Hello
  print(line)                                     //> Hello

  lazy val lines = fromFile("d://e.log").mkString //> lines: => String = <lazy>

  lazy val nofile = fromFile("d://e.xx").mkString //> nofile: => String = <lazy>
  /**********************try**************************/
  try {
    throw new IllegalArgumentException("illegal")
  } catch {
    case _: IllegalArgumentException => print("Error!")
  } finally {
    print("\nfinally")
  }                                               //> Error!
                                                  //| finally

  try {
    throw new IOException("illegal")
  } catch {
    case e1: IllegalArgumentException => print("Error!")
    case e2: IOException => print("IO Error!")
  } finally {
    print("finally")
  }

}