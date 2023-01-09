package day01.Contorller;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import day01.domain.User;
import day01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
@ConfigurationProperties(prefix = "people")
public class TestController {
    private String name;
    private String addr;
    private Integer age;
    @Autowired
    private UserMapper userMapper;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @RequestMapping("/t")
    @ResponseBody
    public String test(){
        System.out.println("test方法执行了");
        return  "hello44ss,springboot";
    }

    @RequestMapping("/t1")
    @ResponseBody
    public String test1(){
        System.out.println("test1方法执行了");
        return  ""+name+""+age;
    }
    /**
     * 整合mybatis 查询所有
     */


    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}