/*
 * ResultDisplayPanel.java
 *
 * Created on August 17, 2010, 2:53 PM
 */

package org.opensim.k12;

/**
 *
 * @author  ayman
 */
public class ResultDisplayPanel extends javax.swing.JPanel {
    
    /** Creates new form ResultDisplayPanel */
    public ResultDisplayPanel() {
        initComponents();
    }

    public javax.swing.JLabel getResultLabel() {
        return resultLabel;
    }

    public void setResultLabel(javax.swing.JLabel resultLabel) {
        this.resultLabel = resultLabel;
    }

    public javax.swing.JTextField getResultTextField() {
        return resultTextField;
    }

    public void setResultTextField(javax.swing.JTextField resultTextField) {
        this.resultTextField = resultTextField;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        resultLabel = new javax.swing.JLabel();
        resultTextField = new javax.swing.JTextField();

        resultLabel.setText("jLabel1");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(resultLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(resultTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(resultLabel)
                .add(resultTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextField resultTextField;
    // End of variables declaration//GEN-END:variables
    
}
