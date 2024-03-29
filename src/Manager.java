/**
 * The manager is responsible for opening and closing the nightclub.
 */
public class Manager implements Runnable{
    private String name;
    private NightClub nightClub;
    private int sleepScaler = 10000;
    Manager(String name){
        this.name = name;
    }
    Manager(String name, NightClub nightClub){
        this.name = name;
        this.nightClub = nightClub;
    }
    public void acceptJob(NightClub nightClub){
        this.nightClub = nightClub;
    }
    public void leaveJob(){
        this.nightClub = null;
    }

    @Override
    public void run() {
        try {
            double random = Math.random();
            Thread.sleep((long) (random*sleepScaler));
            nightClub.close();
        } catch (InterruptedException ex) {
            System.out.println("Interrupted Departure Thread");
        }

        }
    // TODO Is the manager an active or a passive process? What would you need
	// if it was an active process?
}
