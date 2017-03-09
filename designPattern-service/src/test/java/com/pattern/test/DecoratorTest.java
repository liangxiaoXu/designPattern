package com.pattern.test;

import org.junit.Test;

import java.io.*;

/**
 * 装饰模式测试类
 * 本例使用BufferedOutputStream来说明装饰模式的使用
 * BufferedOutputStream 继承FilterOutputStream ，FilterOutputStream 又继承 OutputStream(抽象类)
 * FileOutputStream 继承 OutputStream
 * <p>
 * 例如现在我们往一个文件中写数据
 * FileOutputStream 是被装饰者，实现“写”的功能
 * BufferedOutputStream 是装饰者，在“写”的基础上使用“缓冲区”从而提升性能。它的底层还是调用FileOutputStream的“写”
 */
public class DecoratorTest {

    @Test
    public void writeFile() {

        File file = new File("D:/1.txt");
        //若文件不存在，则创建
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        OutputStream os = null;
        try {
            os = new BufferedOutputStream(new FileOutputStream(file));

            for (int i = 0; i < 10000; i++) {
                os.write("abcdefghijklmnopqrstuvwxyz\n".getBytes());
            }
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

