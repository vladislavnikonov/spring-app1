package edu.school21.app;

public class PreProcessorToLowerImpl implements PreProcessor{
    private String str;

    @Override
    public void setStr(String str) {
        this.str = str.toLowerCase();
    }

    @Override
    public String getStr() {
        return str;
    }
}