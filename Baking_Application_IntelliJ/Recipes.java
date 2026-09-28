public abstract class Recipes implements iRecipes
{
    // Variables to store recipe details
    protected String ingredients;
    protected int timeToMake;
    protected int difficultyLevel;

    // Constructor
    public Recipes(String ingredients, int timeToMake, int difficultyLevel)
    {
        this.ingredients = ingredients;
        this.timeToMake = timeToMake;
        this.difficultyLevel = difficultyLevel;
    }

    // Get ingredients
    public String getIngredients()
    {
        return ingredients;
    }

    // Get time to make
    public int getTimeToMake()
    {
        return timeToMake;
    }

    // Get difficulty level
    public int getDifficultyLevel()
    {
        return difficultyLevel;
    }
}
