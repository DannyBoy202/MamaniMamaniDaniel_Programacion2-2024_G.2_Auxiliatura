import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[][] botones = new JButton[3][3];
    private boolean esTurnoDelJugadorUno = true;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setLayout(new GridLayout(3, 3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
                botones[i][j].setFocusPainted(false);
                botones[i][j].addActionListener(this);
                add(botones[i][j]);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botonClickeado = (JButton) e.getSource();
        if (botonClickeado.getText().equals("")) {
            botonClickeado.setText(esTurnoDelJugadorUno ? "X" : "O");
            esTurnoDelJugadorUno = !esTurnoDelJugadorUno;
            verificarGanador();
        }
    }

    private void verificarGanador() {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if (botones[i][0].getText().equals(botones[i][1].getText()) &&
                botones[i][1].getText().equals(botones[i][2].getText()) &&
                !botones[i][0].getText().equals("")) {
                mostrarGanador(botones[i][0].getText());
                return;
            }
            if (botones[0][i].getText().equals(botones[1][i].getText()) &&
                botones[1][i].getText().equals(botones[2][i].getText()) &&
                !botones[0][i].getText().equals("")) {
                mostrarGanador(botones[0][i].getText());
                return;
            }
        }
        // Verificar diagonales
        if (botones[0][0].getText().equals(botones[1][1].getText()) &&
            botones[1][1].getText().equals(botones[2][2].getText()) &&
            !botones[0][0].getText().equals("")) {
            mostrarGanador(botones[0][0].getText());
            return;
        }
        if (botones[0][2].getText().equals(botones[1][1].getText()) &&
            botones[1][1].getText().equals(botones[2][0].getText()) &&
            !botones[0][2].getText().equals("")) {
            mostrarGanador(botones[0][2].getText());
            return;
        }
        // Verificar empate
        boolean hayEmpate = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botones[i][j].getText().equals("")) {
                    hayEmpate = false;
                    break;
                }
            }
        }
        if (hayEmpate) {
            mostrarEmpate();
        }
    }

    private void mostrarGanador(String ganador) {
        JOptionPane.showMessageDialog(this, "¡" + ganador + " ha ganado Papu!");
        reiniciarJuego();
    }

    private void mostrarEmpate() {
        JOptionPane.showMessageDialog(this, "¡Es un empate Cachorro!");
        reiniciarJuego();
    }

    private void reiniciarJuego() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setText("");
            }
        }
        esTurnoDelJugadorUno = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicTacToe juego = new TicTacToe();
            juego.setVisible(true);
        });
    }
}
