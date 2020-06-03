package com.example.study.study.bean.annotation

import org.springframework.stereotype.Component

@Component
class Test extends MyService {

    final String name ="lisu"

    void doStuff() {
        System.out.println(name+"    do Stuff");
    }
}
