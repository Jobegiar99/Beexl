# Generated from beexl.g4 by ANTLR 4.9.3
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

from mySemantic import *

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A")
        buf.write("\u01d3\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31")
        buf.write("\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36")
        buf.write("\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t")
        buf.write("&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\3")
        buf.write("\2\3\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3s\n\3\3\4\3\4")
        buf.write("\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3")
        buf.write("\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3\7\3\7\3\7\3\7\3")
        buf.write("\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u009a\n\b\3")
        buf.write("\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13")
        buf.write("\5\13\u00a9\n\13\3\f\3\f\3\f\3\f\5\f\u00af\n\f\3\r\3\r")
        buf.write("\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00bd")
        buf.write("\n\16\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00c5\n\17\r")
        buf.write("\17\16\17\u00c6\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00cf")
        buf.write("\n\20\3\21\3\21\3\21\5\21\u00d4\n\21\3\21\3\21\5\21\u00d8")
        buf.write("\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e2")
        buf.write("\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24")
        buf.write("\7\24\u00ee\n\24\f\24\16\24\u00f1\13\24\7\24\u00f3\n\24")
        buf.write("\f\24\16\24\u00f6\13\24\3\24\3\24\3\24\3\25\3\25\3\25")
        buf.write("\3\25\3\25\3\25\7\25\u0101\n\25\f\25\16\25\u0104\13\25")
        buf.write("\3\25\3\25\5\25\u0108\n\25\3\26\3\26\3\26\7\26\u010d\n")
        buf.write("\26\f\26\16\26\u0110\13\26\3\26\3\26\3\27\3\27\5\27\u0116")
        buf.write("\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u011e\n\30\3")
        buf.write("\31\3\31\5\31\u0122\n\31\3\32\3\32\3\32\3\32\3\32\3\32")
        buf.write("\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0130\n\32\3\32\3")
        buf.write("\32\3\33\3\33\5\33\u0136\n\33\3\34\3\34\3\34\3\34\3\34")
        buf.write("\3\34\5\34\u013e\n\34\3\35\3\35\5\35\u0142\n\35\3\36\3")
        buf.write("\36\3\36\3\36\5\36\u0148\n\36\3\36\3\36\3\37\3\37\3\37")
        buf.write("\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0158")
        buf.write("\n\37\3 \3 \3 \3 \3 \3 \3 \7 \u0161\n \f \16 \u0164\13")
        buf.write(" \3 \3 \3!\3!\5!\u016a\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#")
        buf.write("\5#\u0174\n#\3$\3$\3$\3$\3$\3$\3$\5$\u017d\n$\3%\3%\3")
        buf.write("%\3%\3&\3&\3&\3&\5&\u0187\n&\3\'\3\'\3\'\3\'\3\'\3\'\3")
        buf.write("(\3(\3(\3(\3(\3(\3(\3(\5(\u0197\n(\3)\3)\3)\7)\u019c\n")
        buf.write(")\f)\16)\u019f\13)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\7")
        buf.write("+\u01ac\n+\f+\16+\u01af\13+\3+\3+\3,\3,\3,\3,\3,\3,\3")
        buf.write(",\3,\7,\u01bb\n,\f,\16,\u01be\13,\3,\3,\3,\3-\3-\3-\5")
        buf.write("-\u01c6\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01d1\n.\3.\2")
        buf.write("\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60")
        buf.write("\62\64\668:<>@BDFHJLNPRTVXZ\2\3\3\2\'*\2\u01dd\2\\\3\2")
        buf.write("\2\2\4r\3\2\2\2\6t\3\2\2\2\b|\3\2\2\2\n\u0089\3\2\2\2")
        buf.write("\f\u008b\3\2\2\2\16\u0099\3\2\2\2\20\u009b\3\2\2\2\22")
        buf.write("\u009e\3\2\2\2\24\u00a8\3\2\2\2\26\u00ae\3\2\2\2\30\u00b0")
        buf.write("\3\2\2\2\32\u00bc\3\2\2\2\34\u00be\3\2\2\2\36\u00ce\3")
        buf.write("\2\2\2 \u00d0\3\2\2\2\"\u00db\3\2\2\2$\u00e5\3\2\2\2&")
        buf.write("\u00e8\3\2\2\2(\u00fa\3\2\2\2*\u0109\3\2\2\2,\u0113\3")
        buf.write("\2\2\2.\u011d\3\2\2\2\60\u011f\3\2\2\2\62\u012f\3\2\2")
        buf.write("\2\64\u0133\3\2\2\2\66\u013d\3\2\2\28\u013f\3\2\2\2:\u0147")
        buf.write("\3\2\2\2<\u0157\3\2\2\2>\u0159\3\2\2\2@\u0169\3\2\2\2")
        buf.write("B\u016b\3\2\2\2D\u0173\3\2\2\2F\u0175\3\2\2\2H\u017e\3")
        buf.write("\2\2\2J\u0186\3\2\2\2L\u0188\3\2\2\2N\u0196\3\2\2\2P\u0198")
        buf.write("\3\2\2\2R\u01a2\3\2\2\2T\u01ad\3\2\2\2V\u01b2\3\2\2\2")
        buf.write("X\u01c5\3\2\2\2Z\u01d0\3\2\2\2\\]\7\31\2\2]a\5\4\3\2^")
        buf.write("`\5\30\r\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3")
        buf.write("\2\2\2ca\3\2\2\2de\5T+\2e\3\3\2\2\2fg\7\32\2\2gh\7A\2")
        buf.write("\2hi\b\3\1\2is\7\3\2\2jk\7\33\2\2kl\7A\2\2lm\b\3\1\2m")
        buf.write("n\7\3\2\2no\5\6\4\2op\b\3\1\2pq\5\b\5\2qs\3\2\2\2rf\3")
        buf.write("\2\2\2rj\3\2\2\2s\5\3\2\2\2tu\7\34\2\2uv\7@\2\2vw\b\4")
        buf.write("\1\2wx\7\4\2\2xy\7@\2\2yz\b\4\1\2z{\7\3\2\2{\7\3\2\2\2")
        buf.write("|}\7 \2\2}~\5\f\7\2~\177\b\5\1\2\177\u0080\7\3\2\2\u0080")
        buf.write("\t\3\2\2\2\u0081\u0082\7\36\2\2\u0082\u008a\b\6\1\2\u0083")
        buf.write("\u0084\7\35\2\2\u0084\u008a\b\6\1\2\u0085\u0086\7\61\2")
        buf.write("\2\u0086\u008a\b\6\1\2\u0087\u0088\7\62\2\2\u0088\u008a")
        buf.write("\b\6\1\2\u0089\u0081\3\2\2\2\u0089\u0083\3\2\2\2\u0089")
        buf.write("\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a\13\3\2\2\2\u008b")
        buf.write("\u008c\7\35\2\2\u008c\u008d\7\5\2\2\u008d\u008e\5\16\b")
        buf.write("\2\u008e\u008f\7\4\2\2\u008f\u0090\5\16\b\2\u0090\u0091")
        buf.write("\7\4\2\2\u0091\u0092\5\16\b\2\u0092\u0093\7\4\2\2\u0093")
        buf.write("\u0094\5\16\b\2\u0094\u0095\7\6\2\2\u0095\r\3\2\2\2\u0096")
        buf.write("\u009a\5\20\t\2\u0097\u0098\7@\2\2\u0098\u009a\b\b\1\2")
        buf.write("\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u009a\17\3\2")
        buf.write("\2\2\u009b\u009c\t\2\2\2\u009c\u009d\b\t\1\2\u009d\21")
        buf.write("\3\2\2\2\u009e\u009f\7\36\2\2\u009f\u00a0\7\5\2\2\u00a0")
        buf.write("\u00a1\5\24\13\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\5\24")
        buf.write("\13\2\u00a3\u00a4\7\6\2\2\u00a4\23\3\2\2\2\u00a5\u00a6")
        buf.write("\7@\2\2\u00a6\u00a9\b\13\1\2\u00a7\u00a9\5\26\f\2\u00a8")
        buf.write("\u00a5\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\25\3\2\2\2\u00aa")
        buf.write("\u00ab\7>\2\2\u00ab\u00af\b\f\1\2\u00ac\u00ad\7=\2\2\u00ad")
        buf.write("\u00af\b\f\1\2\u00ae\u00aa\3\2\2\2\u00ae\u00ac\3\2\2\2")
        buf.write("\u00af\27\3\2\2\2\u00b0\u00b1\7!\2\2\u00b1\u00b2\7?\2")
        buf.write("\2\u00b2\u00b3\b\r\1\2\u00b3\u00b4\7\7\2\2\u00b4\u00b5")
        buf.write("\5\n\6\2\u00b5\u00b6\6\r\2\2\u00b6\u00b7\7\3\2\2\u00b7")
        buf.write("\31\3\2\2\2\u00b8\u00bd\5\36\20\2\u00b9\u00bd\5(\25\2")
        buf.write("\u00ba\u00bd\5> \2\u00bb\u00bd\5\34\17\2\u00bc\u00b8\3")
        buf.write("\2\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb")
        buf.write("\3\2\2\2\u00bd\33\3\2\2\2\u00be\u00bf\7;\2\2\u00bf\u00c0")
        buf.write("\7\5\2\2\u00c0\u00c1\5,\27\2\u00c1\u00c2\7\6\2\2\u00c2")
        buf.write("\u00c4\7\b\2\2\u00c3\u00c5\5\36\20\2\u00c4\u00c3\3\2\2")
        buf.write("\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7")
        buf.write("\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\t\2\2\u00c9")
        buf.write("\35\3\2\2\2\u00ca\u00cf\5 \21\2\u00cb\u00cf\5\"\22\2\u00cc")
        buf.write("\u00cf\5$\23\2\u00cd\u00cf\5&\24\2\u00ce\u00ca\3\2\2\2")
        buf.write("\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3")
        buf.write("\2\2\2\u00cf\37\3\2\2\2\u00d0\u00d3\7+\2\2\u00d1\u00d4")
        buf.write("\7?\2\2\u00d2\u00d4\5\22\n\2\u00d3\u00d1\3\2\2\2\u00d3")
        buf.write("\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d8\7?\2\2")
        buf.write("\u00d6\u00d8\5\f\7\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3")
        buf.write("\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\3\2\2\u00da!")
        buf.write("\3\2\2\2\u00db\u00dc\7?\2\2\u00dc\u00dd\7\n\2\2\u00dd")
        buf.write("\u00e1\b\22\1\2\u00de\u00e2\5,\27\2\u00df\u00e2\5\22\n")
        buf.write("\2\u00e0\u00e2\5\f\7\2\u00e1\u00de\3\2\2\2\u00e1\u00df")
        buf.write("\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3")
        buf.write("\u00e4\7\3\2\2\u00e4#\3\2\2\2\u00e5\u00e6\7&\2\2\u00e6")
        buf.write("\u00e7\7\3\2\2\u00e7%\3\2\2\2\u00e8\u00e9\7?\2\2\u00e9")
        buf.write("\u00f4\7\5\2\2\u00ea\u00ef\7?\2\2\u00eb\u00ec\7\4\2\2")
        buf.write("\u00ec\u00ee\7?\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3")
        buf.write("\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3")
        buf.write("\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f3")
        buf.write("\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2")
        buf.write("\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7")
        buf.write("\6\2\2\u00f8\u00f9\7\3\2\2\u00f9\'\3\2\2\2\u00fa\u00fb")
        buf.write("\7\67\2\2\u00fb\u00fc\7\5\2\2\u00fc\u00fd\5,\27\2\u00fd")
        buf.write("\u00fe\7\6\2\2\u00fe\u0102\7\b\2\2\u00ff\u0101\5\36\20")
        buf.write("\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100")
        buf.write("\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104")
        buf.write("\u0102\3\2\2\2\u0105\u0107\7\t\2\2\u0106\u0108\5*\26\2")
        buf.write("\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108)\3\2\2")
        buf.write("\2\u0109\u010a\78\2\2\u010a\u010e\7\b\2\2\u010b\u010d")
        buf.write("\5\36\20\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e")
        buf.write("\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2")
        buf.write("\u0110\u010e\3\2\2\2\u0111\u0112\7\t\2\2\u0112+\3\2\2")
        buf.write("\2\u0113\u0115\5\60\31\2\u0114\u0116\5.\30\2\u0115\u0114")
        buf.write("\3\2\2\2\u0115\u0116\3\2\2\2\u0116-\3\2\2\2\u0117\u0118")
        buf.write("\7\13\2\2\u0118\u0119\b\30\1\2\u0119\u011e\5,\27\2\u011a")
        buf.write("\u011b\7\f\2\2\u011b\u011c\b\30\1\2\u011c\u011e\5,\27")
        buf.write("\2\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e/\3\2")
        buf.write("\2\2\u011f\u0121\5\64\33\2\u0120\u0122\5\62\32\2\u0121")
        buf.write("\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\61\3\2\2\2\u0123")
        buf.write("\u0124\7\r\2\2\u0124\u0130\b\32\1\2\u0125\u0126\7\16\2")
        buf.write("\2\u0126\u0130\b\32\1\2\u0127\u0128\7\17\2\2\u0128\u0130")
        buf.write("\b\32\1\2\u0129\u012a\7\20\2\2\u012a\u0130\b\32\1\2\u012b")
        buf.write("\u012c\7\21\2\2\u012c\u0130\b\32\1\2\u012d\u012e\7\22")
        buf.write("\2\2\u012e\u0130\b\32\1\2\u012f\u0123\3\2\2\2\u012f\u0125")
        buf.write("\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u0129\3\2\2\2\u012f")
        buf.write("\u012b\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\3\2\2\2")
        buf.write("\u0131\u0132\5\60\31\2\u0132\63\3\2\2\2\u0133\u0135\5")
        buf.write("8\35\2\u0134\u0136\5\66\34\2\u0135\u0134\3\2\2\2\u0135")
        buf.write("\u0136\3\2\2\2\u0136\65\3\2\2\2\u0137\u0138\7\23\2\2\u0138")
        buf.write("\u0139\b\34\1\2\u0139\u013e\5\64\33\2\u013a\u013b\7\24")
        buf.write("\2\2\u013b\u013c\b\34\1\2\u013c\u013e\5\64\33\2\u013d")
        buf.write("\u0137\3\2\2\2\u013d\u013a\3\2\2\2\u013e\67\3\2\2\2\u013f")
        buf.write("\u0141\5<\37\2\u0140\u0142\5:\36\2\u0141\u0140\3\2\2\2")
        buf.write("\u0141\u0142\3\2\2\2\u01429\3\2\2\2\u0143\u0144\7\25\2")
        buf.write("\2\u0144\u0148\b\36\1\2\u0145\u0146\7\26\2\2\u0146\u0148")
        buf.write("\b\36\1\2\u0147\u0143\3\2\2\2\u0147\u0145\3\2\2\2\u0148")
        buf.write("\u0149\3\2\2\2\u0149\u014a\58\35\2\u014a;\3\2\2\2\u014b")
        buf.write("\u014c\7?\2\2\u014c\u0158\6\37\3\3\u014d\u014e\7@\2\2")
        buf.write("\u014e\u0158\b\37\1\2\u014f\u0158\5L\'\2\u0150\u0158\5")
        buf.write("F$\2\u0151\u0152\7\5\2\2\u0152\u0153\b\37\1\2\u0153\u0154")
        buf.write("\5,\27\2\u0154\u0155\7\6\2\2\u0155\u0156\b\37\1\2\u0156")
        buf.write("\u0158\3\2\2\2\u0157\u014b\3\2\2\2\u0157\u014d\3\2\2\2")
        buf.write("\u0157\u014f\3\2\2\2\u0157\u0150\3\2\2\2\u0157\u0151\3")
        buf.write("\2\2\2\u0158=\3\2\2\2\u0159\u015a\79\2\2\u015a\u015b\5")
        buf.write("@!\2\u015b\u015c\7:\2\2\u015c\u015d\5@!\2\u015d\u015e")
        buf.write("\7<\2\2\u015e\u0162\7\b\2\2\u015f\u0161\5\36\20\2\u0160")
        buf.write("\u015f\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2")
        buf.write("\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3")
        buf.write("\2\2\2\u0165\u0166\7\t\2\2\u0166?\3\2\2\2\u0167\u016a")
        buf.write("\5\22\n\2\u0168\u016a\5\f\7\2\u0169\u0167\3\2\2\2\u0169")
        buf.write("\u0168\3\2\2\2\u016aA\3\2\2\2\u016b\u016c\5D#\2\u016c")
        buf.write("\u016d\5\64\33\2\u016d\u016e\5D#\2\u016eC\3\2\2\2\u016f")
        buf.write("\u0170\7?\2\2\u0170\u0174\6#\4\3\u0171\u0174\5\22\n\2")
        buf.write("\u0172\u0174\5F$\2\u0173\u016f\3\2\2\2\u0173\u0171\3\2")
        buf.write("\2\2\u0173\u0172\3\2\2\2\u0174E\3\2\2\2\u0175\u0176\7")
        buf.write("?\2\2\u0176\u0177\6$\5\3\u0177\u017c\7\27\2\2\u0178\u0179")
        buf.write("\7/\2\2\u0179\u017d\b$\1\2\u017a\u017b\7\60\2\2\u017b")
        buf.write("\u017d\b$\1\2\u017c\u0178\3\2\2\2\u017c\u017a\3\2\2\2")
        buf.write("\u017dG\3\2\2\2\u017e\u017f\5J&\2\u017f\u0180\5\64\33")
        buf.write("\2\u0180\u0181\5J&\2\u0181I\3\2\2\2\u0182\u0183\7?\2\2")
        buf.write("\u0183\u0187\b&\1\2\u0184\u0187\5\f\7\2\u0185\u0187\5")
        buf.write("L\'\2\u0186\u0182\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185")
        buf.write("\3\2\2\2\u0187K\3\2\2\2\u0188\u0189\7?\2\2\u0189\u018a")
        buf.write("\6\'\6\3\u018a\u018b\b\'\1\2\u018b\u018c\7\27\2\2\u018c")
        buf.write("\u018d\5N(\2\u018dM\3\2\2\2\u018e\u018f\7\63\2\2\u018f")
        buf.write("\u0197\b(\1\2\u0190\u0191\7\64\2\2\u0191\u0197\b(\1\2")
        buf.write("\u0192\u0193\7\65\2\2\u0193\u0197\b(\1\2\u0194\u0195\7")
        buf.write("\66\2\2\u0195\u0197\b(\1\2\u0196\u018e\3\2\2\2\u0196\u0190")
        buf.write("\3\2\2\2\u0196\u0192\3\2\2\2\u0196\u0194\3\2\2\2\u0197")
        buf.write("O\3\2\2\2\u0198\u019d\7\b\2\2\u0199\u019c\5\30\r\2\u019a")
        buf.write("\u019c\5\32\16\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2")
        buf.write("\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e")
        buf.write("\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0")
        buf.write("\u01a1\7\t\2\2\u01a1Q\3\2\2\2\u01a2\u01a3\7\"\2\2\u01a3")
        buf.write("\u01a4\7#\2\2\u01a4\u01a5\7$\2\2\u01a5\u01a6\7\5\2\2\u01a6")
        buf.write("\u01a7\7\6\2\2\u01a7\u01a8\5P)\2\u01a8\u01a9\b*\1\2\u01a9")
        buf.write("S\3\2\2\2\u01aa\u01ac\5V,\2\u01ab\u01aa\3\2\2\2\u01ac")
        buf.write("\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2")
        buf.write("\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\5")
        buf.write("R*\2\u01b1U\3\2\2\2\u01b2\u01b3\7\"\2\2\u01b3\u01b4\5")
        buf.write("X-\2\u01b4\u01b5\7?\2\2\u01b5\u01b6\b,\1\2\u01b6\u01b7")
        buf.write("\b,\1\2\u01b7\u01b8\6,\7\2\u01b8\u01bc\7\5\2\2\u01b9\u01bb")
        buf.write("\5Z.\2\u01ba\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba")
        buf.write("\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be")
        buf.write("\u01bc\3\2\2\2\u01bf\u01c0\7\6\2\2\u01c0\u01c1\5P)\2\u01c1")
        buf.write("W\3\2\2\2\u01c2\u01c6\5\n\6\2\u01c3\u01c4\7#\2\2\u01c4")
        buf.write("\u01c6\b-\1\2\u01c5\u01c2\3\2\2\2\u01c5\u01c3\3\2\2\2")
        buf.write("\u01c6Y\3\2\2\2\u01c7\u01c8\7?\2\2\u01c8\u01c9\6.\b\3")
        buf.write("\u01c9\u01ca\7\7\2\2\u01ca\u01cb\5\n\6\2\u01cb\u01cc\7")
        buf.write("\4\2\2\u01cc\u01d1\3\2\2\2\u01cd\u01ce\7?\2\2\u01ce\u01cf")
        buf.write("\7\7\2\2\u01cf\u01d1\5\n\6\2\u01d0\u01c7\3\2\2\2\u01d0")
        buf.write("\u01cd\3\2\2\2\u01d1[\3\2\2\2(ar\u0089\u0099\u00a8\u00ae")
        buf.write("\u00bc\u00c6\u00ce\u00d3\u00d7\u00e1\u00ef\u00f4\u0102")
        buf.write("\u0107\u010e\u0115\u011d\u0121\u012f\u0135\u013d\u0141")
        buf.write("\u0147\u0157\u0162\u0169\u0173\u017c\u0186\u0196\u019b")
        buf.write("\u019d\u01ad\u01bc\u01c5\u01d0")
        return buf.getvalue()


class beexlParser ( Parser ):

    grammarFileName = "beexl.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "','", "'('", "')'", "':'", "'{'", 
                     "'}'", "'='", "'&&'", "'||'", "'>'", "'<'", "'<='", 
                     "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", 
                     "'.'", "<INVALID>", "'filename'", "'read'", "'create'", 
                     "'canvas'", "'rgba'", "'vector'", "'format'", "'background'", 
                     "'var'", "'fun'", "'void'", "'main'", "'return'", "'print'", 
                     "'MAX_RED'", "'MAX_BLUE'", "'MAX_GREEN'", "'MAX_ALPHA'", 
                     "'fill'", "'.png'", "'.jpg'", "'.jpeg'", "'x'", "'y'", 
                     "'int'", "'float'", "'r'", "'g'", "'b'", "'a'", "'if'", 
                     "'else'", "'from'", "'to'", "'while'", "'do'", "'CANVAS_WIDTH'", 
                     "'CANVAS_HEIGHT'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "WS", "FILENAME", "READ", 
                      "CREATE", "CANVAS", "RGBA", "VECTOR", "FORMAT", "BACKGROUND", 
                      "VAR", "FUNCTION", "VOID", "MAIN", "RETURN", "PRINT", 
                      "MAX_RED", "MAX_BLUE", "MAX_GREEN", "MAX_ALPHA", "FILL", 
                      "PNG", "JPG", "JPEG", "X", "Y", "INT", "FLOAT", "RED", 
                      "GREEN", "BLUE", "ALPHA", "IF", "ELSE", "FROM", "TO", 
                      "WHILE", "DO", "CANVAS_WIDTH", "CANVAS_HEIGHT", "ID", 
                      "NUMBER", "STRINGFILENAME" ]

    RULE_fileconfig0 = 0
    RULE_fileconfig1 = 1
    RULE_canvas0 = 2
    RULE_background0 = 3
    RULE_type0 = 4
    RULE_rgba0 = 5
    RULE_rgba1 = 6
    RULE_cExtras0 = 7
    RULE_vector0 = 8
    RULE_vector1 = 9
    RULE_vExtras0 = 10
    RULE_vars0 = 11
    RULE_instruction0 = 12
    RULE_while0 = 13
    RULE_extras0 = 14
    RULE_pixelFill0 = 15
    RULE_assignment0 = 16
    RULE_print0 = 17
    RULE_functionCall0 = 18
    RULE_conditional0 = 19
    RULE_conditional1 = 20
    RULE_hyperExp0 = 21
    RULE_hyperExp1 = 22
    RULE_superExp0 = 23
    RULE_superExp1 = 24
    RULE_exp0 = 25
    RULE_exp1 = 26
    RULE_term0 = 27
    RULE_term1 = 28
    RULE_factor0 = 29
    RULE_cycle0 = 30
    RULE_cycle1 = 31
    RULE_vectorOperation0 = 32
    RULE_vectorOperation1 = 33
    RULE_vectorAttribute0 = 34
    RULE_rgbaOperation0 = 35
    RULE_rgbaOperation1 = 36
    RULE_rgbaAttribute0 = 37
    RULE_rgbaAttribute1 = 38
    RULE_block0 = 39
    RULE_main0 = 40
    RULE_body0 = 41
    RULE_functionDefinition0 = 42
    RULE_functionDefinition1 = 43
    RULE_functionDefinition2 = 44

    ruleNames =  [ "fileconfig0", "fileconfig1", "canvas0", "background0", 
                   "type0", "rgba0", "rgba1", "cExtras0", "vector0", "vector1", 
                   "vExtras0", "vars0", "instruction0", "while0", "extras0", 
                   "pixelFill0", "assignment0", "print0", "functionCall0", 
                   "conditional0", "conditional1", "hyperExp0", "hyperExp1", 
                   "superExp0", "superExp1", "exp0", "exp1", "term0", "term1", 
                   "factor0", "cycle0", "cycle1", "vectorOperation0", "vectorOperation1", 
                   "vectorAttribute0", "rgbaOperation0", "rgbaOperation1", 
                   "rgbaAttribute0", "rgbaAttribute1", "block0", "main0", 
                   "body0", "functionDefinition0", "functionDefinition1", 
                   "functionDefinition2" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    WS=22
    FILENAME=23
    READ=24
    CREATE=25
    CANVAS=26
    RGBA=27
    VECTOR=28
    FORMAT=29
    BACKGROUND=30
    VAR=31
    FUNCTION=32
    VOID=33
    MAIN=34
    RETURN=35
    PRINT=36
    MAX_RED=37
    MAX_BLUE=38
    MAX_GREEN=39
    MAX_ALPHA=40
    FILL=41
    PNG=42
    JPG=43
    JPEG=44
    X=45
    Y=46
    INT=47
    FLOAT=48
    RED=49
    GREEN=50
    BLUE=51
    ALPHA=52
    IF=53
    ELSE=54
    FROM=55
    TO=56
    WHILE=57
    DO=58
    CANVAS_WIDTH=59
    CANVAS_HEIGHT=60
    ID=61
    NUMBER=62
    STRINGFILENAME=63

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.3")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class Fileconfig0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FILENAME(self):
            return self.getToken(beexlParser.FILENAME, 0)

        def fileconfig1(self):
            return self.getTypedRuleContext(beexlParser.Fileconfig1Context,0)


        def body0(self):
            return self.getTypedRuleContext(beexlParser.Body0Context,0)


        def vars0(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.Vars0Context)
            else:
                return self.getTypedRuleContext(beexlParser.Vars0Context,i)


        def getRuleIndex(self):
            return beexlParser.RULE_fileconfig0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFileconfig0" ):
                listener.enterFileconfig0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFileconfig0" ):
                listener.exitFileconfig0(self)




    def fileconfig0(self):

        localctx = beexlParser.Fileconfig0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_fileconfig0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.match(beexlParser.FILENAME)
            self.state = 91
            self.fileconfig1()
            self.state = 95
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==beexlParser.VAR:
                self.state = 92
                self.vars0()
                self.state = 97
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 98
            self.body0()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Fileconfig1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._STRINGFILENAME = None # Token

        def READ(self):
            return self.getToken(beexlParser.READ, 0)

        def STRINGFILENAME(self):
            return self.getToken(beexlParser.STRINGFILENAME, 0)

        def CREATE(self):
            return self.getToken(beexlParser.CREATE, 0)

        def canvas0(self):
            return self.getTypedRuleContext(beexlParser.Canvas0Context,0)


        def background0(self):
            return self.getTypedRuleContext(beexlParser.Background0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_fileconfig1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFileconfig1" ):
                listener.enterFileconfig1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFileconfig1" ):
                listener.exitFileconfig1(self)




    def fileconfig1(self):

        localctx = beexlParser.Fileconfig1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_fileconfig1)
        try:
            self.state = 112
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.READ]:
                self.enterOuterAlt(localctx, 1)
                self.state = 100
                self.match(beexlParser.READ)
                self.state = 101
                localctx._STRINGFILENAME = self.match(beexlParser.STRINGFILENAME)
                createFilename((None if localctx._STRINGFILENAME is None else localctx._STRINGFILENAME.text))
                self.state = 103
                self.match(beexlParser.T__0)
                pass
            elif token in [beexlParser.CREATE]:
                self.enterOuterAlt(localctx, 2)
                self.state = 104
                self.match(beexlParser.CREATE)
                self.state = 105
                localctx._STRINGFILENAME = self.match(beexlParser.STRINGFILENAME)
                createFilename((None if localctx._STRINGFILENAME is None else localctx._STRINGFILENAME.text))
                self.state = 107
                self.match(beexlParser.T__0)
                self.state = 108
                self.canvas0()
                createCanvas()
                self.state = 110
                self.background0()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Canvas0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._NUMBER = None # Token

        def CANVAS(self):
            return self.getToken(beexlParser.CANVAS, 0)

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(beexlParser.NUMBER)
            else:
                return self.getToken(beexlParser.NUMBER, i)

        def getRuleIndex(self):
            return beexlParser.RULE_canvas0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCanvas0" ):
                listener.enterCanvas0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCanvas0" ):
                listener.exitCanvas0(self)




    def canvas0(self):

        localctx = beexlParser.Canvas0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_canvas0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 114
            self.match(beexlParser.CANVAS)
            self.state = 115
            localctx._NUMBER = self.match(beexlParser.NUMBER)
            valueStack.append((None if localctx._NUMBER is None else localctx._NUMBER.text))
            self.state = 117
            self.match(beexlParser.T__1)
            self.state = 118
            localctx._NUMBER = self.match(beexlParser.NUMBER)
            addToValueStack((None if localctx._NUMBER is None else localctx._NUMBER.text))
            self.state = 120
            self.match(beexlParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Background0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def BACKGROUND(self):
            return self.getToken(beexlParser.BACKGROUND, 0)

        def rgba0(self):
            return self.getTypedRuleContext(beexlParser.Rgba0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_background0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBackground0" ):
                listener.enterBackground0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBackground0" ):
                listener.exitBackground0(self)




    def background0(self):

        localctx = beexlParser.Background0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_background0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 122
            self.match(beexlParser.BACKGROUND)
            self.state = 123
            self.rgba0()
            createBackground()
            self.state = 125
            self.match(beexlParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Type0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._VECTOR = None # Token
            self._RGBA = None # Token
            self._INT = None # Token
            self._FLOAT = None # Token

        def VECTOR(self):
            return self.getToken(beexlParser.VECTOR, 0)

        def RGBA(self):
            return self.getToken(beexlParser.RGBA, 0)

        def INT(self):
            return self.getToken(beexlParser.INT, 0)

        def FLOAT(self):
            return self.getToken(beexlParser.FLOAT, 0)

        def getRuleIndex(self):
            return beexlParser.RULE_type0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType0" ):
                listener.enterType0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType0" ):
                listener.exitType0(self)




    def type0(self):

        localctx = beexlParser.Type0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_type0)
        try:
            self.state = 135
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.VECTOR]:
                self.enterOuterAlt(localctx, 1)
                self.state = 127
                localctx._VECTOR = self.match(beexlParser.VECTOR)
                nameStack.append((None if localctx._VECTOR is None else localctx._VECTOR.text))
                pass
            elif token in [beexlParser.RGBA]:
                self.enterOuterAlt(localctx, 2)
                self.state = 129
                localctx._RGBA = self.match(beexlParser.RGBA)
                nameStack.append((None if localctx._RGBA is None else localctx._RGBA.text))
                pass
            elif token in [beexlParser.INT]:
                self.enterOuterAlt(localctx, 3)
                self.state = 131
                localctx._INT = self.match(beexlParser.INT)
                nameStack.append((None if localctx._INT is None else localctx._INT.text))
                pass
            elif token in [beexlParser.FLOAT]:
                self.enterOuterAlt(localctx, 4)
                self.state = 133
                localctx._FLOAT = self.match(beexlParser.FLOAT)
                nameStack.append((None if localctx._FLOAT is None else localctx._FLOAT.text))
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Rgba0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RGBA(self):
            return self.getToken(beexlParser.RGBA, 0)

        def rgba1(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.Rgba1Context)
            else:
                return self.getTypedRuleContext(beexlParser.Rgba1Context,i)


        def getRuleIndex(self):
            return beexlParser.RULE_rgba0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRgba0" ):
                listener.enterRgba0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRgba0" ):
                listener.exitRgba0(self)




    def rgba0(self):

        localctx = beexlParser.Rgba0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_rgba0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 137
            self.match(beexlParser.RGBA)
            self.state = 138
            self.match(beexlParser.T__2)
            self.state = 139
            self.rgba1()
            self.state = 140
            self.match(beexlParser.T__1)
            self.state = 141
            self.rgba1()
            self.state = 142
            self.match(beexlParser.T__1)
            self.state = 143
            self.rgba1()
            self.state = 144
            self.match(beexlParser.T__1)
            self.state = 145
            self.rgba1()
            self.state = 146
            self.match(beexlParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Rgba1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._NUMBER = None # Token

        def cExtras0(self):
            return self.getTypedRuleContext(beexlParser.CExtras0Context,0)


        def NUMBER(self):
            return self.getToken(beexlParser.NUMBER, 0)

        def getRuleIndex(self):
            return beexlParser.RULE_rgba1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRgba1" ):
                listener.enterRgba1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRgba1" ):
                listener.exitRgba1(self)




    def rgba1(self):

        localctx = beexlParser.Rgba1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_rgba1)
        try:
            self.state = 151
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.MAX_RED, beexlParser.MAX_BLUE, beexlParser.MAX_GREEN, beexlParser.MAX_ALPHA]:
                self.enterOuterAlt(localctx, 1)
                self.state = 148
                self.cExtras0()
                pass
            elif token in [beexlParser.NUMBER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 149
                localctx._NUMBER = self.match(beexlParser.NUMBER)
                valueStack.append(int((None if localctx._NUMBER is None else localctx._NUMBER.text)))
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CExtras0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MAX_RED(self):
            return self.getToken(beexlParser.MAX_RED, 0)

        def MAX_BLUE(self):
            return self.getToken(beexlParser.MAX_BLUE, 0)

        def MAX_GREEN(self):
            return self.getToken(beexlParser.MAX_GREEN, 0)

        def MAX_ALPHA(self):
            return self.getToken(beexlParser.MAX_ALPHA, 0)

        def getRuleIndex(self):
            return beexlParser.RULE_cExtras0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCExtras0" ):
                listener.enterCExtras0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCExtras0" ):
                listener.exitCExtras0(self)




    def cExtras0(self):

        localctx = beexlParser.CExtras0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_cExtras0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 153
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << beexlParser.MAX_RED) | (1 << beexlParser.MAX_BLUE) | (1 << beexlParser.MAX_GREEN) | (1 << beexlParser.MAX_ALPHA))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            valueStack.append(255)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Vector0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VECTOR(self):
            return self.getToken(beexlParser.VECTOR, 0)

        def vector1(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.Vector1Context)
            else:
                return self.getTypedRuleContext(beexlParser.Vector1Context,i)


        def getRuleIndex(self):
            return beexlParser.RULE_vector0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVector0" ):
                listener.enterVector0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVector0" ):
                listener.exitVector0(self)




    def vector0(self):

        localctx = beexlParser.Vector0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_vector0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 156
            self.match(beexlParser.VECTOR)
            self.state = 157
            self.match(beexlParser.T__2)
            self.state = 158
            self.vector1()
            self.state = 159
            self.match(beexlParser.T__1)
            self.state = 160
            self.vector1()
            self.state = 161
            self.match(beexlParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Vector1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._NUMBER = None # Token

        def NUMBER(self):
            return self.getToken(beexlParser.NUMBER, 0)

        def vExtras0(self):
            return self.getTypedRuleContext(beexlParser.VExtras0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_vector1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVector1" ):
                listener.enterVector1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVector1" ):
                listener.exitVector1(self)




    def vector1(self):

        localctx = beexlParser.Vector1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_vector1)
        try:
            self.state = 166
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.NUMBER]:
                self.enterOuterAlt(localctx, 1)
                self.state = 163
                localctx._NUMBER = self.match(beexlParser.NUMBER)
                valueStack.append((None if localctx._NUMBER is None else localctx._NUMBER.text))
                pass
            elif token in [beexlParser.CANVAS_WIDTH, beexlParser.CANVAS_HEIGHT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 165
                self.vExtras0()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VExtras0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CANVAS_HEIGHT(self):
            return self.getToken(beexlParser.CANVAS_HEIGHT, 0)

        def CANVAS_WIDTH(self):
            return self.getToken(beexlParser.CANVAS_WIDTH, 0)

        def getRuleIndex(self):
            return beexlParser.RULE_vExtras0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVExtras0" ):
                listener.enterVExtras0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVExtras0" ):
                listener.exitVExtras0(self)




    def vExtras0(self):

        localctx = beexlParser.VExtras0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_vExtras0)
        try:
            self.state = 172
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.CANVAS_HEIGHT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 168
                self.match(beexlParser.CANVAS_HEIGHT)
                valueStack.append(len(variable_table['canvas']))
                pass
            elif token in [beexlParser.CANVAS_WIDTH]:
                self.enterOuterAlt(localctx, 2)
                self.state = 170
                self.match(beexlParser.CANVAS_WIDTH)
                valueStack.append(len(variable_table['canvas'][0]))
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Vars0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def VAR(self):
            return self.getToken(beexlParser.VAR, 0)

        def ID(self):
            return self.getToken(beexlParser.ID, 0)

        def type0(self):
            return self.getTypedRuleContext(beexlParser.Type0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_vars0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVars0" ):
                listener.enterVars0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVars0" ):
                listener.exitVars0(self)




    def vars0(self):

        localctx = beexlParser.Vars0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_vars0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 174
            self.match(beexlParser.VAR)
            self.state = 175
            localctx._ID = self.match(beexlParser.ID)
            nameStack.append((None if localctx._ID is None else localctx._ID.text))
            self.state = 177
            self.match(beexlParser.T__4)
            self.state = 178
            self.type0()
            self.state = 179
            if not canCreateVariable():
                from antlr4.error.Errors import FailedPredicateException
                raise FailedPredicateException(self, "canCreateVariable()")
            self.state = 180
            self.match(beexlParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Instruction0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def extras0(self):
            return self.getTypedRuleContext(beexlParser.Extras0Context,0)


        def conditional0(self):
            return self.getTypedRuleContext(beexlParser.Conditional0Context,0)


        def cycle0(self):
            return self.getTypedRuleContext(beexlParser.Cycle0Context,0)


        def while0(self):
            return self.getTypedRuleContext(beexlParser.While0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_instruction0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInstruction0" ):
                listener.enterInstruction0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInstruction0" ):
                listener.exitInstruction0(self)




    def instruction0(self):

        localctx = beexlParser.Instruction0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_instruction0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 186
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.PRINT, beexlParser.FILL, beexlParser.ID]:
                self.state = 182
                self.extras0()
                pass
            elif token in [beexlParser.IF]:
                self.state = 183
                self.conditional0()
                pass
            elif token in [beexlParser.FROM]:
                self.state = 184
                self.cycle0()
                pass
            elif token in [beexlParser.WHILE]:
                self.state = 185
                self.while0()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class While0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(beexlParser.WHILE, 0)

        def hyperExp0(self):
            return self.getTypedRuleContext(beexlParser.HyperExp0Context,0)


        def extras0(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.Extras0Context)
            else:
                return self.getTypedRuleContext(beexlParser.Extras0Context,i)


        def getRuleIndex(self):
            return beexlParser.RULE_while0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile0" ):
                listener.enterWhile0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile0" ):
                listener.exitWhile0(self)




    def while0(self):

        localctx = beexlParser.While0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_while0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 188
            self.match(beexlParser.WHILE)
            self.state = 189
            self.match(beexlParser.T__2)
            self.state = 190
            self.hyperExp0()
            self.state = 191
            self.match(beexlParser.T__3)
            self.state = 192
            self.match(beexlParser.T__5)
            self.state = 194 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 193
                self.extras0()
                self.state = 196 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << beexlParser.PRINT) | (1 << beexlParser.FILL) | (1 << beexlParser.ID))) != 0)):
                    break

            self.state = 198
            self.match(beexlParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Extras0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def pixelFill0(self):
            return self.getTypedRuleContext(beexlParser.PixelFill0Context,0)


        def assignment0(self):
            return self.getTypedRuleContext(beexlParser.Assignment0Context,0)


        def print0(self):
            return self.getTypedRuleContext(beexlParser.Print0Context,0)


        def functionCall0(self):
            return self.getTypedRuleContext(beexlParser.FunctionCall0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_extras0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExtras0" ):
                listener.enterExtras0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExtras0" ):
                listener.exitExtras0(self)




    def extras0(self):

        localctx = beexlParser.Extras0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_extras0)
        try:
            self.state = 204
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 200
                self.pixelFill0()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 201
                self.assignment0()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 202
                self.print0()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 203
                self.functionCall0()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PixelFill0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FILL(self):
            return self.getToken(beexlParser.FILL, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(beexlParser.ID)
            else:
                return self.getToken(beexlParser.ID, i)

        def vector0(self):
            return self.getTypedRuleContext(beexlParser.Vector0Context,0)


        def rgba0(self):
            return self.getTypedRuleContext(beexlParser.Rgba0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_pixelFill0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPixelFill0" ):
                listener.enterPixelFill0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPixelFill0" ):
                listener.exitPixelFill0(self)




    def pixelFill0(self):

        localctx = beexlParser.PixelFill0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_pixelFill0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 206
            self.match(beexlParser.FILL)
            self.state = 209
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.ID]:
                self.state = 207
                self.match(beexlParser.ID)
                pass
            elif token in [beexlParser.VECTOR]:
                self.state = 208
                self.vector0()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 213
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.ID]:
                self.state = 211
                self.match(beexlParser.ID)
                pass
            elif token in [beexlParser.RGBA]:
                self.state = 212
                self.rgba0()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 215
            self.match(beexlParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Assignment0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(beexlParser.ID, 0)

        def hyperExp0(self):
            return self.getTypedRuleContext(beexlParser.HyperExp0Context,0)


        def vector0(self):
            return self.getTypedRuleContext(beexlParser.Vector0Context,0)


        def rgba0(self):
            return self.getTypedRuleContext(beexlParser.Rgba0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_assignment0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment0" ):
                listener.enterAssignment0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment0" ):
                listener.exitAssignment0(self)




    def assignment0(self):

        localctx = beexlParser.Assignment0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_assignment0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 217
            self.match(beexlParser.ID)
            self.state = 218
            self.match(beexlParser.T__7)
            operatorStack.append("=")
            self.state = 223
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.T__2, beexlParser.ID, beexlParser.NUMBER]:
                self.state = 220
                self.hyperExp0()
                pass
            elif token in [beexlParser.VECTOR]:
                self.state = 221
                self.vector0()
                pass
            elif token in [beexlParser.RGBA]:
                self.state = 222
                self.rgba0()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 225
            self.match(beexlParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Print0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PRINT(self):
            return self.getToken(beexlParser.PRINT, 0)

        def getRuleIndex(self):
            return beexlParser.RULE_print0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint0" ):
                listener.enterPrint0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint0" ):
                listener.exitPrint0(self)




    def print0(self):

        localctx = beexlParser.Print0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_print0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 227
            self.match(beexlParser.PRINT)
            self.state = 228
            self.match(beexlParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionCall0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(beexlParser.ID)
            else:
                return self.getToken(beexlParser.ID, i)

        def getRuleIndex(self):
            return beexlParser.RULE_functionCall0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionCall0" ):
                listener.enterFunctionCall0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionCall0" ):
                listener.exitFunctionCall0(self)




    def functionCall0(self):

        localctx = beexlParser.FunctionCall0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_functionCall0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 230
            self.match(beexlParser.ID)
            self.state = 231
            self.match(beexlParser.T__2)
            self.state = 242
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==beexlParser.ID:
                self.state = 232
                self.match(beexlParser.ID)
                self.state = 237
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==beexlParser.T__1:
                    self.state = 233
                    self.match(beexlParser.T__1)
                    self.state = 234
                    self.match(beexlParser.ID)
                    self.state = 239
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 244
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 245
            self.match(beexlParser.T__3)
            self.state = 246
            self.match(beexlParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Conditional0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(beexlParser.IF, 0)

        def hyperExp0(self):
            return self.getTypedRuleContext(beexlParser.HyperExp0Context,0)


        def extras0(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.Extras0Context)
            else:
                return self.getTypedRuleContext(beexlParser.Extras0Context,i)


        def conditional1(self):
            return self.getTypedRuleContext(beexlParser.Conditional1Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_conditional0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConditional0" ):
                listener.enterConditional0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConditional0" ):
                listener.exitConditional0(self)




    def conditional0(self):

        localctx = beexlParser.Conditional0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_conditional0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 248
            self.match(beexlParser.IF)
            self.state = 249
            self.match(beexlParser.T__2)
            self.state = 250
            self.hyperExp0()
            self.state = 251
            self.match(beexlParser.T__3)
            self.state = 252
            self.match(beexlParser.T__5)
            self.state = 256
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << beexlParser.PRINT) | (1 << beexlParser.FILL) | (1 << beexlParser.ID))) != 0):
                self.state = 253
                self.extras0()
                self.state = 258
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 259
            self.match(beexlParser.T__6)
            self.state = 261
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==beexlParser.ELSE:
                self.state = 260
                self.conditional1()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Conditional1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ELSE(self):
            return self.getToken(beexlParser.ELSE, 0)

        def extras0(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.Extras0Context)
            else:
                return self.getTypedRuleContext(beexlParser.Extras0Context,i)


        def getRuleIndex(self):
            return beexlParser.RULE_conditional1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConditional1" ):
                listener.enterConditional1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConditional1" ):
                listener.exitConditional1(self)




    def conditional1(self):

        localctx = beexlParser.Conditional1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_conditional1)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 263
            self.match(beexlParser.ELSE)
            self.state = 264
            self.match(beexlParser.T__5)
            self.state = 268
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << beexlParser.PRINT) | (1 << beexlParser.FILL) | (1 << beexlParser.ID))) != 0):
                self.state = 265
                self.extras0()
                self.state = 270
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 271
            self.match(beexlParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HyperExp0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def superExp0(self):
            return self.getTypedRuleContext(beexlParser.SuperExp0Context,0)


        def hyperExp1(self):
            return self.getTypedRuleContext(beexlParser.HyperExp1Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_hyperExp0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHyperExp0" ):
                listener.enterHyperExp0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHyperExp0" ):
                listener.exitHyperExp0(self)




    def hyperExp0(self):

        localctx = beexlParser.HyperExp0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_hyperExp0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 273
            self.superExp0()
            self.state = 275
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==beexlParser.T__8 or _la==beexlParser.T__9:
                self.state = 274
                self.hyperExp1()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class HyperExp1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def hyperExp0(self):
            return self.getTypedRuleContext(beexlParser.HyperExp0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_hyperExp1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHyperExp1" ):
                listener.enterHyperExp1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHyperExp1" ):
                listener.exitHyperExp1(self)




    def hyperExp1(self):

        localctx = beexlParser.HyperExp1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_hyperExp1)
        try:
            self.state = 283
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.T__8]:
                self.enterOuterAlt(localctx, 1)
                self.state = 277
                self.match(beexlParser.T__8)
                operatorStack.append("&&")
                self.state = 279
                self.hyperExp0()
                pass
            elif token in [beexlParser.T__9]:
                self.enterOuterAlt(localctx, 2)
                self.state = 280
                self.match(beexlParser.T__9)
                operatorStack.append("||")
                self.state = 282
                self.hyperExp0()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SuperExp0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp0(self):
            return self.getTypedRuleContext(beexlParser.Exp0Context,0)


        def superExp1(self):
            return self.getTypedRuleContext(beexlParser.SuperExp1Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_superExp0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSuperExp0" ):
                listener.enterSuperExp0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSuperExp0" ):
                listener.exitSuperExp0(self)




    def superExp0(self):

        localctx = beexlParser.SuperExp0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_superExp0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 285
            self.exp0()
            self.state = 287
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << beexlParser.T__10) | (1 << beexlParser.T__11) | (1 << beexlParser.T__12) | (1 << beexlParser.T__13) | (1 << beexlParser.T__14) | (1 << beexlParser.T__15))) != 0):
                self.state = 286
                self.superExp1()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class SuperExp1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def superExp0(self):
            return self.getTypedRuleContext(beexlParser.SuperExp0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_superExp1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSuperExp1" ):
                listener.enterSuperExp1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSuperExp1" ):
                listener.exitSuperExp1(self)




    def superExp1(self):

        localctx = beexlParser.SuperExp1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_superExp1)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 301
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.T__10]:
                self.state = 289
                self.match(beexlParser.T__10)
                operatorStack.append(">")
                pass
            elif token in [beexlParser.T__11]:
                self.state = 291
                self.match(beexlParser.T__11)
                operatorStack.append("<")
                pass
            elif token in [beexlParser.T__12]:
                self.state = 293
                self.match(beexlParser.T__12)
                operatorStack.append("<=")
                pass
            elif token in [beexlParser.T__13]:
                self.state = 295
                self.match(beexlParser.T__13)
                operatorStack.append(">=")
                pass
            elif token in [beexlParser.T__14]:
                self.state = 297
                self.match(beexlParser.T__14)
                operatorStack.append("==")
                pass
            elif token in [beexlParser.T__15]:
                self.state = 299
                self.match(beexlParser.T__15)
                operatorStack.append("!=")
                pass
            else:
                raise NoViableAltException(self)

            self.state = 303
            self.superExp0()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def term0(self):
            return self.getTypedRuleContext(beexlParser.Term0Context,0)


        def exp1(self):
            return self.getTypedRuleContext(beexlParser.Exp1Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_exp0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp0" ):
                listener.enterExp0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp0" ):
                listener.exitExp0(self)




    def exp0(self):

        localctx = beexlParser.Exp0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_exp0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 305
            self.term0()
            self.state = 307
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==beexlParser.T__16 or _la==beexlParser.T__17:
                self.state = 306
                self.exp1()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Exp1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp0(self):
            return self.getTypedRuleContext(beexlParser.Exp0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_exp1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp1" ):
                listener.enterExp1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp1" ):
                listener.exitExp1(self)




    def exp1(self):

        localctx = beexlParser.Exp1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_exp1)
        try:
            self.state = 315
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.T__16]:
                self.enterOuterAlt(localctx, 1)
                self.state = 309
                self.match(beexlParser.T__16)
                operatorStack.append("+")
                self.state = 311
                self.exp0()
                pass
            elif token in [beexlParser.T__17]:
                self.enterOuterAlt(localctx, 2)
                self.state = 312
                self.match(beexlParser.T__17)
                operatorStack.append("-")
                self.state = 314
                self.exp0()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Term0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def factor0(self):
            return self.getTypedRuleContext(beexlParser.Factor0Context,0)


        def term1(self):
            return self.getTypedRuleContext(beexlParser.Term1Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_term0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm0" ):
                listener.enterTerm0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm0" ):
                listener.exitTerm0(self)




    def term0(self):

        localctx = beexlParser.Term0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_term0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 317
            self.factor0()
            self.state = 319
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==beexlParser.T__18 or _la==beexlParser.T__19:
                self.state = 318
                self.term1()


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Term1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def term0(self):
            return self.getTypedRuleContext(beexlParser.Term0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_term1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm1" ):
                listener.enterTerm1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm1" ):
                listener.exitTerm1(self)




    def term1(self):

        localctx = beexlParser.Term1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_term1)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 325
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.T__18]:
                self.state = 321
                self.match(beexlParser.T__18)
                operatorStack.append("*")
                pass
            elif token in [beexlParser.T__19]:
                self.state = 323
                self.match(beexlParser.T__19)
                operatorStack.append("/")
                pass
            else:
                raise NoViableAltException(self)

            self.state = 327
            self.term0()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Factor0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token
            self._NUMBER = None # Token

        def ID(self):
            return self.getToken(beexlParser.ID, 0)

        def NUMBER(self):
            return self.getToken(beexlParser.NUMBER, 0)

        def rgbaAttribute0(self):
            return self.getTypedRuleContext(beexlParser.RgbaAttribute0Context,0)


        def vectorAttribute0(self):
            return self.getTypedRuleContext(beexlParser.VectorAttribute0Context,0)


        def hyperExp0(self):
            return self.getTypedRuleContext(beexlParser.HyperExp0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_factor0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor0" ):
                listener.enterFactor0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor0" ):
                listener.exitFactor0(self)




    def factor0(self):

        localctx = beexlParser.Factor0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_factor0)
        try:
            self.state = 341
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,25,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 329
                localctx._ID = self.match(beexlParser.ID)
                self.state = 330
                if not (None if localctx._ID is None else localctx._ID.text) in variable_table:
                    from antlr4.error.Errors import FailedPredicateException
                    raise FailedPredicateException(self, "$ID.text in variable_table")
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 331
                localctx._NUMBER = self.match(beexlParser.NUMBER)
                operatorStack.append((None if localctx._NUMBER is None else localctx._NUMBER.text))
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 333
                self.rgbaAttribute0()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 334
                self.vectorAttribute0()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 335
                self.match(beexlParser.T__2)
                operatorStack.append("(")
                self.state = 337
                self.hyperExp0()
                self.state = 338
                self.match(beexlParser.T__3)
                operatorStack.pop()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Cycle0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FROM(self):
            return self.getToken(beexlParser.FROM, 0)

        def cycle1(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.Cycle1Context)
            else:
                return self.getTypedRuleContext(beexlParser.Cycle1Context,i)


        def TO(self):
            return self.getToken(beexlParser.TO, 0)

        def DO(self):
            return self.getToken(beexlParser.DO, 0)

        def extras0(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.Extras0Context)
            else:
                return self.getTypedRuleContext(beexlParser.Extras0Context,i)


        def getRuleIndex(self):
            return beexlParser.RULE_cycle0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCycle0" ):
                listener.enterCycle0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCycle0" ):
                listener.exitCycle0(self)




    def cycle0(self):

        localctx = beexlParser.Cycle0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_cycle0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 343
            self.match(beexlParser.FROM)
            self.state = 344
            self.cycle1()
            self.state = 345
            self.match(beexlParser.TO)
            self.state = 346
            self.cycle1()
            self.state = 347
            self.match(beexlParser.DO)
            self.state = 348
            self.match(beexlParser.T__5)
            self.state = 352
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << beexlParser.PRINT) | (1 << beexlParser.FILL) | (1 << beexlParser.ID))) != 0):
                self.state = 349
                self.extras0()
                self.state = 354
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 355
            self.match(beexlParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Cycle1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def vector0(self):
            return self.getTypedRuleContext(beexlParser.Vector0Context,0)


        def rgba0(self):
            return self.getTypedRuleContext(beexlParser.Rgba0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_cycle1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCycle1" ):
                listener.enterCycle1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCycle1" ):
                listener.exitCycle1(self)




    def cycle1(self):

        localctx = beexlParser.Cycle1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_cycle1)
        try:
            self.state = 359
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.VECTOR]:
                self.enterOuterAlt(localctx, 1)
                self.state = 357
                self.vector0()
                pass
            elif token in [beexlParser.RGBA]:
                self.enterOuterAlt(localctx, 2)
                self.state = 358
                self.rgba0()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VectorOperation0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def vectorOperation1(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.VectorOperation1Context)
            else:
                return self.getTypedRuleContext(beexlParser.VectorOperation1Context,i)


        def exp0(self):
            return self.getTypedRuleContext(beexlParser.Exp0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_vectorOperation0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVectorOperation0" ):
                listener.enterVectorOperation0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVectorOperation0" ):
                listener.exitVectorOperation0(self)




    def vectorOperation0(self):

        localctx = beexlParser.VectorOperation0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_vectorOperation0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 361
            self.vectorOperation1()
            self.state = 362
            self.exp0()
            self.state = 363
            self.vectorOperation1()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VectorOperation1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(beexlParser.ID, 0)

        def vector0(self):
            return self.getTypedRuleContext(beexlParser.Vector0Context,0)


        def vectorAttribute0(self):
            return self.getTypedRuleContext(beexlParser.VectorAttribute0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_vectorOperation1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVectorOperation1" ):
                listener.enterVectorOperation1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVectorOperation1" ):
                listener.exitVectorOperation1(self)




    def vectorOperation1(self):

        localctx = beexlParser.VectorOperation1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_vectorOperation1)
        try:
            self.state = 369
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,28,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 365
                localctx._ID = self.match(beexlParser.ID)
                self.state = 366
                if not validateID((None if localctx._ID is None else localctx._ID.text),"vector"):
                    from antlr4.error.Errors import FailedPredicateException
                    raise FailedPredicateException(self, "validateID($ID.text,\"vector\")")
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 367
                self.vector0()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 368
                self.vectorAttribute0()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VectorAttribute0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(beexlParser.ID, 0)

        def X(self):
            return self.getToken(beexlParser.X, 0)

        def Y(self):
            return self.getToken(beexlParser.Y, 0)

        def getRuleIndex(self):
            return beexlParser.RULE_vectorAttribute0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVectorAttribute0" ):
                listener.enterVectorAttribute0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVectorAttribute0" ):
                listener.exitVectorAttribute0(self)




    def vectorAttribute0(self):

        localctx = beexlParser.VectorAttribute0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_vectorAttribute0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 371
            localctx._ID = self.match(beexlParser.ID)
            self.state = 372
            if not validateID((None if localctx._ID is None else localctx._ID.text),'vector'):
                from antlr4.error.Errors import FailedPredicateException
                raise FailedPredicateException(self, "validateID($ID.text,'vector')")
            self.state = 373
            self.match(beexlParser.T__20)
            self.state = 378
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.X]:
                self.state = 374
                self.match(beexlParser.X)
                nameStack.append("x")
                pass
            elif token in [beexlParser.Y]:
                self.state = 376
                self.match(beexlParser.Y)
                nameStack.append("y")
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RgbaOperation0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def rgbaOperation1(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.RgbaOperation1Context)
            else:
                return self.getTypedRuleContext(beexlParser.RgbaOperation1Context,i)


        def exp0(self):
            return self.getTypedRuleContext(beexlParser.Exp0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_rgbaOperation0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRgbaOperation0" ):
                listener.enterRgbaOperation0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRgbaOperation0" ):
                listener.exitRgbaOperation0(self)




    def rgbaOperation0(self):

        localctx = beexlParser.RgbaOperation0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_rgbaOperation0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 380
            self.rgbaOperation1()
            self.state = 381
            self.exp0()
            self.state = 382
            self.rgbaOperation1()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RgbaOperation1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(beexlParser.ID, 0)

        def rgba0(self):
            return self.getTypedRuleContext(beexlParser.Rgba0Context,0)


        def rgbaAttribute0(self):
            return self.getTypedRuleContext(beexlParser.RgbaAttribute0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_rgbaOperation1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRgbaOperation1" ):
                listener.enterRgbaOperation1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRgbaOperation1" ):
                listener.exitRgbaOperation1(self)




    def rgbaOperation1(self):

        localctx = beexlParser.RgbaOperation1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_rgbaOperation1)
        try:
            self.state = 388
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,30,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 384
                localctx._ID = self.match(beexlParser.ID)
                validateID((None if localctx._ID is None else localctx._ID.text),"rgba")
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 386
                self.rgba0()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 387
                self.rgbaAttribute0()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RgbaAttribute0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(beexlParser.ID, 0)

        def rgbaAttribute1(self):
            return self.getTypedRuleContext(beexlParser.RgbaAttribute1Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_rgbaAttribute0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRgbaAttribute0" ):
                listener.enterRgbaAttribute0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRgbaAttribute0" ):
                listener.exitRgbaAttribute0(self)




    def rgbaAttribute0(self):

        localctx = beexlParser.RgbaAttribute0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 74, self.RULE_rgbaAttribute0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 390
            localctx._ID = self.match(beexlParser.ID)
            self.state = 391
            if not validateID((None if localctx._ID is None else localctx._ID.text),'rgba'):
                from antlr4.error.Errors import FailedPredicateException
                raise FailedPredicateException(self, "validateID($ID.text,'rgba')")
            nameStack.append((None if localctx._ID is None else localctx._ID.text))
            self.state = 393
            self.match(beexlParser.T__20)
            self.state = 394
            self.rgbaAttribute1()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RgbaAttribute1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RED(self):
            return self.getToken(beexlParser.RED, 0)

        def GREEN(self):
            return self.getToken(beexlParser.GREEN, 0)

        def BLUE(self):
            return self.getToken(beexlParser.BLUE, 0)

        def ALPHA(self):
            return self.getToken(beexlParser.ALPHA, 0)

        def getRuleIndex(self):
            return beexlParser.RULE_rgbaAttribute1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRgbaAttribute1" ):
                listener.enterRgbaAttribute1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRgbaAttribute1" ):
                listener.exitRgbaAttribute1(self)




    def rgbaAttribute1(self):

        localctx = beexlParser.RgbaAttribute1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 76, self.RULE_rgbaAttribute1)
        try:
            self.state = 404
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.RED]:
                self.enterOuterAlt(localctx, 1)
                self.state = 396
                self.match(beexlParser.RED)
                nameStack.append("r")
                pass
            elif token in [beexlParser.GREEN]:
                self.enterOuterAlt(localctx, 2)
                self.state = 398
                self.match(beexlParser.GREEN)
                nameStack.append("g")
                pass
            elif token in [beexlParser.BLUE]:
                self.enterOuterAlt(localctx, 3)
                self.state = 400
                self.match(beexlParser.BLUE)
                nameStack.append("b")
                pass
            elif token in [beexlParser.ALPHA]:
                self.enterOuterAlt(localctx, 4)
                self.state = 402
                self.match(beexlParser.ALPHA)
                nameStack.append("a")
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Block0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def vars0(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.Vars0Context)
            else:
                return self.getTypedRuleContext(beexlParser.Vars0Context,i)


        def instruction0(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.Instruction0Context)
            else:
                return self.getTypedRuleContext(beexlParser.Instruction0Context,i)


        def getRuleIndex(self):
            return beexlParser.RULE_block0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlock0" ):
                listener.enterBlock0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlock0" ):
                listener.exitBlock0(self)




    def block0(self):

        localctx = beexlParser.Block0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 78, self.RULE_block0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 406
            self.match(beexlParser.T__5)
            self.state = 411
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << beexlParser.VAR) | (1 << beexlParser.PRINT) | (1 << beexlParser.FILL) | (1 << beexlParser.IF) | (1 << beexlParser.FROM) | (1 << beexlParser.WHILE) | (1 << beexlParser.ID))) != 0):
                self.state = 409
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [beexlParser.VAR]:
                    self.state = 407
                    self.vars0()
                    pass
                elif token in [beexlParser.PRINT, beexlParser.FILL, beexlParser.IF, beexlParser.FROM, beexlParser.WHILE, beexlParser.ID]:
                    self.state = 408
                    self.instruction0()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 413
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 414
            self.match(beexlParser.T__6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Main0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUNCTION(self):
            return self.getToken(beexlParser.FUNCTION, 0)

        def VOID(self):
            return self.getToken(beexlParser.VOID, 0)

        def MAIN(self):
            return self.getToken(beexlParser.MAIN, 0)

        def block0(self):
            return self.getTypedRuleContext(beexlParser.Block0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_main0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMain0" ):
                listener.enterMain0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMain0" ):
                listener.exitMain0(self)




    def main0(self):

        localctx = beexlParser.Main0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 80, self.RULE_main0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 416
            self.match(beexlParser.FUNCTION)
            self.state = 417
            self.match(beexlParser.VOID)
            self.state = 418
            self.match(beexlParser.MAIN)
            self.state = 419
            self.match(beexlParser.T__2)
            self.state = 420
            self.match(beexlParser.T__3)
            self.state = 421
            self.block0()
            generateQuadruples()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Body0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def main0(self):
            return self.getTypedRuleContext(beexlParser.Main0Context,0)


        def functionDefinition0(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.FunctionDefinition0Context)
            else:
                return self.getTypedRuleContext(beexlParser.FunctionDefinition0Context,i)


        def getRuleIndex(self):
            return beexlParser.RULE_body0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBody0" ):
                listener.enterBody0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBody0" ):
                listener.exitBody0(self)




    def body0(self):

        localctx = beexlParser.Body0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 82, self.RULE_body0)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 427
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,34,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 424
                    self.functionDefinition0() 
                self.state = 429
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,34,self._ctx)

            self.state = 430
            self.main0()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionDefinition0Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def FUNCTION(self):
            return self.getToken(beexlParser.FUNCTION, 0)

        def functionDefinition1(self):
            return self.getTypedRuleContext(beexlParser.FunctionDefinition1Context,0)


        def ID(self):
            return self.getToken(beexlParser.ID, 0)

        def block0(self):
            return self.getTypedRuleContext(beexlParser.Block0Context,0)


        def functionDefinition2(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(beexlParser.FunctionDefinition2Context)
            else:
                return self.getTypedRuleContext(beexlParser.FunctionDefinition2Context,i)


        def getRuleIndex(self):
            return beexlParser.RULE_functionDefinition0

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionDefinition0" ):
                listener.enterFunctionDefinition0(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionDefinition0" ):
                listener.exitFunctionDefinition0(self)




    def functionDefinition0(self):

        localctx = beexlParser.FunctionDefinition0Context(self, self._ctx, self.state)
        self.enterRule(localctx, 84, self.RULE_functionDefinition0)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 432
            self.match(beexlParser.FUNCTION)
            self.state = 433
            self.functionDefinition1()
            self.state = 434
            localctx._ID = self.match(beexlParser.ID)
            nameStack.append((None if localctx._ID is None else localctx._ID.text))
            nameStack.append("function")
            self.state = 437
            if not canCreateVariable():
                from antlr4.error.Errors import FailedPredicateException
                raise FailedPredicateException(self, "canCreateVariable()")
            self.state = 438
            self.match(beexlParser.T__2)
            self.state = 442
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==beexlParser.ID:
                self.state = 439
                self.functionDefinition2()
                self.state = 444
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 445
            self.match(beexlParser.T__3)
            self.state = 446
            self.block0()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionDefinition1Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def type0(self):
            return self.getTypedRuleContext(beexlParser.Type0Context,0)


        def VOID(self):
            return self.getToken(beexlParser.VOID, 0)

        def getRuleIndex(self):
            return beexlParser.RULE_functionDefinition1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionDefinition1" ):
                listener.enterFunctionDefinition1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionDefinition1" ):
                listener.exitFunctionDefinition1(self)




    def functionDefinition1(self):

        localctx = beexlParser.FunctionDefinition1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 86, self.RULE_functionDefinition1)
        try:
            self.state = 451
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [beexlParser.RGBA, beexlParser.VECTOR, beexlParser.INT, beexlParser.FLOAT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 448
                self.type0()
                pass
            elif token in [beexlParser.VOID]:
                self.enterOuterAlt(localctx, 2)
                self.state = 449
                self.match(beexlParser.VOID)
                nameStack.append("void")
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionDefinition2Context(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(beexlParser.ID, 0)

        def type0(self):
            return self.getTypedRuleContext(beexlParser.Type0Context,0)


        def getRuleIndex(self):
            return beexlParser.RULE_functionDefinition2

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunctionDefinition2" ):
                listener.enterFunctionDefinition2(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunctionDefinition2" ):
                listener.exitFunctionDefinition2(self)




    def functionDefinition2(self):

        localctx = beexlParser.FunctionDefinition2Context(self, self._ctx, self.state)
        self.enterRule(localctx, 88, self.RULE_functionDefinition2)
        try:
            self.state = 462
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,37,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 453
                localctx._ID = self.match(beexlParser.ID)
                self.state = 454
                if not validateID((None if localctx._ID is None else localctx._ID.text),'function'):
                    from antlr4.error.Errors import FailedPredicateException
                    raise FailedPredicateException(self, "validateID($ID.text,'function')")
                self.state = 455
                self.match(beexlParser.T__4)
                self.state = 456
                self.type0()
                self.state = 457
                self.match(beexlParser.T__1)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 459
                self.match(beexlParser.ID)
                self.state = 460
                self.match(beexlParser.T__4)
                self.state = 461
                self.type0()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[11] = self.vars0_sempred
        self._predicates[29] = self.factor0_sempred
        self._predicates[33] = self.vectorOperation1_sempred
        self._predicates[34] = self.vectorAttribute0_sempred
        self._predicates[37] = self.rgbaAttribute0_sempred
        self._predicates[42] = self.functionDefinition0_sempred
        self._predicates[44] = self.functionDefinition2_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def vars0_sempred(self, localctx:Vars0Context, predIndex:int):
            if predIndex == 0:
                return canCreateVariable()
         

    def factor0_sempred(self, localctx:Factor0Context, predIndex:int):
            if predIndex == 1:
                return (None if localctx._ID is None else localctx._ID.text) in variable_table
         

    def vectorOperation1_sempred(self, localctx:VectorOperation1Context, predIndex:int):
            if predIndex == 2:
                return validateID((None if localctx._ID is None else localctx._ID.text),"vector")
         

    def vectorAttribute0_sempred(self, localctx:VectorAttribute0Context, predIndex:int):
            if predIndex == 3:
                return validateID((None if localctx._ID is None else localctx._ID.text),'vector')
         

    def rgbaAttribute0_sempred(self, localctx:RgbaAttribute0Context, predIndex:int):
            if predIndex == 4:
                return validateID((None if localctx._ID is None else localctx._ID.text),'rgba')
         

    def functionDefinition0_sempred(self, localctx:FunctionDefinition0Context, predIndex:int):
            if predIndex == 5:
                return canCreateVariable()
         

    def functionDefinition2_sempred(self, localctx:FunctionDefinition2Context, predIndex:int):
            if predIndex == 6:
                return validateID((None if localctx._ID is None else localctx._ID.text),'function')
         




