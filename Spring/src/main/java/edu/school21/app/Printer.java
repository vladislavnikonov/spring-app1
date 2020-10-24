package edu.school21.app;

public interface Printer {
    String getPrefix();
    void setPrefix(String prefix);
    void print(String str);
}