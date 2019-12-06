package com.pzhu.novel.common.client;

/**
 * @author 刘鹏 liupeng
 * @date 2019/12/6
 **/
public interface TcpClientPool<T extends AbstractTcpClient> {

    void createPool();

    //消费一个客户端
    T getClient();

    //归还一个
    void closeClient(T abstractTcpClient);

    //关闭连接池
    void close();

}
