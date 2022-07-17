package genetic;
import java.util.ArrayList;
class Thought21 extends Thought{
private static ArrayList<Thought21> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 108.8643974960187;
private double fd1 = 202.31439110279496;
private Thought fo0 = null;
private Thought fo1 = null;
Thought21 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought21 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought21 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought21 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought21 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    fb0 = fd1 > fd0;
    double ld1 = 328.38049484669864;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    Thought lo3 = Thought174.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    fb1 = lb0 && lb2;
    ld1 = fd0 + fd1;
    double ld4 = 429.2828818788615;

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
    fd0 = fd1 + fd0;
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fd1 *= -1;
    if (fb0) {
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ab3 = fd1 < fd0;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
        ab1 = !ab2;
        boolean lb1 = false;
        fd0 = fd1 - fd0;
        boolean lb2 = false;
        fd1 = fd0 - fd1;
        } else if (ab3) {
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        boolean lb3 = false;
        fd1 = fd0 - fd1;
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
    fb1 = !fb0;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    fb1 = ad3 > ad4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
        ad1 = ad2 - ad3;
        ad4 *= -1;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        double ld0 = 365.63357761214576;
        boolean lb1 = false;
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
        Thought lo2 = Thought348.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m3(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld0, ad1, ad2, lb1, fb0, fb1, lb1);
}
        double ld3 = 905.1033598523255;
        ad2 *= -1;
        Thought lo4 = Thought7.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
        fb1 = ad3 > ad4;
        lb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m3();
}
        lb1 = fd0 < fd1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ld0, ld3, ad1, ad2, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb1, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad1 = ad2 - ad3;
    ab4 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    double ld0 = 935.8435931887149;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
    Output.points[3][0] -= ad3;
    boolean lb1 = true;
    ab4 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    if (fb0) {
        fb1 = lb1 && ab1;
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
        ld0 = ad1 - ad2;
        ad3 = ad4 + fd0;
        ab2 = ab3 && ab4;
        fb0 = fb1 || lb1;
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        boolean lb2 = true;
        fb0 = fb1 || lb2;
        fd1 *= -1;
        lb1 = !ab1;
        ab2 = ld0 < ad1;
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
    double ld0 = 244.24591759319614;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought204.getInstance(fb0, fb1, fb0, fb1);
        fb0 = fd0 > fd1;
        fb1 = !fb0;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(ld0, fd0, fd1, ld0);
}
        fb1 = fb0 || fb1;
        Output.points[3][1] -= fd0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1);
}
if(ao4 != null){
          fb0 = ao4.m2(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
        fb1 = fd0 < fd1;
        boolean lb2 = false;
        lb2 = fb0 || fb1;
        lb2 = fb0 && fb1;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        ld0 *= -1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought209.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    fb1 = ad1 < ad2;
    ad3 *= -1;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought200.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[3][2] -= ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        ad2 *= -1;
    double ld2 = 270.9355040272319;
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb3, fb0);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb1 = ao3.m2(ad3, ad4, fd0, fd1);
}
    boolean lb4 = true;
    Thought lo5 = Thought150.getInstance(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3);
    lb3 = !lb4;
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ld2, fb1, lb3, lb4, fb0);
}
    double ld6 = 544.4829696618852;
    Thought lo7 = Thought345.getInstance(ao3, ao4, fo0, fo1, fb1, lb3, lb4, fb0);
if(ao1 != null){
      ld6 = ao1.m3();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
        ab3 = fd0 > fd1;
    ab4 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab4 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought247.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    double ld1 = 268.36975251243734;

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
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    if (ab4) {
        double ld1 = 776.9483152878103;
        ad4 *= -1;
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
              ao2 = ao3.m4(fb0, fb1, lb0, ab1);
}
            fd0 = fd1 + ld1;
            ad1 = ad2 - ad3;
            ad4 *= -1;
            boolean lb2 = true;
            ab1 = fd0 > fd1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
              ao4 = fo0.m4(ld1, ad1, ad2, ad3);
}
            ab2 = ab3 && ab4;
            fb0 = ad4 > fd0;
            double ld3 = 995.9163174471274;
            boolean lb4 = true;
            fb0 = fb1 && lb2;
            double ld5 = 824.1838287122323;
            lb4 = !lb0;
if(fo1 != null){
              ab1 = fo1.m2(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld3);
}
            boolean lb6 = true;
            boolean lb7 = false;
if(fo1 != null){
              fo0 = fo1.m4(ld5, ld1, ad1, ad2, lb0, ab1, ab2, ab3);
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m1();
}
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Output.points[3][3] -= fd1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
    double ld1 = 960.9865051132972;
    Output.points[3][4] -= ld1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = true;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    double ld0 = 806.2369840613122;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = fd0 < fd1;
    Thought lo1 = Thought318.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    if (fb1) {
        double ld2 = 404.1982195241629;
        double ld3 = 67.86472048978813;
        Thought lo4 = Thought350.getInstance(ld2, ld3, ld0, fd0);
        Output.points[3][5] += fd1;
if(fo1 != null){
          ld2 = fo1.m3(fo0, fo1, fo0, fo1, ld3, ld0, fd0, fd1);
}
        ab1 = ld2 < ld3;
        ab2 = ab3 || ab4;
        ld0 = fd0 - fd1;
        Output.points[3][6] -= ld2;
        fb0 = ld3 > ld0;
        boolean lb5 = false;
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld2, ld3, ab4, fb0, fb1, lb5);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb6, ab1, ab2, ab3);
}
        for(int i0=0; i0<10; i0++){
if(fo1 != null){
              fo0 = fo1.m4();
}
            ld0 *= -1;
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fb1 = fb0 && fb1;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo1.m1();
}
        double ld0 = 346.04376632818236;
        Thought lo1 = Thought231.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    boolean lb2 = false;
    ad2 *= -1;
    Output.points[3][7] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    Thought lo3 = Thought12.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb1, lb2, ab1, ab2);
}
    Output.points[3][8] += ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought364.getInstance(ao3, ao4, fo0, fo1);
    Thought lo1 = Thought215.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        }
    fb1 = fd0 < fd1;

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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[4][0] += fd0;
    fd1 *= -1;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(lb0, fb0, fb1, lb0);
}
    fb0 = ad1 > ad2;
    fb1 = lb0 || fb0;
    Thought lo1 = Thought54.getInstance(ao3, ao4, fo0, fo1);
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    Thought lo3 = Thought237.getInstance(fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
    fb1 = lb0 && lb2;
    Output.points[4][1] -= ad3;
    fb0 = fb1 || lb0;
    ad4 = fd0 + fd1;
    Output.points[4][2] -= ad1;
    lb2 = ad2 < ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    fb0 = ad2 > ad3;

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
    boolean lb0 = false;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Output.points[4][3] -= fd0;
    lb0 = !ab1;
    Thought lo1 = Thought61.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
    Output.points[4][4] -= fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    Output.points[4][5] -= fd0;
    ab1 = ab2 && ab3;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    boolean lb0 = true;
    boolean lb1 = false;
    Output.points[4][6] += fd1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3();
}
        boolean lb2 = true;
        fd0 = fd1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought32.getInstance(fd1, fd0, fd1, fd0);
    Thought lo1 = Thought178.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    Thought lo2 = Thought31.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Thought lo3 = Thought319.getInstance();
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb4 = false;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb4, fb0);
}
    fb1 = lb4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb5 = false;

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    Output.points[4][7] -= fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought128.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    fd0 *= -1;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        ab1 = fd0 > fd1;
if(fo0 != null){
          fd0 = fo0.m3();
}
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        lb1 = !ab1;
        ab2 = fd1 > fd0;
        Output.points[4][8] -= fd1;
        ab3 = ab4 && fb0;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        }
    fd1 = ad1 - ad2;
    fb1 = !fb0;
    ad3 = ad4 - fd0;
        Thought lo0 = Thought213.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    double ld1 = 504.1924009946556;
    ad3 = ad4 - fd0;
    fd1 = ld1 - ad1;
    fb1 = fb0 && fb1;
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    ld1 = ad1 + ad2;

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
    ab2 = ad1 < ad2;
    boolean lb0 = false;
    Output.points[5][0] -= ad3;
    ab2 = ad4 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo1 != null){
      fo1.m2();
}
    double ld1 = 847.4523257861877;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought385.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fd0 *= -1;
        fb0 = fb1 || fb0;
        Thought lo1 = Thought399.getInstance();
        fd1 *= -1;
        fb1 = fb0 || fb1;
        boolean lb2 = true;
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
if(ao2 != null){
          fd1 = ao2.m3(fb0, fb1, lb2, fb0);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Output.points[5][1] -= fd1;
    fb0 = ad1 > ad2;
    boolean lb0 = false;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao2.m2(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought359.getInstance();
    Thought lo2 = Thought136.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
    boolean lb3 = false;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, lb3);
}
    ad4 *= -1;
    fb0 = !fb1;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    Thought lo4 = Thought84.getInstance(ao2, ao3, ao4, fo0);
    lb0 = fd0 > fd1;
    boolean lb5 = false;
    ad1 *= -1;

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
    ab2 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    double ld0 = 721.2762039272742;
    Thought lo1 = Thought75.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought160.getInstance();
    ld0 = fd0 + fd1;
    fb0 = fb1 || ab1;
    ab2 = ld0 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ld0 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(ab2, ab3, ab4, fb0);
}
    ld0 = fd0 - fd1;
    double ld3 = 784.0565024137762;
    Thought lo4 = Thought307.getInstance(ao4, fo0, fo1, ao1);
    ld0 = ld3 + fd0;
    boolean lb5 = false;
    boolean lb6 = false;
if(ao2 != null){
      fd1 = ao2.m3(ld0, ld3, fd0, fd1);
}
    ld0 = ld3 - fd0;
    ab4 = !fb0;

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
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    ab3 = fd0 > fd1;
    ab4 = ad1 > ad2;
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;
    ad1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m2();
}
    fd1 = ad1 - ad2;
    ab4 = !fb0;
    Thought lo0 = Thought157.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
if(ao1 != null){
          fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    Thought lo2 = Thought216.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab1 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          fd1 = ao1.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        fb1 = fd0 > fd1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 *= -1;
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[5][2] -= fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        double ld0 = 452.4342986975071;
if(fo0 != null){
          fb0 = fo0.m2();
}
        boolean lb1 = true;
        boolean lb2 = true;
        Thought lo3 = Thought30.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb1);
if(fo0 != null){
          fo1 = fo0.m4(lb2, fb0, fb1, lb1);
}
        double ld4 = 57.19587298299891;
if(fo1 != null){
          ld4 = fo1.m3(fo0, fo1, fo0, fo1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought306.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Output.points[5][3] -= fd1;
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought57.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    Output.points[5][4] -= fd0;
    fd1 *= -1;
        boolean lb2 = true;
if(fo1 != null){
      fo1.m1();
}
    boolean lb3 = true;
    Output.points[5][5] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
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
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    fb0 = !fb1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
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
    ab1 = !ab2;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
    Output.points[5][6] -= ad4;
    Thought lo1 = Thought31.getInstance(fo1, fo0, fo1, fo0);
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought362.getInstance(fd0, fd1, ad1, ad2);
        for(int i1=0; i1<10; i1++){
            lb0 = ab1 || ab2;
            ab3 = ad3 > ad4;
}}
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
    for(int i0=0; i0<10; i0++){
        Output.points[5][7] -= fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb0 = fd1 > fd0;
        fb1 = fd1 < fd0;
if(ao1 != null){
          ao1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        double ld0 = 839.4022574570529;
        fb0 = fb1 || fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + ld0;
}
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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    fb1 = ad3 < ad4;
if(ao3 != null){
      lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    boolean lb1 = true;
    fd1 *= -1;
    boolean lb2 = false;
    Output.points[5][8] -= ad1;
    lb2 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    lb0 = ad2 < ad3;
    boolean lb3 = false;
    boolean lb4 = false;
if(ao4 != null){
      lb1 = ao4.m2(ad4, fd0, fd1, ad1);
}
    boolean lb5 = true;
    Thought lo6 = Thought120.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    fd1 *= -1;
    lb2 = ad1 < ad2;

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
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
    ab2 = fd1 < fd0;
    boolean lb0 = false;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4);
}
    ab3 = fd1 < fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    double ld3 = 667.2261100510132;
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
    ld3 *= -1;
    fd0 = fd1 + ld3;
    fb1 = lb0 && lb1;

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
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m1();
}
    ab1 = ab2 || ab3;
    double ld0 = 146.87507613288702;
    ab4 = ad4 > fd0;
    fb0 = fb1 && ab1;
    double ld1 = 130.35026876163607;
    ab2 = !ab3;
    double ld2 = 557.656419006486;
    double ld3 = 633.2309268042161;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao2 != null){
      ld0 = ao2.m3(fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    if (ab4) {
        fb0 = fb1 && ab1;
if(ao4 != null){
          ao3 = ao4.m4(ld1, ld2, ld3, ad1);
}
        boolean lb4 = false;
        ad2 = ad3 - ad4;
        } else {
        fd0 = fd1 + ld0;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
        fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    Output.points[6][0] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
        boolean lb0 = false;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    Output.points[6][1] += fd1;
    fb0 = fd0 > fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;

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
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    double ld0 = 973.689104137636;

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
