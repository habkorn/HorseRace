/*******************************************************************************
*                                                                             *
*           The copyright for this file rests with Thomas Haberkorn.          *
*                         <t.haberkorn@tugraz.at>                             *
*   Any action involving this file is prohibited without written permission.  *
*                                                                             *


/**
 * This class 
 * <p>
 * @author T. Haberkorn
 * @version 0.0.1 | 04.03.2014
 */
// *****************************************************************************
   public class Main 
// *****************************************************************************
{

// parameters
// -----------------------------------------------------------------------------

/**
 * ||function description||
 * @param   
 * @return  
 */
// =============================================================================
   public Main()
// =============================================================================
{

      //some changes
} // Main ===================================================================
   
/**
 @param args the command line arguments
 */
// =============================================================================
   public static void main(String[] args) throws InterruptedException
// =============================================================================
{
   Race race=new Race();
   WaterPlace waterPlace=new WaterPlace();
   
   new Thread(new Horse("blue", race, waterPlace)).start();
   new Thread(new Horse("red", race, waterPlace)).start();
   new Thread(new Horse("green", race, waterPlace)).start();
   
   System.out.println("Get ready..");
   Thread.sleep(1000);
   System.out.println("GO!");
   
   race.startRace();

}// ============================================================================


}