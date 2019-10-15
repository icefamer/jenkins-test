package com.icefamer.server.domain.ucenter.ext;

import com.icefamer.server.domain.course.ext.CategoryNode;
import com.icefamer.server.domain.ucenter.Menu;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * Created by admin on 2018/3/20.
 */
@Data
@ToString
public class MenuExt extends Menu {

    List<CategoryNode> children;
}
