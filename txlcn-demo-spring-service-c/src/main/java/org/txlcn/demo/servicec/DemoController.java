package org.txlcn.demo.servicec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Date: 2019/09/25
 *
 * @author lonkin
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/rpc")
    public String rpc(@RequestParam("value") String value) {
        return demoService.rpc(value);
    }
}
