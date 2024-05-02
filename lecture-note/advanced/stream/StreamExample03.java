package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 测试Java Stream的中间操作
 */
public class StreamExample03 {

    public static void main(String[] args) {
        List<Pokemon> pokemons = Arrays.asList(
                new Pokemon(1, "Bulbasaur", "Grass"),
                new Pokemon(2, "Ivysaur", "Grass"),
                new Pokemon(3, "Venusaur", "Grass"),
                new Pokemon(4, "Charmander", "Fire"),
                new Pokemon(5, "Charmeleon", "Fire"),
                new Pokemon(1, "Bulbasaur", "Grass"),
                new Pokemon(1, "Bulbasaur", "Grass")
        );

        // 筛选流
        pokemons.stream().filter(pokemon -> pokemon.getId() < 4).forEach(System.out::println);
        System.out.println("---------");
        // 截断流 stream.limit(3), 使其元素不超过给定数量
        pokemons.stream().limit(3).forEach(System.out::println);
        System.out.println("---------");
        // skip(n) 跳过前n个元素
        pokemons.stream().skip(3).forEach(System.out::println);
        System.out.println("---------");
        // distinct() 是根据流的hashcode() equals()去除重复元素
        pokemons.stream().distinct().forEach(System.out::println);
        
    }
    
}

class Pokemon {
    private int id;
    private String name;
    private String type;

    public Pokemon(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pokemon: " + "id= " + id +
                ", name= " + name +
                ", type= " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return id == pokemon.id &&
                Objects.equals(name, pokemon.name) &&
                Objects.equals(type, pokemon.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type);
    }
}
