package com.demo.kafka.cache;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Person {

    private long id;
    private String name;
    private String location;
    private String fame;
    private String music;
    private long age;
    private String blink;
    private String house;

    public Person(long id, String name, String location, String fame, String music, long age, String blink, String house) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.fame = fame;
        this.music = music;
        this.age = age;
        this.blink = blink;
        this.house = house;
    }

    // Default constructor (if needed elsewhere)
    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFame() {
        return fame;
    }

    public void setFame(String fame) {
        this.fame = fame;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getBlink() {
        return blink;
    }

    public void setBlink(String blink) {
        this.blink = blink;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}
