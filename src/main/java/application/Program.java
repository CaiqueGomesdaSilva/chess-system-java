/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;

/**
 *
 * @author Caiqu
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
            
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }

    }
}
