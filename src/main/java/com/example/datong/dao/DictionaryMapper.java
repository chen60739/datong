package com.example.datong.dao;

import com.example.datong.model.Dictionary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DictionaryMapper {
    /**
     * 查询所有字典信息
     * @return
     */
    List<Dictionary> selectDictionary();
    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    List<Dictionary> selectParents();

    List<Dictionary> selectSubClassByTopId(Integer topId);
}