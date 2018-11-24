/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_regTramite;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

/**
 *
 * @author kid_d_000
 */
public class Proceso extends Thread {

    ArrayList<JCheckBox> array;
    JRadioButton rbA, rbP;
    
    public Proceso(ArrayList<JCheckBox> array, JRadioButton rbA, JRadioButton rbP) {
        this.array = array;
        this.rbA = rbA;
        this.rbP = rbP;
    }
    
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < array.size(); i++) {
                if (!array.get(i).isSelected()) {
                    rbP.setSelected(true);
                    i = -1;
                }
            }
            rbA.setSelected(true);
        }
    }
}
