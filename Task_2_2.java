import java.util.*;
public class Task_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Cp866");
        System.out.printf("Введите число строк в книге = ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> recipesList = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            System.out.printf("Введите строку=  ");
            recipesList.add(sc.nextLine());
        }
        System.out.printf("Введите число замен продуктов = ");
        int m = sc.nextInt();
        sc.nextLine();
        List<String> product_1 = new ArrayList<>(); 
        List<String> product_2 = new ArrayList<>(); 
        for (int i = 0; i < m; i ++) {
            System.out.printf("Введите продукт и его замену = ");
            String[] prods = sc.nextLine().split("-");
            product_1.add(prods[0].trim());
            product_2.add(prods[1].trim());
        }
        sc.close();
        for (int i = 0, size = product_1.size(); i < size; i ++) {
            product_1.add(product_1.get(i).substring(0, 1).toUpperCase()+product_1.get(i).substring(1));
            product_2.add(product_2.get(i).substring(0, 1).toUpperCase()+product_2.get(i).substring(1));
        }
        List<String> recipesListNew = new ArrayList<>();
        for (int i = 0; i < recipesList.size(); i ++) {
            String recipe = recipesList.get(i);
            for (int j = 0; j < product_1.size(); j ++)
                recipe = recipe.replaceAll(product_1.get(j), product_2.get(j));
            recipesListNew.add(recipe);
        }
        for (String recipe : recipesListNew)
            System.out.println(recipe);
    }
}