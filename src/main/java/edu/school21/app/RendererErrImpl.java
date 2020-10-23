package edu.school21.app;

public class RendererErrImpl implements Renderer{
    private PreProcessor preProcessor;

    public RendererErrImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }

    @Override
    public void print(String str) {
        preProcessor.setStr(str);
        System.err.println(preProcessor.getStr());
    }
}