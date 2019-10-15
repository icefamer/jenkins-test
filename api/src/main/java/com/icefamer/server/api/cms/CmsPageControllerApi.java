package com.icefamer.server.api.cms;

import com.icefamer.server.domain.cms.request.QueryPageRequest;
import com.icefamer.server.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "cms页面管理接口", produces = "cmsPage", tags = "cms页面服务")
public interface CmsPageControllerApi extends CmsControllerApi {

    @ApiOperation("各类页面的分页查询接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码",
                    defaultValue = "1", required = true,
                    paramType = "path", dataType = "int"),
            @ApiImplicitParam(name = "size", value = "每页查询数",
                    defaultValue = "20", required = true,
                    paramType = "path", dataType = "int")
            }
    )
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
