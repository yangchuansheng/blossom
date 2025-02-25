package com.blossom.backend.base.user.pojo;

import com.blossom.backend.base.sys.os.OSRes;
import com.blossom.common.base.pojo.AbstractPOJO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Map;

/**
 * 用户响应
 *
 * @author xzzz
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BlossomUserRes extends AbstractPOJO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 备注
     */
    private String remark;
    /**
     * 位置
     */
    private String location;
    /**
     * 文章数
     */
    private Integer articleCount;
    /**
     * 文章字数
     */
    private Integer articleWords;

    /**
     * 对象存储信息, 非登录状态不返回该字段
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private OSRes osRes;

    /**
     * 系统参数, paramName: paramValue
     */
    private Map<String, String> params;

    /**
     * 用户参数, paramName: paramValue
     */
    private Map<String, String> userParams;
}
