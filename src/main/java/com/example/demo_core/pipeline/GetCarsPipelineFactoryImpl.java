package com.example.demo_core.pipeline;

import com.example.demo_core.dao.entities.Car;
import org.springframework.stereotype.Component;

@Component
public class GetCarsPipelineFactoryImpl implements PipelineFactory<Car, Pipeline<Car>> {

    @Override
    public Pipeline<Car> getPipeline(Car car) {
        if (car.getBrand().equals("Ferrari")) {
            return new FerrariPipeline();
        } else {
            return new HlamPipeline();
        }
    }
}
