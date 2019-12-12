package com.example.datong.service.impl;

import com.example.datong.dao.DictionaryMapper;
import com.example.datong.model.Dictionary;
import com.example.datong.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class DictionaryImpl implements DictionaryService {

    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Override
    public HashMap<String, List<Dictionary>> getDictionary() {
        HashMap<String, List<Dictionary>> dictionarys = new HashMap<>();
        List<Dictionary> parents = dictionaryMapper.selectParents();
        for (Dictionary parent : parents) {
            List<Dictionary> childs = dictionaryMapper.selectSubClassByTopId(parent.getDictionaryId());
            dictionarys.put(parent.getDictionaryName(),childs);
        }
        return dictionarys;
    }
}
