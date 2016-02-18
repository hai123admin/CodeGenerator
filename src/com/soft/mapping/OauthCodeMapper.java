package com.soft.mapping;

import com.soft.model.OauthCode;

public interface OauthCodeMapper {
    int insert(OauthCode record);

    int insertSelective(OauthCode record);
}