package com.pzhu.novel.common.client;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 刘鹏 liupeng
 * @date 2019/12/6
 **/
public class SpiderTcpClientPool implements TcpClientPool<SpiderTcpClient> {

    Logger logger = LoggerFactory.getLogger(SpiderTcpClientPool.class);

    private Semaphore semaphore;
    private List<SpiderTcpClient> spiderTcpClientList;

    public SpiderTcpClientPool(Integer size,Socket spiderSocket) {
        this.semaphore = new Semaphore(size);
        this.spiderTcpClientList = new ArrayList<>(5);
        for (int i = 0; i < size; i++) {
            spiderTcpClientList.add(new SpiderTcpClient(spiderSocket));
        }
    }

    @Override
    public void createPool() {

    }

    @Override
    public SpiderTcpClient getClient() {
        try {
            semaphore.acquire();
            return spiderTcpClientList.remove(0);
        } catch (InterruptedException e) {
            logger.error("获取Tcp客户端失败关闭失败");
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void closeClient(SpiderTcpClient spiderTcpClient) {
        spiderTcpClientList.add(spiderTcpClient);
        semaphore.release();
    }

    @Override
    public void close() {
        spiderTcpClientList.stream().forEach(spiderTcpClient -> spiderTcpClient.close());
    }
}
