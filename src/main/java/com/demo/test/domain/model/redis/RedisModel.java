package com.demo.test.domain.model.redis;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

//getterとsetterの省略
@Getter
@Setter

//Redisに登録するデータ形式を扱うクラス
public class RedisModel {

    private String stringData;

    private List<String> dataList;

    private Map<String, String> mapDataSet;
}
