import javax.swing.JFrame;
public class ServerTestcol
{
    public static void main(String[] args)
    {
        Servercol application = new Servercol();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.waitForPackets();
    }
}