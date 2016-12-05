package test.chario;

import java.io.*;

public class TestFileIO {

	public static void main(String[] args) {
		// ���ڽ�Ʈ���� �̿��� ���� ����� �׽�Ʈ
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
			String data = "java ����Ŭ html5 css3 javascript jquery";
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
			//���� �б�� ��� ������ ������ 
			String data = br.readLine();
			
			System.out.println("���Ϸ� ���� ���� ������ : " + data);
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







