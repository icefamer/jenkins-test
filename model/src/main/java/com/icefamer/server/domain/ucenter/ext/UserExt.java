package com.icefamer.server.domain.ucenter.ext;

import com.icefamer.server.domain.ucenter.Menu;
import com.icefamer.server.domain.ucenter.User;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 2018/3/20.
 */
@Data
@ToString
public class UserExt extends User {

    //权限信息
    private List<Menu> permissions;

    //企业信息
    private String companyId;
}
