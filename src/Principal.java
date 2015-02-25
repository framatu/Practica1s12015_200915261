/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maza
 */
public class Principal extends javax.swing.JFrame {

    public static class jugadores{
        String nombre;
        Integer cantidad;
        Integer tipo;
        externalParameters parametros;
        jugadores siguiente;
    }
    
    public static class externalParameters{
        String key;
        String value;
        externalParameters siguiente;
        
    }
    public static class objetoPlantaZombie{
        Integer indice;
        String nombre;
        String imagen;
        Integer ataque;
        Integer defensa;
        Integer tipoAtaque;

        objetoPlantaZombie siguiente;
    }
    
    static jugadores jugador=null;
    static externalParameters parametros;
    static objetoPlantaZombie plantas=null;
    static objetoPlantaZombie zombies=null;
    static Integer sequence=0;
    
    public static void add_jugador(jugadores cab,externalParameters parametros,String nombre,String cantidad,Integer tipo){
        jugadores nuevo,copia;
        nuevo = new jugadores();
        nuevo.nombre = nombre;
        nuevo.cantidad=Integer.parseInt(cantidad);
        nuevo.parametros=parametros;
        nuevo.tipo=tipo;
        nuevo.siguiente = null;
        if(cab == null)
            cab = nuevo;
        else{
            copia = cab;
            while(copia.siguiente!=null){
                copia = copia.siguiente;
            }
            copia.siguiente = nuevo;
        }
        jugador=cab;
    }
    
    public static void add_parametros(externalParameters cab,String key,String value){
        externalParameters nuevo,copia;
        nuevo = new externalParameters();
        nuevo.key=key;
        nuevo.value=value;
        nuevo.siguiente = null;
        if(cab == null)
            cab = nuevo;
        else{
            copia = cab;
            while(copia.siguiente!=null){
                copia = copia.siguiente;
            }
            copia.siguiente = nuevo;
        }
        parametros=cab;
    }
    
    public static void listado(objetoPlantaZombie cab){
        while(cab != null){ 
            cab=cab.siguiente;
        }
    }
    
    public static void listadoPlayers(jugadores cab){
        while(cab != null){
            System.out.println("------Jugador------");
            System.out.println(cab.nombre);
            System.out.println(cab.cantidad);
            externalParameters parametros = cab.parametros;
            while(parametros!=null){
                System.out.println("------Parametros------");
                System.out.println(parametros.key);
                System.out.println(parametros.value);
                
                parametros=parametros.siguiente;
            }
            cab=cab.siguiente;
        }
    }
    
    public static void add_planta(objetoPlantaZombie cab,Integer indice, String nombre,String imagen,Integer defensa,Integer ataque,Integer tipoAtaque){
        objetoPlantaZombie nuevo,copia;
        nuevo = new objetoPlantaZombie();
        nuevo.indice=indice;
        nuevo.nombre=nombre;
        nuevo.imagen=imagen;
        nuevo.ataque=ataque;
        nuevo.defensa=defensa;
        nuevo.tipoAtaque=tipoAtaque;
        nuevo.siguiente = null;
        if(cab == null)
            cab = nuevo;
        else{
            copia = cab;
            while(copia.siguiente!=null){
                copia = copia.siguiente;
            }
            copia.siguiente = nuevo;
        }
        sequence++;
        plantas=cab;
    }
    
    public static void add_zombie(objetoPlantaZombie cab,Integer indice, String nombre,String imagen,Integer defensa,Integer ataque,Integer tipoAtaque){
        objetoPlantaZombie nuevo,copia;
        nuevo = new objetoPlantaZombie();
        nuevo.indice=indice;
        nuevo.nombre=nombre;
        nuevo.imagen=imagen;
        nuevo.ataque=ataque;
        nuevo.defensa=defensa;
        nuevo.tipoAtaque=tipoAtaque;
        nuevo.siguiente = null;
        if(cab == null)
            cab = nuevo;
        else{
            copia = cab;
            while(copia.siguiente!=null){
                copia = copia.siguiente;
            }
            copia.siguiente = nuevo;
        }
        sequence++;
        zombies=cab;
    }
    
    public static String[] vectorObject(objetoPlantaZombie lista){
        String[] array = new String[100];
        Integer indice=0;
        while(lista != null){
            array[indice]=lista.nombre;
            indice++;
            lista=lista.siguiente;
        }
        return array;
    }
    
    public static objetoPlantaZombie findObject(objetoPlantaZombie lista,String nombre){
        while(lista !=null){
            if(lista.nombre.equalsIgnoreCase(nombre)){
                return lista;
            }
            lista=lista.siguiente;
        }
        return null;
    }
    
    public static void editObject(objetoPlantaZombie lista,Integer indice, String nombre,String imagen,Integer defensa,Integer ataque,Integer tipoAtaque){
        objetoPlantaZombie copia = lista;
        objetoPlantaZombie anterior = new objetoPlantaZombie();
        while(copia!=null){
            if(copia.indice==indice){
                objetoPlantaZombie nuevo = new objetoPlantaZombie();
                nuevo.indice=indice;
                nuevo.nombre=nombre;
                nuevo.imagen=imagen;
                nuevo.ataque=ataque;
                nuevo.defensa=defensa;
                nuevo.tipoAtaque=tipoAtaque;
                if(anterior==null){
                    nuevo.siguiente=copia.siguiente;
                    zombies=nuevo;
                }else{
                    anterior.siguiente=nuevo;
                    nuevo.siguiente=copia.siguiente;
                    zombies=lista;
                }
            }
            anterior=copia;
            copia=copia.siguiente;
            
        }
        
    }


    
    
    
    
    
    
    
    
    
    /**
     * Creates new form NewJFrame
     */
    public Principal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Inicio");

        jMenuItem1.setText("Configuraciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Configuraciones config = new Configuraciones();
        config.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
