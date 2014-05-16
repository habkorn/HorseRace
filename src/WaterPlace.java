
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
 * @version 0.0.1 | 04.03.2014
 */
// *****************************************************************************
   public class WaterPlace 
// *****************************************************************************
{

// parameters
// -----------------------------------------------------------------------------
   private Random rand;
   private final long seed;
/**
 * ||function description||
 * @param   
 * @return  
 */
// =============================================================================
   public WaterPlace()
// =============================================================================
{
  seed=System.nanoTime();
  rand=new Random(seed);
} // WaterPlace ================================================================
   
   public synchronized long getDrink() throws InterruptedException
{
   long duration= Math.abs(rand.nextLong()) % 2000 + 1000;
   Thread.sleep(duration);
   return duration;
}


}