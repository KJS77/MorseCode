package morsecode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class MorseTest 
{
	public static void main(String[] args) 
	{
		MorseFileDecoder mfd;
		if(args.length > 0)
		{
			mfd = new MorseFileDecoder(args[0]);
			try
			{
				System.out.println(mfd.decode());
			}
			catch(FileNotFoundException e)
			{
				System.err.println("Specified file not found.");
			}
		}
		else
		{
			System.out.println("Enter filename to decode:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try
			{
				mfd = new MorseFileDecoder(br.readLine());
				System.out.println(mfd.decode());
			}
			catch(FileNotFoundException fe)
			{
				System.err.println("Specified file not found.");
			}
			catch(IOException e)
			{
				System.err.println("An IO error occurred: " + e.toString());
			}
		}

	}

}
