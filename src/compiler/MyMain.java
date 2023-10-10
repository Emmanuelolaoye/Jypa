
package compiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MyMain {
    public static boolean error;
    static CharStream charStream;
    static SourceLanguageLexer languageLexer;
    static SourceLanguageParser languageParser;
    static ParseTree tree;
    static String SourcecodeFileName = "./src/compiler/SourceCode.txt";
    static String PythonFileName = "./src/compiler/What.py";


    public static void main(String[] args) throws Exception {
        try {
            openNotepad();
            getTree();
        } catch (IOException var3) {
            System.out.println("please change the file names");
        }

        MyVisitor myVisitor = new MyVisitor();
        String pythonCode = myVisitor.visit(tree);
        System.out.println(pythonCode);
        convertToPythonFile(pythonCode);
    }

    public static void openNotepad() throws IOException, InterruptedException {
        String textFile = String.valueOf(new File(SourcecodeFileName));
        String notepadApp = String.valueOf(new File("notepad.exe"));
        Runtime runtime = Runtime.getRuntime();
        Process p = runtime.exec(new String[]{notepadApp, textFile});
        BufferedReader stdOut = new BufferedReader(new InputStreamReader(p.getInputStream()));

        while(stdOut.readLine() != null) {
        }

    }

    public static void writeSampleText() {
        String sampletext = "// write code here<<";

        try {
            File f = new File(SourcecodeFileName);
            if (!f.exists() && f.isDirectory()) {
                System.out.println(22222);
                FileWriter w = new FileWriter(f);
                w.write(sampletext);
                w.close();
            }

            System.out.println("reopen");
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public static void convertToPythonFile(String pythonCode) throws IOException {
        FileWriter fileWriter = new FileWriter(PythonFileName);
        fileWriter.write(pythonCode);
        fileWriter.close();
    }

    public static void getTree() {
        try {
            languageLexer = new SourceLanguageLexer(CharStreams.fromFileName(SourcecodeFileName));
            languageParser = new SourceLanguageParser(new CommonTokenStream(languageLexer));
            tree = languageParser.program();
        } catch (Exception var1) {
            var1.printStackTrace();
        }

    }
}
