package com.pzhu.novel.common.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import cn.hutool.core.lang.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 刘鹏 liupeng
 * @date 2019/12/6
 **/
public class SpiderTcpClient extends AbstractTcpClient {
    Logger logger = LoggerFactory.getLogger(SpiderTcpClient.class);

    private Socket pySocket;

    public SpiderTcpClient(Socket pySocket) {
        this.pySocket = pySocket;
    }

    private volatile static OutputStream pyOutputStream;

    // 得到outputStream
    public OutputStream getOutputStream() {
        if (pyOutputStream == null) {
            synchronized (Singleton.class) {
                if (pyOutputStream == null) {
                    try {
                        pyOutputStream = pySocket.getOutputStream();
                        return pyOutputStream;
                    } catch (IOException e) {
                        logger.error("pySocket create outPutStream 错误");
                        e.printStackTrace();
                    }
                }
            }
        }
        return pyOutputStream;
    }


    @Override
    public void sendMessages(String msg) {
        OutputStream os = null;
        try {
            os = getOutputStream();
            byte[] bytes = msg.getBytes("utf-8");
            os.write(bytes);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String receiveMessages() {
        return null;
    }

    @Override
    public void close() {
        try {
            getOutputStream().close();
        } catch (IOException e) {
            logger.error("outputStream 关闭失败");
            e.printStackTrace();
        }
    }
}
