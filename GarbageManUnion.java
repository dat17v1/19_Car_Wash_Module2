public class GarbageManUnion 
{
    // 14.
    // Attributes
    private GarbageMan[] garbageMan = new GarbageMan[10];

    // Dette er ikke en opgave, men bare forklaring

    // lav et nyt object af GarbageMan
    //GarbageMan gam = new GarbageMan("Per", 120.75);
    public void addToArray()
    {
        garbageMan[0] = new GarbageMan("Per", 120.75);
        garbageMan[1] = new GarbageMan("Otto", 60.75);
        garbageMan[2] = new GarbageMan("Henning", 560.75);
    }

    public void print()
    {
        System.out.println(garbageMan);
    }
}