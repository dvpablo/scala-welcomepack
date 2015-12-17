package org.scalatest.examples.flatspec

import org.scalatest.FlatSpec
import Main.Hello

class HelloTest extends FlatSpec {

  behavior of "Hello"

  it should "print a string" in {
    Hello.main(Array[String]())
  }
}