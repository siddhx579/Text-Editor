package simplejavatexteditor;
import javax.swing.JTextPane;
public class SimpleJavaTextEditor extends JTextPane {
    private static final long serialVersionUID = 1L;
    public final static String AUTHOR_EMAIL = "chiragtripathi1820@gmail.com";
    public final static String NAME = "JavaNotePad";
    public final static String EDITOR_EMAIL = "siddhantkapoor579@gmail.com";
    public final static double VERSION = 3.0;

    public static void main(String[] args) {
        new UI().setVisible(true);
    }

}
