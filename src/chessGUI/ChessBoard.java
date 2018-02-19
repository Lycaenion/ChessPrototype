package chessGUI;

import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;
import com.googlecode.lanterna.screen.*;

import java.io.IOException;
import java.nio.charset.Charset;

import java.nio.charset.Charset;

public class ChessBoard {
    public static void main(String[] args) {
        Screen screen = TerminalFacade.createScreen();
        screen.startScreen();
        screen.clear();

        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if((i+j) % 2 == 0 ){
                    screen.putString(j, i, "K", Terminal.Color.WHITE, Terminal.Color.WHITE);
                }else{
                    screen.putString(i, j, "K", Terminal.Color.BLACK, Terminal.Color.BLACK );
                }
            }

        }
        screen.refresh();
    }


}
