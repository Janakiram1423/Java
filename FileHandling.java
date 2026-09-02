import java.io.*;
class FileHandling
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream fin = new FileInputStream("File1.txt");
			FileOutputStream fout = new FileOutputStream("File2.txt");
			int data;
			while ((data = fin.read()) != -1)
			{
				fout.write(data);
			}
			fin.close();
			fout.close();
			
			System.out.println("\n File copied0 successfully.");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
