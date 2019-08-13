/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoRecemNascido;
import javax.swing.JOptionPane;
import modelo.Recemnascido;


import tela.manutencao.ManutencaoRecemNascido;

/**
 *
 * @author Administrador
 */
public class ControladorRecemNascido {

    public static void inserir(ManutencaoRecemNascido man){
        Recemnascido objeto = new Recemnascido();
        objeto.setNome_mae(man.jtfNomemae.getText());
        objeto.setPeso(Double.parseDouble(man.jtfPeso.getText()));
        objeto.setNumero_quarto(Integer.parseInt(man.jtfNumeroquarto.getText()));
        objeto.setSexo(man.jtfSexo.getText());
        
        boolean resultado = DaoRecemNascido.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoRecemNascido man){
        Recemnascido objeto = new Recemnascido();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome_mae(man.jtfNomemae.getText());
        objeto.setPeso(Double.parseDouble(man.jtfPeso.getText()));
        objeto.setNumero_quarto(Integer.parseInt(man.jtfNumeroquarto.getText()));
        objeto.setSexo(man.jtfSexo.getText());
        
        boolean resultado = DaoRecemNascido.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

     public static void excluir(ManutencaoRecemNascido man){
        Recemnascido objeto = new Recemnascido();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = DaoRecemNascido.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
}
