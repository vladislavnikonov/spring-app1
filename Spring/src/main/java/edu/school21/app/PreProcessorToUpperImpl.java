package edu.school21.app;

public class PreProcessorToUpperImpl implements PreProcessor{
    private String str;

    @Override
    public void setStr(String str) {
        this.str = str.toUpperCase();
    }

    @Override
    public String getStr() {
        return str;
    }
}