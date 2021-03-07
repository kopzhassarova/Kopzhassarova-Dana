package com.company;
public class App {
    Dialog dialog;
    public App(String OS){
        if("Windows".equals(OS)){
            dialog = new WindowsDialog();
        }else{
            dialog = new WebDialog();
        }
    }
    public static void main(String[] args) {
        App app = new App("HTML");
        app.dialog.render();
    }
}
