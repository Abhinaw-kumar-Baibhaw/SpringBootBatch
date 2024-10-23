package com.example.SpringBootBatch;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CoffeeItemWriter implements ItemWriter<Coffee> {
    private final CoffeeRepository coffeeRepository;

    public CoffeeItemWriter(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public void write(List<? extends Coffee> items) throws Exception {
        coffeeRepository.saveAll(items);
    }

    @Override
    public void write(Chunk<? extends Coffee> chunk) throws Exception {

    }
}

