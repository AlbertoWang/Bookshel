package cn.edu.cqu.SpringcloudDemo.Service;import cn.edu.cqu.SpringcloudDemo.Model.MyJson;import org.springframework.stereotype.Service;/** * @ author     ：alberto * @ date       ：Created in 2020/4/27 16:33 * @ description：用户服务接口 */@Servicepublic interface UserSerivce {    public MyJson getUser(int userId, String serverPort);}