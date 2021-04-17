package com.yese.pojo;

import com.yese.validate.Insert;
import com.yese.validate.Update;
import com.yese.validate.Username;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * 用户ID
     */
    @NotNull(message = "{id.NotNull}", groups = {Update.class})
    private Long userId;

    /**
     * 用户名
     */
    @NotBlank(message = "{username.NotBlank}", groups = {Insert.class, Update.class})
    @Length(max = 10, message = "{username.length}")
    @Pattern(regexp = "^[\\u4E00-\\u9FA5A-Za-z0-9\\*]*$", message = "{username.invalid}")
    private String username;

    @NotBlank(message = "name不能为空")
    @Username(message = "name需要以abc开头")
    private String name;

    /**
     * 密码
     */
    @NotBlank(message = "{password.NotBlank}")
    private String password;

    /**
     * 手机号
     */
    @NotBlank(message = "{phone.NotBlank}")
    @Pattern(regexp = "^[1][3,4,5,6,7,8,9][0-9]{9}$", message = "{phone.invalid}")
    private String mobile;

    /**
     * 性别
     */
    @NotNull(message = "{sex.NotNull}")
    private Integer sex;

    /**
     * 年龄
     */
    @NotNull(message = "{age.NotNull}")
    @Min(value = 1, message = "{age.min}")
    @Max(value = 120, message = "{age.max}")
    private Integer age;

    /**
     * 邮箱
     */
    @NotBlank(message = "{email.NotBlank}")
    @Email(message = "{email.invalid}")
    private String email;

    // 用于嵌套校验
    @Valid
    private Dog dog;

}