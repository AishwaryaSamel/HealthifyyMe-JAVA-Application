/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.utilities;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Sriram
 */
public class tableHeaderColors extends DefaultTableCellRenderer {
    public tableHeaderColors() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable myTable, Object value, boolean selected, boolean focused, int row, int column) {
        super.getTableCellRendererComponent(myTable, value, selected, focused, row, column);
        setBackground(new java.awt.Color(80,80,82));
        setForeground(new java.awt.Color(255, 255, 255));
        myTable.setFillsViewportHeight(true);
        setBorder(BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        myTable.setShowGrid(true);
        TableCellRenderer rendererFromHeader = myTable.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        return this;
    }
    
}
