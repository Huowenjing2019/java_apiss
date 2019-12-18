package com.tedu.cn;

import org.junit.Test;

import java.io.*;


public class FileTest {
    @Test
    public void m1() throws IOException {
        /**
         * File是位于java.io包下的一个类，通过该类可以操作本地磁盘的
         * 数据，但不能读取文件的内存
         */
        File f=new File("T.txt");
        //可以使用exists()方法检查某个文件是否存在
        if(f.exists()){
            System.out.println("文件存在");
        }else{
            System.out.println("文件不存在");
            boolean flag=f.createNewFile();
            System.out.println(flag?"创建成功":"创建失败");
        }
}

    @Test
    public void m2(){
        File f = new File("D:\\t.txt");
        //表示一个目录，是文件返回true，是目录返回false
        System.out.println(f.isFile());//判断是否为文件
        System.out.println(f.isDirectory());//判断是否为目录
    }
    @Test
    public void m3(){
        /**
         * 使用length()API表示
         * 文件的长度，英文字母和空格占用一字节
         * 中文在jdk下占用2字节，在UTF-8下占用3字节
         */
        File f = new File("t.txt");
        System.out.println(f.length());
    }
    @Test
    public void m4(){
        File f = new File("wd/de1/de2");//创建多重目录
        if (!f.exists()){
            System.out.println(f.mkdirs());
        }
    }
    @Test
    public void m5(){
        //重命名文件
        File f = new File("t.txt");
        if (f.exists()){
            f.renameTo(new File("new.txt"));
        }
    }
    @Test
    public void m6(){
        File f = new File("wd"+File.separator+
                "de1"+File.separator+"de2"+File.separator+"ww.txt"+File.separator);
        System.out.println(f.getAbsolutePath());//获取绝对路径
        System.out.println(f.getAbsoluteFile());
    }
    @Test
    public void m8() throws IOException {
        File f = new File("new.txt");
        RandomAccessFile r = new RandomAccessFile(f,"rw");
        //读取文件第一行
        String first_line = r.readLine();
        System.out.println(new String(first_line.getBytes("iso8859-1"),"utf-8"));
        r.close();
    }
    @Test
    public void m9() throws IOException {
        File f = new File("new.txt");
        RandomAccessFile r = new RandomAccessFile(f,"rw");
        byte[] bs= new byte[6];
        System.out.println("当前指针位置是："+r.getFilePointer());
        int i = r.read(bs);
        System.out.println(i);
        System.out.println(new String(bs));
        System.out.println("当前指针位置是："+r.getFilePointer());
        System.out.println("重置指针");
        //重置指针
        r.seek(0);
        i = r.read(bs);
        System.out.println(i);
        System.out.println(new String(bs));
        System.out.println("当前指针位置是："+r.getFilePointer());
        r.close();
    }
    @Test
    public void m10() throws IOException{
        File f = new File("new.txt");
        RandomAccessFile r = new RandomAccessFile(f,"rw");
        byte[] bs= new byte[1024];//每次读取1kb;
        long len = 0;
        String str = "";
        while ((len=r.read(bs))!=-1){
            str+= new String(bs);
        }
        System.out.println(str);
        System.out.println("读取完毕");
        r.close();
    }
    @Test
    public void m11() throws IOException {
        File f = new File("new.txt");
        RandomAccessFile r = new RandomAccessFile(f, "rw");
        //重置指针
        r.seek(r.length());
        //添加到换行
        r.write("\n".getBytes());
        //添加到最后
        r.write("记得当初你还是一个娃".getBytes());
        System.out.println("添加成功");
        r.close();
    }
    @Test
    public void m12() throws IOException {
        File f = new File("11.jpg");
        RandomAccessFile r = new RandomAccessFile(f, "rw");
        File f2 = new File("12.jpg");
        if (!f2.exists()){
            System.out.println(f2.createNewFile());
        }
        RandomAccessFile r2 = new RandomAccessFile(f2, "rw");
        //实现现实拷贝
        byte[] bs= new byte[1024];
        long len = 0;
        while ((len=r.read(bs))!=-1){
            r2.write(bs);
        }
        r.close();
        r2.close();

    }


}
