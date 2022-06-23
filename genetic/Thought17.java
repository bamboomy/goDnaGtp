package genetic;
import java.util.ArrayList;
class Thought17 extends Thought{
private static ArrayList<Thought17> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 487.28228510039736;
private double fd1 = 316.1887690484678;
private Thought fo0 = null;
private Thought fo1 = null;
Thought17 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought17 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought17 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought17 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought17 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought17 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought17 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought17 instance = new Thought17 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought6.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    double ld2 = 851.354555185545;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    Thought lo3 = Thought32.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb1, lb1, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld2, fd0, fd1, fb0, fb1, lb1, fb0);
}
    ld2 = fd0 + fd1;
    fb1 = lb1 && fb0;
    fb1 = lb1 || fb0;
    double ld4 = 771.738569324892;
    Output.points[1][0] -= ld2;
if(fo0 != null){
      fo0.m1();
}
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought52.getInstance(ld4, fd0, fd1, ld2);
        ld4 = fd0 + fd1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab1 = fd1 < fd0;
    double ld0 = 770.7566415490011;
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    Thought lo1 = Thought75.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ld0;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fd0 = fd1 - ld0;
    fb0 = fd0 < fd1;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, ld0, fd0);
}
    fb0 = fd1 > ld0;
    fb1 = lb2 || lb3;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Thought lo0 = Thought32.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
        fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought93.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ad1;
    Output.points[1][1] += ad2;
    fb0 = ad3 > ad4;
    double ld2 = 167.90985864467666;
if(fo0 != null){
      fb1 = fo0.m2();
}
    boolean lb3 = true;
    Output.points[1][2] -= ad4;
    lb3 = !fb0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, ad1, ad2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    Output.points[1][3] += ad2;
    double ld0 = 278.53665370804396;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab4, fb0, fb1, lb1);
}
    ad3 = ad4 - fd0;
    fd1 = ld0 - ad1;
    ab1 = ad2 < ad3;
    if (ab2) {
        boolean lb2 = false;
        ad4 = fd0 - fd1;
        double ld3 = 224.09566647957215;
        ab2 = ld3 < ld0;
        boolean lb4 = false;
        ab2 = ab3 || ab4;
        fb0 = ad1 < ad2;
        boolean lb5 = false;
        fb0 = !fb1;
        lb2 = lb4 && lb5;
        Thought lo6 = Thought47.getInstance(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
        ad3 *= -1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = fd0 < fd1;
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 289.7414637023078;
    fb0 = fb1 && fb0;
    Thought lo1 = Thought89.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    ld0 = ad1 + ad2;
    double ld2 = 14.150232692568231;
    ad2 *= -1;
if(ao1 != null){
      ad3 = ao1.m3();
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m3(ad4, fd0, fd1, ld0);
}
    fb0 = !fb1;
    ld2 *= -1;
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb1 = fb0 && fb1;
    Thought lo3 = Thought77.getInstance(fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, ld2, ad1);
}
    fb0 = ad2 > ad3;
    boolean lb4 = false;
    fb0 = fb1 && lb4;
    ad4 *= -1;
    double ld5 = 202.7727270638395;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, fb0, fb1, lb4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb4, fb0, fb1);
}
    lb4 = fb0 && fb1;
    Output.points[1][4] += ld2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    Thought lo1 = Thought95.getInstance(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(lb0, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = !fb0;
    boolean lb2 = true;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    Thought lo4 = Thought23.getInstance(ao2, ao3, ao4, fo0, lb2, lb3, ab1, ab2);
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = !lb2;
if(fo1 != null){
      fo1.m1();
}
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    lb3 = fd1 > fd0;
    ab1 = fd1 < fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought17.getInstance(ab1, ab2, ab3, ab4);
    boolean lb1 = true;
    boolean lb2 = false;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Output.points[1][5] += fd1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    boolean lb3 = true;
    double ld4 = 511.42509131142816;
    ld4 *= -1;
    boolean lb5 = true;
    ab2 = ab3 || ab4;
    Output.points[1][6] += ad1;
    Output.points[1][7] -= ad2;
    Thought lo6 = Thought62.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
    Output.points[1][8] += ld4;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      lb3 = fo1.m2(ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = fd1 > fd0;
    Output.points[2][0] += fd1;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(lb2, fb0, fb1, lb0);
}
        boolean lb3 = true;
        fd0 = fd1 + fd0;
        lb0 = lb1 || lb2;
        fb0 = fb1 && lb3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        fd0 *= -1;
        fd1 = fd0 + fd1;
        Thought lo4 = Thought85.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, fb0);
        fb1 = fd0 < fd1;
}
Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, lb2, ab1, ab2);
}
    boolean lb3 = true;
    ab2 = fd0 < fd1;
    Thought lo4 = Thought29.getInstance();
        boolean lb5 = false;
    fd0 *= -1;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
    fb0 = fb1 && fb0;
    Output.points[2][1] += fd1;
    Thought lo0 = Thought39.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    double ld2 = 640.9173203544614;
    double ld3 = 402.014175134757;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, ad1, ad2);
}
    fb0 = ad3 > ad4;
    Thought lo4 = Thought38.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld3, fb1, lb1, fb0, fb1);
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ld2 = ld3 + ad1;
    boolean lb5 = false;
    Thought lo6 = Thought43.getInstance(fo1, fo0, fo1, fo0, lb1, lb5, fb0, fb1);
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld2;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m1(fd1, ld2, ld3, ad1, lb5, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(lb5, fb0, fb1, lb1);
}
        Thought lo7 = Thought33.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, ld3, ad1);

Thought.STACK_COUNTER++;
return lb5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        ad1 = ad2 + ad3;
        double ld0 = 918.741250903276;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        boolean lb1 = true;
        Thought lo2 = Thought37.getInstance(fo0, fo1, fo0, fo1);
        Thought lo3 = Thought24.getInstance(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
        ad4 = fd0 - fd1;
        ld0 *= -1;
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    double ld0 = 616.0559174641402;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
}
        boolean lb1 = true;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    Thought lo0 = Thought24.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought3.getInstance(fo0, fo1, ao1, ao2);
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad3 *= -1;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1);
}
    boolean lb2 = false;
    Thought lo3 = Thought85.getInstance(fb0, fb1, lb2, fb0);

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Output.points[2][2] -= fd1;
    Thought lo0 = Thought50.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    double ld1 = 499.13100621248753;
    ab1 = ld1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Output.points[2][3] += fd1;
    boolean lb2 = false;
    double ld3 = 221.400500405767;
    ld1 = ld3 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld1, ld3, fd0, fd1, fb0, fb1, lb2, ab1);
}
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = ab2 || ab3;
if(ao3 != null){
      ab4 = ao3.m2(ld1, ld3, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb2, lb4);
}
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, ld1, ld3, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb2, lb4, ab1);
}
    ab2 = ld1 > ld3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    Thought lo5 = Thought32.getInstance(fd1, ld1, ld3, fd0, ab3, ab4, fb0, fb1);

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab2 = ao2.m2();
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    ab2 = ab3 || ab4;
    double ld0 = 27.9053998567584;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
}
    ab3 = !ab4;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
        Output.points[2][4] -= ld0;
        ab3 = ab4 && fb0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought87.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    Thought lo1 = Thought32.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1();
}
    Thought lo2 = Thought68.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    double ld4 = 113.20769725978002;
    ld4 = fd0 - fd1;
    fb0 = fb1 || lb3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 569.5870938141703;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought70.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 - ld0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      ld0 = fo0.m3();
}
    fd0 *= -1;
    fb0 = fd1 > ld0;
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought1.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    double ld1 = 763.4618483235361;
    boolean lb2 = true;
    boolean lb3 = true;
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
    lb2 = !lb3;
    ad2 *= -1;
    fb0 = ad3 > ad4;
    boolean lb4 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ad1, ad2, fb0, fb1, lb2, lb3);
}

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[2][5] -= ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2();
}
    ab1 = ad2 > ad3;
    Output.points[2][6] -= ad4;
    Thought lo0 = Thought69.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    double ld1 = 74.48885458002385;
    Thought lo2 = Thought33.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    ab3 = !ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 && fb1;
    double ld3 = 436.1701321843264;

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = !fb1;
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
        Output.points[2][7] += fd0;
    fb0 = fb1 && lb0;
    double ld2 = 235.68720569185987;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld2, fd0, fd1);
}
    ld2 = fd0 + fd1;
    ld2 = fd0 + fd1;
    Thought lo3 = Thought53.getInstance(lb1, fb0, fb1, lb0);
    lb1 = ld2 > fd0;
    boolean lb4 = false;
    Output.points[2][8] += fd1;
    Thought lo5 = Thought38.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2);
    lb4 = fd0 > fd1;

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    Thought lo0 = Thought81.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 209.51483481836684;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    fd1 *= -1;
    fb0 = !fb1;
    ld1 = ad1 + ad2;
    Thought lo2 = Thought77.getInstance(ad3, ad4, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    if (fb0) {
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        ad2 = ad3 + ad4;
        fb1 = fb0 || fb1;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = !fb1;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[3][0] -= fd0;
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ab2 = ao3.m2();
}
        ab3 = ab4 || fb0;
    Output.points[3][1] -= fd0;
if(ao4 != null){
      fb1 = ao4.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    double ld0 = 198.57412590431403;
    fd0 = fd1 - ld0;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ab2 = ab3 || ab4;
    if (fb0) {
        fb1 = ad1 < ad2;
        boolean lb0 = true;
        ad3 *= -1;
        double ld1 = 52.924722794751446;
        lb0 = ad3 > ad4;
if(fo1 != null){
          ab1 = fo1.m2(fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
        ad2 *= -1;
        ad3 *= -1;
        fb1 = lb0 && ab1;
        ab2 = ad4 < fd0;
if(ao1 != null){
          fd1 = ao1.m3();
}
        ld1 = ad1 + ad2;
        Output.points[3][2] -= ad3;
        ad4 = fd0 - fd1;
        ab3 = ab4 || fb0;
if(ao3 != null){
          ao2 = ao3.m4(ld1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        if (fb1) {
            ld1 = ad1 + ad2;
if(fo0 != null){
              ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
            ad3 = ad4 - fd0;
if(fo1 != null){
              fo1.m1(ao1, ao2, ao3, ao4, fd1, ld1, ad1, ad2);
}
if(fo0 != null){
              fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
            ab1 = ab2 || ab3;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
              ld1 = ao4.m3(fo0, fo1, ao1, ao2);
}
}}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        fb1 = !lb0;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fb1 || lb0;
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    double ld0 = 99.85799185775274;
    Thought lo1 = Thought9.getInstance(ld0, fd0, fd1, ld0);
    Output.points[3][3] += fd0;
    fd1 = ld0 + fd0;
    fd1 *= -1;
    fb0 = ld0 > fd0;
    fd1 *= -1;
    fb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    ld0 = fd0 + fd1;
    fb1 = ld0 < fd0;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb0 = !lb1;
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
        fb0 = ad3 < ad4;
        fb1 = lb0 || lb1;
        double ld2 = 810.9216040017415;
        Thought lo3 = Thought62.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2);
        ad1 *= -1;
        fb0 = ad2 < ad3;
        Output.points[3][4] += ad4;
        Thought lo4 = Thought68.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, fb1, lb0, lb1, fb0);
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
    ad1 *= -1;
    Thought lo1 = Thought33.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 || lb0;
    Output.points[3][5] -= ad3;
    Output.points[3][6] += ad4;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought21.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    Thought lo3 = Thought3.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 96.97027583023777;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
    double ld1 = 122.96462957323641;
    ld1 = fd0 - fd1;
    ld0 *= -1;
        fb0 = fb1 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0);
}
    fb0 = fb1 || lb2;
    fb0 = fb1 && lb2;
    fb0 = fb1 && lb2;
    ld1 = fd0 - fd1;
    fb0 = ld0 < ld1;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
        ad3 *= -1;
        fb1 = ad4 < fd0;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd1 *= -1;
        ad1 = ad2 + ad3;
        boolean lb1 = true;
if(ao4 != null){
          ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
        boolean lb2 = false;
if(fo0 != null){
          fo0.m1(lb0, lb1, lb2, fb0);
}
        double ld3 = 665.07531349842;
if(fo1 != null){
          ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld3, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
        boolean lb4 = true;
        double ld5 = 74.71420687582469;
        }
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb6 = true;
    lb6 = fd0 > fd1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought87.getInstance();
if(ao4 != null){
      ao4.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = fd1 > fd0;
    ab1 = !ab2;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2();
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab2 = ao2.m2(ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought13.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
          ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
        ab2 = !ab3;
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
        double ld1 = 418.0086117496797;
        boolean lb2 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fb0 = ad2 < ad3;
        fb1 = lb2 || ab1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
}
Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought63.getInstance();
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fb0, fb1, lb1, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo2 = Thought74.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb1, fb0, fb1);
}
    fd1 *= -1;
    Thought lo3 = Thought33.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb1 = !fb0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[3][7] -= fd0;
    Thought lo0 = Thought72.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Output.points[3][8] -= fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought59.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    double ld0 = 619.4114716745987;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[4][0] -= ld0;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0);
}
    fb0 = !fb1;
    Thought lo2 = Thought79.getInstance(lb1, fb0, fb1, lb1);
    double ld3 = 857.7121497600123;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
}
        fb0 = !fb1;
    boolean lb4 = true;
    lb1 = !lb4;
    double ld5 = 17.30466904399868;
    ld5 = fd0 + fd1;
    fb0 = ld0 < ld3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
