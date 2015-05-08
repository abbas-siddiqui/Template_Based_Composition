/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainVis.java
 *
 * Created on 31.03.2011, 15:23:06
 */
package template_demo;

import edu.uci.ics.jung.algorithms.layout.FRLayout2;
import edu.uci.ics.jung.algorithms.layout.KKLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.visualization.GraphZoomScrollPane;
import edu.uci.ics.jung.visualization.Layer;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.control.*;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import generated.ListOfRequirements;
import generated.ListOfRequirements.Requirement;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.*;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.collections15.Transformer;
import reqdesc.requirements.Requirements;

/**
 *
 * @author siddiqui
 */
public class MainVis extends javax.swing.JFrame {

    RetrievedRequirements retReqs;
    NetworkParameters netParam;
    TemplatePool pool;
    BuildingBlockPool bbPool;
    DomainPolicies domPol;
    WorkflowGenerator generator;

    /**
     * Creates new form MainVis
     */
    public MainVis() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        fileName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        reqPanel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        reqSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayReq = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        suitableTempspnl = new javax.swing.JPanel();
        selectTemps = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tempPoolpnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        algoOption = new javax.swing.JComboBox();
        selectTemp = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        selectedTempPnl = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        workflowdisplay = new javax.swing.JTextArea();
        fillBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(fileName, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(410, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(fileName))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("browse");

        jTabbedPane1.addTab("Browse Requirements", jPanel1);

        reqPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reqPanel.setLayout(new java.awt.GridLayout(0, 3, 1, 1));
        jScrollPane3.setViewportView(reqPanel);

        jButton3.setText("Load Requirements");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        reqSend.setText("Send Requirements");
        reqSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(reqSend, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 365, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(reqSend))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Create New Requirements", jPanel2);

        displayReq.setColumns(20);
        displayReq.setEditable(false);
        displayReq.setLineWrap(true);
        displayReq.setRows(5);
        displayReq.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        displayReq.setEnabled(false);
        jScrollPane1.setViewportView(displayReq);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        suitableTempspnl.setLayout(new java.awt.GridLayout(20, 1));
        jScrollPane4.setViewportView(suitableTempspnl);

        selectTemps.setText("Suitable Template(s)");
        selectTemps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTempsActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tempPoolpnl.setLayout(new java.awt.GridLayout(20, 1));
        jScrollPane2.setViewportView(tempPoolpnl);

        jLabel1.setText("Template Pool (i.e. Avaliable Templates)");

        algoOption.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First Match", "Criterian" }));
        algoOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algoOptionActionPerformed(evt);
            }
        });

        selectTemp.setText("Select a Template");
        selectTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTempActionPerformed(evt);
            }
        });

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setToolTipText("");
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        selectedTempPnl.setLayout(new java.awt.GridLayout(20, 1));
        jScrollPane5.setViewportView(selectedTempPnl);

        workflowdisplay.setColumns(20);
        workflowdisplay.setRows(5);
        jScrollPane6.setViewportView(workflowdisplay);

        fillBtn.setText("Fill the Template");
        fillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(98, 98, 98)
                        .addComponent(selectTemps)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(algoOption, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectTemp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fillBtn)
                        .addGap(90, 90, 90))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectTemps)
                            .addComponent(algoOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectTemp))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fillBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTabbedPane1)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser c = new JFileChooser("./Extra_Files/");
        // Demonstrate "Open" dialog:
        int rVal = c.showOpenDialog(this);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            fileName.setText(c.getSelectedFile().getAbsolutePath());
            try {
                RetrieveRequirements(fileName.getText());
            } catch (JAXBException ex) {
                Logger.getLogger(MainVis.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (rVal == JFileChooser.CANCEL_OPTION) {
            fileName.setText("You pressed cancel");
        }

         new Thread() {

            public void run() {
                LoadNetworkParameters();
            }
        }.start();
         
        new Thread() {

            public void run() {
                LoadTemplates();
            }
        }.start();

        new Thread() {

            public void run() {
                LoadPolicies();
            }
        }.start();


        new Thread() {

            public void run() {
                LoadBBs();
            }
        }.start();

       
        //GenerateWorkflow();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            PopulateReqList("");
        } catch (JAXBException ex) {
            Logger.getLogger(MainVis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void reqSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqSendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reqSendActionPerformed

    private void selectTempsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTempsActionPerformed

        pool.SearchforTemplates(retReqs, domPol);
        // TODO add your handling code here:
        if (pool.selectedTemplates.size() > 0) {
            for (int i = 0; i < pool.selectedTemplates.size(); i++) {
                DrawTemplate(pool.selectedTemplates.get(i), suitableTempspnl);
            }
        }

        validate();
    }//GEN-LAST:event_selectTempsActionPerformed

    private void selectTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTempActionPerformed
        // TODO add your handling code here:
//         for (int i=0; i<pool.selectedTemplates.size(); i++)

        if (algoOption.getSelectedItem().toString().equalsIgnoreCase("First Match")) {
            TemplateFirstMatch();
        }
        validate();
    }//GEN-LAST:event_selectTempActionPerformed

    private void algoOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algoOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_algoOptionActionPerformed

    private void fillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillBtnActionPerformed

        //  bbPool.PrintBBNames();
        if (pool.selectedTemplates.size() != 0) {
            pool.selectedTemplates.get(0).FillTemplate(bbPool.buildingBlocks);
        }

        GenerateWorkflow(pool.selectedTemplates.get(0));


//        pool.selectedTemplates.get(0).PrintPlaceHolders();
    }//GEN-LAST:event_fillBtnActionPerformed

    public void GenerateWorkflow(AvailableTemplate temp) {
        generator = new WorkflowGenerator();
        try {
            // generator.addBuildingBlock();
            int numberofWorkflows = generator.GenerateWorkflows(temp);
            String text = "";
            try {
                for (int i = 0; i < numberofWorkflows; i++) {

                    FileReader fr = new FileReader("./Extra_Files/workflow" + (i + 1) +".xml" );
                    BufferedReader reader = new BufferedReader(fr);
                    String textLine = "";
                    while (textLine != null) {
                        textLine = reader.readLine();
                        text = text + textLine + "\n";
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            workflowdisplay.setText(text);
        } catch (Exception ex) {
            Logger.getLogger(MainVis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void TemplateFirstMatch() {
        if (pool.selectedTemplates.size() != 0) {
            DrawTemplate(pool.selectedTemplates.get(0), selectedTempPnl);

        }
//        for (int i =0 ; i<pool.templates.size(); i++)
//        {
//         pool.templates.get(i).PrintPlaceHolders();
//        }

    }

    public void PopulateReqList(String path_name) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance("generated");
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        ListOfRequirements Listreq = (ListOfRequirements) unmarshaller.unmarshal(new File("./Extra_Files/RequirementsDatabase.xml"));
        //Listreq.getRequirement()
        List<Requirement> reqs = Listreq.getRequirement();
        String req, reqType;
        for (int i = 0; i < reqs.size(); i++) {
            reqType = reqs.get(i).getReqType();
            req = reqs.get(i).getValue();
            if (reqType.equalsIgnoreCase("numeric") || reqType.equalsIgnoreCase("time")) {
                reqPanel.add(CreateNumericReq(req));
            } else if (reqType.equalsIgnoreCase("boolean")) {
                JCheckBox box = new JCheckBox(req);
                reqPanel.add(box);
            }

            reqPanel.validate();
            //  System.out.println(req);

        }
        validate();
    }

    public void RetrieveRequirements(String path_name) throws JAXBException {

        JAXBContext jc = JAXBContext.newInstance("reqdesc.requirements");
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        retReqs = new RetrievedRequirements();
        Requirements reqList = (Requirements) unmarshaller.unmarshal(new File("/" + path_name));//("./Extra_Files/Req1.xml"));

        String domainName = reqList.getDomain();
        retReqs.setDomainName(domainName);

        List<Requirements.Requirement> reqs = reqList.getRequirement();
        String effectName, operator, attributeName, attributeUnit;



        for (int i = 0; i < reqs.size(); i++) {

            Requirements.Requirement r = reqs.get(i);

            effectName = r.getEffect();
            operator = r.getOperator();
            Requirements.Requirement.Attribute atr = r.getAttribute();
            attributeName = atr.getValue();
            attributeUnit = atr.getUnit();

            if (attributeUnit == null) {
                attributeUnit = "";
            }
            if (attributeName == null) {
                attributeName = "";
            }

            displayReq.append(effectName + "" + operator + "" + attributeName + "" + attributeUnit + "\t");
            //   System.out.println(effectName + "" + operator + "" + attributeName + "" + attributeUnit);                                         
            retReqs.addRequirement(effectName, operator, attributeName);
        }

        //Retrieving Forced Mandatory Requirements from the Application!!!

        Requirements.Mandatory man = reqList.getMandatory();

        if (man != null) {
            List<Requirements.Mandatory.Requirement> manreqs = man.getRequirement();


            for (int i = 0; i < manreqs.size(); i++) {

                Requirements.Mandatory.Requirement r = manreqs.get(i);

                effectName = r.getEffect();
                operator = r.getOperator();
                Requirements.Mandatory.Requirement.Attribute atr = r.getAttribute();
                attributeName = atr.getValue();
                attributeUnit = atr.getUnit();

                if (attributeUnit == null) {
                    attributeUnit = "";
                }
                if (attributeName == null) {
                    attributeName = "";
                }

                displayReq.append(effectName + "" + operator + "" + attributeName + "" + attributeUnit + "\t");
                //   System.out.println(effectName + "" + operator + "" + attributeName + "" + attributeUnit);                   

                retReqs.addRequirement(effectName, operator, attributeName);

            }
        }
    }

    public Component CreateNumericReq(String req) {

        JPanel numericReq = new JPanel();
        numericReq.setLayout(new FlowLayout());
        JCheckBox box = new JCheckBox(req);
        numericReq.add(box);

        String operators[] = {"<", ">", "=", ">=", "<="};
        JComboBox oper = new JComboBox(operators);
        numericReq.add(oper);
        JTextField val = new JTextField();
        val.setText("9999999999");
        numericReq.add(val);
        String logoperators[] = {"AND", "OR"};
        JComboBox logoper = new JComboBox(logoperators);
        numericReq.add(logoper);
        JComboBox oper1 = new JComboBox(operators);
        numericReq.add(oper1);
        JTextField val1 = new JTextField();
        val1.setText("9999999999");

        numericReq.add(val1);

        return numericReq;

    }

    public void LoadBBs() {

        BBProcessing bbProcessing = new BBProcessing();
        bbPool = new BuildingBlockPool();

        File InputFolder = new File("./Extra_Files/BBPool/");
        String[] files = InputFolder.list();
        for (int i = 0; i < files.length; i++) {
            try {
                AvailableBB bb = new AvailableBB();
                //System.out.println("File Name is "+files[i] );
                bb.setBBName(files[i]);
                bbProcessing.BBProcess(files[i], bb);
                bbPool.addBB(bb);
                //DrawTemplate(temp, tempPoolpnl);
            } catch (JAXBException ex) {
                Logger.getLogger(MainVis.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //bbPool.PrintBBNames();
    }

    public void LoadTemplates() {

        TemplateProcessing tempProcessing = new TemplateProcessing();
        pool = new TemplatePool();

        File InputFolder = new File("./Extra_Files/TemplatesPool/");
        String[] files = InputFolder.list();
        for (int i = 0; i < files.length; i++) {
            try {
                AvailableTemplate temp = new AvailableTemplate();
                temp.Initialize("Template" + i);
                tempProcessing.TemplateProcess(files[i], temp);
                pool.addTemplate(temp);
                DrawTemplate(temp, tempPoolpnl);
            } catch (JAXBException ex) {
                Logger.getLogger(MainVis.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        validate();
    }

    public void LoadPolicies() {
        try {
            domPol = new DomainPolicies();

            domPol.ProcessDomainPolicies("./Extra_Files/DomainPolicies/DomainPolicies.xml", netParam);
            domPol.PrintoutDomains();
        } catch (JAXBException ex) {
            Logger.getLogger(MainVis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void LoadNetworkParameters() {
        try {
            netParam = new NetworkParameters();
            netParam.ProcessNetworkPolicies("./Extra_Files/NetwokParameters/Scenario1_Server1.xml");
            netParam.PrintoutAllParameters();
        } catch (Exception ex) {
            Logger.getLogger(MainVis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DrawTemplate(AvailableTemplate view, JPanel drawPanel) {

        Graph<String, String> g = new SparseMultigraph<String, String>();

        int x = 300;
        int y = 125 * view.vertices.size();

        // System.out.print("Number of Vertices : " + view.vertices.size() + " Y value is: " + y);
        Layout<String, String> layout = new KKLayout<String, String>(g);
        layout.setSize(new Dimension(x, y));
        for (int i = 0; i < view.vertices.size(); i++) {
            g.addVertex(view.vertices.get(i));
            double x1 = 90;
            double y1 = 50 + 120 * i;
            Point2D point = new Point2D.Double(x1, y1);
            layout.setLocation(view.vertices.get(i), point);
            layout.lock(view.vertices.get(i), true);

        }

        for (int j = 0; j < view.connections.size(); j++) {
            Connection con = view.connections.get(j);
            String[] placeholdersName = new String[2];
            String[] portID = new String[2];
            for (int k = 0; k < con.ports.size(); k++) {
                Port port = con.ports.get(k);
                placeholdersName[k] = port.placeholderName;
                portID[k] = port.portId;
            }
            g.addEdge("Port: " + portID[0] + " Port: " + portID[0], placeholdersName[0], placeholdersName[1]);
        }

        Transformer<String, Paint> vertexColor = new Transformer<String, Paint>() {

            @Override
            public Paint transform(String i) {
                return Color.GREEN;
            }
        };

        VisualizationViewer vv = new VisualizationViewer(layout);
        vv.setPreferredSize(new Dimension(x, y)); //Sets the viewing area 
        PluggableGraphMouse pgm = new PluggableGraphMouse();
        pgm.add(new PickingGraphMousePlugin());
        pgm.add(new TranslatingGraphMousePlugin(MouseEvent.BUTTON3_MASK));
        pgm.add(new ScalingGraphMousePlugin(new CrossoverScalingControl(), 0, 1 / 1.1f, 1.1f));
        vv.setGraphMouse(pgm);
        Transformer<String, Shape> vertexSize = new Transformer<String, Shape>() {

            @Override
            public Shape transform(String i) {
                Rectangle2D rect = new Rectangle2D.Double(-10, -20, 80, 30);
                return rect;
            }
        };
//         final ScalingControl scaler = new CrossoverScalingControl();
//         scaler.scale(vv, 1/1.3f, vv.getCenter());
        vv.setGraphLayout(layout);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Integer>());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<String>());
        vv.getRenderContext().setVertexFillPaintTransformer(vertexColor);
        vv.getRenderContext().setVertexShapeTransformer(vertexSize);


//         Point2D v_location = layout.transform("v");
//    Point2D vv1_center_location = vv.getRenderContext()
//            .getMultiLayerTransformer()
//            .inverseTransform(Layer.LAYOUT, vv.getCenter());
//
//    vv.getRenderContext()
//            .getMultiLayerTransformer()
//            .getTransformer(Layer.LAYOUT)
//            .translate(-(v_location.getX() - vv1_center_location.getX()),
//                    -(v_location.getY() - vv1_center_location.getY()));

        //vv.setPreferredSize(new Dimension(200,200));
        // final GraphZoomScrollPane panel = new GraphZoomScrollPane(vv);
        //panel.setPreferredSize(new Dimension(200,200));
        //drawPanel.add(panel);
        drawPanel.add(vv);
        //  tempPool.setBounds(5,10,200,500);
        drawPanel.validate();


    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox algoOption;
    private javax.swing.JTextArea displayReq;
    private javax.swing.JTextField fileName;
    private javax.swing.JButton fillBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel reqPanel;
    private javax.swing.JButton reqSend;
    private javax.swing.JButton selectTemp;
    private javax.swing.JButton selectTemps;
    private javax.swing.JPanel selectedTempPnl;
    private javax.swing.JPanel suitableTempspnl;
    private javax.swing.JPanel tempPoolpnl;
    private javax.swing.JTextArea workflowdisplay;
    // End of variables declaration//GEN-END:variables
}