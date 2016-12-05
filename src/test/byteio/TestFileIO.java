package test.byteio;

import java.io.*;

public class TestFileIO {

	public static void main(String[] args) {
		// ���ϰ��� ����� ó�� : ����Ʈ��Ʈ�� �̿��� ���
		TestFileIO test = new TestFileIO();
		
		test.output();
		test.input();
	}
	
	//���Ϸ� ���� �����͸� �о ȭ�鿡 ���
	public void input(){
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		try {
			fin = new FileInputStream("testByteSample.dat");
			bin = new BufferedInputStream(fin);
			
			//��� ������ ������ ���� �߻���.
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
	
	//������ �����, ���Ͽ� ������ ��� ����
	public void output(){
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("testByteSample.dat");
			bout = new BufferedOutputStream(fout);
			
			//��� ��Ʈ�� Ŭ���������� ��� ������ ������ �ڵ����� 
			//������ ����
			String data = "���ѹα� ���� �ڸ��� korea seoul 2016";
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
				fout.close();  //��Ʈ�� �ݳ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
	}

}






