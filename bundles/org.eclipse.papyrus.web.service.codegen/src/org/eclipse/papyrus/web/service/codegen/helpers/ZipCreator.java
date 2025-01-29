/*******************************************************************************

 * Copyright (c) 2006 - 2023 CEA LIST.

 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     CEA LIST - initial API and implementation
 *******************************************************************************/

package org.eclipse.papyrus.web.service.codegen.helpers;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/***************
 * 
 * @author marcosddf
 * 
 * code copied and adapted from https://www.baeldung.com/java-compress-and-uncompress
 * 
 * It receives a folder name as input, compresses it and returns the compressed content, including all subfolders and files.
 * It is used to package a complete Eclipse project. 
 *
 */

public class ZipCreator {

	/**
	 * Converts a folder and all its contents into a Zip file.
	 * @param folderName
	 * @return
	 * @throws IOException
	 */
	public static FileInputStream zipFolder(String folderName) throws IOException {
		String sourceFile = folderName;
		FileOutputStream fos = new FileOutputStream(folderName+".zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		File fileToZip = new File(sourceFile);



		zipFile(fileToZip, fileToZip.getName(), zipOut);
		zipOut.close();
		fos.close();
		FileInputStream genZip = new FileInputStream(new File(folderName+".zip"));
		return genZip;
	}

	private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
		if (fileToZip.isDirectory()) {
			if (fileName.endsWith("/")) {
				zipOut.putNextEntry(new ZipEntry(fileName));
				zipOut.closeEntry();
			} else {
				zipOut.putNextEntry(new ZipEntry(fileName + "/"));
				zipOut.closeEntry();
			}
			File[] children = fileToZip.listFiles();
			for (File childFile : children) {
				zipFile(childFile, fileName + "/" + childFile.getName(), zipOut);
			}
			return;
		}
		FileInputStream fis = new FileInputStream(fileToZip);
		ZipEntry zipEntry = new ZipEntry(fileName);
		zipOut.putNextEntry(zipEntry);
		byte[] bytes = new byte[1024];
		int length;
		while ((length = fis.read(bytes)) >= 0) {
			zipOut.write(bytes, 0, length);
		}
		fis.close();
	}
	/**
	 * Zips a generated project into a zip file
	 * 
	 * @param path
	 * @return
	 */

	public static FileInputStream zipProjectFromPath(String path) {
		FileInputStream zippedProject = null;
		try {
			zippedProject = ZipCreator.zipFolder(path);
			// deleteCodeGenFolder(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return zippedProject;
	}    

}

