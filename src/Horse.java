
import java.util.Random;

/*******************************************************************************
*                                                                             *
*           The copyright for this file rests with Thomas Haberkorn.          *
*                         <t.haberkorn@tugraz.at>                             *
*   Any action involving this file is prohibited without written permission.  *
*                                                                             *
******************************************************************************/


/**
 * This class 
 * <p>
 * @author T. Haberkorn
 * @version 0.0.1 | 03.03.2014
 */
// *****************************************************************************
   public class Horse implements Runnable
// *****************************************************************************
{
   private double distance;
   
   private String name;
   
   private Race race;
   private WaterPlace waterPlace;
   
   private Random rand;
   private long time;
   
   private int numberLaps=3;
   
   private long cumulTime;

// parameters
// -----------------------------------------------------------------------------

/**
 * ||function description||
 * @param   
 * @return  
 */
// =============================================================================
   public Horse(String name, Race race, WaterPlace waterPlace)
// =============================================================================
{
   this.name=name;
   this.race=race;
   this.waterPlace=waterPlace;
   long seed=System.nanoTime(); // System.currentTimeMillis() too inacurate
   System.out.println("Seed for Horse" + name + ": " +seed );
   rand=new Random(seed);
} // Horse =====================================================================
   
// =============================================================================
   public long runLap() throws InterruptedException
// =============================================================================
{
   long duration=Math.abs(rand.nextLong()) % 3000 + 1000;
   Thread.sleep(duration);
   return duration;
}

   @Override
// =============================================================================
   public void run()
// =============================================================================
{

   try
   {
      race.getReadyToTRace();
      System.out.println(name + " is off and running!");
      for (int i = 0; i < numberLaps; i++)
      {
         time=runLap();
         System.out.println(name + " completes lap no. " + (i+1) +" in " + 
          time/1000. +" seconds.");
         
         cumulTime+=time;
         
         time=waterPlace.getDrink();
         System.out.println(name + " drinks for " + time/1000. +" seconds.");

         cumulTime+=time;
      }
      
      
      System.out.println(race.crossFinishLine() + ". "+ name + " has completed"
         + " the race. Laps:" + numberLaps +
       " in " + cumulTime/1000. +" seconds.");
   } catch (InterruptedException e)
   {
      System.out.println(name + " broke a leg and won't finish the race.");
   }

}


}// ****************************************************************************