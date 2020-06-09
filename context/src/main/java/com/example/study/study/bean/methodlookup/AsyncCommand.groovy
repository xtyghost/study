package com.example.study.study.bean.methodlookup

class AsyncCommand implements Command {

    String state

    @Override
    void setState(String state) {
        this.state = state;
    }

    @Override
    void execute() {
        println "state=========" + state
    }
}
