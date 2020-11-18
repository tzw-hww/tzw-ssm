package com.tzw.mapper;

import com.tzw.entity.EcifClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;
public interface EcifClientMapper extends Mapper<EcifClient> {

    public List<Map<String,Object>> selectAllList();
}
