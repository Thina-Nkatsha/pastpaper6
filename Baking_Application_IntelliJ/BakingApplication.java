import java.util.Scanner;

public class BakingApplication
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ingredients eg: flour, salt, baking soda and coco: ");
        String ingredients = input.nextLine();

        System.out.print("Enter time to make (in minutes): ");
        int timeToMake = input.nextInt();

        System.out.print("Enter difficulty level: ");
        int difficultyLevel = input.nextInt();

        ProcessRecipe recipe = new ProcessRecipe(ingredients, timeToMake, difficultyLevel);

        recipe.PrintRecipes();
    }
}
