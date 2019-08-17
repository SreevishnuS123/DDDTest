package com.vcentry.tnstc.reportGenerator;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class ReportOptimizer {

	public static void optimizeReport() throws IOException {

		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-DD hh-mm-ss-mmm");
		String name = df.format(date);
		File src = new File("D:\\newWorkspace\\DDDTest\\Screenshot");

		File dst = new File("D:\\newWorkspace\\DDDTest\\OldScreenshot\\" + name);
		
		FileUtils.copyDirectory(src, dst);
		FileUtils.cleanDirectory(src);

	}

}
