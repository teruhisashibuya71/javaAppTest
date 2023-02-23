package com.demo.test.domain.model;

//Lombokgああってもimportは必要
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestUser {
    //最低限のフィールドで作成
    private int id;
	
	private String name;
    
    private int age;
}
