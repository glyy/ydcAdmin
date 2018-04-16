package web.controller;

import domain.vo.UserInfoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping(value="/")
    public String toIndex(HttpServletRequest request, HttpServletResponse response){
        return "forward:/home";
    }
    @GetMapping(value="/index")
    public String toHome(HttpServletRequest request, HttpServletResponse response){
        return "forward:/home";
    }
    @GetMapping(value="/login")
    public String toLogin(){
        return "login";
    }

    @GetMapping(value="/home")
    public String toHome(Model model){
        logger.info("--测试是否请求成功--");
        List<UserInfoVO> userList = new ArrayList<UserInfoVO>();
        UserInfoVO u1 = new UserInfoVO();
        UserInfoVO u2 = new UserInfoVO();
        UserInfoVO u3 = new UserInfoVO();
        UserInfoVO u4 = new UserInfoVO();

        u1.setUserId("123");
        u1.setUserName("客户管理");
        u1.setUserMobile("1111");
        u1.setUserRoleName("GLY");
        u1.setUserDeptName("互联网技术部");
        u1.setUserStatus("0");

        u2.setUserId("97");
        u2.setUserName("订单管理");
        u2.setUserMobile("13899095547");
        u2.setUserRoleName("GG");
        u2.setUserDeptName("ZSSYB");
        u2.setUserStatus("0");

        u3.setUserId("788");
        u3.setUserName("库存管理");
        u3.setUserMobile("2222");
        u3.setUserRoleName("CWZY");
        u3.setUserDeptName("财务部");
        u3.setUserStatus("0");

        u4.setUserId("90");
        u4.setUserName("用户管理");
        u4.setUserMobile("333");
        u4.setUserRoleName("FWZY");
        u4.setUserDeptName("法务部");
        u4.setUserStatus("0");

        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);

        //个人信息
        model.addAttribute("user",u1);
        //用户列表
        model.addAttribute("userList",userList);
        return "layout/layout";
    }
}
