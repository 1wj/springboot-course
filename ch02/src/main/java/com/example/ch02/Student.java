package com.example.ch02;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class Student {

    // 需要在创建数据表的时候设置主键自增有不同的策略
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
   @TableField(fill = FieldFill.INSERT)
    private Integer version;

}