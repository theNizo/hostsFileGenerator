import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        //args = new String[]{"/home/nizo/Documents/hosts/tld /home/nizo/Documents/hosts/input /home/nizo/Documents/hosts/output"}; //remove later
        //correct args
        if(args.length==3) {
            args = new String[]{null, args[0], args[1], args[2]};
        }
        if (args.length!=4) {
            System.out.println("Usage:\n\t.jar </path/to/head> </path/to/TopLevelDomains> </path/to/input> <path/to/output>\n\nThe head can be empty.\n");
            System.exit(1);
        }
        //initializing variables
        String head;
        ArrayList<String> tld = new ArrayList<>();
        ArrayList<String> input = new ArrayList<>();
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[3]));
        //reading the head
        BufferedReader reader;
        String l;
        if(args[0]!=null) {
            reader = new BufferedReader(new FileReader(new File(args[0])));
            while ((l = reader.readLine()) != null) {
                writer.append(l + "\n");
            }
            writer.append("\n");
        }
        //reading TLDs
        reader = new BufferedReader(new FileReader(new File(args[1])));
        while ((l = reader.readLine())!=null) {
            if(!l.startsWith(".")) {
                l = "." + l;
            }
            tld.add(l);
        }

        //reading input
        reader = new BufferedReader(new FileReader(new File(args[2])));
        while ((l = reader.readLine())!=null) {
            //used for testing
            //String[] test = line.split("[.]");
            //System.out.println(test.length);
            if (l.split("[.]").length!=2) {
                for (String e:tld) {
                    writer.append("0.0.0.0 " + l + e + "\n");
                    writer.append("0.0.0.0 " +"www." + l + e + "\n");
                }
            }
            else {
                writer.append("0.0.0.0 " + l + "\n");
                writer.append("0.0.0.0 www." + l + "\n");
            }
        }

        writer.close();
    }
}
