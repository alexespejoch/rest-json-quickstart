package service;

import model.Fruit;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@ApplicationScoped
public class FruitService {

    private Set<Fruit> fruits = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public FruitService()
    {
        fruits.add(new Fruit("Apple","Winter fruit"));
        fruits.add(new Fruit("Orange", "Tropical Fruit"));
    }

    public Set<Fruit> list(){
        return fruits;
    }

    public Set<Fruit> add(Fruit fruit){
        fruits.add(fruit);
        return fruits;
    }

    public Set<Fruit> delete(Fruit fruit){
        fruits.removeIf(existingFruit -> existingFruit.name.contentEquals(fruit.name));
        return  fruits;
    }
}
