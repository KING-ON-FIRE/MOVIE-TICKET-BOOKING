package lecture;
import java.io.*;
public class Write {
	Write(String str){
		FileWriter fr = null;
		try {
			File f = new File("C:\\Users\\tpenu\\Desktop\\rough1.txt");
			fr = new FileWriter(f,true);
			fr.write(str);
			fr.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}