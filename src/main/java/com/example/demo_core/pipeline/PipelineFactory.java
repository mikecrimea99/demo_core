package com.example.demo_core.pipeline;

public interface PipelineFactory<S,T> {
    T getPipeline(S s);
}
