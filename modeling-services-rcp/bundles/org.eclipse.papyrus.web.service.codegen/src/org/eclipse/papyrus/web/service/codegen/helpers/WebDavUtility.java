package org.eclipse.papyrus.web.service.codegen.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IProject;

import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

public class WebDavUtility {

	/**
	 * test class with test credentials. Under early development.
	 * 
	 */
	private static String user = "USERLOGIN";
	private static String password = "USERPASSWORD";

	private static Sardine webdavServer;
	public static final String codeGenFolder = "codegen";
	private static String baseUrl = "USE_BASE_URL";
	private static void listLocalFiles(String rootPath) {
		// Replace "path/to/your/eclipse/project" with the actual path to your Eclipse project

		File directory = new File(rootPath);

		if (directory.exists() && directory.isDirectory()) {
			createFolder(directory.getName()); //create the root project
			listAndUploadFilesAndFolders(directory, directory.getName());
		} else {
			System.out.println("Invalid directory path.");
		}
		System.out.println("### end of synchronisation ##");
	}


	private static void createFolder(String path) {
		try {
			webdavServer.createDirectory(baseUrl + path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createFile (File inputFile, String newFileURL){
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(inputFile);
			webdavServer.put(baseUrl + newFileURL, inputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void listAndUploadFilesAndFolders(File directory, String currentURL) {
		File[] files = directory.listFiles();

		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println("Folder: " + file.getName());
					String newFolderURL = currentURL +"/" +file.getName();
					System.out.println("new Folder: " + newFolderURL); 
					createFolder(newFolderURL);
					listAndUploadFilesAndFolders(file, newFolderURL);
				} else {
					System.out.println("File: " + file.getName());
					String newFileURL = currentURL + "/" +file.getName();
					System.out.println("new file :"+newFileURL);
					createFile(file, newFileURL); 
				}
			}
		}

		//        https://medium.com/@denis.verkhovsky/nextcloud-api-how-to-upload-the-files-9caccc4a4a6c
		//

		////	            
		//	            
		//			 // Creating a folder
		//			 String folderName = "NewFolder";
		//			 sardine.setCredentials(user, password);
		//			 sardine.createDirectory(baseUrl +"/"+ genProject.getName());
		//
		//			 System.out.println("Folder '" + folderName + "' created successfully.");
		//		 } catch (Exception e) {
		//			 e.printStackTrace();
		//		 }	



	}


	@SuppressWarnings("deprecation")
	public static void uploadNextcloud(IProject genProject, String rootPath) {

		if (webdavServer == null) {
			webdavServer = SardineFactory.begin(user, password);
			webdavServer.setCredentials(user, password);
		}
		listLocalFiles(rootPath+"/"+genProject.getName());

	}
}
