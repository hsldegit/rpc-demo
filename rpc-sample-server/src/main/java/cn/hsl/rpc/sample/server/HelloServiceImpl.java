package cn.hsl.rpc.sample.server;

import cn.hsl.rpc.server.RpcService;
import cn.hsl.rpc.simple.client.HelloService;
import cn.hsl.rpc.simple.client.Person;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        System.out.println("已经调用服务端接口实现，业务处理结果为：");
        System.out.println("Hello! " + name);
        return "Hello! " + name;
    }

    public String hello(Person person) {
        System.out.println("已经调用服务端接口实现，业务处理为：");
        System.out.println("Hello! " + person.getFirstName() + " "
                + person.getLastName());
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
