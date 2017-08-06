package com.asiainfo.mhttp.controller;

import com.asiainfo.mhttp.entity.SenderEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by renshunyu on 2017/7/23.
 */
@RestController
@RequestMapping("/mail")
public class SendController {
    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public SenderEntity send(@RequestParam(value = "haha", required = true) String str, @RequestBody String bd)  {

        SenderEntity se = new SenderEntity();
        se.setString(bd);
        return se;
    }
}
