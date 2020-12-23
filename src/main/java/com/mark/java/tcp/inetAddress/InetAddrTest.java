package com.mark.java.tcp.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddrTest {

    public static void main(String[] args) throws UnknownHostException {

        //获取主机名+ip地址
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //获取本机网络IP地址
        String hostAddress = localHost.getHostAddress();
        System.out.println(hostAddress);
        //获取主机名
        String hostName = localHost.getHostName();
        System.out.println(hostName);
        //根据主机名称获取ip地址
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);

    }

}
