package com.tedu.cn;

import entity.Emp;
import org.junit.Test;

import java.io.*;
import java.util.Date;

public class IoTest {
    /**
     * 流的概念：
     * 流就是一根水管，通过该水管
     * 运输数据，由于运输的方向
     * 有输入方向和输出方向，所以流分为标准的输入输出流两种
     *
     * java语言里面有一个抽象类叫做
     * InputStream该类是左右输入流的父类，是一个抽象类
     * 提供了3个重载的方法读取数据，3个重载的方法分别是
     * 1、int read();每一次读取1字节
     * 2、int read(byte[] bf)每次读取bf长度的数据
     * 3、int read(byte[] bf,int off,int len);
     *
     * 标准输出流的父类是：OutputSteam
     * 该类提供了3个write方法，分别是：
     * 1、public abstract void write(int b)
     *          throws IOExceotion
     * 2、public void write(byte[] b)
     *          throws IEOxceotion
     * 3、public void write(byte[] b,int off,int len)
     *          throws IEOxceotion
     *
     * */
    @Test
    public void m1() throws IOException {
        //创建一个输入流对象
        InputStream is = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\Studio3T.zip"));
        OutputStream os=new FileOutputStream(new File("copy.zip"));
        byte[] bs=new byte[1024];
        long len=0;
        while ((len=is.read(bs))!=-1){
            os.write(bs);
        }
        //关闭流
        is.close();
        os.close();
        System.out.println("文件拷贝完毕");

    }

    /**
     * 基于包装流（缓冲流 的文件复制)
     * BufferedInputStream(缓冲输入流)
     * BufferedOutputStream(缓冲输入流)
     */
    @Test
    public  void m3() throws IOException {
        //创建一个输入流对象
        InputStream is=new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\Studio3T.zip"));
        //创建一个输出流
        OutputStream os=new FileOutputStream(new File("back.zip"));
        //创建一个高级输入流（包装流）
        BufferedInputStream bis=new BufferedInputStream(is);
        //创建一个高级输出流（包装流）
        BufferedOutputStream bos=new BufferedOutputStream(os);
        //执行复制的逻辑
        byte[] bs=new byte[1024];
        long len=0;
        while ((len=bis.read(bs))!=-1){
            bos.write(bs);
        }
        bos.flush();//通知司机  没有砖块了，开车走人。
        bis.close();
        bos.close();
        System.out.println("写入完毕！！！");
    }

    /**
     * 测试序列化
     */
    @Test
    public void m4() throws IOException {
        Emp emp = new Emp(1234,"jack","M",new Date(),5000,3000,20);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("emp.obj"));
        oos.writeObject(emp);
        oos.close();
        System.out.println("序列化完毕");
    }
    /**
     * 测试反序列化
     */
    @Test
    public void m5() throws IOException, ClassNotFoundException {
        InputStream is =new FileInputStream("emp.obj");
        ObjectInputStream ois=new ObjectInputStream(is);
        Emp emp=(Emp) ois.readObject();
        is.close();
        ois.close();
        System.out.println("反序列完毕");
            System.out.println(emp);

    }
}
