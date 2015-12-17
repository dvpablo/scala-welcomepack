SCALA-WELCOMEPACK
=================
This is a repo showing a basic setup in SCALA, using:

- [SBT](http://www.scala-sbt.org/) for dependency management and test


##Compile
```
$ scalac -d classes src/main/scala/Hello.scala
```

##Build
```
$ sbt
```

##Test
```
$ sbt
> test
```

##Run
```
$ sbt
> run
$ scala -cp classes Hello
$ ./runScript.sh
```

REVISIONS
=========
##0.1.0
*2015-12-17 | Pablo del Vecchio*

- First commit