package cn.hsl.rpc.registry;

/**
 * 常量
 */
public class Constant {

    public static final int ZK_SESSION_TIMEOUT = 5000;// zk超时时间

    public static final String ZK_REGISTRY_PATH = "/registry";// 注册节点

    public static final String ZK_DATA_PATH = ZK_REGISTRY_PATH + "/data";// 节点
}