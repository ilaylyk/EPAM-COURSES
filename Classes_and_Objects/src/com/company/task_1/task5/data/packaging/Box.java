package com.company.task_1.task5.data.packaging;

import com.company.task_1.task5.data.packaging.material.Color;
import com.company.task_1.task5.data.packaging.material.TypeBoxMaterial;

public class Box {
    private TypeBoxMaterial typeBoxMaterial;
    private Color color;

    public Box(TypeBoxMaterial typeBoxMaterial, Color color) {
        this.typeBoxMaterial = typeBoxMaterial;
        this.color = color;
    }

    public TypeBoxMaterial getTypeBoxMaterial() {
        return typeBoxMaterial;
    }

    public void setTypeBoxMaterial(TypeBoxMaterial typeBoxMaterial) {
        this.typeBoxMaterial = typeBoxMaterial;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Packing: material - " + typeBoxMaterial.printTypeBoxMaterial() + ", color - " + color.printColor() + ".";
    }
}
