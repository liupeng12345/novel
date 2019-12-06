package com.pzhu.novel.config;

import java.io.IOException;
import java.net.Socket;

import com.pzhu.novel.common.client.SpiderTcpClientPool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 刘鹏 liupeng
 * @date 2019/12/4
 **/
@Configuration
public class PythonServiceConfig {
    @Value("${serchServe.ip}")
    private String ip;
    @Value("${serchServe.port}")
    private Integer port;
    @Value("${serchServe.poolsize}")
    private Integer size;

    @Bean
    public Socket spiderSocket() throws IOException {
        Socket socket = new Socket(ip, port);
        return socket;
    }

    @Bean
    public SpiderTcpClientPool spiderTcpClientPool(Socket spiderSocket){
        SpiderTcpClientPool spiderTcpClientPool = new SpiderTcpClientPool(size,spiderSocket);
        return spiderTcpClientPool;
    }


}
