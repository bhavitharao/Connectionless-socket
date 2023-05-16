import javax.swing.JFrame;
public class ClientTestcol
{
    public static void main(String[] args)
    {
        Clientcol application = new Clientcol();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.waitForPackets();
    }
}