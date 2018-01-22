import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Node {

    public static void main(String[] args) throws IOException {

        String routerAddress = JOptionPane.showInputDialog(null, "What is the address of the router?");
        int routerPort = Integer.parseInt(JOptionPane.showInputDialog(null, "What port should you be accessed on?")); // port number


        ServerParent server = new ServerParent(routerPort);
        (new Thread(server)).start();

        /*boolean Running = true;
        Scanner scan = new Scanner(System.in);

        // Creating threads with accepted connections
        while (Running)
        {
            try {
                if(scan.hasNext()) {
                    Client ct = new Client(5555, routerAddress);
                    (new Thread(ct)).start();
                    scan.next();
                }
            }catch (Exception e) {
                System.err.println("Unknown error has occurred.");
                System.exit(1);
            }
        }//end while*/
        Node n = new Node();
    }

    public Node(){
        JFrame frame = new JFrame("Node");
        frame.setSize(300, 225);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JButton go = new JButton("GO");
        go.setBounds(100, 125, 100, 40);
        go.setFont(new Font("Arial", Font.BOLD, 18));
        JComboBox list = new JComboBox();
        list.setBounds(50, 75, 200, 30);
        list.setFont(new Font("Arial", Font.PLAIN, 14));
        JLabel heading = new JLabel("Pick your file:", SwingConstants.CENTER);
        heading.setBounds(50, 25, 200, 50);
        heading.setFont(new Font("Arial", Font.BOLD, 24));

        frame.add(go);
        frame.add(list);
        frame.add(heading);

        frame.setVisible(true);
    }
}

