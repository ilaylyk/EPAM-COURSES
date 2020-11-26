package com.company.task_1.task5.data.packaging.material;

public enum TypeBoxMaterial {
    CARDBOARD, WOOD, METALL;

    public static TypeBoxMaterial choiceMaterial(String material) {
        switch (material) {
            case "cardboard":
                return TypeBoxMaterial.CARDBOARD;
            case "tree":
                return TypeBoxMaterial.WOOD;
            case "metal":
                return TypeBoxMaterial.METALL;
            default:
                return TypeBoxMaterial.CARDBOARD;
        }
    }

    public String printTypeBoxMaterial() {
        switch (this) {
            case CARDBOARD:
                return "cardboard";
            case WOOD:
                return "tree";
            case METALL:
                return "metal";
            default:
                return "no material selected";
        }
    }
}
