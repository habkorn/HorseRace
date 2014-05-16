/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**

 @author Thomas Haberkorn
 */
public class Race
{

   public int place=0;
   
// =============================================================================
   public synchronized void getReadyToTRace() throws InterruptedException
// =============================================================================
{
   this.wait();
}// ============================================================================
   
// =============================================================================
   public synchronized void startRace()
// =============================================================================
{
   this.notifyAll();
}// ============================================================================

// =============================================================================
   public synchronized int crossFinishLine()
// =============================================================================
{
   return ++place;
}// ============================================================================


}
