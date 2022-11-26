package DataCompression;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class DecompressFile {
	public static void main (String[] args) throws IOException {
		long startTime = System.nanoTime();
		DecompressFile oscarDecompress = new DecompressFile();
		oscarDecompress.decompressFile( "C:\\Users\\LENOVO LEGION\\Documents\\huffman root\\swa.png", "C:\\\\\\\\Users\\\\\\\\LENOVO LEGION\\\\\\\\Documents\\\\\\\\huffman root\\\\\\\\sway2.mp4");
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		double seconds = (double) duration/1000000000;
		System.out.println("Done compressing time is " + seconds + "seconds");
	}
	private void decompressFile (String fileDecompress, String deCompressFile) throws IOException {
		try (
				FileInputStream fin = new FileInputStream(fileDecompress);
				InflaterInputStream in = new InflaterInputStream(fin);
				FileOutputStream fout = new FileOutputStream(deCompressFile);){
			int i;
			while (( i = in.read()) != -1) {
				fout.write((byte) i);
				fout.flush();
			}
		}
		System.out.println("done decompressing for oscar..");
	}

}
