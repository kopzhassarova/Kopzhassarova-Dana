
package com.company;
public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new WindowsDialog();
        }
        dialog.render();
    }
}