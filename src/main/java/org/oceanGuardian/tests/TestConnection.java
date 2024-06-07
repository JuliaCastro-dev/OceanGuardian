package org.oceanGuardian.tests;

import org.oceanGuardian.db.databaseContext;

import javax.swing.*;

public class TestConnection {
    public static void main(String[] args) {
        if(databaseContext.getConnection()==null) {
            JOptionPane.showMessageDialog(null, "Erro ao estabelecer conexão");
        }else {
            JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso!");
        }
    }
}
