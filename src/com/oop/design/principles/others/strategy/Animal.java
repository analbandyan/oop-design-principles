package com.oop.design.principles.others.strategy;

import com.oop.design.principles.others.strategy.movement.Movement;
import com.oop.design.principles.others.strategy.sound.Sound;

public class Animal {

    private Sound sound;
    private Movement movement;

    public Animal(Sound sound, Movement movement) {
        this.sound = sound;
        this.movement = movement;
    }

    public void act() {
        sound.make();
        movement.move();
    }

    public void changeSound(Sound sound) {
        this.sound = sound;
    }

    public void changeMovement(Movement movement) {
        this.movement = movement;
    }

}
