import org.antlr.runtime.tree.TreeWizard;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName(args[0]);
        Analex analex = new Analex(input);
        CommonTokenStream tokens = new CommonTokenStream(analex);
        Anasint anasint = new Anasint(tokens);
        ParseTree tree = anasint.programa();
        JFrame frame = new JFrame("Antlr ParseTree (M)");
        TreeViewer v = new TreeViewer(Arrays.asList(anasint.getRuleNames()),tree);
        JScrollPane panel = new JScrollPane(v);
        v.setScale(0.8);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1000,300);
        frame.setVisible(true);
        // Semántico.
        ParseTreeWalker walker= new ParseTreeWalker();
        Anasem anasem=new Anasem();
        walker.walk(anasem, tree);
        //Interprete
        InterpreteParametros visitor = new InterpreteParametros();
        visitor.visit(tree);


    }

}
