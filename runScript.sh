#!/usr/bin/env bash

exec scala "$0" "$@"
!#
object Hello {
  def main(args: Array[String]) = println("Hello World!")
}
Hello.main(args)
