package lec17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lec17Main {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(
            new Fruit("사과", 1_000),
            new Fruit("사과", 1_200),
            new Fruit("사과", 1_500),
            new Fruit("바나나", 1_000),
            new Fruit("바나나", 1_500),
            new Fruit("바나나", 2_000),
            new Fruit("수박", 30_000)
        );

        Lec17Main main = new Lec17Main();
        List<Fruit> result = main.filterFruits(fruits, new FruitFilter() {
            @Override
            public boolean isSelected(Fruit fruit) {
                return Arrays.asList("사과", "바나나")
                    .contains(fruit.getName())
                    && fruit.getPrice() > 5000;
            }
        });

        List<Fruit> result2 = main.filterFruits2(fruits, fruit -> fruit.getName().equals("사과"));

        main.filterFruits3(fruits, Fruit::isApple);
    }

    private List<Fruit> findApplies(List<Fruit> fruits) {
        List<Fruit> applies = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getName().equals("사과")) {
                applies.add(fruit);
            }
        }
        return applies;
    }

    private List<Fruit> findBananas(List<Fruit> fruits) {
        List<Fruit> bananas = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getName().equals("바나나")) {
                bananas.add(fruit);
            }
        }
        return bananas;
    }

    private List<Fruit> findFruitsWithName(List<Fruit> fruits, String name) {
        List<Fruit> result = new ArrayList<>();

        for (Fruit fruit : fruits) {
            if (fruit.getName().equals(name)) {
                result.add(fruit);
            }
        }
        return result;
    }

    private List<Fruit> filterFruits(List<Fruit> fruits, FruitFilter fruitFilter) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruitFilter.isSelected(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }

    private List<Fruit> filterFruits2(List<Fruit> fruits, Predicate<Fruit> filter) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (filter.test(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }

    private List<Fruit> filterFruits3(List<Fruit> fruits, Predicate<Fruit> filter) {
        return fruits.stream()
            .filter(filter)
            .toList();
    }

}

