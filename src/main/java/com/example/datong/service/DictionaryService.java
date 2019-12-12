package com.example.datong.service;

import com.example.datong.model.Dictionary;

import java.util.HashMap;
import java.util.List;

public interface DictionaryService {
    HashMap<String, List<Dictionary>> getDictionary();
}
