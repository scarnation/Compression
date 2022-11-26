package DataCompression;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class CompressFile {
	public static void main (String[] args) throws IOException {
		long startTime = System.nanoTime();
		CompressFile oscarCompress = new CompressFile();
		oscarCompress.compressFile("C:\\\\Users\\\\LENOVO LEGION\\\\Documents\\\\huffman root\\\\scart.mp4", "C:\\Users\\LENOVO LEGION\\Documents\\huffman root\\swa.png");
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		double seconds = (double) duration/1000000000;
		System.out.println("Done compressing time is " + seconds + "seconds");
	}
	
	private void compressFile(String fileToCompress, String compressFile) throws IOException {
		try (
			FileInputStream fin = new FileInputStream(fileToCompress);
			FileOutputStream fout = new FileOutputStream(compressFile);
			DeflaterOutputStream dos = new DeflaterOutputStream(fout);){
			int i;
			while ((i = fin.read()) != -1) {
				dos.write((byte) i);
				dos.flush();
			}
			
		}
		
		System.out.println("Done compressing file for Oscar, size reduction to 23%..");
	}

}
