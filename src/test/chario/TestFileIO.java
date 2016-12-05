package test.chario;

import java.io.*;

public class TestFileIO {

	public static void main(String[] args) {
		// 문자스트림을 이용한 파일 입출력 테스트
		TestFileIO test = new TestFileIO();
		test.saveFile();
		test.openFile();

	}
	
	public void saveFile(){
		//BufferedWriter bw = null;
		
		try(BufferedWriter bw = new BufferedWriter(
				new FileWriter(new File("testCharSample.txt")))) {
			//File file = new File("testCharSample.txt");
			//bw = new BufferedWriter(new FileWriter(file));
			String data = "java 오라클 html5 css3 javascript jquery";
			bw.write(data);
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}/*finally{
			try {
				bw.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}*/
	}
	
	public void openFile(){
		//BufferedReader br = null;
		
		try(BufferedReader br = new BufferedReader(
				new FileReader("testCharSample.txt"));
				
				) {
			/*br = new BufferedReader(
					new FileReader("testCharSample.txt"));*/
			//파일 읽기시 대상 파일이 없으면 
			String data = br.readLine();
			
			System.out.println("파일로 부터 읽은 데이터 : " + data);
		} catch (Exception e) {
			e.printStackTrace();
		}/*finally{
			try {
				br.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}*/
	}

}







