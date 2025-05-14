package apresentacao;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

// Classe Painel que estende JPanel para desenhar gráficos personalizados
public class Painel extends JPanel {
    private static final long serialVersionUID = 1L; // Identificador para serialização

    // Método sobrescrito que é chamado automaticamente para desenhar componentes gráficos
    public void paintComponent(Graphics g) {
        // Desenha uma linha diagonal do ponto (100, 100) até (200, 200)
        g.drawLine(100, 100, 200, 200);
        
        // Desenha uma linha horizontal do ponto (100, 300) até (300, 300)
        g.drawLine(100, 300, 300, 300);
        
        // Define a cor para o "céu" e preenche um retângulo no topo da tela
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 1024, 500);
        
        // Define a cor para a "grama" e preenche um retângulo na parte inferior da tela
        g.setColor(Color.green);
        g.fillRect(0, 500, 1024, 268);
        
        // Desenha o "sol" usando dois círculos preenchidos (uma camada laranja e uma amarela menor por cima)
        g.setColor(Color.orange);
        g.fillOval(800, 70, 100, 100);
        g.setColor(Color.yellow);
        g.fillOval(810, 80, 80, 80);
        
        // Desenha uma "casa" como um retângulo rosa
        g.setColor(Color.pink);
        g.fillRect(200, 350, 200, 200);
        
        // Define os pontos X e Y para desenhar o telhado da casa como um triângulo
        int[] xPoints = {200, 300, 400}; // Coordenadas X dos vértices do triângulo
        int[] yPoints = {350, 250, 350}; // Coordenadas Y dos vértices do triângulo
        
        // Define a cor vermelha para o telhado e desenha o polígono preenchido
        g.setColor(Color.red);
        g.fillPolygon(xPoints, yPoints, 3);
        
        // Desenha um "boneco" com um círculo magenta para a cabeça
        g.setColor(Color.magenta);
        g.fillOval(610, 300, 60, 60);
        
        // Desenha uma linha (possivelmente parte do corpo ou braço do boneco)
        g.drawLine(540, 330, 590, 560);
    }
}
