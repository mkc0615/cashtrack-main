package com.cashtrack.cash_track.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CommonService {

    // json to hashmap
    public HashMap<String, Object> jsonToString(String params){
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        ObjectMapper mapper = new ObjectMapper();

        try{
            resultMap = mapper.readValue(params, HashMap.class);
        }catch(JsonMappingException e){
            e.printStackTrace();
        }catch(JsonProcessingException e){
            e.printStackTrace();
        }
        return resultMap;
    }
}
