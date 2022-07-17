package genetic;
import java.util.ArrayList;
class Thought30 extends Thought{
private static ArrayList<Thought30> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 729.3785162245522;
private double fd1 = 347.6364973521599;
private Thought fo0 = null;
private Thought fo1 = null;
Thought30 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought30 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought30 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought30 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought30 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought30 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought30 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought30 instance = new Thought30 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        }
    boolean lb0 = true;
    lb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    Thought lo1 = Thought345.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    double ld2 = 793.4973333442665;

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
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2();
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    fd1 *= -1;
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb0, lb1);
}
    Output.points[5][6] -= fd0;
    ab1 = ab2 && ab3;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought103.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[5][7] += fd0;
    fd1 = fd0 - fd1;
    Output.points[5][8] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
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
        boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    boolean lb1 = false;
    lb1 = ad2 < ad3;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    lb1 = ad1 > ad2;
    fb0 = fb1 && lb0;
    lb1 = fb0 && fb1;
    Thought lo2 = Thought376.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
    ad3 = ad4 - fd0;
    Thought lo3 = Thought101.getInstance();

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
    ad2 = ad3 + ad4;
    ab1 = fd0 > fd1;
    double ld0 = 664.0704482582198;
    boolean lb1 = false;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    double ld2 = 612.1926158881586;
    boolean lb3 = false;
    Thought lo4 = Thought272.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld0);
}
    if (ab4) {
        fb0 = fb1 || lb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
        Output.points[6][0] -= ad4;
        lb3 = ab1 || ab2;
        ab3 = ab4 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, ld2, fb1, lb1, lb3, ab1);
}
        ab2 = !ab3;
        boolean lb5 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        lb5 = lb1 || lb3;
if(fo1 != null){
          fo1.m3();
}
        ab1 = ab2 || ab3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb5);
}
if(fo0 != null){
          fo0.m2(lb1, lb3, ab1, ab2);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    Output.points[6][1] -= fd1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
    boolean lb1 = false;
    boolean lb2 = true;
    lb1 = !lb2;
if(ao3 != null){
      ao3.m1();
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    lb2 = fb0 && fb1;
    boolean lb3 = false;
    boolean lb4 = true;
    boolean lb5 = true;
    boolean lb6 = false;
    Thought lo7 = Thought64.getInstance(lb0, lb1, lb2, lb3);
if(ao3 != null){
      lb4 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo8 = Thought7.getInstance(fd0, fd1, fd0, fd1);
    lb5 = fd0 > fd1;

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
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 303.59452311928334;
    fb1 = fb0 || fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    double ld1 = 283.45572433461524;

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
    fd1 = fd0 - fd1;
    double ld0 = 787.8287582105743;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m1(lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought90.getInstance(ao2, ao3, ao4, fo0);
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(ld0, fd0, fd1, ld0);
}
    ab4 = fd0 < fd1;
    double ld3 = 473.3388344700247;
    Thought lo4 = Thought30.getInstance(ao1, ao2, ao3, ao4, ld0, ld3, fd0, fd1);
    Thought lo5 = Thought256.getInstance(ld0, ld3, fd0, fd1, fb0, fb1, lb1, ab1);
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    ld3 = fd0 + fd1;
    boolean lb6 = true;
    double ld7 = 751.2763867387915;
    ld0 *= -1;
    if (fb0) {
if(ao4 != null){
          ao4.m2();
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[6][2] += fd1;
if(ao1 != null){
      fb1 = ao1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4);
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
    fd0 *= -1;
    fb1 = fd1 > fd0;
    if (fb0) {
        fd1 = fd0 + fd1;
        fb1 = fd0 < fd1;
        fb0 = fd0 > fd1;
        fb1 = fd0 > fd1;
        fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
        boolean lb0 = true;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fb0 = fb1 || lb0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        double ld1 = 249.9416790093025;
        fd0 *= -1;
        fd1 = ld1 - fd0;
        fd1 *= -1;
        double ld2 = 694.7575598490522;
        ld1 = ld2 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
}
        fb1 = ld1 < ld2;
        lb0 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
}
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
    double ld0 = 975.3094933097019;
    ld0 = fd0 - fd1;
    Thought lo1 = Thought255.getInstance(fo0, fo1, fo0, fo1);
    ld0 = fd0 + fd1;
    Output.points[6][3] -= ld0;
        fd0 = fd1 - ld0;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    Thought lo2 = Thought230.getInstance(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
    fb0 = fd1 < ld0;
    fd0 = fd1 + ld0;
    fb1 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo3 = Thought340.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
    Output.points[6][4] -= fd0;
    fd1 *= -1;
    boolean lb4 = false;
    Thought lo5 = Thought241.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ab3;
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
        boolean lb0 = false;
    Thought lo1 = Thought208.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    double ld2 = 83.10338784956994;
        ad4 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    double ld3 = 163.97200009051812;
    ld2 = ld3 + ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb1, lb0, fb0, fb1);
}
    boolean lb4 = true;
    lb0 = !lb4;
    boolean lb5 = false;
    double ld6 = 578.6396289542686;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    if (lb5) {
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    lb0 = fd1 > ad1;
    Thought lo1 = Thought28.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought239.getInstance(fb1, lb0, ab1, ab2);
    boolean lb3 = false;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
return ab4;
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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought230.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
    Thought lo3 = Thought356.getInstance(lb0, lb2, fb0, fb1);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    lb0 = fd0 > fd1;
    lb2 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb4 = false;
    lb4 = !fb0;
    fb1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, lb0, lb2, lb4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, lb2, lb4);
}
    boolean lb5 = true;
if(ao4 != null){
      ao3 = ao4.m4();
}

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
    ad2 *= -1;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = ad4 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
    fb0 = fb1 || fb0;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    Output.points[6][5] -= ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought42.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought381.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    boolean lb0 = true;
if(ao1 != null){
      fd1 = ao1.m3(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    lb0 = fd1 > fd0;
    ab1 = fd1 > fd0;
    ab2 = ab3 || ab4;
    double ld1 = 660.5106701477803;
    boolean lb2 = true;
    ab4 = fb0 && fb1;
    double ld3 = 289.0301793619841;
    boolean lb4 = true;
if(ao1 != null){
      lb0 = ao1.m2(ld3, fd0, fd1, ld1);
}

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
        ad2 *= -1;
    boolean lb0 = false;
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    lb0 = ab1 && ab2;
    Thought lo1 = Thought266.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
    boolean lb2 = false;
    fd1 = ad1 + ad2;
    lb0 = ad3 < ad4;
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    fd0 = fd1 + ad1;

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
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    double ld0 = 842.026282906666;
    Output.points[6][6] += ld0;
    fb1 = !fb0;
    fd0 *= -1;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3();
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[6][7] -= fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought149.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = fd0 < fd1;
    fb0 = fd0 > fd1;
    double ld1 = 512.4405513606133;
    double ld2 = 241.70167867921157;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ld2 > fd0;
    boolean lb3 = false;
    Thought lo4 = Thought116.getInstance(fo1, fo0, fo1, fo0);
    lb3 = !ab1;
    fd1 = ld1 + ld2;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[6][8] += fd0;
    fb1 = fb0 || fb1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ad3 = fo0.m3();
}
    fb0 = ad4 > fd0;
    fb1 = fd1 > ad1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought307.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fb0, fb1, ab1, ab2);
}
    double ld1 = 831.316771459801;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 - ad4;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, ad1);
}
    for(int i0=0; i0<10; i0++){
        ab3 = ad2 < ad3;
        Thought lo3 = Thought207.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
        ab4 = fb0 && fb1;
if(fo0 != null){
          fo0.m3(ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, ab1);
}
if(fo0 != null){
          fo0.m1();
}
        ab2 = !ab3;
        ab4 = fb0 || fb1;
        fd0 *= -1;
        double ld4 = 228.15790551999805;
        double ld5 = 475.5616271297554;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld5, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
          ld1 = fo0.m3(ab4, fb0, fb1, lb2);
}
        ad1 = ad2 - ad3;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought267.getInstance(fd0, fd1, fd0, fd1);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    double ld2 = 414.58864081531635;
if(fo1 != null){
      ld2 = fo1.m3(fd0, fd1, ld2, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
          fo1 = ao1.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought180.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 = fd1 - ad1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
    fb0 = ad3 < ad4;
    Thought lo1 = Thought66.getInstance(fd0, fd1, ad1, ad2);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    ad3 *= -1;
    fb1 = fb0 && fb1;
    boolean lb2 = true;
    ad4 *= -1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    boolean lb3 = false;
    lb2 = lb3 && fb0;
    fb1 = fd1 > ad1;
    lb2 = ad2 > ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, lb3, fb0, fb1, lb2);
}
if(ao1 != null){
      ad3 = ao1.m3(lb3, fb0, fb1, lb2);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}

Thought.STACK_COUNTER++;
return ad1;
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
if(ao1 != null){
      ab2 = ao1.m2(fd1, fd0, fd1, fd0);
}
    Output.points[7][0] -= fd1;
    double ld0 = 492.25236830012113;
    Thought lo1 = Thought39.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
    ab3 = ab4 && fb0;
    boolean lb2 = true;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1, fb0, fb1, lb2, ab1);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ld0 *= -1;
if(ao1 != null){
      fd0 = ao1.m3();
}
    lb2 = !ab1;
    ab2 = !ab3;
    Output.points[7][1] -= fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb2);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab2 = !ab3;
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    ab3 = ad4 < fd0;
    Thought lo1 = Thought311.getInstance(fd1, ad1, ad2, ad3);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
    Output.points[7][2] -= fd1;
    double ld2 = 182.5333423627686;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    Output.points[7][3] += ld2;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    fb0 = fb1 && lb0;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2();
}
    fb1 = fb0 && fb1;
    Output.points[7][4] -= fd1;
    Output.points[7][5] -= fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    double ld0 = 805.0695828192172;
    fb0 = ld0 < fd0;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    double ld2 = 545.702991175883;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought256.getInstance(fd0, fd1, ld0, ld2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
    if (fb0) {
        Output.points[7][6] -= fd0;
if(fo1 != null){
          fd1 = fo1.m3(ld0, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
}
        ld0 = ld2 + fd0;
        fd1 *= -1;
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
    boolean lb0 = false;
    fd0 *= -1;
    Thought lo1 = Thought390.getInstance(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[7][7] -= fd1;
    fd0 *= -1;
    boolean lb2 = true;
    Thought lo3 = Thought270.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Thought lo4 = Thought269.getInstance(lb0, lb2, ab1, ab2);
    fd1 = fd0 + fd1;
    Output.points[7][8] -= fd0;
    ab3 = fd1 > fd0;
    if (ab4) {
        fb0 = !fb1;
        lb0 = lb2 || ab1;
        fd1 = fd0 + fd1;
        ab2 = ab3 || ab4;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = ad2 < ad3;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought250.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fb1 = fb0 && fb1;
    fb0 = fd1 > ad1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3();
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
    ab1 = ad2 < ad3;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought92.getInstance(ab2, ab3, ab4, fb0);
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
        boolean lb4 = false;
    Output.points[8][0] -= ad2;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 + fd0;
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        fb0 = fb1 || lb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        lb2 = ad4 > fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
    double ld0 = 654.2868310630463;
    Output.points[8][1] -= fd0;
    fb1 = fb0 || fb1;
    fd1 = ld0 - fd0;
    fb0 = !fb1;
if(ao2 != null){
      fd1 = ao2.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2();
}
    fb0 = ld0 > fd0;
    fd1 *= -1;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    fd0 *= -1;
    fb1 = fd1 < ld0;
    Output.points[8][2] += fd0;
    if (fb0) {
        fd1 = ld0 + fd0;
        fb1 = fb0 || fb1;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ao3.m1(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        Output.points[8][3] += fd0;
        Output.points[8][4] -= fd1;
        ld0 = fd0 - fd1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    fb1 = ad2 > ad3;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought184.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    fb1 = fb0 || fb1;
    fd1 *= -1;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    fb0 = ad3 < ad4;
    Thought lo2 = Thought5.getInstance(ao3, ao4, fo0, fo1);
    double ld3 = 834.9574630838339;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld3);
}
    fb1 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        lb1 = fb0 || fb1;
        lb1 = ld3 < ad1;
        boolean lb4 = false;
if(ao2 != null){
          lb1 = ao2.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb4, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb4, lb1);
}
}
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
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    ab1 = !ab2;
    ab3 = fd0 < fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought87.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 = fd0 - fd1;
    Thought lo1 = Thought167.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    double ld2 = 5.615269834776229;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ab1 = ad1 > ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    ad3 = ad4 - fd0;
    ab1 = fd1 > ad1;
    ad2 = ad3 + ad4;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
if(ao1 != null){
      ad1 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
    fd1 = ad1 + ad2;
    double ld1 = 567.2550076665588;
    ab3 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
    Output.points[8][5] += ad4;

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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 98.96680290222902;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    ld0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + ld0;
    fd0 = fd1 - ld0;
    Thought lo2 = Thought247.getInstance();
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    fb0 = !fb1;
    fd1 = ld0 - fd0;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb3, fb0, fb1);
}
    fd1 = ld0 - fd0;

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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    boolean lb2 = true;

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
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = true;
        fb0 = fb1 && lb0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[8][6] -= fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    lb0 = fb0 && fb1;
    fd1 = fd0 - fd1;

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
