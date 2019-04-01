package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoad {

	public static Properties propLoad() throws IOException {
		
		File file = new File("./env.properties");
		FileInputStream fs = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fs);
		return prop;
	}
}
