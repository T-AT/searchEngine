/**
 *  FontGenerator5Pixel
 *  Copyright 2005 by Michael Christen
 *  First released 31.10.2005 at http://yacy.net
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *  
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program in the file lgpl21.txt
 *  If not, see <http://www.gnu.org/licenses/>.
 */

package net.yacy.visualization;

public class FontGenerator5Pixel { 

/*
?0x20: !"#$%&'
0x28:()*+,-./
0x30:01234567
0x38:89:;<=>?
0x40:@ABCDEFG
0x48:HIJKLMNO
0x50:PQRSTUVW
0x58:XYZ[\]^_
0x60:`abcdefg
0x68:hijklmno
0x70:pqrstuvw
0x78:xyz{|}~
*/

    private static final String[][] font =
        {
            {".....", //0x20
             ".....",
             ".....",
             ".....",
             "....."},
            {"..X..",
             "..X..",
             "..X..",
             ".....",
             "..X.."},
            {".X.X.",
             ".X.X.",
             ".....",
             ".....",
             "....."},
            {".X.X.",
             "XXXXX",
             ".X.X.",
             "XXXXX",
             ".X.X."},
            {"+XXXX",
             "X.X..",
             "+XXX+",
             "..X.X",
             "XXXX+"},
            {".X..X",
             "X.XX.",
             ".XXX.",
             ".XX.X",
             "X..X."},
            {"+XXX.",
             "X+...",
             "+X+X.",
             "X.X+.",
             "+X+X."},
            {"..X..",
             "..X..",
             ".....",
             ".....",
             "....."},
            {"....X", //0x28
             "...X+",
             "...X.",
             "...X+",
             "....X"},
            {"X....",
             "+X...",
             ".X...",
             "+X...",
             "x...."},
            {".....",
             ".X.X.",
             "++X++",
             ".x.X.",
             "....."},
            {".....",
             "..X..",
             ".XXX.",
             "..X..",
             "....."},
            {".....",
             ".....",
             "..X..",
             ".+X..",
             ".X..."},
            {".....",
             ".....",
             ".XXX.",
             ".....",
             "....."},
            {".....",
             ".....",
             ".....",
             ".....",
             "..X.."},
            {"....X",
             "...X+",
             "..X+.",
             ".X+..",
             "X+..."},
            {".XXX.", //0x30
             "X+.XX",
             "X.X.X",
             "XX.+X",
             ".XXX."},
            {"..X..",
             ".XX..",
             "..X..",
             "..X..",
             ".XXX."},
            {".XXX.",
             "X+.+X",
             ".+XX+",
             "+X+..",
             "XXXXX"},
            {".XXX.",
             "X+.+X",
             "...X+",
             "X+.+X",
             ".XXX."},
            {".+XX.",
             "+X+X.",
             "XXXXX",
             "...X.",
             "...X."},
            {"XXXXX",
             "X....",
             "XXXX.",
             "...+X",
             "XXXX."},
            {".XXX.",
             "X+...",
             "XXXX+",
             "X+.+X",
             ".XXX."},
            {"XXXXX",
             "..+X+",
             "..X+.",
             "..X..",
             "..X.."},
            {".XXX.", //0x38
             "X+.+X",
             "+XXX.",
             "X+.+X",
             ".XXX."},
            {".XXX.",
             "X+.+X",
             "+XXXX",
             "...+X",
             ".XXX."},
            {".....",
             "..X..",
             ".....",
             "..X..",
             "....."},
            {".....",
             "..X..",
             ".....",
             ".+X..",
             ".X..."},
            {"...X+",
             "..X+.",
             ".X+..",
             "..X+.",
             "...X+"},
            {".....",
             "XXXXX",
             ".....",
             "XXXXX",
             "....."},
            {"+X...",
             ".+X..",
             "..+X.",
             ".+X..",
             "+X..."},
            {".XXX.",
             "..+X.",
             "..X..",
             ".....",
             "..X.."},
            {"+XXX+", //0x40
             "XXX.X",
             "X+XX+",
             "X+...",
             ".XXX."},
            {".+X+.",
             "+X+X+",
             "X+.+X",
             "XXXXX",
             "X...X"},
            {"XXX+.",
             "X.+X.",
             "XXXX+",
             "X..+X",
             "XXXX."},
            {".XXX.",
             "X+...",
             "X....",
             "X+...",
             ".XXX."},
            {"XXXX.",
             "X..+X",
             "X...X",
             "X..+X",
             "XXXX."},
            {"XXXXX",
             "X....",
             "XXX..",
             "X....",
             "XXXXX"},
            {"XXXXX",
             "X....",
             "XXX..",
             "X....",
             "X...."},
            {".XXX.",
             "X+...",
             "X.XXX",
             "X..+X",
             ".XXX."},
            {"X...X", //0x48
             "X...X",
             "XXXXX",
             "X...X",
             "X...X"},
            {"XXXXX",
             "..X..",
             "..X..",
             "..X..",
             "XXXXX"},
            {"XXXXX",
             "....X",
             "....X",
             "X+.+X",
             ".XXX."},
            {"X..+X",
             "X.+X.",
             "XXX..",
             "X.+X.",
             "X..+X"},
            {"X....",
             "X....",
             "X....",
             "X....",
             "XXXXX"},
            {"X...X",
             "XX.XX",
             "X+X+X",
             "X.+.X",
             "X...X"},
            {"X+..X",
             "XX+.X",
             "X+X+X",
             "X.+XX",
             "X..+X"},
            {".XXX.",
             "X+.+X",
             "X...X",
             "X+.+X",
             ".XXX."},
            {"XXXX.", //0x50
             "X..+X",
             "XXXX.",
             "X....",
             "X...."},
            {".XXX.",
             "X+.+X",
             "X.X+X",
             "X++X+",
             ".XX+X"},
            {"XXXX.",
             "X..+X",
             "XXXX.",
             "X.+X.",
             "X..+X"},
            {".XXX+",
             "X+...",
             ".XXX.",
             "...+X",
             "+XXX."},
            {"XXXXX",
             "..X..",
             "..X..",
             "..X..",
             "..X.."},
            {"X...X",
             "X...X",
             "X...X",
             "X+.+X",
             ".XXX."},
            {"X...X",
             "X...X",
             "X+.+X",
             ".X+X.",
             "..X.."},
            {"X...X",
             "X...X",
             "X.+.X",
             "X+X+X",
             ".X.X."},
            {"X+.+X", //0x58
             "+X+X+",
             ".+X+.",
             "+X+X+",
             "X+.+X"},
            {"X...X",
             "+X.X+",
             ".+X+.",
             "..X..",
             "..X.."},
            {"XXXXX",
             "..+X+",
             ".+X+.",
             "+X+..",
             "XXXXX"},
            {"..XXX",
             "..X..",
             "..X..",
             "..X..",
             "..XXX"},
            {"X+...",
             "+X+..",
             ".+X+.",
             "..+X+",
             "...+X"},
            {"XXX..",
             "..X..",
             "..X..",
             "..X..",
             "XXX.."},
            {".+X+.",
             "+X+X+",
             "X+.+X",
             ".....",
             "....."},
            {".....",
             ".....",
             ".....",
             ".....",
             "XXXXX"},
            {".X+..", //0x60
             ".+X..",
             ".....",
             ".....",
             "....."},
            {".....",
             ".....",
             "+XXXX",
             "X+..X",
             ".XXXX"},
            {"X....",
             "X....",
             "XXXX.",
             "X..+X",
             "XXXX."},
            {".....",
             ".....",
             ".XXXX",
             "X+...",
             ".XXXX"},
            {"....X",
             "....X",
             ".XXXX",
             "X+..X",
             ".XXXX"},
            {".....",
             "+XX+.",
             "X.+X.",
             "X+X+.",
             ".XXXX"},
            {"..XX.",
             "..X+.",
             ".XXX.",
             "..X..",
             "..X.."},
            {".....",
             ".+XX+",
             ".X+.X",
             ".+X+X",
             "XXXX."},
            {"X....", //0x68
             "X....",
             "X+XX+",
             "XX++X",
             "X+..X"},
            {"..X..",
             ".....",
             "..X..",
             "..X..",
             "..X.."},
            {"..X..",
             ".....",
             "..X..",
             ".+X..",
             ".X+.."},
            {"X....",
             "X....",
             "X.+XX",
             "XXX+.",
             "X.+XX"},
            {"..X..",
             "..X..",
             "..X..",
             "..X..",
             "..X.."},
            {".....",
             ".....",
             ".X+X.",
             "X+X+X",
             "X.X.X"},
            {".....",
             ".....",
             ".XXX.",
             "X+.+X",
             "X...X"},
            {".....",
             ".....",
             ".XXX.",
             "X+.+X",
             ".XXX."},
            {".....", //0x70
             "XXXX.",
             "X..+X",
             "XXXX.",
             "X...."},
            {".....",
             ".XXXX",
             "X+..X",
             ".XXXX",
             "....X"},
            {".....",
             "..+X.",
             "..X+.",
             "..X..",
             "..X.."},
            {".....",
             ".....",
             ".+XX.",
             "+X++X",
             "X++X."},
            {"..X..",
             ".XXX.",
             "..X..",
             "..X..",
             "..X.."},
            {".....",
             ".....",
             "X...X",
             "X+.+X",
             ".XXX."},
            {".....",
             ".....",
             "X+.+X",
             "+X+X+",
             ".+X+."},
            {".....",
             ".....",
             "X.X.X",
             "X+X+X",
             ".X+X."},
            {".....", //0x78
             ".....",
             ".X+X.",
             ".+X+.",
             ".X+X."},
            {".....",
             ".....",
             ".X+X.",
             ".+X+.",
             "..X.."},
            {".....",
             ".....",
             ".XXXX",
             ".+X+.",
             "XXXX."},
            {"...XX",
             "..+X+",
             ".+X+.",
             "..+X+",
             "...XX"},
            {"..X..",
             "..X..",
             "..X..",
             "..X..",
             "..X.."},
            {"XX...",
             "+X+..",
             ".+X+.",
             "+X+..",
             "XX..."},
            {".....",
             "+X+..",
             "X+X+X",
             "..+X+",
             "....."},
            {"XXXXX",
             "X...X",
             "X...X",
             "X...X",
             "XXXXX"},
        };

    
    public static void main(final String[] args) {
        String[] letter;
        long b;
        long v;
        int c = 0;
        String s;
        for (int i = 0; i < font.length; i++) {
            letter = font[i];
            b = 0;
            for (int j = 0; j < 5; j++) {
                b = b << 10;
                v = 1 << 9;
                for (int col = 0; col < 5; col++) {
                    if (letter[j].charAt(col) == '+')  b += v;
                    if (letter[j].charAt(col) == 'X')  b += v + (v / 2);
                    v = v >> 2;
                }
            }
            s = Long.toHexString(b).toUpperCase();
            while (s.length() < 14) s = "0" + s;
            System.out.print("0x" + s + "L,");
            c++;
            if (c >= 8) {
                System.out.println();
                c = 0;
            }
        }
    } 

} 
