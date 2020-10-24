package edu.school21.app;

public class RendererStandartImpl implements Renderer{
    private PreProcessor preProcessor;

    public RendererStandartImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }

    @Override
    public void print(String str) {
        preProcessor.setStr(str);
        System.out.println(preProcessor.getStr());
    }
}
