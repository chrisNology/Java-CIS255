package Assign07;
import javax.swing.*;
import java.awt.*;

/**
   The ServicePanel class allows the user to select
   the services for the bagel.
*/

public class ServicePanel extends JPanel
{
   // The following constants are used to indicate
   // the cost of services.
   public final double OIL_CHANGE = 26.00;
   public final double LUBE_JOB = 18.00;
   public final double RADIATOR_FLUSH = 30.00;
   public final double TRANSMISSION_FLUSH = 80.00;
   public final double INSPECTION = 15.00;
   public final double MUFFLER_REPLACEMENT = 100.00;
   public final double TIRE_ROTATION = 20.00;

   private JCheckBox oilChange;  // To select oil change
   private JCheckBox lubeJob;       // To select lube job
   private JCheckBox radiatorFlush;   // To select radiator flush
   private JCheckBox transmissionFlush; // To select transmission flush
   private JCheckBox inspection;  // To select inspection
   private JCheckBox mufflerReplacement;       // To select muffler replacement
   private JCheckBox tireRotation;   // To select tire rotation

   /**
      Constructor
   */

   public ServicePanel()
   {
      // Create a GridLayout manager with 
      // four rows and one column.
      setLayout(new GridLayout(4, 1));

      // Create the check boxes.
      oilChange = new JCheckBox("Oil change");
      lubeJob = new JCheckBox("Lube job");
      radiatorFlush = new JCheckBox("Radiator flush");
      transmissionFlush = new JCheckBox("Transmission flush");
      inspection = new JCheckBox("Inspection");
      mufflerReplacement = new JCheckBox("Muffler replacement");
      tireRotation = new JCheckBox("Tire rotation");

      // Add a border around the panel.
      setBorder(BorderFactory.createTitledBorder("Services"));

      // Add the check boxes to the panel.
      add(oilChange);
      add(lubeJob);
      add(radiatorFlush);
      add(transmissionFlush);
      add(inspection);
      add(mufflerReplacement);
      add(tireRotation);
   }

   /**
      getServiceCost method
      @return The cost of the selected services.
   */

   public double getServiceCost()
   {
      double serviceCost = 0.0;

      if (oilChange.isSelected())
         serviceCost += OIL_CHANGE;
      if (lubeJob.isSelected())
         serviceCost += LUBE_JOB;
      if (radiatorFlush.isSelected())
         serviceCost += RADIATOR_FLUSH;
      if (transmissionFlush.isSelected())
         serviceCost += TRANSMISSION_FLUSH;
      if (inspection.isSelected())
          serviceCost += INSPECTION;
      if (mufflerReplacement.isSelected())
          serviceCost += MUFFLER_REPLACEMENT;
      if (tireRotation.isSelected())
          serviceCost += TIRE_ROTATION;

      return serviceCost;
   }
}
