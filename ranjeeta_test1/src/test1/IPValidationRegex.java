package test1;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author ranjeeta mishra
 * @version 1.0
 * reads a file and print list of invalid ips
 *
 */
public class IPValidationRegex {
	private Pattern pattern;
	//ClassLoader classLoader = getClass().getClassLoader();

	public IPValidationRegex() {
		pattern = Pattern.compile(
				"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
		
			}

	public void validateIP(String input) {
		Matcher match = pattern.matcher(input);

		if (!match.matches()) {
			System.out.println("Invalid IP found,please verify  " + input);
		}
	}

	public static void main(String[] args) throws IOException {
       
        String inp = "";
		File file = new File("C:\\Users\\khitishmishra\\workspace\\ranjeeta_test1\\src\\test1\\IpList1.txt");
        IPValidationRegex ip = new IPValidationRegex();
        final FileReader fr = new FileReader(file);
		final BufferedReader bfo = new BufferedReader(fr);

		try {
			
			while ((inp = bfo.readLine()) != null) {
				ip.validateIP(inp);
			}
		} 
		
		catch (FileNotFoundException f) {
			f.printStackTrace();
		}

		finally {
			fr.close();
			bfo.close();
		}

	}
	

}
