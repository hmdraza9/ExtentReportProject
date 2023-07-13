package util;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReaderClass {

	public String propReader(String propKey) throws IOException {
		// TODO Auto-generated method stub

		FileReader reader = new FileReader("C:/all-props/myprops.properties");
		Properties pr = new Properties();
		pr.load(reader);
		
		return pr.getProperty(propKey);
		
	}

}
