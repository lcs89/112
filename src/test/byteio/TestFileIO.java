package test.byteio;

import java.io.*;

public class TestFileIO {

	public static void main(String[] args) {
		// 파일과의 입출력 처리 : 바이트스트림 이용한 경우
		TestFileIO test = new TestFileIO();
		
		test.output();
		test.input();
	}
	
	//파일로 부터 데이터를 읽어서 화면에 출력
	public void input(){
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		try {
			fin = new FileInputStream("testByteSample.dat");
			bin = new BufferedInputStream(fin);
			
			//대상 파일이 없으면 에러 발생함.
			byte[] data = new byte[100];
			/*int readData = 0, index = 0;
			while((readData = fin.read()) != -1){
				data[index++] = (byte)readData;
			}*/
			//fin.read(data);
			bin.read(data);
			System.out.println(new String(data));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}finally{
			try {
				bin.close();
				fin.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
	
	//파일을 만들고, 파일에 데이터 기록 저장
	public void output(){
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("testByteSample.dat");
			bout = new BufferedOutputStream(fout);
			
			//출력 스트림 클래스에서는 대상 파일이 없으면 자동으로 
			//파일을 만듦
			String data = "대한민국 서울 코리아 korea seoul 2016";
			/*fout.write(data.getBytes());
			fout.flush();*/
			bout.write(data.getBytes());
			bout.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}finally{
			try {
				bout.close();
				fout.close();  //스트림 반납
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}






