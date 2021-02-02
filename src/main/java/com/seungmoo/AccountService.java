package com.seungmoo;

import com.seungmoo.di.Inject;

public class AccountService {

    // refactoring-example 에서 만든 @Inject annotation으로
    // DI를 해보자
    @Inject
    AccountRepository accountRepository;

    public void join() {
        System.out.println("Service join");
        accountRepository.save();
    }
}
