package com.ramber.springboot.util;

import com.ramber.springboot.model.BaseEntity;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Administrator on 2017/10/26.
 */
public interface MyMapper<C extends BaseEntity> extends Mapper,MySqlMapper {

}
