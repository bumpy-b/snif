/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package packetparser;

public class ParserTokenManager implements ParserConstants
{
  public static  java.io.PrintStream debugStream = System.out;
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7fffffff8000L) != 0L)
         {
            jjmatchedKind = 47;
            return 28;
         }
         if ((active0 & 0x80000000000000L) != 0L)
            return 4;
         return -1;
      case 1:
         if ((active0 & 0x600000200000L) != 0L)
            return 28;
         if ((active0 & 0x1fffffdf8000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 47;
               jjmatchedPos = 1;
            }
            return 28;
         }
         return -1;
      case 2:
         if ((active0 & 0x180000000000L) != 0L)
            return 28;
         if ((active0 & 0x7ffffff8000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 2;
            return 28;
         }
         return -1;
      case 3:
         if ((active0 & 0x7f800000000L) != 0L)
            return 28;
         if ((active0 & 0x7ffff8000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 3;
            return 28;
         }
         return -1;
      case 4:
         if ((active0 & 0x1fff8000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 4;
            return 28;
         }
         if ((active0 & 0x7e0000000L) != 0L)
            return 28;
         return -1;
      case 5:
         if ((active0 & 0x1fe00000L) != 0L)
            return 28;
         if ((active0 & 0x1f8000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 5;
            return 28;
         }
         return -1;
      case 6:
         if ((active0 & 0x180000L) != 0L)
            return 28;
         if ((active0 & 0x78000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 6;
            return 28;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 56);
      case 41:
         return jjStopAtPos(0, 58);
      case 46:
         return jjStartNfaWithStates_0(0, 55, 4);
      case 58:
         return jjStopAtPos(0, 54);
      case 59:
         return jjStopAtPos(0, 50);
      case 61:
         jjmatchedKind = 51;
         return jjMoveStringLiteralDfa1_0(0x200000000000000L);
      case 91:
         return jjStopAtPos(0, 59);
      case 93:
         return jjStopAtPos(0, 60);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x21100008000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x400000300000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x4802000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x80200000000L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x300000000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1020000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x41cc00000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x80040000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x10000010000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 123:
         return jjStopAtPos(0, 52);
      case 125:
         return jjStopAtPos(0, 53);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1120000L);
      case 102:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 45, 28);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x20420000000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x10400000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0xa00000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x104080040000L);
      case 111:
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0xd2100218000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x20008000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x10020000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x100a0800000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x2100008000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x600000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 114:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 43, 28);
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x1800040000L);
      case 116:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 44, 28);
         return jjMoveStringLiteralDfa3_0(active0, 0x48003000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000200000L);
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x240110000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 100:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 40, 28);
         break;
      case 101:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 35, 28);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 28);
         return jjMoveStringLiteralDfa4_0(active0, 0x2480000L);
      case 103:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 37, 28);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x60000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      case 109:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 38, 28);
         break;
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 111:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 39, 28);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 42, 28);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 114:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 41, 28);
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x8808000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x5000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x4800000L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 101:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 28);
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x8008000L);
      case 107:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(4, 30, 28);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 110:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 28);
         break;
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x3000000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000L);
      case 116:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 28);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 28);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(4, 34, 28);
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(5, 27, 28);
         break;
      case 100:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(5, 28, 28);
         break;
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(5, 21, 28);
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 102:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(5, 22, 28);
         break;
      case 104:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 28);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 110:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(5, 24, 28);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(5, 25, 28);
         return jjMoveStringLiteralDfa6_0(active0, 0x48000L);
      case 116:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 26, 28);
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x60000L);
      case 102:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(6, 19, 28);
         break;
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000L);
      case 116:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(6, 20, 28);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(7, 18, 28);
         break;
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(7, 15, 28);
         else if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(7, 16, 28);
         break;
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(7, 17, 28);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
static private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
static private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 60;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 6);
                  else if (curChar == 47)
                     jjAddStates(7, 8);
                  else if (curChar == 36)
                  {
                     if (kind > 47)
                        kind = 47;
                     jjCheckNAdd(28);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(9, 11);
                  else if (curChar == 39)
                     jjAddStates(12, 13);
                  else if (curChar == 46)
                     jjCheckNAdd(4);
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddStates(14, 16);
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
                  if (curChar == 46)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(17, 19);
                  break;
               case 6:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
                  if (curChar == 39)
                     jjAddStates(12, 13);
                  break;
               case 10:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 11:
                  if (curChar == 39 && kind > 13)
                     kind = 13;
                  break;
               case 13:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 14:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(15, 11);
                  break;
               case 15:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 16:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               case 18:
                  if (curChar == 34)
                     jjCheckNAddStates(9, 11);
                  break;
               case 19:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 21:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 22:
                  if (curChar == 34 && kind > 14)
                     kind = 14;
                  break;
               case 23:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(20, 23);
                  break;
               case 24:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 25:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(24);
                  break;
               case 27:
                  if (curChar != 36)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(28);
                  break;
               case 28:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(28);
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 6);
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 31:
                  if (curChar != 46)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(24, 26);
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(24, 26);
                  break;
               case 34:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(35);
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(35, 8);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(36, 37);
                  break;
               case 38:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(39);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(39, 8);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(27, 29);
                  break;
               case 42:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(43);
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(43, 8);
                  break;
               case 44:
                  if (curChar != 48)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddStates(14, 16);
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(46, 2);
                  break;
               case 47:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(47, 2);
                  break;
               case 48:
                  if (curChar == 47)
                     jjAddStates(7, 8);
                  break;
               case 49:
                  if (curChar == 47)
                     jjCheckNAddStates(30, 32);
                  break;
               case 50:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(30, 32);
                  break;
               case 51:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 52:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 53:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 52;
                  break;
               case 54:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(55, 56);
                  break;
               case 55:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(55, 56);
                  break;
               case 56:
                  if (curChar == 42)
                     jjCheckNAddStates(33, 35);
                  break;
               case 57:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(58, 56);
                  break;
               case 58:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(58, 56);
                  break;
               case 59:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 28:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(28);
                  break;
               case 2:
                  if ((0x100000001000L & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 5:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(36, 37);
                  break;
               case 8:
                  if ((0x5000000050L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 10:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 12:
                  if (curChar == 92)
                     jjAddStates(38, 40);
                  break;
               case 13:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 19:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 20:
                  if (curChar == 92)
                     jjAddStates(41, 43);
                  break;
               case 21:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 33:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(44, 45);
                  break;
               case 37:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(46, 47);
                  break;
               case 41:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(48, 49);
                  break;
               case 45:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(46);
                  break;
               case 46:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(46, 2);
                  break;
               case 50:
                  jjAddStates(30, 32);
                  break;
               case 55:
                  jjCheckNAddTwoStates(55, 56);
                  break;
               case 57:
               case 58:
                  jjCheckNAddTwoStates(58, 56);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 10:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 19:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(9, 11);
                  break;
               case 50:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(30, 32);
                  break;
               case 55:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(55, 56);
                  break;
               case 57:
               case 58:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(58, 56);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 60 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   30, 31, 36, 37, 40, 41, 8, 49, 54, 19, 20, 22, 10, 12, 45, 47, 
   2, 4, 5, 8, 19, 20, 24, 22, 32, 33, 8, 40, 41, 8, 50, 51, 
   53, 56, 57, 59, 6, 7, 13, 14, 16, 21, 23, 25, 34, 35, 38, 39, 
   42, 43, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, "\143\157\156\164\151\156\165\145", "\166\157\154\141\164\151\154\145", 
"\162\145\147\151\163\164\145\162", "\165\156\163\151\147\156\145\144", "\164\171\160\145\144\145\146", 
"\144\145\146\141\165\154\164", "\144\157\165\142\154\145", "\163\151\172\145\157\146", 
"\163\167\151\164\143\150", "\162\145\164\165\162\156", "\145\170\164\145\162\156", 
"\163\164\162\165\143\164", "\163\164\141\164\151\143", "\163\151\147\156\145\144", 
"\167\150\151\154\145", "\142\162\145\141\153", "\165\156\151\157\156", "\143\157\156\163\164", 
"\146\154\157\141\164", "\163\150\157\162\164", "\145\154\163\145", "\143\141\163\145", 
"\154\157\156\147", "\145\156\165\155", "\141\165\164\157", "\166\157\151\144", 
"\143\150\141\162", "\147\157\164\157", "\146\157\162", "\151\156\164", "\151\146", "\144\157", 
null, null, null, "\73", "\75", "\173", "\175", "\72", "\56", "\50", "\75\75", 
"\51", "\133", "\135", };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x1ffcffffffffe881L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[60];
static private final int[] jjstateSet = new int[120];
static protected char curChar;
public ParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 60; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

public static Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
