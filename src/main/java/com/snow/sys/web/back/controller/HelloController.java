package com.snow.sys.web.back.controller;

import com.snow.common.mode.ReturnDto;
import com.snow.common.mode.productMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *@author  created by tk
 *@date     2018-01-18
 */
@RestController
public class HelloController {
    @Autowired
    private productMode productmode;
    @GetMapping(value = "/hello/{id}")
    public ReturnDto  say(@PathVariable(value = "id",required = false)Integer id)
    {
        ReturnDto returnDto=new ReturnDto();
        returnDto.setObject(productmode);
        return returnDto;
    }
}
