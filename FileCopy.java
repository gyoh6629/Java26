package iostream.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
//		copyImageFile();
		copyTextFile();
	}
	
	public static void copyImageFile() {
		String source = "Curi_01.jpg";
		String target = "Curi_01_copied.jpg";
		
		try (
				// 입력 파일로 입력 스트림 객체 생성
				InputStream fis = new FileInputStream(source);	
				// 출력 파일로 출력 스트림 객체 생성
				OutputStream fos = new FileOutputStream(target);				
		) {
			while (true) {
//				//입력 스트림 객체로부터 데이터를 읽어 옴
//				int data = fis.read();
//				fos.write(data);
//				// 읽어온 데이터를 출력 스트림 객체로 출력
//				fos.write(data);
				
				byte[] dataArr = new byte[128];
				int result = fis.read(dataArr);
				if (result == -1) break;
				fos.write(dataArr);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void copyTextFile() {
		String source = "copyTextFile_01.txt";
		String target = "copyTextFile_01_copied.txt";
		
		try (
				// 입력 파일로 입력 스트림 객체 생성
				InputStream fis = new FileInputStream(source);	
				// 출력 파일로 출력 스트림 객체 생성
				OutputStream fos = new FileOutputStream(target);				
		) {
			while (true) {
//				//입력 스트림 객체로부터 데이터를 읽어 옴
//				int data = fis.read();
//				fos.write(data);
//				// 읽어온 데이터를 출력 스트림 객체로 출력
//				fos.write(data);
				
				byte[] dataArr = new byte[128];
				int result = fis.read(dataArr);
				if (result == -1) break;
				fos.write(dataArr);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
