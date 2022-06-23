package genetic;
import java.util.ArrayList;
class Thought2 extends Thought{
private static ArrayList<Thought2> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 482.0287491807105;
private double fd1 = 162.28839357495843;
private Thought fo0 = null;
private Thought fo1 = null;
Thought2 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought2 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought2 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought2 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought2 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought2 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought2 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought2 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought2 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought2 instance = new Thought2 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought2 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought2 instance = new Thought2 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought2 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought2 instance = new Thought2 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought2 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought2 instance = new Thought2 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought2 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought2 instance = new Thought2 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought2 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought2 instance = new Thought2 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought2 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought2 instance = new Thought2 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought2 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought2 instance = new Thought2 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
          fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1();
}
    boolean lb0 = true;
    double ld1 = 435.99888585737426;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    boolean lb2 = false;
        boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb3, fb0, fb1, lb0);
}
    double ld4 = 801.5156849068376;
    ld4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
    boolean lb5 = true;
if(fo1 != null){
      ld1 = fo1.m3(ld4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld1);
}
    boolean lb6 = true;

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
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought16.getInstance();
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    Thought lo1 = Thought19.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb2 = !ab1;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    double ld4 = 495.01613575878935;
    ab1 = ab2 && ab3;
    fd0 = fd1 - ld4;

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
    fb1 = ad2 < ad3;
    Output.points[4][1] -= ad4;
    fb0 = fd0 > fd1;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > ad1;
    ad2 *= -1;
    Output.points[4][2] -= ad3;
    fb1 = ad4 < fd0;
    double ld2 = 631.7494364746079;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ld2 = ad1 - ad2;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fd1 = ad1 - ad2;
    Output.points[4][3] += ad3;
    boolean lb0 = true;
    Thought lo1 = Thought80.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
        boolean lb2 = false;
    ab1 = ad2 > ad3;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
    lb3 = fd1 > ad1;

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
    boolean lb0 = true;
    Thought lo1 = Thought27.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    double ld2 = 617.1987756656667;
    for(int i0=0; i0<10; i0++){
        double ld3 = 312.92349291609247;
        }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld2);
}
    fb1 = fd0 > fd1;
    lb0 = fb0 && fb1;
    Output.points[4][4] -= ld2;
if(fo1 != null){
      fd0 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    boolean lb4 = false;
    lb4 = fd1 < ld2;
    boolean lb5 = true;

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
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[4][5] -= ad2;
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = !fb0;
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Thought lo2 = Thought58.getInstance(ao4, fo0, fo1, ao1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
    double ld3 = 740.5625067185435;
    ad4 = fd0 + fd1;
    fb1 = ld3 < ad1;
    double ld4 = 457.0560999045706;
if(ao2 != null){
          lb0 = ao2.m2(ao3, ao4, fo0, fo1, lb1, fb0, fb1, lb0);
}
    ad1 = ad2 + ad3;

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
    double ld0 = 352.68265148655826;
    ab2 = fd0 < fd1;
    ab3 = ld0 < fd0;
if(ao1 != null){
      ab4 = ao1.m2(fd1, ld0, fd0, fd1);
}
    double ld1 = 477.1367009458011;
    boolean lb2 = true;
    Thought lo3 = Thought92.getInstance(ao2, ao3, ao4, fo0, ld0, ld1, fd0, fd1);
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb2, ab1);
}
if(ao1 != null){
      ld0 = ao1.m3();
}
    double ld4 = 947.095542541121;
    boolean lb5 = true;
    Thought lo6 = Thought56.getInstance(ld1, ld4, fd0, fd1, ab1, ab2, ab3, ab4);
    ld0 *= -1;
    fb0 = fb1 && lb2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld1, ld4, fd0, fd1, lb5, ab1, ab2, ab3);
}
    ld0 = ld1 + ld4;
    boolean lb7 = false;
    fd0 = fd1 + ld0;
    ab3 = ld1 > ld4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb2);
}
    lb5 = fd0 > fd1;
    lb7 = ab1 || ab2;
if(ao1 != null){
      ab3 = ao1.m2(ld0, ld1, ld4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, ld1, ld4, fd0);
}
    fd1 = ld0 + ld1;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb2);
}
    lb5 = lb7 || ab1;

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
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2();
}
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    double ld0 = 474.22326773988044;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    ld0 *= -1;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            ad1 *= -1;
if(ao2 != null){
              ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
            ad2 *= -1;
            double ld1 = 495.02490485986135;
            boolean lb2 = false;
if(ao1 != null){
              ab4 = ao1.m2(ad2, ad3, ad4, fd0);
}
            fd1 = ld1 - ld0;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
              fd0 = ao2.m3(fb0, fb1, lb2, ab1);
}
if(ao3 != null){
              ao3.m2();
}
if(ao4 != null){
              ab2 = ao4.m2(fd1, ld1, ld0, ad1, ab3, ab4, fb0, fb1);
}
}}
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
    double ld0 = 229.73770741030376;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
    fb1 = ld0 < fd0;
    fb0 = fd1 < ld0;
    double ld1 = 516.6021390801518;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld0, ld1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ld0;
    ld1 = fd0 + fd1;
    boolean lb2 = false;
    fb0 = ld0 > ld1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fd0 < fd1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    Thought lo1 = Thought77.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;

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
    double ld0 = 644.0481312810347;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fb0 = ld0 < ad1;
    fb1 = lb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
}
    double ld2 = 612.1755337586244;
    fd0 *= -1;
    fd1 *= -1;
    lb1 = ld0 < ld2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = ad1 > ad2;
    lb1 = ad3 > ad4;
    double ld3 = 562.9995239154867;
    ad4 = fd0 + fd1;
    fb0 = ld0 < ld2;
    ld3 = ad1 - ad2;
    boolean lb4 = true;
    ad3 = ad4 + fd0;
    fb0 = !fb1;
    Thought lo5 = Thought78.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, ld2, ld3, lb1, lb4, fb0, fb1);
    boolean lb6 = false;
    lb1 = lb4 || lb6;
    Output.points[4][6] += ad1;
    boolean lb7 = false;

Thought.STACK_COUNTER++;
return lb7;
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
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ad1, ad2, ad3, ad4);
}
    ab3 = fd0 > fd1;
    ab4 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    fb0 = ad2 > ad3;
    Thought lo0 = Thought51.getInstance(fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 372.9665189242264;
    ab4 = fb0 && fb1;
    ab1 = ab2 && ab3;
    Output.points[4][7] -= ad3;
    ab4 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 || ab1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb0 = !fb1;
    Output.points[4][8] -= fd0;
    Thought lo0 = Thought85.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld1 = 857.2310996093106;
    Output.points[5][0] -= fd0;
    fd1 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
    ld1 *= -1;
    lb2 = fd0 > fd1;
    lb3 = ld1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb2, lb3);
}
if(ao4 != null){
      ao4.m2(ld1, fd0, fd1, ld1);
}
    fb0 = fb1 && lb2;
    Output.points[5][1] += fd0;
    double ld4 = 167.17092172424574;
        boolean lb5 = false;
    lb3 = fd0 > fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 || fb1;
    Output.points[5][2] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought99.getInstance();
    fb0 = fb1 && fb0;
    fd1 *= -1;
    ad1 *= -1;
    fb1 = ad2 > ad3;
    fb0 = ad4 > fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought10.getInstance(ao3, ao4, fo0, fo1);
    fd1 = fd0 - fd1;
        Thought lo1 = Thought61.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    Thought lo2 = Thought77.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    Thought lo4 = Thought76.getInstance(ab4, fb0, fb1, lb3);
if(ao3 != null){
      fd0 = ao3.m3();
}
    double ld5 = 528.8226897484602;
    ab1 = ab2 || ab3;
if(ao4 != null){
      ab4 = ao4.m2(fd0, fd1, ld5, fd0, fb0, fb1, lb3, ab1);
}
    if (ab2) {
        Output.points[5][3] += fd1;
        boolean lb6 = true;
        ld5 = fd0 + fd1;
if(fo0 != null){
          ld5 = fo0.m3(fo1, ao1, ao2, ao3);
}
        double ld7 = 962.5498276830225;
        ab2 = ab3 || ab4;
        ld5 = fd0 - fd1;
        ld7 = ld5 + fd0;
        fb0 = !fb1;
}
Thought.STACK_COUNTER++;
return lb3;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Output.points[5][4] += fd1;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
    Output.points[5][5] -= fd0;
    double ld0 = 404.090025858437;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought82.getInstance(ab4, fb0, fb1, ab1);
    boolean lb2 = true;
    ab1 = ad2 < ad3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld3 = 938.5921701233254;
if(ao3 != null){
      ad3 = ao3.m3(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    ld3 = ad1 + ad2;
    fb1 = ad3 > ad4;
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    ld0 = ld3 + ad1;
    ad2 = ad3 - ad4;
    double ld4 = 697.6725418551408;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        fb0 = fb1 || fb0;
        fd1 *= -1;
        boolean lb0 = true;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0);
}
        boolean lb1 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        fd0 = fd1 + fd0;
        fb0 = fb1 || lb0;
if(fo0 != null){
          fo0.m1(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
        lb1 = fb0 && fb1;
        boolean lb2 = false;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);
}
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        double ld3 = 169.59952141189666;
        fb1 = lb0 || lb1;
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
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought58.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb0 = lb2 && ab1;
    Output.points[5][6] -= fd0;
    Thought lo3 = Thought61.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    boolean lb4 = false;
    boolean lb5 = true;
    lb5 = !ab1;
    ab2 = fd1 < fd0;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb0;
        fb0 = fb1 || lb0;
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo1 = Thought35.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
        fd1 = ad1 - ad2;
        Thought lo2 = Thought74.getInstance(ad3, ad4, fd0, fd1);
        Thought lo3 = Thought25.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        }
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    double ld4 = 134.00614176895598;
        fb0 = ad3 > ad4;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    ad2 *= -1;
    fb0 = ad3 < ad4;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m2();
}
    Thought lo1 = Thought85.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[5][7] += ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    double ld2 = 289.04563683956223;
    fb1 = lb0 && ab1;
    Thought lo3 = Thought25.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1);
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
    boolean lb4 = true;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd0 = fd1 - ld2;
    fb1 = lb0 && lb4;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Output.points[5][8] -= fd0;
    fb0 = fb1 || lb0;
    lb4 = !ab1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 390.58036169996916;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    Output.points[6][0] += ld0;
    fb0 = fd0 < fd1;
    double ld1 = 691.6214475598179;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    double ld2 = 644.5154224380764;
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(ld1, ld2, fd0, fd1);
}
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ld1, ld2, fd0);
}
    boolean lb5 = false;
    lb4 = fd1 < ld0;
    ld1 = ld2 - fd0;
    lb5 = fb0 || fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao4 != null){
      lb0 = ao4.m2();
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb1 = true;
    Thought lo2 = Thought79.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
    double ld3 = 520.7701422291674;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb0, lb1, fb0);
}
    fd0 = fd1 - ld3;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4);
}
    double ld4 = 304.45653949118474;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld3);
}
    fb1 = lb0 || lb1;
    fb0 = !fb1;
    Thought lo5 = Thought57.getInstance(lb0, lb1, fb0, fb1);
    lb0 = ld4 > ad1;
    double ld6 = 195.06075022951265;
    double ld7 = 575.0419329488723;
    ld7 *= -1;
    ad1 = ad2 - ad3;
    lb1 = !fb0;
    ad4 = fd0 + fd1;
    ld3 = ld4 + ld6;
    fb1 = ld7 < ad1;
    lb0 = !lb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ab1 = ao3.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought82.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[6][1] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m1(ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
    Thought lo1 = Thought39.getInstance();
    fd0 = fd1 + fd0;
    double ld2 = 329.23670374484317;
    fd0 *= -1;
    ab2 = fd1 < ld2;
    boolean lb3 = false;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
    if (fb1) {
        Output.points[6][2] -= ld2;
        lb3 = fd0 < fd1;
        ld2 *= -1;
        fd0 *= -1;
        boolean lb4 = true;
        lb3 = !ab1;
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
    boolean lb0 = true;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
        Thought lo1 = Thought5.getInstance(ao1, ao2, ao3, ao4);
    fb1 = lb0 || ab1;
    ab2 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[6][3] -= ad1;
    ad2 *= -1;
    boolean lb2 = true;
    lb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Thought lo3 = Thought56.getInstance(fd0, fd1, ad1, ad2);
    double ld4 = 420.1611267509771;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ld4 = ao4.m3(lb0, lb2, ab1, ab2);
}
    Thought lo5 = Thought32.getInstance();
    Thought lo6 = Thought23.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    boolean lb7 = true;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ld4 *= -1;
    Output.points[6][4] -= ad1;

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
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
    Output.points[6][5] += fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    double ld2 = 363.02215782998053;
    fb0 = !fb1;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    Output.points[6][6] -= fd0;
if(fo0 != null){
      fo0.m2(fd1, ld2, fd0, fd1);
}
    ld2 = fd0 - fd1;
    ld2 = fd0 - fd1;
    boolean lb3 = false;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(fo0 != null){
      fd0 = fo0.m3(lb1, lb3, fb0, fb1);
}
    Thought lo4 = Thought88.getInstance();
if(fo1 != null){
      fo1.m1(fd1, ld2, fd0, fd1, lb0, lb1, lb3, fb0);
}
    fb1 = ld2 > fd0;

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
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        Output.points[6][7] += fd1;
    fd0 = fd1 + fd0;
    ab4 = !fb0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    boolean lb1 = false;
    Output.points[6][8] += fd1;
    boolean lb2 = true;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(lb2, ab1, ab2, ab3);
}
        boolean lb3 = true;

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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3();
}
    Thought lo0 = Thought15.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    ad2 *= -1;
    fb1 = !fb0;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    Output.points[7][0] += ad2;
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb2);
}
    boolean lb3 = true;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
    double ld4 = 869.3857771568578;
    Output.points[7][1] += ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ad1);
}
    Output.points[7][2] += ad2;
if(fo0 != null){
      fo0.m1(lb3, fb0, fb1, lb1);
}
    boolean lb5 = true;
    ad3 = ad4 + fd0;
    Thought lo6 = Thought18.getInstance();
    fd1 = ld4 - ad1;

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
    Thought lo0 = Thought50.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fd0 = fd1 - ad1;
    Thought lo1 = Thought93.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = false;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
    Output.points[7][3] += fd0;
    boolean lb3 = true;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought50.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fd0 > fd1;
    Thought lo1 = Thought12.getInstance(fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fb0 && fb1;
    double ld2 = 188.06246504331557;
    Output.points[7][4] -= ld2;
    boolean lb3 = true;
    Output.points[7][5] += fd0;
if(ao3 != null){
      ao3.m3(fd1, ld2, fd0, fd1, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    if (fb0) {
        fb1 = lb3 || fb0;
        fb1 = lb3 || fb0;
        Output.points[7][6] += ld2;
        Thought lo4 = Thought94.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, fb1, lb3, fb0, fb1);
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb3);
}
if(ao1 != null){
          ao1.m1(fd1, ld2, fd0, fd1);
}
        Output.points[7][7] -= ld2;
        double ld5 = 277.7100859344169;
        for(int i0=0; i0<10; i0++){
            ld2 = fd0 + fd1;
            if (fb0) {
                Output.points[7][8] += ld5;
                ld2 *= -1;
}}}
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
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd1 *= -1;
        ad1 = ad2 + ad3;
        Thought lo0 = Thought24.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1);
}
        ad3 = ad4 - fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + ad1;
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        ad2 = ad3 - ad4;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          ad1 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
        boolean lb1 = false;
        double ld2 = 591.1497408977839;
        double ld3 = 95.2536008033729;
}
Thought.STACK_COUNTER++;
return ao4;
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
    ab2 = !ab3;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
    Output.points[8][0] += fd1;
    double ld1 = 269.8951452201406;
    ab1 = ld1 > fd0;
    ab2 = !ab3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, fd0, fd1);
}
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
if(ao2 != null){
      ao2.m3(ab1, ab2, ab3, ab4);
}
        fd1 *= -1;
    fb0 = fb1 || lb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[8][1] += ad1;
    ab2 = ad2 < ad3;
    ab3 = ab4 && fb0;
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad3 = ad4 - fd0;
    double ld0 = 549.8402913121944;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought80.getInstance(fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
    ad2 = ad3 + ad4;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab3 = fd0 < fd1;
    ld0 = ad1 + ad2;

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
    double ld0 = 836.5969196923267;
    Output.points[8][2] -= fd0;
    Output.points[8][3] += fd1;
    ld0 *= -1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought77.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought32.getInstance(fd1, ld0, fd0, fd1);
        fb0 = ld0 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought63.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    fb0 = fd1 < fd0;
    double ld1 = 285.7027797509321;
    boolean lb2 = false;
    fd0 *= -1;
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fb1 = !lb2;
    double ld3 = 743.5700974019854;

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
    double ld0 = 202.6360598188638;
    Thought lo1 = Thought38.getInstance(fb1, fb0, fb1, fb0);
    Thought lo2 = Thought60.getInstance();
    fb1 = fb0 || fb1;
    ld0 *= -1;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    lb3 = !fb0;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, fb1, lb3, fb0, fb1);
}
    lb3 = !fb0;
        boolean lb4 = false;
    Output.points[8][4] -= fd1;
    fb0 = fb1 && lb3;
    ld0 = fd0 - fd1;
    Thought lo5 = Thought34.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb4, fb0, fb1, lb3);
}
    double ld6 = 967.3441968491437;
    Thought lo7 = Thought57.getInstance(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb3);
    lb4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld6, fd0, fd1, ld0);
}
    boolean lb8 = false;
    Thought lo9 = Thought68.getInstance(fo1, fo0, fo1, fo0, ld6, fd0, fd1, ld0);
        boolean lb10 = false;

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
