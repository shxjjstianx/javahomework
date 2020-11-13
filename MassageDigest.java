import java.io.*;
import java.security.MessageDigest;
import java.util.*;

public class MassageDigest {
	
	public static void SHA1Checksum(InputStream is, MessageDigest complete) throws Exception{
		//用于计算hash值的文件缓冲区
		byte[] buffer = new byte[1024];
		//使用SHA1哈希/摘要算法
		int numRead = 0;
		do {
			//读出numRead字节到buffer中
			numRead = is.read(buffer);
			if(numRead > 0) {
				//根据buffer[0:numRead]的内容更新hash值
				complete.update(buffer, 0, numRead);
			}
			//文件以读完，退出循环
		} while (numRead != -1);
		//关闭输入流
		is.close();
	}
	
	public static void dfs(String path, MessageDigest complete) throws Exception {
        File dir = new File(path);
        File[] fs = dir.listFiles();
        for(int i = 0; i < fs.length; i++) {
            if(fs[i].isFile()) {
                System.out.println("file " + fs[i].getName());
                SHA1Checksum(new FileInputStream(fs[i]), complete);
            }
            if(fs[i].isDirectory()) {
                System.out.println("directory " + fs[i].getName());
                dfs(path + File.separator + fs[i].getName(), complete);
            }
        }
    }
	
    public static void main(String[] args) {
    	try {
    		MessageDigest complete = MessageDigest.getInstance("SHA-1"); 
    		
            Scanner input = new Scanner(System.in);
            System.out.print("请输入要哈希的目录：");
            String dir = input.next();

            dfs(dir, complete);

            System.out.println("\nHash Code:");
    		
    		byte[] sha1 = complete.digest();
    		
    		String result = "";
    		for (int i = 0; i < sha1.length; i++) {
    			result += Integer.toString(sha1[i]&0xFF, 16);
    		}
    		
    		System.out.println(result);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}
