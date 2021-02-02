package com.seungmoo;

import com.seungmoo.di.ContainerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 진짜 스프링 이라면 getObject 이런 소스도 생략이고,
        // 싱글톤 관리 등등 더 될 것이다. (이거는 그냥 예제)
        AccountService accountService = ContainerService.getObject(AccountService.class);
        accountService.join();
    }
}
