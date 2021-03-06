package cn.ac.yhao.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddrUtil {

    private static final Logger log = LoggerFactory.getLogger(AddrUtil.class);

    public static String getIpAddr() {
        String ip = System.getenv("_D_HOST_IP");
        if (StringUtils.isBlank(ip)) {
            try {
                ip = InetAddress.getLocalHost().getHostAddress();
            } catch(UnknownHostException e) {
                log.error("get ip addr error!", e);
            }
        }
        log.info("ip:{}", ip);
        return ip;
    }

    public static void main(String[] args) {
        AddrUtil.getIpAddr();
    }
}
