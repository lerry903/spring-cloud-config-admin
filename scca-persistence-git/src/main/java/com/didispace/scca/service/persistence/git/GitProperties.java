package com.didispace.scca.service.persistence.git;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by 程序猿DD/翟永超 on 2018/4/24.
 * <p>
 * Blog: http://blog.didispace.com/
 * Github: https://github.com/dyc87112/
 */
@Data
@ConfigurationProperties(prefix = "scca.git")
public class GitProperties {

    /**
     * Git登录的用户名
     */
    private String username;
    /**
     * Git登录的密码
     */
    private String password;

}
