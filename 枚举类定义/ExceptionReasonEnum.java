package com.brandslink.cloud.warehouse.enums;

import io.swagger.annotations.ApiModelProperty;
import org.apache.axis.utils.StringUtils;

/**
 * @Author: zhangjinhua
 * @Date: 2019/6/15 10:07
 */
public enum ExceptionReasonEnum {
    /**
     * 少货
     */
    @ApiModelProperty(value = "少货")
    SH("少货"),
    /**
     * 实物破损
     */
    @ApiModelProperty(value = "实物破损")
    SWPS("实物破损"),
    /**
     * 实物与SKU不符
     */
    @ApiModelProperty(value = "实物与SKU不符")
    SWYSKUBF("实物与SKU不符"),
    /**
     * 多货
     */
    @ApiModelProperty(value = "多货")
    DH("多货"),
    /**
     * 多货
     */
    @ApiModelProperty(value = "其他")
    QT("其他");

    private final String chineseName;

    private ExceptionReasonEnum(String chineseName) {
        this.chineseName = chineseName;
    }

    /**
     * 获取中文名称.
     *
     * @return {@link String}
     */
    public String getChineseName() {
        return chineseName;
    }

    /**
     * 解析字符串.
     *
     * @return {@link ExceptionReasonEnum}
     */
    public static final ExceptionReasonEnum parse(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        try {
            return ExceptionReasonEnum.valueOf(value);
        } catch (Throwable t) {
            return null;
        }
    }
}
