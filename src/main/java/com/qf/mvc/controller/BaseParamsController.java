package com.qf.mvc.controller;

import com.qf.mvc.dto.Userdto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


@Controller
public class BaseParamsController {
    @GetMapping("/test1")
    public String test(String username){
        System.out.println(username);
        return username;
    }

    /*
    *   通过@GetMapping（”/name）请求数据，
    *   使用@ResponseBody来处理响应后的数据
    *
    * */
    @GetMapping("/test2")
    @ResponseBody
    public String test2(Userdto userdto){
        System.out.println(userdto);
        return "接收对象参数";
    }

    /*
    * 复杂的对象用json传（嵌套对象）
    *
    * */
    @GetMapping("/test3")
    @ResponseBody
    public String test3(Userdto userdto){
        System.out.println(userdto);
        System.out.println(userdto.getAddress().getCity() );
        return "接受前台对象参数";
    }

    @GetMapping("/test4")
    @ResponseBody
    public String test4(int[] ids){
        for (int id : ids) {
            System.out.println(id);
        }
        return "接受数组类型参数";
    }

    /*
    *   @GetMapping 请求数据
    *   @responseBody 响应前台
    * */
    @GetMapping("/test5")
    @ResponseBody
    public String test5(Map<String ,String > map){
        System.out.println(map);
        return "接受集合类型参数";
    }


    @GetMapping("/test6")//请求数据
    @ResponseBody//响应数据
    public String test6(Userdto userdto){
        System.out.println(userdto.getList().toString());
        return "返回集合类型参数";
    }

    //也支持内置对象
    @GetMapping("/test7")
    @ResponseBody
    public String test7(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request.toString());
        System.out.println(response.toString());
        return "返回集合类型参数";
    }
}
