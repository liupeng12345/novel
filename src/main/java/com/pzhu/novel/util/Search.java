package com.pzhu.novel.util;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author 刘鹏 liupeng
 * @date 2019/10/22
 **/
public class Search {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO Auto-generated method stub
        //1.建立TCP连接
        String ip = "127.0.0.1";   //服务器端ip地址
        int port = 9999;        //端口号
        Socket sck = new Socket(ip, port);
        //2.传输内容
        String content = "盘龙";
        byte[] bstream = content.getBytes("utf-8");  //转化为字节流
        OutputStream os = sck.getOutputStream();   //输出流
        os.write(bstream);
        //3.关闭连接
        sck.close();
    }

}
