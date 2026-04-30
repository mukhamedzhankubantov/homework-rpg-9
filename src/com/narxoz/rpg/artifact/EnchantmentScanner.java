package com.narxoz.rpg.artifact;

public class EnchantmentScanner implements ArtifactVisitor {
    @Override
    public void visit(Weapon w) {
        System.out.println("Weapon: " + w.getName() + " has +" + w.getAttackBonus() + " attack.");
    }

    @Override
    public void visit(Potion p) {
        System.out.println("Potion: " + p.getName() + " heals " + p.getHealing() + " HP.");
    }

    @Override
    public void visit(Scroll s) {
        System.out.println("Scroll: " + s.getName() + " contains " + s.getSpellName() + " spell.");
    }

    @Override
    public void visit(Ring r) {
        System.out.println("Ring: " + r.getName() + " adds " + r.getMagicBonus() + " mana power.");
    }

    @Override
    public void visit(Armor a) {
        System.out.println("Armor: " + a.getName() + " gives +" + a.getDefenseBonus() + " defense.");
    }
}