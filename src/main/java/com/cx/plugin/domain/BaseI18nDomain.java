package com.cx.plugin.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * Created by caixiang on 2017/8/15.
 */
@Data
@NoArgsConstructor
public abstract class BaseI18nDomain {
    @TableField(exist = false)
    private Map i18n;
}