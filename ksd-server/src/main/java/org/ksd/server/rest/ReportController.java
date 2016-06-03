/*
 * Copyright (c) 2014 Qunar.com. All Rights Reserved.
 */
package org.ksd.server.rest;

import org.ksd.server.bean.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ReportController {

    @RequestMapping("/report/receive")
    public Result<String> receive() {
        return null;
    }
}
