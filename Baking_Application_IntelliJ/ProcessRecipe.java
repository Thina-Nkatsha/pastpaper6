public class ProcessRecipe extends Recipes
{
    // Constructor
    public ProcessRecipe(String ingredients, int timeToMake, int difficultyLevel)
    {
        super(ingredients, timeToMake, difficultyLevel);
    }

    // Print recipe details
    @Override
    public void PrintRecipes()
    {
        System.out.println("***************************************");
        System.out.println("INGREDIENTS: " + getIngredients());
        System.out.println("TIME TO MAKE: " + getTimeToMake());
        System.out.println("DIFFICULTY LEVEL: " + getDifficultyLevel());
        System.out.println("***************************************");
    }
}
