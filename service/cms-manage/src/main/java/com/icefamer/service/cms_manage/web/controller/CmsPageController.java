package com.icefamer.service.cms_manage.web.controller;

import com.icefamer.server.api.cms.CmsPageControllerApi;
import com.icefamer.server.domain.cms.request.QueryPageRequest;
import com.icefamer.server.model.response.QueryResponseResult;
import com.icefamer.service.cms_manage.service.CmsPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cms")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    private CmsPageService cmsPageService;

    @GetMapping("/page/test")
    public String pageTest(){
        return "成功接入";
    }

    @Override
    @GetMapping("/page/list/{page}/{size}")
    @ResponseBody
    public QueryResponseResult findList(@PathVariable("page") int page,
                                        @PathVariable("size") int size,
                                        QueryPageRequest queryPageRequest) {
        return cmsPageService.findList(page,size,queryPageRequest);
    }
}
