package com.pzhu.novel.common.client;

import java.net.Socket;

/**
 * @author 刘鹏 liupeng
 * @date 2019/12/6
 **/
public abstract class AbstractTcpClient {

    public abstract void sendMessages(String msg);

    public abstract String receiveMessages();

    public abstract void close();
}
