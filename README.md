# Exporting ANTLR4 parse tree into XML

This code is a simple export of the LISP-style tree produced by `ParseTree.toStringTree` method. First you have to install the ANTLR4 according to [this instructions](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md). This solution is accompanied by a [stackoverflow question](https://stackoverflow.com/questions/46648209/transform-parse-tree-into-xml) where we discuss possible solution for the ParseTree XML export. Feel free to contribute to it if you have a better solution for the problem.

Once you have antlr4 ready (and reference in the CLASSPATH as well) you may use the following commands to run it:

     antlr4 -visitor str.g4
	 javac *.java
	 java main < test_file.in
	 
Test file has to contain an input in the LISP-style tree format and the result is XML on the standard output.
