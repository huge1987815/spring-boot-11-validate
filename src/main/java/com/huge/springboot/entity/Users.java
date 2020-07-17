package com.huge.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * @Desc:
 * @author:huge
 * @create:2020-07-16 0:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users implements Serializable {
    private Integer userId;
    @NotBlank(message = "用户名不能为空")
    @Length(min = 6,max = 20,message ="用户名最少6位，最多20位" )
    private String userName;
    @NotEmpty(message = "密码不能为空")
    private String password;
    private String sex;
    @Range(min = 12,max = 99,message="年龄在12岁在99岁之间")
    private Integer age;
    @Email(message = "邮箱必须包含@,以.com结尾")
    private String email;
}
