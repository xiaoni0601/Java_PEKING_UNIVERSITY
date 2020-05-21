import java.nio.file.*;
import java.nio.charset.*;
import java.util.List;

class ReadAllLines
{
	public static void main(String[] args) throws java.io.IOException
	{
		String filePath = "\\Users\\xiaonili\\Desktop\\chapter09\\ReadAllLines.java";

		List<String> lines = Files.readAllLines(
			Paths.get(filePath),  
			Charset.forName("utf-8") //or Charset.defaultCharset()
		);
		for(String s : lines ) System.out.println(s);
	}
}
