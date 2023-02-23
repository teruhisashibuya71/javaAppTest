package com.demo.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RedisController {
    
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
	private StringRedisTemplate stringRedisTemplate; // String用のTemplate

    //Redis登録情報の取得
    //http://localhost:8080/redis/get
	@RequestMapping(value="/redis/get", method=RequestMethod.GET)
	public String get(@RequestParam(value="key", required=true) String key, Model model) {

		// キーを指定してredisから値を取得
		String result = stringRedisTemplate.opsForValue().get(key);

		model.addAttribute("result",result);

		return "redis/get";
	}

    //Redis登録情報の登録
    //http://localhost:8080/redis/set?key=testkey&value=hogehoge
	@RequestMapping(value="/redis/set", method=RequestMethod.GET)
	public String set(@RequestParam(value="key", required=true) String key,
			@RequestParam(value="value", required=true) String value,
			Model model) {

		// キーと値を指定してredisにセット
		stringRedisTemplate.opsForValue().set(key, value);

		return "redis/set";
	}

    //Redis登録情報の削除
    //http://localhost:8080/redis/del?key=testkey
	@RequestMapping(value="/redis/del", method=RequestMethod.GET)
	public String del(@RequestParam(value="key", required=true) String key,Model model) {

		// キーを指定してredisから削除
		stringRedisTemplate.delete(key);

		return "redis/del";
	}

    // @RequestMapping("/redis")
    // public String putRedis() throws Exception {
    //     //エンティティにセット
    //     RedisModel redisEntity =  new RedisModel();
    //     redisEntity.setStringData("文字をセット");
        
    //     redisTemplate.opsForValue()
    //         .set("RedisModel:StringData", redisEntity.getStringData());
        
    //     //html返却
    //     return "putRedis";
    // }
}

    