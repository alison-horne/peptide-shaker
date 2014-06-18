package eu.isas.peptideshaker.gui.pride;

import com.compomics.software.ToolFactory;
import com.compomics.software.dialogs.SearchGuiSetupDialog;
import com.compomics.util.examples.BareBonesBrowserLaunch;
import com.compomics.util.preferences.UtilitiesUserPreferences;
import java.io.File;
import java.util.ArrayList;

/**
 * Display the extracted search settings to the user.
 *
 * @author Harald Barsnes
 */
public class PrideSearchParametersDialog extends javax.swing.JDialog {

    /**
     * Reference to the main frame.
     */
    private PrideReShakeGUIv2 prideReShakeGUI;
    /**
     * The extracted search parameters file.
     */
    private File prideSearchParametersFile;
    /**
     * The mgf files.
     */
    private ArrayList<File> mgfFiles;
    /**
     * The species for the PRIDE project.
     */
    private String species;
    /**
     * The species type for the PRIDE project.
     */
    private String speciesType;

    /**
     * Creates a new PrideSearchParametersDialog.
     *
     * @param prideReShakeGUI a reference to the main frame
     * @param prideSearchParametersFile the pride search parameters file
     * @param prideSearchParametersReport the pride search parameters report
     * @param mgfFiles the converted mgf files
     * @param species the species for the project, can be null and also a list
     * of species
     * @param speciesType the species type
     * @param modal
     */
    public PrideSearchParametersDialog(PrideReShakeGUIv2 prideReShakeGUI, File prideSearchParametersFile,
            String prideSearchParametersReport, ArrayList<File> mgfFiles, String species, String speciesType, boolean modal) {
        super(prideReShakeGUI, modal);
        initComponents();
        this.prideReShakeGUI = prideReShakeGUI;
        this.prideSearchParametersFile = prideSearchParametersFile;
        this.mgfFiles = mgfFiles;
        this.species = species;
        this.speciesType = speciesType;
        searchParametersReportEditorPane.setText(prideSearchParametersReport);
        setLocationRelativeTo(prideReShakeGUI);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        searchParametersReportScrollPane = new javax.swing.JScrollPane();
        searchParametersReportEditorPane = new javax.swing.JEditorPane();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PRIDE Search Settings");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        backgroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchParametersReportScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 10));

        searchParametersReportEditorPane.setEditable(false);
        searchParametersReportEditorPane.setBorder(null);
        searchParametersReportEditorPane.setContentType("text/html"); // NOI18N
        searchParametersReportEditorPane.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                searchParametersReportEditorPaneHyperlinkUpdate(evt);
            }
        });
        searchParametersReportScrollPane.setViewportView(searchParametersReportEditorPane);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        infoLabel.setFont(infoLabel.getFont().deriveFont((infoLabel.getFont().getStyle() | java.awt.Font.ITALIC)));
        infoLabel.setText("Click OK to open the data in SearchGUI and start the re-analysis!");

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(searchParametersReportScrollPane)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(infoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addContainerGap())
        );

        backgroundPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchParametersReportScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton)
                    .addComponent(infoLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Close the dialog.
     *
     * @param evt
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
        //peptideShakerGUI.close();
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Open SearchGUI with the given search parameters.
     *
     * @param evt
     */
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        prideReShakeGUI.setVisible(false);
        this.setVisible(false);

        boolean openSearchGUI = true;

        // check if we have a valid SearchGUI location.
        try {
            UtilitiesUserPreferences utilitiesUserPreferences = UtilitiesUserPreferences.loadUserPreferences();
            if (utilitiesUserPreferences.getSearchGuiPath() == null || !(new File(utilitiesUserPreferences.getSearchGuiPath()).exists())) {
                SearchGuiSetupDialog searchGuiSetupDialog = new SearchGuiSetupDialog(prideReShakeGUI, true);
                openSearchGUI = !searchGuiSetupDialog.isDialogCanceled();
            }
        } catch (Exception e) {
            prideReShakeGUI.getPeptideShakerGUI().catchException(e);
        }

        if (openSearchGUI) {

            new Thread(new Runnable() {
                public void run() {
                    try {
                        File outputFolder = null;
                        if (!mgfFiles.isEmpty()) {
                            outputFolder = new File(mgfFiles.get(0).getParentFile(), "search_results");
                            if (!outputFolder.exists()) {
                                boolean success = outputFolder.mkdir();
                                if (!success) {
                                    outputFolder = null;
                                }
                            }
                        }
                        ToolFactory.startSearchGUI(prideReShakeGUI, mgfFiles, prideSearchParametersFile, outputFolder, species, speciesType);
                        prideReShakeGUI.getPeptideShakerGUI().close();
                    } catch (Exception e) {
                        prideReShakeGUI.getPeptideShakerGUI().catchException(e);
                    }
                }
            }, "StartSearchGUI").start();
        }
    }//GEN-LAST:event_okButtonActionPerformed

    /**
     * Close the dialog.
     *
     * @param evt
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cancelButtonActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing

    /**
     * Make the links active.
     *
     * @param evt
     */
    private void searchParametersReportEditorPaneHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_searchParametersReportEditorPaneHyperlinkUpdate
        if (evt.getEventType().toString().equalsIgnoreCase(
                javax.swing.event.HyperlinkEvent.EventType.ENTERED.toString())) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        } else if (evt.getEventType().toString().equalsIgnoreCase(
                javax.swing.event.HyperlinkEvent.EventType.EXITED.toString())) {
            setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        } else if (evt.getEventType().toString().equalsIgnoreCase(
                javax.swing.event.HyperlinkEvent.EventType.ACTIVATED.toString())) {
            if (evt.getDescription().startsWith("#")) {
                searchParametersReportEditorPane.scrollToReference(evt.getDescription());
            } else {
                this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
                BareBonesBrowserLaunch.openURL(evt.getDescription());
                this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            }
        }
    }//GEN-LAST:event_searchParametersReportEditorPaneHyperlinkUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton okButton;
    private javax.swing.JEditorPane searchParametersReportEditorPane;
    private javax.swing.JScrollPane searchParametersReportScrollPane;
    // End of variables declaration//GEN-END:variables
}
