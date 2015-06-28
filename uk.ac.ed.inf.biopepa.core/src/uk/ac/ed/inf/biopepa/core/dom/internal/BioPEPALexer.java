/* The following code was generated by JFlex 1.4.1 on 16/09/11 16:56 */

package uk.ac.ed.inf.biopepa.core.dom.internal;

import java_cup.runtime.*;
import java.io.Reader;
import java.util.HashMap;
import java.io.InputStreamReader;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 16/09/11 16:56 from the specification file
 * <tt>/afs/inf.ed.ac.uk/user/a/aclark6/Bio-PEPA/uk.ac.ed.inf.biopepa.core/grammar/biopepa.jflex</tt>
 */
public class BioPEPALexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 1;
  public static final int CPPCOMMENT = 2;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\55\1\3\1\2\1\0\1\3\1\1\16\55\4\0\1\3\3\0"+
    "\1\54\3\0\1\33\1\34\1\5\1\35\1\37\1\26\1\36\1\4"+
    "\12\52\1\40\1\41\1\31\1\42\1\32\1\0\1\46\4\54\1\53"+
    "\6\54\1\22\2\54\1\24\13\54\1\44\1\0\1\45\1\43\1\54"+
    "\1\0\1\11\1\51\1\10\1\54\1\17\1\25\2\54\1\13\1\54"+
    "\1\21\1\6\1\50\1\14\1\7\1\20\1\54\1\30\1\15\1\12"+
    "\1\27\1\54\1\23\1\54\1\47\1\16\4\0\41\55\2\0\4\54"+
    "\4\0\1\54\2\0\1\55\7\0\1\54\4\0\1\54\5\0\27\54"+
    "\1\0\37\54\1\0\u013f\54\31\0\162\54\4\0\14\54\16\0\5\54"+
    "\11\0\1\54\21\0\130\55\5\0\23\55\12\0\1\54\13\0\1\54"+
    "\1\0\3\54\1\0\1\54\1\0\24\54\1\0\54\54\1\0\46\54"+
    "\1\0\5\54\4\0\202\54\1\0\4\55\3\0\105\54\1\0\46\54"+
    "\2\0\2\54\6\0\20\54\41\0\46\54\2\0\1\54\7\0\47\54"+
    "\11\0\21\55\1\0\27\55\1\0\3\55\1\0\1\55\1\0\2\55"+
    "\1\0\1\55\13\0\33\54\5\0\3\54\15\0\4\55\14\0\6\55"+
    "\13\0\32\54\5\0\13\54\16\55\7\0\12\52\4\0\2\54\1\55"+
    "\143\54\1\0\1\54\10\55\1\0\6\55\2\54\2\55\1\0\4\55"+
    "\2\54\12\52\3\54\2\0\1\54\17\0\1\55\1\54\1\55\36\54"+
    "\33\55\2\0\3\54\60\0\46\54\13\55\1\54\u014f\0\3\55\66\54"+
    "\2\0\1\55\1\54\20\55\2\0\1\54\4\55\3\0\12\54\2\55"+
    "\2\0\12\52\21\0\3\55\1\0\10\54\2\0\2\54\2\0\26\54"+
    "\1\0\7\54\1\0\1\54\3\0\4\54\2\0\1\55\1\54\7\55"+
    "\2\0\2\55\2\0\3\55\11\0\1\55\4\0\2\54\1\0\3\54"+
    "\2\55\2\0\12\52\4\54\15\0\3\55\1\0\6\54\4\0\2\54"+
    "\2\0\26\54\1\0\7\54\1\0\2\54\1\0\2\54\1\0\2\54"+
    "\2\0\1\55\1\0\5\55\4\0\2\55\2\0\3\55\13\0\4\54"+
    "\1\0\1\54\7\0\12\52\2\55\3\54\14\0\3\55\1\0\11\54"+
    "\1\0\3\54\1\0\26\54\1\0\7\54\1\0\2\54\1\0\5\54"+
    "\2\0\1\55\1\54\10\55\1\0\3\55\1\0\3\55\2\0\1\54"+
    "\17\0\2\54\2\55\2\0\12\52\1\0\1\54\17\0\3\55\1\0"+
    "\10\54\2\0\2\54\2\0\26\54\1\0\7\54\1\0\2\54\1\0"+
    "\5\54\2\0\1\55\1\54\6\55\3\0\2\55\2\0\3\55\10\0"+
    "\2\55\4\0\2\54\1\0\3\54\4\0\12\52\1\0\1\54\20\0"+
    "\1\55\1\54\1\0\6\54\3\0\3\54\1\0\4\54\3\0\2\54"+
    "\1\0\1\54\1\0\2\54\3\0\2\54\3\0\3\54\3\0\10\54"+
    "\1\0\3\54\4\0\5\55\3\0\3\55\1\0\4\55\11\0\1\55"+
    "\17\0\11\52\11\0\1\54\7\0\3\55\1\0\10\54\1\0\3\54"+
    "\1\0\27\54\1\0\12\54\1\0\5\54\4\0\7\55\1\0\3\55"+
    "\1\0\4\55\7\0\2\55\11\0\2\54\4\0\12\52\22\0\2\55"+
    "\1\0\10\54\1\0\3\54\1\0\27\54\1\0\12\54\1\0\5\54"+
    "\2\0\1\55\1\54\7\55\1\0\3\55\1\0\4\55\7\0\2\55"+
    "\7\0\1\54\1\0\2\54\4\0\12\52\22\0\2\55\1\0\10\54"+
    "\1\0\3\54\1\0\27\54\1\0\20\54\4\0\6\55\2\0\3\55"+
    "\1\0\4\55\11\0\1\55\10\0\2\54\4\0\12\52\22\0\2\55"+
    "\1\0\22\54\3\0\30\54\1\0\11\54\1\0\1\54\2\0\7\54"+
    "\3\0\1\55\4\0\6\55\1\0\1\55\1\0\10\55\22\0\2\55"+
    "\15\0\60\54\1\55\2\54\7\55\4\0\10\54\10\55\1\0\12\52"+
    "\47\0\2\54\1\0\1\54\2\0\2\54\1\0\1\54\2\0\1\54"+
    "\6\0\4\54\1\0\7\54\1\0\3\54\1\0\1\54\1\0\1\54"+
    "\2\0\2\54\1\0\4\54\1\55\2\54\6\55\1\0\2\55\1\54"+
    "\2\0\5\54\1\0\1\54\1\0\6\55\2\0\12\52\2\0\2\54"+
    "\42\0\1\54\27\0\2\55\6\0\12\52\13\0\1\55\1\0\1\55"+
    "\1\0\1\55\4\0\2\55\10\54\1\0\42\54\6\0\24\55\1\0"+
    "\2\55\4\54\4\0\10\55\1\0\44\55\11\0\1\55\71\0\42\54"+
    "\1\0\5\54\1\0\2\54\1\0\7\55\3\0\4\55\6\0\12\52"+
    "\6\0\6\54\4\55\106\0\46\54\12\0\51\54\7\0\132\54\5\0"+
    "\104\54\5\0\122\54\6\0\7\54\1\0\77\54\1\0\1\54\1\0"+
    "\4\54\2\0\7\54\1\0\1\54\1\0\4\54\2\0\47\54\1\0"+
    "\1\54\1\0\4\54\2\0\37\54\1\0\1\54\1\0\4\54\2\0"+
    "\7\54\1\0\1\54\1\0\4\54\2\0\7\54\1\0\7\54\1\0"+
    "\27\54\1\0\37\54\1\0\1\54\1\0\4\54\2\0\7\54\1\0"+
    "\47\54\1\0\23\54\16\0\11\52\56\0\125\54\14\0\u026c\54\2\0"+
    "\10\54\12\0\32\54\5\0\113\54\3\0\3\54\17\0\15\54\1\0"+
    "\4\54\3\55\13\0\22\54\3\55\13\0\22\54\2\55\14\0\15\54"+
    "\1\0\3\54\1\0\2\55\14\0\64\54\40\55\3\0\1\54\3\0"+
    "\2\54\1\55\2\0\12\52\41\0\3\55\2\0\12\52\6\0\130\54"+
    "\10\0\51\54\1\55\126\0\35\54\3\0\14\55\4\0\14\55\12\0"+
    "\12\52\36\54\2\0\5\54\u038b\0\154\54\224\0\234\54\4\0\132\54"+
    "\6\0\26\54\2\0\6\54\2\0\46\54\2\0\6\54\2\0\10\54"+
    "\1\0\1\54\1\0\1\54\1\0\1\54\1\0\37\54\2\0\65\54"+
    "\1\0\7\54\1\0\1\54\3\0\3\54\1\0\7\54\3\0\4\54"+
    "\2\0\6\54\4\0\15\54\5\0\3\54\1\0\7\54\17\0\4\55"+
    "\32\0\5\55\20\0\2\54\23\0\1\54\13\0\4\55\6\0\6\55"+
    "\1\0\1\54\15\0\1\54\40\0\22\54\36\0\15\55\4\0\1\55"+
    "\3\0\6\55\27\0\1\54\4\0\1\54\2\0\12\54\1\0\1\54"+
    "\3\0\5\54\6\0\1\54\1\0\1\54\1\0\1\54\1\0\4\54"+
    "\1\0\3\54\1\0\7\54\3\0\3\54\5\0\5\54\26\0\44\54"+
    "\u0e81\0\3\54\31\0\11\54\6\55\1\0\5\54\2\0\5\54\4\0"+
    "\126\54\2\0\2\55\2\0\3\54\1\0\137\54\5\0\50\54\4\0"+
    "\136\54\21\0\30\54\70\0\20\54\u0200\0\u19b6\54\112\0\u51a6\54\132\0"+
    "\u048d\54\u0773\0\u2ba4\54\u215c\0\u012e\54\2\0\73\54\225\0\7\54\14\0"+
    "\5\54\5\0\1\54\1\55\12\54\1\0\15\54\1\0\5\54\1\0"+
    "\1\54\1\0\2\54\1\0\2\54\1\0\154\54\41\0\u016b\54\22\0"+
    "\100\54\2\0\66\54\50\0\15\54\3\0\20\55\20\0\4\55\17\0"+
    "\2\54\30\0\3\54\31\0\1\54\6\0\5\54\1\0\207\54\2\0"+
    "\1\55\4\0\1\54\13\0\12\52\7\0\32\54\4\0\1\54\1\0"+
    "\32\54\12\0\132\54\3\0\6\54\2\0\6\54\2\0\6\54\2\0"+
    "\3\54\3\0\2\54\3\0\2\54\22\0\3\55\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\2\0\1\2\2\3\1\4\1\5\10\6\1\7"+
    "\1\6\1\10\1\11\1\12\1\13\1\14\1\2\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\6"+
    "\1\1\2\25\1\3\1\0\1\6\1\0\3\6\1\26"+
    "\3\6\1\0\1\6\1\27\1\6\1\0\1\30\1\31"+
    "\3\0\1\1\1\6\4\0\10\6\1\1\2\6\1\32"+
    "\1\33\1\34\1\35\1\6\1\0\1\3\3\6\1\36"+
    "\1\37\1\6\1\40\5\6\1\41\1\6\1\0\2\6"+
    "\1\42\3\6\1\0\5\6\1\0\1\43\2\6\1\44"+
    "\1\6\1\0\1\6\1\45\1\6\1\46\3\6\1\47"+
    "\1\6\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\212\0\346\0\212"+
    "\0\u0114\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256"+
    "\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\212\0\212\0\u036a"+
    "\0\212\0\212\0\212\0\212\0\212\0\212\0\212\0\212"+
    "\0\u0398\0\u03c6\0\u03f4\0\212\0\u0422\0\u0450\0\u047e\0\u0142"+
    "\0\u04ac\0\u04da\0\u0508\0\u0142\0\u0536\0\u0564\0\u0592\0\u05c0"+
    "\0\u05ee\0\212\0\u061c\0\u064a\0\212\0\212\0\u0678\0\u06a6"+
    "\0\u06d4\0\u0702\0\u0730\0\u075e\0\u036a\0\u078c\0\u07ba\0\u07e8"+
    "\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\u05c0"+
    "\0\u0958\0\u0986\0\212\0\212\0\212\0\212\0\u09b4\0\u09e2"+
    "\0\u078c\0\u0a10\0\u0a3e\0\u0a6c\0\u0142\0\u0142\0\u0a9a\0\u0142"+
    "\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\u0b80\0\u0142\0\u0bae\0\u0bdc"+
    "\0\u0c0a\0\u0c38\0\u0142\0\u0c66\0\u0c94\0\u0cc2\0\u0cf0\0\u0d1e"+
    "\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04\0\u0142\0\u0e32\0\u0e60"+
    "\0\u0142\0\u0e8e\0\u0ebc\0\u0eea\0\u0142\0\u0f18\0\212\0\u0f46"+
    "\0\u0f74\0\u0fa2\0\u0142\0\u0fd0\0\u0142";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\2\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\12\1\14\1\15\1\12\1\16\1\12\1\17\1\12"+
    "\1\20\4\12\1\21\1\22\1\12\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\12\1\41\1\12\1\42\1\17"+
    "\1\12\2\4\1\43\1\44\55\4\1\0\53\4\60\0"+
    "\1\6\57\0\1\45\1\46\56\0\1\12\1\47\16\12"+
    "\1\0\2\12\7\0\1\50\6\0\7\12\6\0\20\12"+
    "\1\0\2\12\7\0\1\50\6\0\7\12\6\0\1\12"+
    "\1\51\16\12\1\0\2\12\7\0\1\50\6\0\7\12"+
    "\6\0\5\12\1\52\12\12\1\0\2\12\7\0\1\50"+
    "\6\0\1\53\6\12\6\0\6\12\1\54\11\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\4\12\1\55"+
    "\1\56\4\12\1\57\5\12\1\0\2\12\7\0\1\50"+
    "\6\0\7\12\6\0\20\12\1\60\2\12\4\0\1\60"+
    "\2\0\1\50\6\0\7\12\6\0\5\12\1\61\12\12"+
    "\1\0\2\12\7\0\1\50\6\0\7\12\32\0\1\62"+
    "\31\0\12\12\1\63\5\12\1\0\2\12\7\0\1\50"+
    "\6\0\7\12\26\0\1\64\2\0\1\65\56\0\1\66"+
    "\51\0\1\67\6\0\1\70\1\71\71\0\1\72\11\0"+
    "\11\12\1\73\6\12\1\0\2\12\7\0\1\50\6\0"+
    "\7\12\17\0\1\74\16\0\1\75\13\0\1\42\1\74"+
    "\4\0\1\44\53\0\1\45\2\0\53\45\5\76\1\77"+
    "\50\76\6\0\2\12\1\100\12\12\1\101\2\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\20\12\1\0"+
    "\2\12\7\0\1\50\6\0\1\12\1\102\5\12\6\0"+
    "\20\12\1\0\2\12\7\0\1\50\6\0\1\12\1\103"+
    "\5\12\6\0\12\12\1\104\5\12\1\0\2\12\7\0"+
    "\1\50\6\0\7\12\6\0\11\12\1\105\6\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\10\12\1\106"+
    "\7\12\1\0\2\12\7\0\1\50\6\0\7\12\6\0"+
    "\11\12\1\107\6\12\1\0\2\12\7\0\1\50\6\0"+
    "\7\12\52\0\1\110\11\0\6\12\1\111\11\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\12\12\1\112"+
    "\5\12\1\0\2\12\7\0\1\50\6\0\7\12\32\0"+
    "\1\113\57\0\1\114\55\0\1\115\55\0\1\116\40\0"+
    "\1\74\32\0\1\72\1\74\10\0\20\12\1\0\2\12"+
    "\7\0\1\50\6\0\1\12\1\117\5\12\26\0\1\60"+
    "\6\0\1\60\20\0\5\76\1\120\54\76\1\121\1\120"+
    "\50\76\6\0\3\12\1\122\14\12\1\0\2\12\7\0"+
    "\1\50\6\0\7\12\6\0\11\12\1\123\6\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\12\12\1\124"+
    "\5\12\1\0\2\12\7\0\1\50\6\0\7\12\6\0"+
    "\11\12\1\125\6\12\1\0\2\12\7\0\1\50\6\0"+
    "\7\12\6\0\11\12\1\126\6\12\1\0\2\12\7\0"+
    "\1\50\6\0\7\12\6\0\12\12\1\127\5\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\11\12\1\130"+
    "\6\12\1\0\2\12\7\0\1\50\6\0\7\12\6\0"+
    "\2\12\1\131\15\12\1\0\2\12\7\0\1\50\6\0"+
    "\7\12\6\0\11\12\1\132\6\12\1\0\2\12\7\0"+
    "\1\50\6\0\7\12\6\0\11\12\1\133\6\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\20\12\1\0"+
    "\2\12\7\0\1\50\6\0\2\12\1\134\4\12\4\76"+
    "\1\6\1\120\50\76\6\0\4\12\1\135\13\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\20\12\1\0"+
    "\1\12\1\136\7\0\1\50\6\0\7\12\6\0\3\12"+
    "\1\137\14\12\1\0\2\12\7\0\1\50\6\0\7\12"+
    "\6\0\20\12\1\140\2\12\7\0\1\50\6\0\7\12"+
    "\6\0\5\12\1\141\12\12\1\0\2\12\7\0\1\50"+
    "\6\0\7\12\6\0\4\12\1\142\13\12\1\0\2\12"+
    "\7\0\1\50\6\0\7\12\6\0\20\12\1\0\1\12"+
    "\1\143\7\0\1\50\6\0\7\12\6\0\20\12\1\0"+
    "\1\12\1\144\7\0\1\50\6\0\7\12\6\0\5\12"+
    "\1\145\12\12\1\0\2\12\7\0\1\50\6\0\7\12"+
    "\6\0\20\12\1\0\1\12\1\146\7\0\1\50\6\0"+
    "\7\12\15\0\1\147\46\0\11\12\1\150\6\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\5\12\1\151"+
    "\12\12\1\0\2\12\7\0\1\50\6\0\7\12\6\0"+
    "\3\12\1\152\14\12\1\0\2\12\7\0\1\50\6\0"+
    "\7\12\6\0\1\12\1\153\16\12\1\0\2\12\7\0"+
    "\1\50\6\0\7\12\6\0\4\12\1\154\13\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\13\0\1\155\50\0"+
    "\7\12\1\156\10\12\1\0\2\12\7\0\1\50\6\0"+
    "\7\12\6\0\2\12\1\157\15\12\1\0\2\12\7\0"+
    "\1\50\6\0\7\12\6\0\6\12\1\160\11\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\6\12\1\161"+
    "\11\12\1\0\2\12\7\0\1\50\6\0\7\12\6\0"+
    "\20\12\1\0\2\12\7\0\1\50\6\0\1\12\1\162"+
    "\5\12\16\0\1\163\45\0\14\12\1\164\3\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\11\12\1\165"+
    "\6\12\1\0\2\12\7\0\1\50\6\0\7\12\6\0"+
    "\11\12\1\166\6\12\1\0\2\12\7\0\1\50\6\0"+
    "\7\12\17\0\1\167\44\0\3\12\1\170\14\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\6\12\1\171"+
    "\11\12\1\0\2\12\7\0\1\50\6\0\7\12\6\0"+
    "\15\12\1\172\2\12\1\0\2\12\7\0\1\50\6\0"+
    "\7\12\6\0\4\12\1\173\13\12\1\0\2\12\7\0"+
    "\1\50\6\0\7\12\6\0\16\12\1\174\1\12\1\0"+
    "\2\12\7\0\1\50\6\0\7\12\6\0\17\12\1\175"+
    "\1\0\2\12\7\0\1\50\6\0\7\12";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4094];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\2\0\1\11\1\1\1\11\1\1\1\11\15\1"+
    "\2\11\1\1\10\11\3\1\1\11\1\1\1\0\1\1"+
    "\1\0\7\1\1\0\1\1\1\11\1\1\1\0\2\11"+
    "\3\0\2\1\4\0\13\1\4\11\1\1\1\0\17\1"+
    "\1\0\6\1\1\0\5\1\1\0\5\1\1\0\3\1"+
    "\1\11\6\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	    
	private BioPEPASymbolFactory symbolFactory;
	
	final static HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	static {
		map.put(BioPEPAToken.ACTIVATOR, "(+)");
		map.put(BioPEPAToken.INHIBITOR, "(-)");
		map.put(BioPEPAToken.GENERIC, "(.)");
		map.put(BioPEPAToken.COMMA, ",");
		map.put(BioPEPAToken.COLON, ":");
		map.put(BioPEPAToken.SEMI, ";");
		map.put(BioPEPAToken.EQUALS, "=");
		map.put(BioPEPAToken.LCOOP, "<");
		map.put(BioPEPAToken.RCOOP, ">");
		map.put(BioPEPAToken.MULT, "*");
		map.put(BioPEPAToken.MINUS, "-");
		map.put(BioPEPAToken.PLUS, "+");
		map.put(BioPEPAToken.DIVIDE, "/");
		map.put(BioPEPAToken.POWER, "^");
		map.put(BioPEPAToken.SIZE, "size");
		map.put(BioPEPAToken.LOCATION_DEF, "location");
		map.put(BioPEPAToken.SPECIES, "species");
		map.put(BioPEPAToken.FUNCTION, "kineticLawOf");
		map.put(BioPEPAToken.STEP, "step-size");
		map.put(BioPEPAToken.MAX_CONC, "upper");
		map.put(BioPEPAToken.MIN_CONC, "lower");
		map.put(BioPEPAToken.REACTANT, "<<");
		map.put(BioPEPAToken.PRODUCT, ">>");
		map.put(BioPEPAToken.LPAREN, "(");
		map.put(BioPEPAToken.RPAREN, ")");
		map.put(BioPEPAToken.LSQUARE, "[");
		map.put(BioPEPAToken.RSQUARE, "]");
		map.put(BioPEPAToken.AT, "@");
		map.put(BioPEPAToken.IN, "in");
		map.put(BioPEPAToken.TYPE, "type");
		map.put(BioPEPAToken.UMOVE, "->");
		map.put(BioPEPAToken.BMOVE, "<->");
		map.put(BioPEPAToken.COMPARTMENT, "compartment");
		map.put(BioPEPAToken.MEMBRANE, "membrane");
		map.put(BioPEPAToken.TIME, "time");
	}
	
	public BioPEPALexer(Reader reader, BioPEPASymbolFactory sf) {
		this(reader);
	  	symbolFactory = sf;
	}
	
	public BioPEPALexer(BioPEPASymbolFactory sf){
	 	this(new InputStreamReader(System.in));
	    symbolFactory = sf;
	}
	
	public Symbol symbol(String name, int code, Object lexem){
        return symbolFactory.newLocationAwareSymbol(name, code, lexem,
			yychar, yychar + yylength(), yyline, yycolumn);
   
    }
    
    public Symbol symbol(String name, int code){
        return symbol(name, code, null);
    }
    
    public Symbol symbol(int code) {
    	return symbol(null, code, null);
    }
    
    int getCurrentLineNumber(){
	    return yyline;
	}
	
	int getCurrentColumn(){
	    return yycolumn;
	}
	  
	int getCurrentChar() {
	  	return yychar;
	}
	



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public BioPEPALexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public BioPEPALexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1756) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 3: 
          { /* ignore */
          }
        case 41: break;
        case 5: 
          { return symbol(BioPEPAToken.MULT);
          }
        case 42: break;
        case 26: 
          { return symbol(BioPEPAToken.BMOVE);
          }
        case 43: break;
        case 23: 
          { return symbol(BioPEPAToken.UMOVE);
          }
        case 44: break;
        case 30: 
          { return symbol(BioPEPAToken.TIME);
          }
        case 45: break;
        case 2: 
          { return symbol("ERROR", BioPEPAToken.error,"Illegal character: <" + yytext() + ">");
          }
        case 46: break;
        case 18: 
          { return symbol(BioPEPAToken.LSQUARE);
          }
        case 47: break;
        case 11: 
          { return symbol(BioPEPAToken.RPAREN);
          }
        case 48: break;
        case 15: 
          { return symbol(BioPEPAToken.SEMI);
          }
        case 49: break;
        case 34: 
          { return symbol(BioPEPAToken.MAX_CONC);
          }
        case 50: break;
        case 7: 
          { return symbol(BioPEPAToken.MINUS);
          }
        case 51: break;
        case 39: 
          { return symbol(BioPEPAToken.COMPARTMENT);
          }
        case 52: break;
        case 37: 
          { return symbol(BioPEPAToken.MEMBRANE);
          }
        case 53: break;
        case 13: 
          { return symbol(BioPEPAToken.COMMA);
          }
        case 54: break;
        case 35: 
          { return symbol(BioPEPAToken.SPECIES);
          }
        case 55: break;
        case 1: 
          { return symbol(null, BioPEPAToken.NUMBER_LITERAL, yytext());
          }
        case 56: break;
        case 17: 
          { return symbol(BioPEPAToken.POWER);
          }
        case 57: break;
        case 16: 
          { return symbol(BioPEPAToken.EQUALS);
          }
        case 58: break;
        case 29: 
          { return symbol(BioPEPAToken.GENERIC);
          }
        case 59: break;
        case 25: 
          { return symbol(BioPEPAToken.PRODUCT);
          }
        case 60: break;
        case 6: 
          { return symbol(null, BioPEPAToken.NAME,yytext());
          }
        case 61: break;
        case 36: 
          { return symbol(BioPEPAToken.LOCATION_DEF);
          }
        case 62: break;
        case 27: 
          { return symbol(BioPEPAToken.INHIBITOR);
          }
        case 63: break;
        case 19: 
          { return symbol(BioPEPAToken.RSQUARE);
          }
        case 64: break;
        case 10: 
          { return symbol(BioPEPAToken.LPAREN);
          }
        case 65: break;
        case 24: 
          { return symbol(BioPEPAToken.REACTANT);
          }
        case 66: break;
        case 9: 
          { return symbol(BioPEPAToken.RCOOP);
          }
        case 67: break;
        case 8: 
          { return symbol(BioPEPAToken.LCOOP);
          }
        case 68: break;
        case 33: 
          { return symbol(BioPEPAToken.MIN_CONC);
          }
        case 69: break;
        case 12: 
          { return symbol(BioPEPAToken.PLUS);
          }
        case 70: break;
        case 32: 
          { return symbol(BioPEPAToken.SIZE);
          }
        case 71: break;
        case 22: 
          { return symbol(BioPEPAToken.IN);
          }
        case 72: break;
        case 31: 
          { return symbol(BioPEPAToken.TYPE);
          }
        case 73: break;
        case 20: 
          { return symbol(BioPEPAToken.AT);
          }
        case 74: break;
        case 28: 
          { return symbol(BioPEPAToken.ACTIVATOR);
          }
        case 75: break;
        case 4: 
          { return symbol(BioPEPAToken.DIVIDE);
          }
        case 76: break;
        case 14: 
          { return symbol(BioPEPAToken.COLON);
          }
        case 77: break;
        case 40: 
          { return symbol(BioPEPAToken.FUNCTION);
          }
        case 78: break;
        case 38: 
          { return symbol(BioPEPAToken.STEP);
          }
        case 79: break;
        case 21: 
          { 
          }
        case 80: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {     return symbol(BioPEPAToken.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
