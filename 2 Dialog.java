package com.company;

abstract class Dialog{
    abstract public Button createButton();

    void render(){
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }

}