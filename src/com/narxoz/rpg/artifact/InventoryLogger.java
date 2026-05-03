package com.narxoz.rpg.artifact;

/**
 * 4th Visitor to prove Open/Closed behavior.
 * We added this without touching any existing Artifact classes.
 */
public class InventoryLogger implements ArtifactVisitor {
    @Override
    public void visit(Weapon w) { System.out.println(" [LOG] Found Weapon: " + w.getName()); }
    @Override
    public void visit(Potion p) { System.out.println(" [LOG] Found Potion: " + p.getName()); }
    @Override
    public void visit(Scroll s) { System.out.println(" [LOG] Found Scroll: " + s.getName()); }
    @Override
    public void visit(Ring r) { System.out.println(" [LOG] Found Ring: " + r.getName()); }
    @Override
    public void visit(Armor a) { System.out.println(" [LOG] Found Armor: " + a.getName()); }
}