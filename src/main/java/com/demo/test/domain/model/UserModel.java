package com.demo.test.domain.model;

//Lombokがあってもimportは必要
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserModel {
    //最低限のフィールドで作成
    private int id;
	
	private String name;
    
    private int age;
}
