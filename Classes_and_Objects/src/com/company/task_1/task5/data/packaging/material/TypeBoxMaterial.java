package com.company.task_1.task5.data.packaging.material;

public enum TypeBoxMaterial {
    CARDBOARD("red"), WOOD("green"), METALL("white");

    TypeBoxMaterial(String name) {
        this.name = name;
    }

    public String name;

    public static TypeBoxMaterial fromStringTypeBoxMaterial(String value) {
        for (TypeBoxMaterial typeBoxMaterial : TypeBoxMaterial.values()) {
            if (typeBoxMaterial.name.equals(value)) return typeBoxMaterial;
        }
        throw new IllegalArgumentException("Unknown packaging");
    }
}
