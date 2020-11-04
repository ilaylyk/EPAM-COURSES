package com.company.task_1;

public class Task_1 {
    private static String[] toSnakeCase(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];

        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder strBuilder = new StringBuilder();

            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];

                if (Character.isLowerCase(letter)) {
                    strBuilder.append(letter);
                } else {
                    strBuilder.append("_");
                    strBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = strBuilder.toString();
        }
        return snakeCase;
    }

    public static void main(String[] args) {
        String[] camelCase = {"oluwatobilobaPrince", "ashaRayner", "teganValdez", "kieranChadwick", "gurdeepSantos",
                "avneetCortes", "tomiMoses", "hunterTravers"};

        String[] snakeCase = toSnakeCase(camelCase);

        System.out.println("camelCase:");
        System.out.println(String.join(", ", camelCase));
        System.out.println("snake_case:");
        System.out.println(String.join(", ", snakeCase));
    }
}
