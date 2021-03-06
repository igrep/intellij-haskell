/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package intellij.haskell;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static intellij.haskell.psi.HaskellTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_HaskellLexer.flex</tt>
 */
public class _HaskellLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int NCOMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 7, 5]
   * Total runtime size is 2336 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>12]<<7)|((ch>>5)&0x7f)]<<5)|(ch&0x1f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\u010d\1");

  /* The ZZ_CMAP_Y table has 384 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\27\6\1\7\343\6\1\10\12\6\1\11\1\6\1\12\1\6\1\13\1"+
    "\14\1\6\1\15\1\16\33\6\1\17\117\6");

  /* The ZZ_CMAP_A table has 512 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\1\1\4\0\1\1\3\0\1\1\1\3\2\35\1\2\21\0\1\1\1\4\1\72\1\71\1\5\2\73\1\42\1\70"+
    "\1\113\1\114\1\73\1\74\1\115\1\25\1\75\1\73\1\30\4\64\3\33\2\24\1\106\1\116"+
    "\1\77\1\102\1\100\1\101\1\103\1\54\1\57\1\55\1\27\1\37\1\60\1\67\1\51\1\63"+
    "\1\23\1\56\1\47\1\66\1\45\1\34\1\63\1\53\1\62\1\50\1\52\1\46\1\61\1\23\1\32"+
    "\1\65\1\23\1\117\1\21\1\40\1\44\1\41\1\120\1\26\1\123\1\17\1\10\1\11\1\7\1"+
    "\124\1\132\1\6\2\22\1\13\1\130\1\12\1\16\1\127\1\22\1\15\1\14\1\125\1\20\1"+
    "\43\1\131\1\31\1\126\1\22\1\121\1\104\1\122\1\105\6\0\1\36\32\0\1\1\120\0"+
    "\2\22\25\0\2\36\46\0\1\110\1\0\1\111\37\0\1\112\45\0\1\76\36\0\1\107\13\0"+
    "\3\73\66\0\1\73\10\0\1\73\32\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\2\3\1\4\11\5\1\6\1\7"+
    "\1\10\1\4\1\10\1\11\1\12\1\4\1\13\1\1"+
    "\1\4\2\14\2\4\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\3\5\4\36\5\0\2\4"+
    "\1\5\1\37\1\40\3\5\1\41\4\5\1\42\2\5"+
    "\1\0\1\4\1\0\1\7\2\0\1\4\1\43\1\24"+
    "\1\44\4\0\1\21\1\0\1\45\1\0\1\46\1\23"+
    "\1\25\1\21\1\22\1\47\4\5\1\50\1\51\1\52"+
    "\6\0\1\53\1\54\11\5\1\55\2\5\1\56\1\0"+
    "\1\56\1\0\1\57\1\60\1\61\36\0\2\62\1\63"+
    "\4\5\2\50\1\52\7\0\6\5\1\64\1\65\2\5"+
    "\1\66\30\0\1\67\1\70\2\5\1\52\3\0\1\71"+
    "\6\5\1\72\2\0\1\5\1\73\1\0\1\74\1\75"+
    "\1\5\1\76\4\5\3\0\1\77\2\5\1\100\1\5"+
    "\1\101\3\0\1\102\1\0\1\103\21\0\1\104\2\0"+
    "\1\43\3\0\1\105\1\106\1\107";

  private static int [] zzUnpackAction() {
    int [] result = new int[287];
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
    "\0\0\0\133\0\266\0\u0111\0\u016c\0\266\0\u01c7\0\u0222"+
    "\0\u027d\0\u02d8\0\u0333\0\u038e\0\u03e9\0\u0444\0\u049f\0\u04fa"+
    "\0\u0555\0\u05b0\0\u060b\0\u0666\0\u06c1\0\266\0\u0444\0\u071c"+
    "\0\u0777\0\u07d2\0\u082d\0\u0888\0\266\0\u08e3\0\u093e\0\u0999"+
    "\0\u071c\0\u071c\0\u071c\0\u09f4\0\266\0\266\0\266\0\266"+
    "\0\266\0\266\0\266\0\266\0\266\0\266\0\u0a4f\0\266"+
    "\0\u0aaa\0\u0b05\0\u0b60\0\266\0\u0bbb\0\u0c16\0\u0c71\0\u0ccc"+
    "\0\u0d27\0\u0d82\0\u0ddd\0\u0e38\0\u0e93\0\u0eee\0\u0f49\0\u0444"+
    "\0\u0fa4\0\u0fff\0\u105a\0\u10b5\0\u0444\0\u1110\0\u116b\0\u11c6"+
    "\0\u1221\0\u0444\0\u127c\0\u12d7\0\u1332\0\u138d\0\u13e8\0\u1443"+
    "\0\u149e\0\u14f9\0\u1554\0\u15af\0\u071c\0\266\0\u160a\0\u1665"+
    "\0\u16c0\0\u171b\0\u1776\0\u07d2\0\266\0\u17d1\0\266\0\u071c"+
    "\0\u071c\0\u182c\0\u182c\0\u1887\0\u18e2\0\u193d\0\u1998\0\u19f3"+
    "\0\u1a4e\0\266\0\u1aa9\0\u1b04\0\u1b5f\0\u1bba\0\u1c15\0\u1c70"+
    "\0\u1ccb\0\266\0\u1d26\0\u1d81\0\u1ddc\0\u1e37\0\u1e92\0\u1eed"+
    "\0\u1f48\0\u1fa3\0\u1ffe\0\u2059\0\u0444\0\u20b4\0\u210f\0\u216a"+
    "\0\u21c5\0\u2220\0\u2220\0\u160a\0\u1665\0\266\0\u227b\0\u22d6"+
    "\0\u2331\0\u238c\0\u23e7\0\u2442\0\u249d\0\u24f8\0\u2553\0\u25ae"+
    "\0\u2609\0\u2664\0\u26bf\0\u271a\0\u2775\0\u27d0\0\u282b\0\u2886"+
    "\0\u28e1\0\u293c\0\u2997\0\u29f2\0\u2a4d\0\u2aa8\0\u2b03\0\u2b5e"+
    "\0\u2bb9\0\u2c14\0\u2c6f\0\u2cca\0\266\0\u2d25\0\266\0\u2d80"+
    "\0\u2ddb\0\u2e36\0\u2e91\0\u2eec\0\266\0\u2f47\0\u2fa2\0\u2ffd"+
    "\0\u3058\0\u30b3\0\u310e\0\u3169\0\u31c4\0\u321f\0\u327a\0\u32d5"+
    "\0\u3330\0\u338b\0\u33e6\0\u0444\0\u0444\0\u3441\0\u349c\0\u0444"+
    "\0\u34f7\0\u3552\0\u35ad\0\u3608\0\u3663\0\u36be\0\u3719\0\u3774"+
    "\0\u37cf\0\u382a\0\u3885\0\u38e0\0\u393b\0\u3996\0\u39f1\0\u3a4c"+
    "\0\u3aa7\0\u3b02\0\u3b5d\0\u3bb8\0\u3c13\0\u3c6e\0\u3cc9\0\u3d24"+
    "\0\u3d7f\0\u0444\0\u3dda\0\u3e35\0\u3e90\0\u3eeb\0\u3f46\0\u3fa1"+
    "\0\u3ffc\0\u4057\0\u40b2\0\u410d\0\u4168\0\u41c3\0\u421e\0\u0444"+
    "\0\u4279\0\u42d4\0\u432f\0\u0444\0\u438a\0\u0444\0\u0444\0\u43e5"+
    "\0\u0444\0\u4440\0\u449b\0\u44f6\0\u4551\0\u45ac\0\u4607\0\u4662"+
    "\0\u0444\0\u46bd\0\u4718\0\u0444\0\u4773\0\u0444\0\u47ce\0\u4829"+
    "\0\u4884\0\u0444\0\u48df\0\u0444\0\u493a\0\u4995\0\u49f0\0\u4a4b"+
    "\0\u4aa6\0\u4b01\0\u4b5c\0\u4bb7\0\u4c12\0\u4c6d\0\u4cc8\0\u4d23"+
    "\0\u4d7e\0\u4dd9\0\u4e34\0\u4e8f\0\u4eea\0\266\0\u4f45\0\u4fa0"+
    "\0\266\0\u4ffb\0\u5056\0\u50b1\0\266\0\266\0\266";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[287];
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
    "\1\3\1\4\1\5\1\6\1\4\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\2\16\1\17\1\20\1\16"+
    "\1\21\1\16\1\22\1\23\1\24\1\16\1\22\1\25"+
    "\1\16\1\22\1\23\1\22\1\4\1\3\1\22\1\26"+
    "\1\27\1\30\1\16\1\30\17\22\1\23\3\22\1\31"+
    "\1\32\2\30\1\33\1\34\1\35\1\36\1\30\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\2\16\1\61\2\16\1\62\1\63\1\16\2\64"+
    "\1\65\22\64\1\66\10\64\1\0\62\64\1\67\11\64"+
    "\134\0\2\4\1\0\1\4\30\0\1\4\76\0\2\4"+
    "\1\6\1\4\30\0\1\4\76\0\2\70\1\0\1\70"+
    "\1\30\1\71\1\0\1\72\1\73\6\0\1\74\1\30"+
    "\3\0\1\75\7\0\1\70\4\0\1\30\1\0\1\30"+
    "\25\0\1\76\14\30\31\0\1\77\1\16\1\100\2\16"+
    "\1\101\6\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\32\0\5\16"+
    "\1\102\2\16\5\0\1\77\10\16\1\103\2\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\10\16\5\0\1\77\3\16"+
    "\1\104\4\16\1\105\2\16\1\0\3\16\1\0\1\106"+
    "\6\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\32\0\10\16\5\0\1\77\5\16\1\107\5\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\32\0\10\16\5\0\1\77"+
    "\3\16\1\110\7\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\32\0"+
    "\10\16\5\0\1\77\3\16\1\111\7\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\32\0\10\16\5\0\1\77\13\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\10\16\5\0\1\77\1\16"+
    "\1\112\11\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\32\0\10\16"+
    "\5\0\1\77\5\16\1\113\5\16\1\0\3\16\1\0"+
    "\1\114\6\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\32\0\10\16\2\115\2\0\1\115\1\116"+
    "\13\115\1\116\3\115\1\116\7\115\2\0\3\115\1\116"+
    "\1\115\1\116\25\115\15\116\14\115\1\117\7\115\5\0"+
    "\1\120\13\22\1\0\3\22\1\0\7\22\2\0\1\22"+
    "\1\0\1\22\1\0\1\22\1\0\24\22\32\0\10\22"+
    "\11\0\1\121\7\0\1\122\2\0\1\23\3\0\1\23"+
    "\2\0\1\23\3\0\1\121\24\0\1\23\53\0\1\30"+
    "\13\0\1\123\2\0\1\23\1\124\2\0\1\23\2\0"+
    "\1\23\6\0\1\30\1\0\1\30\17\0\1\23\5\0"+
    "\6\30\1\125\6\30\13\0\1\126\21\0\1\121\4\0"+
    "\1\127\2\0\1\122\2\0\1\23\3\0\1\23\2\130"+
    "\1\23\1\127\2\0\1\121\24\0\1\23\53\0\1\30"+
    "\13\0\1\30\3\0\1\30\14\0\1\30\1\0\1\30"+
    "\25\0\15\30\24\0\3\131\1\0\15\131\1\132\46\131"+
    "\1\0\15\131\1\133\24\131\3\134\1\135\15\134\1\136"+
    "\47\134\1\135\41\134\5\0\1\30\13\0\1\123\2\0"+
    "\1\23\1\30\2\0\1\23\2\0\1\23\6\0\1\30"+
    "\1\0\1\30\17\0\1\23\5\0\15\30\121\0\1\137"+
    "\42\0\1\30\13\0\1\30\3\0\1\140\14\0\1\30"+
    "\1\0\1\30\25\0\15\30\31\0\1\30\13\16\1\30"+
    "\1\16\2\0\1\30\1\16\2\0\1\16\7\0\1\16"+
    "\1\30\1\16\1\30\25\0\15\30\14\0\10\16\5\0"+
    "\1\30\13\0\1\30\3\0\1\30\14\0\1\30\1\0"+
    "\1\30\25\0\6\30\1\141\6\30\31\0\1\142\13\0"+
    "\1\142\3\0\1\142\14\0\1\142\1\0\1\142\25\0"+
    "\14\142\1\143\51\0\1\144\112\0\1\77\13\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\3\16\1\145\3\16\1\146"+
    "\5\0\1\77\10\16\1\147\2\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\32\0\10\16\5\0\1\77\13\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\32\0\7\16\1\150\3\0\1\64\251\0"+
    "\1\151\35\0\1\152\106\0\2\70\1\0\1\70\1\0"+
    "\1\71\1\0\1\72\1\73\6\0\1\74\14\0\1\70"+
    "\104\0\1\153\2\0\1\154\131\0\1\155\133\0\1\156"+
    "\1\157\1\0\1\160\127\0\1\161\125\0\1\30\13\0"+
    "\1\30\3\0\1\30\14\0\1\30\1\0\1\30\25\0"+
    "\15\30\13\0\1\162\10\0\2\163\2\0\1\163\1\76"+
    "\13\163\1\76\3\163\1\76\14\163\1\76\1\163\1\76"+
    "\25\163\15\76\24\163\5\0\1\77\132\0\1\77\1\16"+
    "\1\164\4\16\1\165\4\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\32\0\10\16\5\0\1\77\13\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\32\0\4\16\1\166\3\16\5\0\1\77\7\16"+
    "\1\167\3\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\32\0\10\16"+
    "\5\0\1\77\1\16\1\170\5\16\1\171\3\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\10\16\5\0\1\77\13\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\32\0\2\16\1\172\5\16"+
    "\5\0\1\77\6\16\1\173\4\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\32\0\10\16\5\0\1\77\13\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\32\0\6\16\1\174\1\16\5\0\1\77"+
    "\13\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\32\0\2\16\1\175"+
    "\5\16\5\0\1\77\13\16\1\0\3\16\1\0\1\176"+
    "\6\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\32\0\10\16\5\0\1\77\6\16\1\177\4\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\32\0\10\16\24\0\1\200"+
    "\3\0\1\200\2\0\1\200\30\0\1\200\53\0\1\30"+
    "\13\0\1\30\2\0\1\200\1\30\2\0\1\200\2\0"+
    "\1\200\6\0\1\30\1\0\1\30\17\0\1\200\5\0"+
    "\15\30\35\0\1\201\12\0\1\200\3\0\1\200\2\0"+
    "\1\200\30\0\1\200\53\0\1\120\151\0\1\202\1\203"+
    "\2\0\1\202\2\0\1\202\30\0\1\202\7\0\1\203"+
    "\36\0\2\200\2\0\31\200\2\0\74\200\2\115\2\0"+
    "\1\115\1\116\13\115\1\116\3\115\1\116\7\115\2\0"+
    "\3\115\1\116\1\115\1\116\25\115\15\116\24\115\2\124"+
    "\2\0\127\124\30\0\1\204\2\0\1\204\30\0\1\204"+
    "\55\0\3\205\5\0\1\205\4\0\1\205\1\0\3\205"+
    "\2\0\1\205\3\0\1\205\14\0\2\205\1\0\2\205"+
    "\3\0\1\205\36\0\1\205\77\0\1\206\51\0\1\131"+
    "\2\0\1\131\2\0\1\131\1\207\2\0\1\131\2\0"+
    "\1\210\1\0\1\131\1\211\1\210\1\212\1\0\1\210"+
    "\3\0\1\213\2\0\2\131\1\214\1\215\1\216\1\217"+
    "\1\220\1\221\2\0\1\222\1\223\1\0\1\224\1\225"+
    "\1\221\1\216\1\0\1\210\2\0\1\216\2\131\31\0"+
    "\1\131\1\0\1\131\12\0\1\142\13\0\1\142\3\0"+
    "\1\142\14\0\1\142\1\0\1\142\23\0\1\206\1\0"+
    "\15\142\25\0\4\226\2\0\1\134\2\0\1\134\2\0"+
    "\1\134\1\227\2\0\1\134\2\0\1\134\1\0\1\134"+
    "\1\230\1\134\1\231\1\0\1\134\1\0\1\226\1\0"+
    "\1\232\2\0\2\134\1\233\1\234\1\235\1\236\1\237"+
    "\1\240\2\0\1\241\1\242\1\0\1\243\1\244\1\240"+
    "\1\235\1\0\1\134\2\0\1\235\2\134\31\0\1\134"+
    "\1\0\1\134\12\0\1\142\13\0\1\142\3\0\1\142"+
    "\14\0\1\142\1\0\1\142\25\0\15\142\24\0\2\245"+
    "\1\246\2\245\1\247\114\245\1\0\10\245\5\0\1\77"+
    "\13\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\32\0\4\16\1\250"+
    "\3\16\5\0\1\77\3\16\1\251\7\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\32\0\10\16\5\0\1\77\2\16\1\252"+
    "\10\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\32\0\10\16\5\0"+
    "\1\77\3\16\1\253\7\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\32\0\10\16\2\0\1\254\1\255\127\0\2\153\2\0"+
    "\15\153\1\256\111\153\17\0\1\257\122\0\1\260\133\0"+
    "\1\261\130\0\1\262\5\0\1\263\133\0\1\264\125\0"+
    "\1\265\122\0\2\163\2\0\127\163\5\0\1\77\1\266"+
    "\12\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\32\0\10\16\5\0"+
    "\1\77\13\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\32\0\2\16"+
    "\1\267\5\16\5\0\1\77\10\16\1\270\2\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\10\16\5\0\1\77\3\16"+
    "\1\271\7\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\32\0\10\16"+
    "\5\0\1\77\13\16\1\0\3\16\1\0\1\272\6\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\32\0\10\16\5\0\1\77\1\273\12\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\32\0\10\16\5\0\1\77\13\16\1\0"+
    "\3\16\1\0\1\274\6\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\32\0\10\16\5\0\1\77"+
    "\3\16\1\275\7\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\32\0"+
    "\10\16\5\0\1\77\13\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\32\0\2\16\1\276\5\16\5\0\1\77\6\16\1\277"+
    "\4\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\32\0\10\16\5\0"+
    "\1\77\3\16\1\300\7\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\32\0\10\16\11\0\1\121\12\0\1\200\3\0\1\200"+
    "\2\0\1\200\3\0\1\121\24\0\1\200\172\0\1\301"+
    "\32\0\1\202\3\0\1\202\2\0\1\202\30\0\1\202"+
    "\76\0\1\302\2\0\1\302\30\0\1\302\72\0\1\210"+
    "\3\0\1\210\2\0\1\210\30\0\1\210\3\0\1\206"+
    "\101\0\1\303\7\0\1\304\5\0\1\305\64\0\3\306"+
    "\5\0\1\306\4\0\1\306\1\0\3\306\2\0\1\306"+
    "\3\0\1\306\14\0\2\306\1\0\2\306\3\0\1\306"+
    "\36\0\1\306\43\0\1\221\10\0\1\307\2\0\1\310"+
    "\1\0\1\311\13\0\1\131\65\0\1\131\1\0\1\131"+
    "\3\0\1\131\2\0\1\131\1\0\1\131\2\0\3\131"+
    "\2\0\20\131\1\0\3\131\13\0\1\131\13\0\1\131"+
    "\61\0\1\303\5\0\1\312\126\0\1\131\142\0\1\131"+
    "\106\0\1\313\11\0\1\314\3\0\1\315\10\0\1\131"+
    "\1\0\1\316\117\0\1\131\135\0\1\312\131\0\1\316"+
    "\5\0\1\131\107\0\1\303\10\0\1\131\132\0\1\131"+
    "\7\0\1\131\53\0\4\226\14\0\1\134\13\0\1\226"+
    "\125\0\1\134\2\0\1\134\30\0\1\134\105\0\1\317"+
    "\7\0\1\320\5\0\1\321\64\0\3\134\5\0\1\134"+
    "\4\0\1\134\1\0\3\134\2\0\1\134\3\0\1\134"+
    "\14\0\2\134\1\0\2\134\3\0\1\134\36\0\1\134"+
    "\43\0\1\240\10\0\1\322\2\0\1\323\1\0\1\324"+
    "\13\0\1\134\65\0\1\134\1\0\1\134\3\0\1\134"+
    "\2\0\1\134\1\0\1\134\2\0\3\134\2\0\20\134"+
    "\1\0\3\134\13\0\1\134\13\0\1\134\61\0\1\317"+
    "\5\0\1\325\126\0\1\134\142\0\1\134\106\0\1\134"+
    "\11\0\1\326\3\0\1\327\10\0\1\134\1\0\1\330"+
    "\117\0\1\134\135\0\1\325\131\0\1\330\5\0\1\134"+
    "\107\0\1\317\10\0\1\134\132\0\1\134\7\0\1\134"+
    "\55\0\1\245\134\0\1\77\3\16\1\331\7\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\10\16\5\0\1\77\4\16"+
    "\1\332\6\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\32\0\10\16"+
    "\5\0\1\77\12\16\1\333\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\32\0\10\16\5\0\1\77\7\16\1\334\3\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\10\16\3\0\1\255\127\0"+
    "\2\153\1\335\16\153\1\256\111\153\13\0\1\336\125\0"+
    "\1\337\132\0\1\262\133\0\1\153\134\0\1\153\137\0"+
    "\1\340\125\0\1\262\126\0\1\77\13\16\1\0\3\16"+
    "\1\0\3\16\1\341\3\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\32\0\10\16\5\0\1\77"+
    "\13\16\1\0\3\16\1\0\1\342\6\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\32\0\10\16"+
    "\5\0\1\77\7\16\1\343\3\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\32\0\10\16\5\0\1\77\1\344\12\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\10\16\5\0\1\77\12\16"+
    "\1\345\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\32\0\10\16\5\0"+
    "\1\77\13\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\346\1\0\24\16\32\0\10\16"+
    "\5\0\1\77\13\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\32\0"+
    "\3\16\1\347\4\16\5\0\1\77\6\16\1\350\4\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\32\0\10\16\6\0\1\351"+
    "\154\0\1\302\2\0\1\302\30\0\1\302\3\0\1\206"+
    "\111\0\1\131\122\0\1\131\157\0\1\131\55\0\3\306"+
    "\5\0\1\306\4\0\1\306\1\0\3\306\2\0\1\306"+
    "\3\0\1\306\14\0\2\306\1\0\2\306\3\0\1\306"+
    "\3\0\1\206\32\0\1\306\62\0\1\131\134\0\1\131"+
    "\107\0\1\131\24\0\1\131\131\0\1\131\125\0\1\131"+
    "\16\0\1\206\121\0\1\131\105\0\1\131\145\0\1\131"+
    "\134\0\1\134\122\0\1\134\157\0\1\134\121\0\1\134"+
    "\134\0\1\134\107\0\1\134\24\0\1\134\131\0\1\134"+
    "\133\0\1\134\105\0\1\134\145\0\1\134\71\0\1\352"+
    "\1\77\13\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\32\0\10\16"+
    "\5\0\1\77\5\16\1\353\5\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\32\0\10\16\5\0\1\77\3\16\1\354\7\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\32\0\10\16\2\153\1\0"+
    "\16\153\1\256\111\153\20\0\1\355\124\0\1\263\135\0"+
    "\1\153\122\0\1\77\5\16\1\356\1\16\1\357\3\16"+
    "\1\0\3\16\1\0\7\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\24\16\32\0\10\16\5\0\1\77"+
    "\4\16\1\360\6\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\32\0"+
    "\10\16\5\0\1\77\13\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\32\0\2\16\1\361\5\16\5\0\1\77\13\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\1\16\1\362\6\16\5\0"+
    "\1\77\5\16\1\363\5\16\1\0\3\16\1\0\7\16"+
    "\2\0\1\16\1\0\1\16\1\0\1\16\1\0\24\16"+
    "\32\0\10\16\5\0\1\77\1\364\12\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\32\0\10\16\5\0\1\77\13\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\4\16\1\365\3\16\12\0"+
    "\1\366\126\0\1\367\1\370\130\0\1\77\3\16\1\371"+
    "\7\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\32\0\10\16\10\0"+
    "\1\263\127\0\1\77\11\16\1\372\1\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\32\0\10\16\5\0\1\77\4\16\1\373"+
    "\6\16\1\0\3\16\1\0\7\16\2\0\1\16\1\0"+
    "\1\16\1\0\1\16\1\0\24\16\32\0\10\16\5\0"+
    "\1\77\13\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\32\0\2\16"+
    "\1\374\5\16\5\0\1\77\4\16\1\375\6\16\1\0"+
    "\3\16\1\0\7\16\2\0\1\16\1\0\1\16\1\0"+
    "\1\16\1\0\24\16\32\0\10\16\5\0\1\77\3\16"+
    "\1\376\7\16\1\0\3\16\1\0\7\16\2\0\1\16"+
    "\1\0\1\16\1\0\1\16\1\0\24\16\32\0\10\16"+
    "\121\0\1\377\23\0\1\u0100\146\0\1\u0101\111\0\1\77"+
    "\3\16\1\u0102\7\16\1\0\3\16\1\0\7\16\2\0"+
    "\1\16\1\0\1\16\1\0\1\16\1\0\24\16\32\0"+
    "\10\16\4\0\1\u0103\1\77\13\16\1\0\3\16\1\0"+
    "\7\16\2\0\1\16\1\0\1\16\1\0\1\16\1\0"+
    "\24\16\32\0\10\16\5\0\1\77\13\16\1\0\3\16"+
    "\1\0\7\16\2\0\1\16\1\0\1\16\1\0\1\16"+
    "\1\0\24\16\32\0\1\16\1\u0104\6\16\17\0\1\u0105"+
    "\127\0\1\u0106\246\0\1\u0107\10\0\1\u0108\2\0\1\u0109"+
    "\137\0\1\u010a\241\0\1\u010b\13\0\1\u010c\254\0\1\u010d"+
    "\33\0\1\u010e\111\0\1\u010f\150\0\1\u0110\117\0\1\u0111"+
    "\246\0\1\u0112\132\0\1\u0113\14\0\1\u0114\133\0\1\u0115"+
    "\246\0\1\u0116\22\0\1\u0117\132\0\1\u0118\236\0\1\u0119"+
    "\27\0\1\u011a\130\0\1\u011b\132\0\1\u011c\126\0\1\u011d"+
    "\246\0\1\u011e\132\0\1\u011f\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[20748];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\2\1\1\11\17\1\1\11\6\1\1\11"+
    "\7\1\12\11\1\1\1\11\3\1\1\11\3\1\5\0"+
    "\20\1\1\0\1\1\1\0\1\1\2\0\3\1\1\11"+
    "\4\0\1\1\1\0\1\11\1\0\1\11\12\1\1\11"+
    "\1\1\6\0\1\11\16\1\1\0\1\1\1\0\2\1"+
    "\1\11\36\0\1\11\1\1\1\11\5\1\1\11\1\1"+
    "\7\0\13\1\30\0\5\1\3\0\10\1\2\0\2\1"+
    "\1\0\10\1\3\0\6\1\3\0\1\1\1\0\1\1"+
    "\21\0\1\11\2\0\1\11\3\0\3\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[287];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _HaskellLexer() {
    this((java.io.Reader)null);
  }
    private int commentStart;
    private int commentDepth;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _HaskellLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        switch (zzLexicalState) {
            case NCOMMENT: {
              int state = yystate();
        yybegin(YYINITIAL);
        zzStartRead = commentStart;
        return HS_NCOMMENT;
            }
            case 288: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return com.intellij.psi.TokenType.BAD_CHARACTER;
            }
          case 72: break;
          case 2: 
            { return com.intellij.psi.TokenType.WHITE_SPACE;
            }
          case 73: break;
          case 3: 
            { return HS_NEWLINE;
            }
          case 74: break;
          case 4: 
            { return HS_VARSYM_ID;
            }
          case 75: break;
          case 5: 
            { return HS_VAR_ID;
            }
          case 76: break;
          case 6: 
            { return HS_BACKSLASH;
            }
          case 77: break;
          case 7: 
            { return HS_CON_ID;
            }
          case 78: break;
          case 8: 
            { return HS_DECIMAL;
            }
          case 79: break;
          case 9: 
            { return HS_RIGHT_BRACKET;
            }
          case 80: break;
          case 10: 
            { return HS_UNDERSCORE;
            }
          case 81: break;
          case 11: 
            { return HS_QUOTE;
            }
          case 82: break;
          case 12: 
            { return HS_DOT;
            }
          case 83: break;
          case 13: 
            { return HS_EQUAL;
            }
          case 84: break;
          case 14: 
            { return HS_AT;
            }
          case 85: break;
          case 15: 
            { return HS_VERTICAL_BAR;
            }
          case 86: break;
          case 16: 
            { return HS_TILDE;
            }
          case 87: break;
          case 17: 
            { return HS_CONSYM_ID;
            }
          case 88: break;
          case 18: 
            { return HS_COLON_COLON;
            }
          case 89: break;
          case 19: 
            { return HS_LEFT_ARROW;
            }
          case 90: break;
          case 20: 
            { return HS_RIGHT_ARROW;
            }
          case 91: break;
          case 21: 
            { return HS_DOUBLE_RIGHT_ARROW;
            }
          case 92: break;
          case 22: 
            { return HS_LEFT_PAREN;
            }
          case 93: break;
          case 23: 
            { return HS_RIGHT_PAREN;
            }
          case 94: break;
          case 24: 
            { return HS_COMMA;
            }
          case 95: break;
          case 25: 
            { return HS_SEMICOLON;
            }
          case 96: break;
          case 26: 
            { return HS_LEFT_BRACKET;
            }
          case 97: break;
          case 27: 
            { return HS_BACKQUOTE;
            }
          case 98: break;
          case 28: 
            { return HS_LEFT_BRACE;
            }
          case 99: break;
          case 29: 
            { return HS_RIGHT_BRACE;
            }
          case 100: break;
          case 30: 
            { 
            }
          case 101: break;
          case 31: 
            { return HS_IF;
            }
          case 102: break;
          case 32: 
            { return HS_IN;
            }
          case 103: break;
          case 33: 
            { return HS_DO;
            }
          case 104: break;
          case 34: 
            { return HS_OF;
            }
          case 105: break;
          case 35: 
            { return HS_COMMENT;
            }
          case 106: break;
          case 36: 
            { return HS_NCOMMENT_END;
            }
          case 107: break;
          case 37: 
            { return HS_STRING_LITERAL;
            }
          case 108: break;
          case 38: 
            { return HS_DOT_DOT;
            }
          case 109: break;
          case 39: 
            { return HS_NCOMMENT_START;
            }
          case 110: break;
          case 40: 
            { if (commentDepth > 0) {
            commentDepth--;
        }
        else {
             int state = yystate();
             yybegin(YYINITIAL);
             zzStartRead = commentStart;
             return HS_NCOMMENT;
        }
            }
          case 111: break;
          case 41: 
            { commentDepth++;
            }
          case 112: break;
          case 42: 
            { return HS_DIRECTIVE;
            }
          case 113: break;
          case 43: 
            { return HS_PRAGMA_END;
            }
          case 114: break;
          case 44: 
            { return HS_SHEBANG_LINE;
            }
          case 115: break;
          case 45: 
            { return HS_LET;
            }
          case 116: break;
          case 46: 
            { return HS_FLOAT;
            }
          case 117: break;
          case 47: 
            { return HS_OCTAL;
            }
          case 118: break;
          case 48: 
            { return HS_HEXADECIMAL;
            }
          case 119: break;
          case 49: 
            { return HS_CHARACTER_LITERAL;
            }
          case 120: break;
          case 50: 
            { yybegin(NCOMMENT);
    commentDepth = 0;
    commentStart = getTokenStart();
            }
          case 121: break;
          case 51: 
            { return HS_PRAGMA_START;
            }
          case 122: break;
          case 52: 
            { return HS_DATA;
            }
          case 123: break;
          case 53: 
            { return HS_ELSE;
            }
          case 124: break;
          case 54: 
            { return HS_CASE;
            }
          case 125: break;
          case 55: 
            { return HS_TYPE;
            }
          case 126: break;
          case 56: 
            { return HS_THEN;
            }
          case 127: break;
          case 57: 
            { return HS_INFIX;
            }
          case 128: break;
          case 58: 
            { return HS_CLASS;
            }
          case 129: break;
          case 59: 
            { return HS_WHERE;
            }
          case 130: break;
          case 60: 
            { return HS_INFIXL;
            }
          case 131: break;
          case 61: 
            { return HS_INFIXR;
            }
          case 132: break;
          case 62: 
            { return HS_IMPORT;
            }
          case 133: break;
          case 63: 
            { return HS_MODULE;
            }
          case 134: break;
          case 64: 
            { return HS_DEFAULT;
            }
          case 135: break;
          case 65: 
            { return HS_NEWTYPE;
            }
          case 136: break;
          case 66: 
            { return HS_INSTANCE;
            }
          case 137: break;
          case 67: 
            { return HS_DERIVING;
            }
          case 138: break;
          case 68: 
            { return HS_TYPE_FAMILY;
            }
          case 139: break;
          case 69: 
            { return HS_TYPE_INSTANCE;
            }
          case 140: break;
          case 70: 
            { return HS_FOREIGN_IMPORT;
            }
          case 141: break;
          case 71: 
            { return HS_FOREIGN_EXPORT;
            }
          case 142: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
