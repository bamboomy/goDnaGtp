package genetic;
import java.util.ArrayList;
public class Input {
Thought[][] thoughts = new Thought[9][9];
{
thoughts[0][0] = new Thought13(new Thought5(), new Thought12(), null, null);
thoughts[0][1] = new Thought7(new Thought6(), new Thought1(), null, null);
thoughts[0][2] = new Thought13(new Thought3(), new Thought2(), null, null);
thoughts[0][3] = new Thought12(new Thought5(), new Thought15(), null, null);
thoughts[0][4] = new Thought9(new Thought9(), new Thought17(), null, null);
thoughts[0][5] = new Thought12(new Thought19(), new Thought9(), null, null);
thoughts[0][6] = new Thought0(new Thought14(), new Thought14(), null, null);
thoughts[0][7] = new Thought9(new Thought11(), new Thought13(), null, null);
thoughts[0][8] = new Thought12(new Thought16(), new Thought11(), null, null);
thoughts[1][0] = new Thought18(new Thought11(), new Thought15(), null, null);
thoughts[1][1] = new Thought16(new Thought15(), new Thought6(), null, null);
thoughts[1][2] = new Thought14(new Thought9(), new Thought6(), null, null);
thoughts[1][3] = new Thought13(new Thought3(), new Thought15(), null, null);
thoughts[1][4] = new Thought5(new Thought17(), new Thought19(), null, null);
thoughts[1][5] = new Thought10(new Thought15(), new Thought8(), null, null);
thoughts[1][6] = new Thought10(new Thought11(), new Thought12(), null, null);
thoughts[1][7] = new Thought4(new Thought3(), new Thought4(), null, null);
thoughts[1][8] = new Thought19(new Thought15(), new Thought3(), null, null);
thoughts[2][0] = new Thought7(new Thought13(), new Thought6(), null, null);
thoughts[2][1] = new Thought14(new Thought12(), new Thought8(), null, null);
thoughts[2][2] = new Thought3(new Thought4(), new Thought5(), null, null);
thoughts[2][3] = new Thought6(new Thought3(), new Thought8(), null, null);
thoughts[2][4] = new Thought18(new Thought6(), new Thought10(), null, null);
thoughts[2][5] = new Thought15(new Thought11(), new Thought14(), null, null);
thoughts[2][6] = new Thought6(new Thought13(), new Thought7(), null, null);
thoughts[2][7] = new Thought12(new Thought0(), new Thought4(), null, null);
thoughts[2][8] = new Thought7(new Thought14(), new Thought3(), null, null);
thoughts[3][0] = new Thought7(new Thought0(), new Thought1(), null, null);
thoughts[3][1] = new Thought3(new Thought4(), new Thought3(), null, null);
thoughts[3][2] = new Thought15(new Thought3(), new Thought10(), null, null);
thoughts[3][3] = new Thought19(new Thought3(), new Thought17(), null, null);
thoughts[3][4] = new Thought18(new Thought13(), new Thought0(), null, null);
thoughts[3][5] = new Thought17(new Thought13(), new Thought15(), null, null);
thoughts[3][6] = new Thought19(new Thought9(), new Thought1(), null, null);
thoughts[3][7] = new Thought11(new Thought18(), new Thought2(), null, null);
thoughts[3][8] = new Thought12(new Thought5(), new Thought8(), null, null);
thoughts[4][0] = new Thought12(new Thought15(), new Thought7(), null, null);
thoughts[4][1] = new Thought10(new Thought3(), new Thought6(), null, null);
thoughts[4][2] = new Thought0(new Thought14(), new Thought13(), null, null);
thoughts[4][3] = new Thought6(new Thought8(), new Thought5(), null, null);
thoughts[4][4] = new Thought11(new Thought19(), new Thought14(), null, null);
thoughts[4][5] = new Thought12(new Thought3(), new Thought12(), null, null);
thoughts[4][6] = new Thought6(new Thought12(), new Thought13(), null, null);
thoughts[4][7] = new Thought8(new Thought5(), new Thought10(), null, null);
thoughts[4][8] = new Thought17(new Thought12(), new Thought14(), null, null);
thoughts[5][0] = new Thought17(new Thought5(), new Thought8(), null, null);
thoughts[5][1] = new Thought4(new Thought17(), new Thought8(), null, null);
thoughts[5][2] = new Thought19(new Thought16(), new Thought14(), null, null);
thoughts[5][3] = new Thought1(new Thought17(), new Thought5(), null, null);
thoughts[5][4] = new Thought9(new Thought1(), new Thought3(), null, null);
thoughts[5][5] = new Thought2(new Thought14(), new Thought13(), null, null);
thoughts[5][6] = new Thought19(new Thought10(), new Thought4(), null, null);
thoughts[5][7] = new Thought8(new Thought6(), new Thought3(), null, null);
thoughts[5][8] = new Thought14(new Thought5(), new Thought2(), null, null);
thoughts[6][0] = new Thought10(new Thought16(), new Thought9(), null, null);
thoughts[6][1] = new Thought9(new Thought5(), new Thought15(), null, null);
thoughts[6][2] = new Thought2(new Thought13(), new Thought10(), null, null);
thoughts[6][3] = new Thought17(new Thought13(), new Thought17(), null, null);
thoughts[6][4] = new Thought6(new Thought4(), new Thought3(), null, null);
thoughts[6][5] = new Thought0(new Thought15(), new Thought15(), null, null);
thoughts[6][6] = new Thought3(new Thought0(), new Thought4(), null, null);
thoughts[6][7] = new Thought11(new Thought9(), new Thought18(), null, null);
thoughts[6][8] = new Thought12(new Thought4(), new Thought17(), null, null);
thoughts[7][0] = new Thought18(new Thought15(), new Thought4(), null, null);
thoughts[7][1] = new Thought14(new Thought0(), new Thought9(), null, null);
thoughts[7][2] = new Thought7(new Thought11(), new Thought12(), null, null);
thoughts[7][3] = new Thought10(new Thought3(), new Thought5(), null, null);
thoughts[7][4] = new Thought11(new Thought8(), new Thought4(), null, null);
thoughts[7][5] = new Thought8(new Thought15(), new Thought7(), null, null);
thoughts[7][6] = new Thought15(new Thought2(), new Thought10(), null, null);
thoughts[7][7] = new Thought14(new Thought1(), new Thought17(), null, null);
thoughts[7][8] = new Thought19(new Thought17(), new Thought7(), null, null);
thoughts[8][0] = new Thought14(new Thought14(), new Thought7(), null, null);
thoughts[8][1] = new Thought8(new Thought14(), new Thought8(), null, null);
thoughts[8][2] = new Thought5(new Thought18(), new Thought13(), null, null);
thoughts[8][3] = new Thought9(new Thought14(), new Thought17(), null, null);
thoughts[8][4] = new Thought5(new Thought12(), new Thought0(), null, null);
thoughts[8][5] = new Thought17(new Thought17(), new Thought1(), null, null);
thoughts[8][6] = new Thought14(new Thought9(), new Thought19(), null, null);
thoughts[8][7] = new Thought9(new Thought0(), new Thought12(), null, null);
thoughts[8][8] = new Thought9(new Thought5(), new Thought7(), null, null);
}
public void accept(int x, int y, String color){
try {
thoughts[x][y].accept(color);
} catch (CountDownExc e) { 
// dan niet... 
} catch (StackOverflowExc e) {
Thought.STACK_COUNTER = 50;
}
}
}
