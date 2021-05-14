
package com.Views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author davidf
 * 
 * UTILIZACION DE LA CLASE PARA SETEAR LA JTABLE:
 * 
 * 1-En el lugar donde vaya a ser utilizada la tabla
 *   -CREAR UN OBJETO DE ESTA CLASE, para poder utilizar sus métodos
 *    
 *      #Ejemplo: private JTable_ChangeOptions tModel = new JTable_ChangeOptions();
 *  
 * 2-Cogemos la JTABLE que queremos SETEAR y lo unico que hacemos es decirle que:
 *    -nuestra JTABLE es igual a el metodo "getJTable" de nuestra clase, que retornará una JTABLE configurada y pintada
 *       
 *      #Ejemplo: JTable miJtable = tModel.getJTable();
 * 
 *     (puede que si tenemos JScrollpane, tambien debamos agregar NUESTRA Jtable a el ScrollPane)  
 *      #Ejemplo:  jScrollPane.setViewportView(miJtable);
 * 
 ***************************************************************************** 
 *           ----METODOS PUBLICOS-----
 *      
 *      getJTable() ===> Devuelve el JTable 
 * 
 *      initJTable() ===> RESETEA la JTABLE y deja una nueva lista para ser Solicitada 
 * (En este Método se SE PINTAN LAS CELDAS, se le da ALTURA y EVITAMOS que puedan SER ENFOCADAS)
 * 
 * 
 * 
 * *************************************
 *           ---------METODOS PRIVADOS------
 * 
 *      setJtableHeaders()  =======> Metodo en el que se EDITAN LOS HeaderS(TITULOS) de la JTABLE 
 *          (Se PINTA el Background y foreground de los HEADERS, y AQUI le INDICAMOS que LAS COLUMNAS NO PUEDAN MOVERSE(reordenarse))
 * 
 *      initDefaultTableModel() ===> Metodo que inicializa el "modelo" de la tabla (en este BLOQUEAMOS LA EDICION de las celdas,)
 * 
 * 
 */


public class JTableModel_PAINTandBLOCK {

    private JTableHeader header;
    private JTable table;
    private TableModel model ;
    
    private String[] columnNames = {"String", "Integer", "Float", "Double", "Locale & Double", "Boolean"};
    private Object[][] data = {
        {"aaa", new Integer(12), new Float(12.15), new Double(100.05), new Double(12.05), true},
        {"bbb", new Integer(5), new Float(7.154), new Double(6.1555), new Double(417.55), false},
        {"CCC", new Integer(92), new Float(0.1135), new Double(3.1455), new Double(11.05), true},
        {"ddd", new Integer(12), new Float(31.15), new Double(10.05), new Double(23.05), true},
        {"eee", new Integer(5), new Float(5.154), new Double(16.1555), new Double(17.55), false},
        {"fff", new Integer(92), new Float(4.1135), new Double(31.1455), new Double(3.05), true}};



    public JTableModel_PAINTandBLOCK() {
        
        initDefaultTableModel();
        
        initJtable();
           
        setJtableHeaders();

        //////Necesario estableces el tema de la UI de windows, GTK o Metal, para que se puedan PINTAR LOS HEADERS DE LA TABLA
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    } //Fin del constructor

    
    
 ///////////////////////////////////////////7
    //Inicializando la jtable Y PINTANDO LAS CELDAS    
    public void initJtable() {
        
             table = new JTable(model) {
            
            private static final long serialVersionUID = 1L;    
       
            ///Pintando las CELDAS de la JTABLE    
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);

                if (row % 2 == 0) {
                    ((JComponent) c).setBackground(Color.GREEN);
                } else {
                    ((JComponent) c).setBackground(Color.YELLOW);
                }
                return c;
            }
        };
               
        //Seteando altura de las CELDAS
        table.setRowHeight(40);
        //Seteando que NO puedan ser seleccionadas las celdas
        table.setFocusable(false);
        
    }//Fin de initJtable

    
    
 ///////////////////////////////////////////////
    //Obtener el JTABLE que configuramos aquí para pasarlo al JTABLE que mostraremos
    public JTable getJtable() {

        return this.table;
    }
    
    
    
 //////////////////////////////////////////////////////   
  //INICIALIZANDO EL "MODEL" PARA APLICARLE A LA TABLA
    private void initDefaultTableModel(){
    model = new DefaultTableModel(data, columnNames) {
        private static final long serialVersionUID = 1L;

        @Override
        public Class<?> getColumnClass(int column) {
            return getValueAt(0, column).getClass();
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            // Aquí devolvemos true o false según queramos que una celda
            // identificada por fila,columna (row,column), sea o no editable
            return false;
        }

        
    };
    }//Fin de defaultTableModel

    
    
/////////////////////////////////////////////    
   //PINTANDO EL HEADER(TITULO) DE LA JTABLE 
    private void setJtableHeaders() {
        
        header = table.getTableHeader();

        //Indicandole que las COLUMNAS NO SE MUEVAN
        header.setReorderingAllowed(false);

        //Estableciendo TAMAÑO para los HEADER (titulos) de la JTable
        table.getTableHeader().setPreferredSize(new Dimension(table.getPreferredSize().width, 35));

        final TableCellRenderer hr = table.getTableHeader().getDefaultRenderer();
        header.setDefaultRenderer(new TableCellRenderer() {
            private JLabel lbl;

            @Override
            public Component getTableCellRendererComponent(
                    JTable table, Object value, boolean isSelected, boolean hasFocus,
                    int row, int column) {

                lbl = (JLabel) hr.getTableCellRendererComponent(table, value,
                        false, false, row, column);
                lbl.setBorder(BorderFactory.createCompoundBorder(
                        lbl.getBorder(),
                        BorderFactory.createEmptyBorder(1, 1, 1, 1)));
                lbl.setHorizontalAlignment(SwingConstants.CENTER);
                lbl.setBackground(Color.ORANGE);

                // lbl.setForeground(header.getForeground());
                lbl.setForeground(Color.BLACK);

                /*return (value == selectedColumn) ? hr.getTableCellRendererComponent(
table, value, true, true, row, column) : hr.getTableCellRendererComponent(
table, value, false, false, row, column);*/
                lbl.setOpaque(true);
                return lbl;
            }
        });
        
    }//Fin de setJTableHeaders
    
    
    
}
