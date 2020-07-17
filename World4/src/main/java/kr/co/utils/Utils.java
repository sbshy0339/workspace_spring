package kr.co.utils;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class Utils {
	
	public static String saveFile(String originalName, MultipartFile file) throws Exception {
		String newName = Utils.makeNewName(originalName);
		
	    File target = new File("C:"+File.separator+"upload",newName);
	    FileCopyUtils.copy(file.getBytes(), target);
	    
	    return newName;
	}
	
	
	public static String makeNewName(String originalName) {
		UUID uid = UUID.randomUUID();
		String newName = uid.toString()+"_"+originalName;
		
		return newName;
	}

	
	public static String toKor(String msg) {
		
			try {
				return new String(msg.getBytes("8859 1"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				return null;
			}
	}
	
}
