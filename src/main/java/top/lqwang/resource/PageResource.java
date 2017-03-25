package top.lqwang.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Joseph on 2017/3/25.
 */
@RestController
public class PageResource {
    @RequestMapping("/")
    public String toIndex(){
        return "Hello World!";
    }
}
