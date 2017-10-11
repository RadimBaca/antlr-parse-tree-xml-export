# Exporting ANTLR4 parse tree into XML

This code is a simple export of the LISP-style tree produced by `ParseTree.toStringTree` method. First you have to install the ANTLR4 according to [this instructions](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md).

Once you have antl4 ready (and reference in the CLASSPATH as well) you may use the following commands to run it:

     antlr4 str.g4
	 javac *.java
	 java main < file
	 
File will contain the input LISP-tree and the result XML is on the standart output. There is a code for it, therefore, it is possible to integrate it into any JAVA project as well.
