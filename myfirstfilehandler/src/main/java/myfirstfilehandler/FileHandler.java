package myfirstfilehandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

/**
 * Class implemented for file handling.
 * @author ManishKumarGoel
 *
 */
public class FileHandler implements Callable{

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		String fileContent = eventContext.getMessage().getPayload().toString();
		
		File file = new File("C:\\Manish\\Mule\\output\\FinalOutput.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.flush();
		bw.write("Hello " + fileContent + " Your file has been processed successfully :::");
		bw.close();
		
		return fileContent;
	}

}
