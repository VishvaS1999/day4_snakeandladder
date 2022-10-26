public class SnakeLadder_Uc3
{
    public static void main(String[] args)
    {
        int playerposition=0;
        System.out.println("player position is :-" +playerposition);

        int rolldie = (int) (Math.floor(Math.random()*10)%7);
        System.out.println("player rolldie:- " +rolldie);

        int randomOption = (int) (Math.floor(Math.random()%10)%4);
        System.out.println("randomOption");

        if(randomOption == 1)
        {
            System.out.println("Ladder");

            playerposition = rolldie + playerposition;
            System.out.println("play position:- " +playerposition);
        } else if (randomOption == 2)
        {
            System.out.println("Snake");
            playerposition = playerposition - rolldie;
            System.out.println("player position :-" +playerposition);
        }
        else
        {
            System.out.println("No play");
            System.out.println("player position:-" +playerposition);
        }
    }
}
