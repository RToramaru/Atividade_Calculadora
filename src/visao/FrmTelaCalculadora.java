package visao;

import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;

/**
 *
 * Autor : Rafael Almeida Soares Curso : Bacharelado em Sistemas de Informação
 * Disciplina : Programação Orientada a Objetos I Descrição : Calculadora para
 * cálculos matemáticos feita com base na calculadora google que tem como
 * utilização a realização de expressões usando a ordem de precedência e caso
 * ocorra a divisão por zero o resultado é infinity
 */
public class FrmTelaCalculadora extends javax.swing.JFrame {

    private String equacao = "";
    private String stringEquacao = "";
    private String parte = "";
    private boolean porcentagem = false;
    private boolean operacao = true;
    private boolean negativo = false;
    private boolean virgula = false;
    private boolean igual = false;
    private boolean bit = false;

    public FrmTelaCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfTelaEquacao = new javax.swing.JTextField();
        tfTelaResultado = new javax.swing.JTextField();
        btnAC = new javax.swing.JButton();
        btnNegativo = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().setLayout(null);

        tfTelaEquacao.setEditable(false);
        tfTelaEquacao.setBackground(new java.awt.Color(255, 255, 255));
        tfTelaEquacao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tfTelaEquacao.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfTelaEquacao.setBorder(null);
        tfTelaEquacao.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfTelaEquacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(tfTelaEquacao);
        tfTelaEquacao.setBounds(30, 30, 240, 30);

        tfTelaResultado.setEditable(false);
        tfTelaResultado.setBackground(new java.awt.Color(255, 255, 255));
        tfTelaResultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tfTelaResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfTelaResultado.setCaretColor(new java.awt.Color(255, 255, 255));
        tfTelaResultado.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfTelaResultado.setSelectedTextColor(new java.awt.Color(153, 153, 153));
        tfTelaResultado.setSelectionColor(new java.awt.Color(255, 255, 255));
        tfTelaResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(tfTelaResultado);
        tfTelaResultado.setBounds(25, 25, 255, 75);

        btnAC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAC.setText("AC");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });
        btnAC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btnAC);
        btnAC.setBounds(25, 115, 60, 35);

        btnNegativo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnNegativo.setText("+/-");
        btnNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoActionPerformed(evt);
            }
        });
        btnNegativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btnNegativo);
        btnNegativo.setBounds(90, 112, 60, 38);

        btnPorcentagem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPorcentagem.setText("%");
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });
        btnPorcentagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btnPorcentagem);
        btnPorcentagem.setBounds(155, 112, 60, 38);

        btnDivisao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnDivisao.setText("÷");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        btnDivisao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btnDivisao);
        btnDivisao.setBounds(220, 112, 60, 38);

        btn8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        btn8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(90, 168, 60, 38);

        btn7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        btn7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(25, 168, 60, 38);

        btn9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        btn9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(155, 168, 62, 38);

        btnMultiplicacao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnMultiplicacao.setText("X");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });
        btnMultiplicacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btnMultiplicacao);
        btnMultiplicacao.setBounds(222, 168, 60, 38);

        btn4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(25, 217, 60, 35);

        btn5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        btn5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(90, 217, 60, 35);

        btn6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        btn6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(155, 217, 62, 35);

        btnSubtracao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSubtracao.setText("-");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });
        btnSubtracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btnSubtracao);
        btnSubtracao.setBounds(222, 217, 60, 35);

        btn1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(25, 263, 60, 35);

        btn2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(90, 263, 60, 35);

        btn3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(155, 263, 62, 35);

        btnSoma.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });
        btnSoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btnSoma);
        btnSoma.setBounds(222, 263, 60, 35);

        btn0.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        btn0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(25, 303, 125, 35);

        btnVirgula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVirgula.setText(",");
        btnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgulaActionPerformed(evt);
            }
        });
        btnVirgula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btnVirgula);
        btnVirgula.setBounds(155, 303, 62, 35);

        btnIgual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        btnIgual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teclado(evt);
            }
        });
        getContentPane().add(btnIgual);
        btnIgual.setBounds(222, 303, 60, 35);

        setSize(new java.awt.Dimension(317, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        virgula = false;
        negativo = false;
        porcentagem = false;
        operacao = false;
        parte += "0";
        stringEquacao += "0";
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgulaActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        if (parte.isEmpty() || (parte.length() == 1 && negativo)) {
            parte += "0.";
            stringEquacao += "0,";
        } else {
            parte += ".";
            stringEquacao += ",";
        }
        virgula = true;
        negativo = false;
        porcentagem = false;
        operacao = false;
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btnVirgulaActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        virgula = false;
        negativo = false;
        porcentagem = false;
        operacao = false;
        parte += "1";
        stringEquacao += "1";
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        virgula = false;
        negativo = false;
        porcentagem = false;
        operacao = false;
        parte += "2";
        stringEquacao += "2";
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        virgula = false;
        negativo = false;
        porcentagem = false;
        operacao = false;
        parte += "3";
        stringEquacao += "3";
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        virgula = false;
        negativo = false;
        porcentagem = false;
        operacao = false;
        parte += "4";
        stringEquacao += "4";
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        virgula = false;
        negativo = false;
        porcentagem = false;
        operacao = false;
        parte += "5";
        stringEquacao += "5";
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        virgula = false;
        negativo = false;
        porcentagem = false;
        operacao = false;
        parte += "6";
        stringEquacao += "6";
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        virgula = false;
        negativo = false;
        porcentagem = false;
        operacao = false;
        parte += "7";
        stringEquacao += "7";
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        virgula = false;
        negativo = false;
        porcentagem = false;
        operacao = false;
        parte += "8";
        stringEquacao += "8";
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (igual) {
            equacao = "";
            parte = "";
            stringEquacao = "";
        }
        virgula = false;
        negativo = false;
        porcentagem = false;
        operacao = false;
        parte += "9";
        stringEquacao += "9";
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        igual = false;
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        if (virgula) {

        } else if (parte.isEmpty() && equacao.isEmpty()) {

        } else if (parte.length() == 1 && negativo && equacao.isEmpty()) {

        } else if (equacao.length() == 1) {
            if (operacao) {
                equacao = "";
                stringEquacao = "";
                parte = "";
            }
        } else if (!parte.isEmpty() && equacao.isEmpty() && negativo) {
            stringEquacao += "+";
            parte += "+";
            equacao += parte;
        } else {
            if (operacao) {
                stringEquacao = stringEquacao.substring(0, stringEquacao.length() - 1);
                stringEquacao += "+";
                equacao = equacao.substring(0, equacao.length() - 1);
                equacao += "+";

            } else if (porcentagem) {
                stringEquacao = stringEquacao.substring(0, stringEquacao.length() - 1);
                stringEquacao += "+";
                equacao = equacao.substring(0, equacao.length() - 5);
                equacao += "+";

            } else {
                stringEquacao += "+";
                parte += "+";
                equacao += parte;
            }
        }
        parte = "";
        bit = false;
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        negativo = false;
        operacao = true;
        igual = false;
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        if (virgula) {

        } else if (parte.isEmpty() && equacao.isEmpty()) {

        } else if (parte.length() == 1 && negativo && equacao.isEmpty()) {

        } else if (equacao.length() == 1) {
            if (operacao) {
                equacao = "";
                stringEquacao = "";
                parte = "";
            }
        } else if (!parte.isEmpty() && equacao.isEmpty() && negativo) {
            stringEquacao += "-";
            parte += "-";
            equacao += parte;
        } else {
            if (operacao) {
                stringEquacao = stringEquacao.substring(0, stringEquacao.length() - 1);
                stringEquacao += "-";
                equacao = equacao.substring(0, equacao.length() - 1);
                equacao += "-";

            } else if (porcentagem) {
                stringEquacao = stringEquacao.substring(0, stringEquacao.length() - 1);
                stringEquacao += "-";
                equacao = equacao.substring(0, equacao.length() - 5);
                equacao += "-";

            } else {
                stringEquacao += "-";
                parte += "-";
                equacao += parte;
            }
        }
        parte = "";
        bit = false;
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        negativo = false;
        operacao = true;
        igual = false;
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        if (virgula) {

        } else if (parte.isEmpty() && equacao.isEmpty()) {

        } else if (parte.length() == 1 && negativo && equacao.isEmpty()) {

        } else if (equacao.length() == 1) {
            if (operacao) {
                equacao = "";
                stringEquacao = "";
                parte = "";
            }
        } else if (!parte.isEmpty() && equacao.isEmpty() && negativo) {
            stringEquacao += "X";
            parte += "*";
            equacao += parte;
        } else {
            if (operacao) {
                stringEquacao = stringEquacao.substring(0, stringEquacao.length() - 1);
                stringEquacao += "X";
                equacao = equacao.substring(0, equacao.length() - 1);
                equacao += "*";

            } else if (porcentagem) {
                stringEquacao = stringEquacao.substring(0, stringEquacao.length() - 1);
                stringEquacao += "X";
                equacao = equacao.substring(0, equacao.length() - 5);
                equacao += "*";

            } else {
                stringEquacao += "X";
                parte += "*";
                equacao += parte;
            }
        }
        parte = "";
        bit = false;
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        negativo = false;
        operacao = true;
        igual = false;
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        if (virgula) {
        } else if (parte.isEmpty() && equacao.isEmpty()) {

        } else if (parte.length() == 1 && negativo && equacao.isEmpty()) {

        } else if (equacao.length() == 1) {
            if (operacao || negativo) {
                equacao = "";
                stringEquacao = "";
                parte = "";
            }
        } else if (!parte.isEmpty() && equacao.isEmpty() && negativo) {
            stringEquacao += "÷";
            parte += "/";
            equacao += parte;
        } else {
            if (operacao) {
                stringEquacao = stringEquacao.substring(0, stringEquacao.length() - 1);
                stringEquacao += "÷";
                equacao = equacao.substring(0, equacao.length() - 1);
                equacao += "/";

            } else if (porcentagem) {
                stringEquacao = stringEquacao.substring(0, stringEquacao.length() - 1);
                stringEquacao += "÷";
                equacao = equacao.substring(0, equacao.length() - 5);
                equacao += "/";

            } else {
                stringEquacao += "÷";
                parte += "/";
                equacao += parte;
            }
        }
        parte = "";
        bit = false;
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        negativo = false;
        operacao = true;
        igual = false;
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed
        if (bit) {
            if (equacao.isEmpty()) {
                parte = parte.substring(1, parte.length());
                parte = parte.replaceAll("-", "");
                parte = parte.replaceAll(Pattern.quote("+"), "");
                parte = "+" + parte;
                stringEquacao = parte;
            } else {
                equacao += parte;
                if (equacao.charAt(equacao.length() - parte.length() - 1) == '-') {
                    equacao = equacao.substring(0, equacao.length() - parte.length() - 1);
                    stringEquacao = stringEquacao.substring(0, stringEquacao.length() - parte.length() - 1);
                    parte = parte.replaceAll("-", "");
                    parte = parte.replaceAll(Pattern.quote("+"), "");
                    parte = "+" + parte;
                    stringEquacao += parte;

                } else if (equacao.charAt(equacao.length() - parte.length() - 1) == '+') {
                    equacao = equacao.substring(0, equacao.length() - parte.length() - 1);
                    stringEquacao = stringEquacao.substring(0, stringEquacao.length() - parte.length() - 1);
                    parte = parte.replaceAll("-", "");
                    parte = parte.replaceAll(Pattern.quote("+"), "");
                    parte = "-" + parte;
                    stringEquacao += parte;
                } else {
                    equacao = equacao.substring(0, equacao.length() - parte.length());
                    stringEquacao = stringEquacao.substring(0, stringEquacao.length() - parte.length());
                    parte = parte.replaceAll("-", "");
                    parte = parte.replaceAll(Pattern.quote("+"), "");
                    parte = "+" + parte;
                    stringEquacao += parte;
                }
            }
            bit = false;
        } else {
            if (equacao.isEmpty()) {
                parte = parte.replaceAll("-", "");
                parte = parte.replaceAll(Pattern.quote("+"), "");
                parte = "-" + parte;
                stringEquacao = parte;
            } else {
                equacao += parte;
                if (equacao.charAt(equacao.length() - parte.length() - 1) == '-') {
                    equacao = equacao.substring(0, equacao.length() - parte.length() - 1);
                    stringEquacao = stringEquacao.substring(0, stringEquacao.length() - parte.length() - 1);
                    parte = parte.replaceAll("-", "");
                    parte = parte.replaceAll(Pattern.quote("+"), "");
                    parte = "+" + parte;
                    stringEquacao += parte;
                } else if (equacao.charAt(equacao.length() - parte.length() - 1) == '+') {
                    equacao = equacao.substring(0, equacao.length() - parte.length() - 1);
                    stringEquacao = stringEquacao.substring(0, stringEquacao.length() - parte.length() - 1);
                    parte = parte.replaceAll("-", "");
                    parte = parte.replaceAll(Pattern.quote("+"), "");
                    parte = "-" + parte;
                    stringEquacao += parte;
                } else {
                    equacao = equacao.substring(0, equacao.length() - parte.length());
                    stringEquacao = stringEquacao.substring(0, stringEquacao.length() - parte.length());
                    parte = parte.replaceAll("-", "");
                    parte = parte.replaceAll(Pattern.quote("+"), "");
                    parte = "-" + parte;
                    stringEquacao += parte;
                }
            }
            bit = true;
        }
        igual = false;
        negativo = true;
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
    }//GEN-LAST:event_btnNegativoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        if (virgula) {

        } else if (operacao && !porcentagem) {

        } else if (negativo && parte.length() == 1 && equacao.isEmpty()) {

        } else {
            if (equacao.isEmpty() && parte.isEmpty()) {

            } else {
                if (porcentagem) {
                    equacao = equacao.substring(0, equacao.length() - 1);
                }
                equacao += parte;
                ScriptEngineManager factory = new ScriptEngineManager();
                ScriptEngine engine = factory.getEngineByName("JavaScript");
                Object obj;
                try {
                    obj = engine.eval(equacao);
                    tfTelaResultado.setText(obj.toString());
                    stringEquacao = obj.toString();
                    tfTelaEquacao.setText(stringEquacao);
                    tfTelaEquacao.setText(stringEquacao);
                    equacao = "";
                    parte = obj.toString();
                } catch (ScriptException ex) {
                    JOptionPane.showMessageDialog(this, "Equação impossível de ser resolvida", "ERROR", JOptionPane.ERROR);
                }
                virgula = false;
                negativo = false;
                porcentagem = false;
                operacao = false;
                igual = true;
                bit = false;
            }
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentagemActionPerformed
        if (virgula) {

        } else if (equacao.isEmpty() && parte.isEmpty()) {

        } else if (parte.length() == 1 && negativo && equacao.isEmpty()) {

        } else if (equacao.length() == 1) {
            if (operacao || negativo) {
                equacao = "";
                stringEquacao = "";
                parte = "";
            }
        } else if (!parte.isEmpty() && equacao.isEmpty() && negativo) {
            parte += "/100*";
            equacao += parte;
            stringEquacao += "%";
        } else {
            if (operacao) {
                stringEquacao = stringEquacao.substring(0, stringEquacao.length() - 1);
                stringEquacao += "%";
                equacao = equacao.substring(0, equacao.length() - 1);
                equacao += "/100*";
            } else if (porcentagem) {
                stringEquacao = stringEquacao.substring(0, stringEquacao.length() - 1);
                stringEquacao += "%";
                equacao = equacao.substring(0, equacao.length() - 5);
                equacao += "/100*";
            } else {
                stringEquacao += "%";
                parte += "/100*";
                equacao += parte;
            }
        }
        parte = "";
        bit = false;
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        negativo = false;
        operacao = true;
        porcentagem = true;
        igual = false;
    }//GEN-LAST:event_btnPorcentagemActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        parte = "";
        equacao = "";
        stringEquacao = "";
        bit = false;
        tfTelaEquacao.setText(stringEquacao);
        tfTelaResultado.setText(parte);
        negativo = false;
        operacao = false;
        porcentagem = false;
        virgula = false;
        igual = false;
    }//GEN-LAST:event_btnACActionPerformed

    private void teclado(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teclado
        java.awt.event.ActionEvent evt2 = null;
        if (evt.getKeyCode() == KeyEvent.VK_NUMPAD0) {
            btn0ActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_NUMPAD1) {
            btn1ActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_NUMPAD2) {
            btn2ActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_NUMPAD3) {
            btn3ActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_NUMPAD4) {
            btn4ActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_NUMPAD5) {
            btn5ActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_NUMPAD6) {
            btn6ActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_NUMPAD7) {
            btn7ActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_NUMPAD8) {
            btn8ActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_NUMPAD9) {
            btn9ActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_DECIMAL) {
            btnVirgulaActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIgualActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_ADD) {
            btnSomaActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_SUBTRACT) {
            btnSubtracaoActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            btnMultiplicacaoActionPerformed(evt2);
        } else if (evt.getKeyCode() == KeyEvent.VK_DIVIDE) {
            btnDivisaoActionPerformed(evt2);
        }
    }//GEN-LAST:event_teclado

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
            java.util.logging.Logger.getLogger(FrmTelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnNegativo;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JTextField tfTelaEquacao;
    private javax.swing.JTextField tfTelaResultado;
    // End of variables declaration//GEN-END:variables

}
