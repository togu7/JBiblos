/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VistaGFichaTitulo.java
 *
 * Created on 26-nov-2011, 17:38:02
 */
package Vista;

import HBM.Autor;
import HBM.Dewey;
import HBM.Titulo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nanohp
 */
public class VistaGFichaTitulo extends javax.swing.JInternalFrame implements GestionarModelo {

    Titulo titulo;
    List<Dewey> listaCategoriasDewey;
    AutoresTableModel autoresTableModel;

    /** Creates new form VistaGFichaTitulo */
    public VistaGFichaTitulo(List<Dewey> listaCategoriasDewey) {
        this.listaCategoriasDewey = listaCategoriasDewey;
        initComponents();
        inicializaComponentesPropios();
    }

    private void inicializaComponentesPropios() {
        jComboBoxCodDewey.addItem("Seleccione categoría");
        for (Dewey dewey : listaCategoriasDewey) {
            //jComboBoxCodDewey.addItem(dewey.getCategoriaDewey() + " - " + dewey.getNombreCategoriaDewey());
            jComboBoxCodDewey.addItem(dewey.toString());
        }
    }

    public void setTitulo(Titulo titulo) {
        jTextFieldNombre.setText(titulo.getNombreTitulo());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAutores = new javax.swing.JTable();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCodTitulo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSinopsis = new javax.swing.JTextArea();
        jComboBoxCodDewey = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ficha título");

        jLabel2.setText("Titulo");

        jLabel3.setText("Autores");

        jTableAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Apellidos", "Autor"
            }
        ));
        jScrollPane1.setViewportView(jTableAutores);

        jTextFieldNombre.setColumns(30);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldCodTitulo.setColumns(3);

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Dewey");

        jTextFieldCodAutor.setColumns(3);

        jLabel5.setText("Sinopsis");

        jTextAreaSinopsis.setColumns(20);
        jTextAreaSinopsis.setLineWrap(true);
        jTextAreaSinopsis.setRows(5);
        jTextAreaSinopsis.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextAreaSinopsis);

        jComboBoxCodDewey.setModel(new javax.swing.DefaultComboBoxModel());

        jButton1.setText("Moficar");

        jButton3.setText("Borrar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addComponent(jComboBoxCodDewey, 0, 247, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxCodDewey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton2)))
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBoxCodDewey;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAutores;
    private javax.swing.JTextArea jTextAreaSinopsis;
    private javax.swing.JTextField jTextFieldCodAutor;
    private javax.swing.JTextField jTextFieldCodTitulo;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    // Implementacion de los metodos de 'GestionarModelo'
    @Override
    public void fijarModelo(Object object) {
        this.titulo = (Titulo) object;

        //ArrayList<Dewey> lista = new ArrayList<Dewey>();
        //lista.add(titulo.getDewey());
        this.setTitle("Ficha título: " + titulo.getNombreTitulo());
        jComboBoxCodDewey.setSelectedItem(titulo.getDewey().toString());

        //jTextFieldCodDewey.setText(new Short(titulo.getId().getDeweyCategoriaDewey()).toString());
        jTextFieldCodAutor.setText(titulo.getId().getIdApellido());
        jTextFieldCodTitulo.setText(titulo.getId().getIdTitulo());
        jTextFieldNombre.setText(titulo.getNombreTitulo());
        jTextAreaSinopsis.setText(titulo.getSinopsis());
        autoresTableModel = new AutoresTableModel(titulo.getAutors());
        jTableAutores.setModel(autoresTableModel);
    }

    @Override
    public Object obtenerModelo() {
        return titulo;
    }

    @Override
    public void limpiarModelo() {
        titulo = null;
        jTextFieldCodAutor.setText("");
        jTextFieldCodTitulo.setText("");
        jTextFieldNombre.setText("");
        jTextFieldNombre.setText("");
        jTextAreaSinopsis.setText("");
        jComboBoxCodDewey.setSelectedIndex(1);
    }
    
    @Override
    public void setEditable(boolean setEditable) {
        jTextFieldCodAutor.setEditable(setEditable);
        jTextFieldCodTitulo.setEditable(setEditable);
        jTextFieldNombre.setEditable(setEditable);
        jTextFieldNombre.setEditable(setEditable);
        jTextAreaSinopsis.setEditable(setEditable);
    }

    public void setModo(String modo) {
        
        if (modo.equals("mostrar")) {
            setEditable(false);
            jButton2.setText("Ok");
        } else if (modo.equals("alta")) {
            titulo = null;
            limpiarModelo();
            setEditable(true);
            setTitle("Alta de titulo");
            jButton2.setText("Alta");
        } else if (modo.equals("modificar")) {
            setEditable(true);
            setTitle("Modificación de titulo");
            jButton2.setText("Guardar");
        } else if (modo.equals("borrar")) {
            setEditable(false);
            setTitle("Eliminación de titulo");
            
        }
    }

    class AutoresTableModel extends DefaultTableModel {
        boolean editable = false;
        Object[] encabezado = {"Apellidos", "Nombre"};
        private Set<Autor> autores = new HashSet<Autor>();

        public AutoresTableModel(Set<Autor> autores) {

            super();
            this.autores = autores;
            Object data[][] = new Object[autores.size()][encabezado.length];

            int i = 0;
            String apellidos = "";
            for (Autor autor : autores) {
                // Extraemos los apellidos
                apellidos += autor.getApellido1Autor() == null ? "" : autor.getApellido1Autor();
                apellidos += autor.getApellido2Autor() == null ? "" : " " + autor.getApellido2Autor();
                data[i][0] = apellidos;

                // Extraemos el nombre
                data[i][1] = autor.getNombreAutor() == null ? "SIN AUTOR" : autor.getNombreAutor();
                i++;
            }

            setDataVector(data, encabezado);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (!editable) {
                return false;
            } else {
                return super.isCellEditable(row, column);
            }
        }

        public void addAutor(Autor autor) {
            autores.add(autor);
        }

        public boolean isEditable() {
            return editable;
        }

        public void setEditableInner(boolean editable) {
            this.editable = editable;
        }
    }
}
