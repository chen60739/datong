package com.example.datong.dao;

import com.example.datong.model.Dictionary;

public interface DictionaryMapper {
    int insert(Dictionary record);

    int insertSelective(Dictionary record);
}