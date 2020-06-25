package com.webarooAutomation;


// @author Sunny-eng
import java.io.File;

import org.apache.commons.io.FilenameUtils;

public class Utils {

	public static String uploadFilesToFTP(String fileNameWithPath) {
		String file = "";
		if (System.getProperty("browser").contains("remote")) {
			System.out.println("Trying to upload csv file to FTP Server");
			FTPLib.sendFile(fileNameWithPath);
			String fileName = (new File(fileNameWithPath)).getName();
			System.out.println(fileName);
			if (FTPLib.checkFilePresence(fileName)) {
				System.out.println("File " + fileName + " is present on FTP Server");
				file = "C:\\gupshup\\EmailUIAutomation\\" + fileName;
			} else {

				file = "C:\\gupshup\\EmailUIAutomation\\" + FilenameUtils.removeExtension(fileName) + "_Default." + FilenameUtils.getExtension(fileNameWithPath);
				System.out.println("Unable to find File " + fileName
						+ " on FTP Server, so using default "+file);

			}
		} else
			file = fileNameWithPath;

		return file;
	}
}
