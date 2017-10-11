import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class main {
public static void main(String[] args) throws Exception {
   // create a CharStream that reads from standard input
   ANTLRInputStream input = new ANTLRInputStream(System.in);
   // create a lexer that feeds off of input CharStream
   strLexer lexer = new strLexer(input);
   // create a buffer of tokens pulled from the lexer
   CommonTokenStream tokens = new CommonTokenStream(lexer);
   // create a parser that feeds off the tokens buffer
   strParser parser = new strParser(tokens);
   ParseTree tree = parser.expr(); // begin parsing at init rule
   
   String xml = "<?xml version=\"1.0\"?>" + new strXMLVisitor().visit(tree);
   System.out.println(xml);      
}
}