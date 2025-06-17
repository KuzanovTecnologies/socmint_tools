package pkg.haxtoolz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

    /**
    *
    *@Author Diego Rêgo
    */
public class passCrack {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException  (
        String wordlist = "test.txt";
        //load data from dict - newline seperated
        String hashtocrack = "6ad14ba9986e3615423dfca256d04e3f";
        //load hash to crack
        //try all combinations

        //System.out.println(new File(".").getAbsolutePath());
        //admin - 21232f297a57a5a743894a0e4a801fc3
        //user123 - 6ad14ba9986e3615423dfca256d04e3f

        String algorithm = "MD5";
        boolean verbose = true;
        try (BufferedReader br = new BufferedReader(new FileReader(wordlist))) {
            System.out.println("[*] Wordlist read. Starting the cracking process... [*]\n");
            String line;
            while ((line = br.readline()) != null)  {
                line = line.replace("\n", "");
                //System.out.println(line);

                //md5 it
                byte[] bytesOfMessage = line.getBytes("UTF-8");
                MessageDigest md = MessageDigest.getInstance(algorithm);
                //System.out.println(md);
                byte[] thedigest = md.digest(bytesOfMessage);
                //System.out.println(thedigest);
                BigInteger bigInt = new BigInteger(1,thedigest);
                String hashtext = bigInt.toString(16);
                if(verbose == true) {
                    System.out.println("Trying >" + hashtext);
                }
            }

            if(hashtocrack.contains(hashtext)){
                System.out.Println("[+] CRACKED PASSWORD : " + hashtext + " -> " + line);

        }

        }
    )
}    
public class blksoctools  {

    public static void main(string[] args) throws FileNotFoundException {
        String url = null;
        HttpURLConnection con = null;
        String wordlist = "common.txt";
        //IMPLEMENT FOR LOOP TO ITERATE OVER BLKSOCTOOLS
        String exty = "";

        try ( BufferedReader br = new BufferedReader (new FileReader(wordlist))) {
            System.out.println("[*] Wordlist read. Starting the soc process... [*]\n");
            String line;

            try {
                url = JOptionPane.showInputDialog("Enter the host you want to scan (with protocol - ex. https://www.microsoft.com/pt-br/) :");
            }   catch (Exception ex) {
                  System.out.println("Could not set the URL variable");
            }

            }

            while ((line = br.readLine()) != null)  {
                //System.out.println(line);
                line = line.replace("\n", "");
                exty = line;
                String EXT = "/" + exty;
                //  https://www.microsoft.com/pt-br/robots.txt
                System.out.println(EXT);


                try (
                    url = url + EXT;
                    URL urly = new URL(url);
                    con = (HTTPURLConnection) urly.openConnection();
                } catch (IOException ex)  {
                    System.out.println("[-]" + ex);
                }

                try {
                    con.setRequestMethod("GET");                    
                } catch  (ProtocolException ex)  {
                    System.out.println("Cant Set method (GET) - " + ex);
                }
                try {
                    if  (con.getResponseCode() == 200)  {
                         System.out.println("Found 200 on Dir : " + EXT);

                         //System.out.println(con.getResponseMessage());
                try {
                    url = url + EXT;
                    //
                    URL urly = new URL(url);
                    con = (HttpURLConnection) urly.openConnection();
                } catch (IOException ex)  {
                    System.out.println("[-]" + ex);

                }

                try  {
                     con.setRequestMethod("GET");
                } catch  (ProtocolException ex)  {
                    System.out.println("Cant Set method (GET) - " + ex);
                }

                try  {
                     if (con.getResponseCode() == 200)  {
                         System.out.println("Found 200 on dir : " + EXT);

                         //System.out.println(con.getResponseMessage());
                     } else {
                        System.out.println("Found " + con.getResponseCode() + " on Dir : " + EXT);
                     }
                
                }  catch   (IOException ex)  {
                     Logger.getLogger.println(blkSocTools.class.getName()).log(Level.SEVERE, null, ex);
                    
                }  

            }
                    
                     }
                }  catch  (IOException ex)  {
                     Logger.getLogger(blkSocTools.class.getName()).log(Level.SEVERE, null, ex);
                }

                }

                }
                    
                    }
                } catch  (IOException ex)  {
                    Logger.getLogger(blkSocTools.class.getName().log(Level.SEVERE, null, ex));
                }
                //HERE
        }
    }
}