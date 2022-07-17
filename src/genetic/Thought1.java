package genetic;
import java.util.ArrayList;
class Thought1 extends Thought{
private static ArrayList<Thought1> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 266.638737373181;
private double fd1 = 558.2015224155041;
private Thought fo0 = null;
private Thought fo1 = null;
Thought1 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought1 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought1 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought1 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought1 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo0 = Thought213.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    double ld1 = 219.87049716706568;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ld1 = fd0 - fd1;
    fb0 = ld1 > fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb2);
}
    Output.points[4][1] -= ld1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[4][2] -= fd1;
    boolean lb3 = false;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb3, fb0, fb1, lb2);
}
    boolean lb4 = true;
    lb3 = fd1 > ld1;
    lb4 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(lb2, lb3, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, ld1, fd0, fd1);
}
    fb1 = ld1 > fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[4][3] -= fd1;
    ab1 = !ab2;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 + fd0;
    ab2 = ab3 || ab4;
if(fo0 != null){
          fo1 = fo0.m4();
}
    double ld0 = 339.55890865060644;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = ld0 + fd0;

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
    fb0 = ad1 > ad2;
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad3 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad4 = fd0 + fd1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought330.getInstance(fo0, fo1, fo0, fo1);
    Output.points[4][4] += ad1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;

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
    double ld0 = 637.9428887668879;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2();
}
    boolean lb1 = false;
    Output.points[4][5] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld2 = 995.4844808538274;
    lb1 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb1);
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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought200.getInstance(ao2, ao3, ao4, fo0);
    fb1 = !fb0;
    double ld1 = 499.48778345739044;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb1 = fd0 > fd1;
if(ao1 != null){
      ld1 = ao1.m3(fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3();
}
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
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
    fb1 = ad2 > ad3;
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    double ld0 = 426.47560693549167;
    ld0 *= -1;
    Thought lo1 = Thought379.getInstance(ao2, ao3, ao4, fo0);
    ad1 = ad2 + ad3;
    double ld2 = 661.6687335156237;
    ad3 = ad4 - fd0;
    Output.points[4][6] -= fd1;
if(fo1 != null){
      fo1.m2(ld0, ld2, ad1, ad2);
}
    double ld3 = 127.42414656504128;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo4 = Thought362.getInstance(fd1, ld0, ld2, ld3, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ad2 = ao1.m3();
}
    ad3 = ad4 - fd0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ld2, ld3, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = fb1 && fb0;
    double ld5 = 274.16453334299956;
    boolean lb6 = false;

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
    Output.points[4][7] -= fd1;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld1 = 890.3669725264032;
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    Thought lo2 = Thought217.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
    double ld3 = 643.6051628588021;
    Output.points[4][8] += ld3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought198.getInstance();
    fb1 = lb0 && ab1;
    fd0 = fd1 + ld1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld3, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, ab1, ab2);
}
    ld3 *= -1;
    boolean lb5 = true;
    for(int i0=0; i0<10; i0++){
        double ld6 = 360.4738237764243;
if(ao3 != null){
          ab2 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ld3, fd0, fd1, ld6);
}
        Thought lo7 = Thought26.getInstance(ao4, fo0, fo1, ao1, ld1, ld3, fd0, fd1);
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
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    Output.points[5][0] += ad3;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    double ld0 = 92.71253705984249;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
        Output.points[5][1] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ld0 = ad1 - ad2;
    Output.points[5][2] -= ad3;
    boolean lb1 = true;
    fb0 = ad4 > fd0;
    boolean lb2 = true;
    fd1 = ld0 - ad1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2();
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        Thought lo0 = Thought260.getInstance(fb1, fb0, fb1, fb0);
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
    double ld1 = 578.6892498407493;
    boolean lb2 = true;
    double ld3 = 746.2302932501632;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld1, ld3, fb1, lb2, fb0, fb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    Output.points[5][3] += fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        ab1 = fd0 < fd1;
        ab2 = ab3 && ab4;
        fd0 = fd1 - fd0;
        fb0 = fb1 && ab1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        double ld0 = 13.978530071518229;
        Thought lo1 = Thought63.getInstance();
        fb1 = ld0 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
        fd0 = fd1 - ld0;
        ab2 = !ab3;
        double ld2 = 907.0582172785279;
if(fo0 != null){
          ld2 = fo0.m3(ab4, fb0, fb1, ab1);
}
}
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[5][4] -= ad1;
    ad2 = ad3 + ad4;
    fb0 = !fb1;
    fd0 = fd1 + ad1;
    double ld0 = 598.3276041147873;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ld0 + ad1;
    boolean lb1 = false;
    lb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
        lb1 = fb0 && fb1;
        double ld2 = 558.2167337571155;
        double ld3 = 166.2205785864819;
        Thought lo4 = Thought175.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
        fb0 = ld3 > ld0;
        fb1 = !lb1;
        fb0 = fb1 && lb1;
        boolean lb5 = false;
        lb1 = !fb0;
}
Thought.STACK_COUNTER++;
return lb1;
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
    Thought lo0 = Thought246.getInstance();
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab1 = fd0 < fd1;
        boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
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
    fb0 = fd0 > fd1;
    double ld0 = 449.115374466887;
if(ao2 != null){
      ao1 = ao2.m4(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
    fb1 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ld0 = fd0 + fd1;
    Thought lo2 = Thought295.getInstance(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
    fd0 = fd1 + ld0;
    fb0 = fb1 && lb1;
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
    Thought lo3 = Thought249.getInstance(fb0, fb1, lb1, fb0);
    boolean lb4 = true;
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    double ld0 = 400.630805454752;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought216.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
if(fo0 != null){
      ao4 = fo0.m4(lb2, fb0, fb1, lb2);
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
    boolean lb0 = true;
    fd1 *= -1;
    lb0 = ab1 && ab2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab3 = ab4 && fb0;
        fd0 = fd1 - fd0;
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
    Output.points[5][5] -= fd0;
    ab3 = fd1 > fd0;
    ab4 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb1 = false;
        ab4 = fb0 && fb1;
        double ld2 = 914.6399287789673;
        ad1 = ad2 - ad3;
        Output.points[5][6] -= ad4;
        lb0 = lb1 || ab1;
if(ao4 != null){
          ab2 = ao4.m2(fd0, fd1, ld2, ad1);
}
        ab3 = ad2 > ad3;
        Thought lo3 = Thought289.getInstance(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2);
if(ao3 != null){
          ad1 = ao3.m3(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
if(ao4 != null){
          ab4 = ao4.m2();
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ld2, ad1, ad2, fb1, lb0, lb1, ab1);
}
        ab2 = !ab3;
        ad3 *= -1;
        boolean lb4 = false;
        }
    fd0 = fd1 + ad1;
    fb1 = !ab1;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
    Thought lo5 = Thought84.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    fd1 *= -1;
    if (fb1) {
        double ld0 = 214.47168529841235;
        Thought lo1 = Thought225.getInstance(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
        fd0 *= -1;
        fb0 = fd1 < ld0;
        fd0 = fd1 + ld0;
        boolean lb2 = false;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
        fd1 = ld0 + fd0;
        double ld3 = 344.37622962434085;
        fb1 = fd0 > fd1;
        Output.points[5][7] += ld0;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 + fd0;
    lb0 = ab1 && ab2;
    double ld1 = 910.7486890514473;
    ab3 = ab4 || fb0;
    Thought lo2 = Thought142.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb0, ab1, ab2);
    ab3 = ab4 || fb0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, ab1, ab2);
}
    ld1 *= -1;

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
    Output.points[5][8] += ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3);
}
    fb1 = !fb0;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = !fb0;
    double ld0 = 686.2291623034941;
    fd0 = fd1 - ld0;
    Output.points[6][0] += ad1;
    ad2 *= -1;
    fb1 = ad3 < ad4;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
return ad4;
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
    ad2 *= -1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    double ld0 = 827.1939538897778;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought168.getInstance();
    ad2 *= -1;
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
    double ld2 = 340.600637407947;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld2);
}
    ab2 = !ab3;
    double ld4 = 600.6730615868147;
if(fo1 != null){
      fo1.m1(ld4, ad1, ad2, ad3, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = false;
    double ld6 = 141.9627842777604;
    ad3 = ad4 + fd0;
    ab4 = fb0 && fb1;
    fd1 = ld0 + ld2;
    lb3 = !lb5;
    ab1 = ab2 || ab3;
    if (ab4) {
}
Thought.STACK_COUNTER++;
return ld4;
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
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
    Thought lo0 = Thought174.getInstance(ao1, ao2, ao3, ao4);
    Thought lo1 = Thought49.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    double ld3 = 608.1934943597416;
    if (lb2) {
        fb0 = fd0 > fd1;
        fb1 = lb2 && fb0;
if(fo0 != null){
          ao4 = fo0.m4(ld3, fd0, fd1, ld3, fb1, lb2, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
            fd0 = fd1 + ld3;
            fd0 = fd1 + ld3;
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, fb0, fb1, lb2);
}
            fb0 = !fb1;
            lb2 = fb0 || fb1;
}}
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
    boolean lb0 = true;
    ad1 = ad2 - ad3;
    double ld1 = 63.19327080780721;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb0 = fb0 || fb1;
    Output.points[6][1] += ad3;
    if (lb0) {
        fb0 = fb1 || lb0;
        fb0 = ad4 > fd0;
        fb1 = !lb0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
        fb1 = ad4 > fd0;
if(ao3 != null){
          ao3.m3(lb0, fb0, fb1, lb0);
}
        fd1 *= -1;
        boolean lb2 = false;
        boolean lb3 = false;
}
Thought.STACK_COUNTER++;
return ld1;
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
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 576.311388027094;
    Output.points[6][2] += ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought252.getInstance(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
    ld0 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      fd0 = ao4.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fd1 > ld0;

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
    ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
    ad1 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && ab1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    ab2 = fd1 < ad1;
    ad2 = ad3 + ad4;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m2(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 > ad2;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = lb2 || ab1;
    boolean lb3 = false;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    double ld4 = 641.7773448020661;
if(ao1 != null){
      fb1 = ao1.m2();
}
    Output.points[6][3] -= ad1;
    boolean lb5 = true;

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
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    double ld0 = 716.1613512428962;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 *= -1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb0 = fd1 < ld0;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    double ld1 = 481.3728368367925;
    double ld2 = 265.31993884691536;
    Thought lo3 = Thought66.getInstance();

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
    ab2 = fd1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fb1 = !ab1;
    ab2 = fd1 > fd0;
    Thought lo0 = Thought94.getInstance(fd1, fd0, fd1, fd0);
    if (ab3) {
        boolean lb1 = false;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        ab3 = fd1 < fd0;
        double ld2 = 816.8112827739874;
        if (ab4) {
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, ld2, fd0, fb0, fb1, lb1, ab1);
}
            Thought lo3 = Thought158.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
            fb1 = lb1 || ab1;
            ab2 = !ab3;
}}
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
    ad1 *= -1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 > ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    fb0 = fb1 && fb0;
    Thought lo0 = Thought85.getInstance(fd0, fd1, ad1, ad2);
    boolean lb1 = false;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][4] += ad1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    if (ab3) {
if(fo0 != null){
          fd1 = fo0.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
        ab2 = fd0 < fd1;
        ab3 = !ab4;
        Output.points[6][5] -= ad1;
        for(int i0=0; i0<10; i0++){
            }
        Output.points[6][6] += ad2;
        Thought lo0 = Thought29.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
if(fo1 != null){
          ab3 = fo1.m2();
}
        ab4 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
        boolean lb1 = false;
        Output.points[6][7] -= ad1;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m2(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        ab1 = ad3 > ad4;
        boolean lb3 = true;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        double ld4 = 337.7327808078065;
        ad2 = ad3 + ad4;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld4, ad1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb2, lb3);
}
if(fo0 != null){
          ad2 = fo0.m3();
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    Output.points[6][8] -= fd0;
    fd1 = fd0 + fd1;
    lb0 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought197.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    if (fb1) {
if(ao1 != null){
          ao1.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
        boolean lb2 = false;
        Output.points[7][0] -= fd1;
        boolean lb3 = true;
        fd0 = fd1 + fd0;
if(ao1 != null){
          fd1 = ao1.m3();
}
        fd0 = fd1 - fd0;
        lb0 = fd1 < fd0;
        fb0 = fb1 && lb2;
        fd1 = fd0 + fd1;
        lb3 = lb0 || fb0;
        fd0 = fd1 - fd0;
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
    if (fb1) {
        for(int i0=0; i0<10; i0++){
            ad2 = ad3 + ad4;
            boolean lb0 = true;
            double ld1 = 935.8235571313697;
            ad4 = fd0 - fd1;
            lb0 = ld1 > ad1;
            Output.points[7][1] -= ad2;
if(ao1 != null){
              ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
            Output.points[7][2] -= ld1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fd0 = fd1 - fd0;
    ab1 = ab2 || ab3;
    Thought lo0 = Thought258.getInstance(ab4, fb0, fb1, ab1);
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[7][3] -= fd1;
    Thought lo1 = Thought170.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    Thought lo2 = Thought47.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    Thought lo3 = Thought367.getInstance(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
    boolean lb4 = true;
    ab3 = !ab4;
    boolean lb5 = false;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb6 = true;
    boolean lb7 = true;
if(fo1 != null){
      ab2 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo8 = Thought62.getInstance(lb4, lb5, lb6, lb7);
    Thought lo9 = Thought266.getInstance(fo0, fo1, ao1, ao2);
    Thought lo10 = Thought110.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    lb4 = lb5 && lb6;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = !lb0;
    boolean lb1 = true;
    Output.points[7][4] -= fd1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m1(lb1, ab1, ab2, ab3);
}
    ad4 = fd0 + fd1;
    boolean lb2 = true;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
    boolean lb3 = false;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        if (lb0) {
if(ao3 != null){
              ao3.m3(ao4, fo0, fo1, ao1, lb1, lb2, lb3, ab1);
}
            ab2 = ad3 < ad4;
}}
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
    Output.points[7][5] += fd0;
if(fo0 != null){
          fo0.m2();
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, fb0, fb1);
}
    Output.points[7][6] += fd1;
        Output.points[7][7] += fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    Thought lo0 = Thought222.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld1 = 690.4909724581818;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < fd0;
    fb0 = fd1 < ld1;
    boolean lb2 = true;
    fd0 = fd1 + ld1;
    double ld3 = 378.8507442234914;
    Thought lo4 = Thought156.getInstance();
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld1, fb0, fb1, lb2, fb0);
}
    ld3 = fd0 + fd1;
    ld1 = ld3 - fd0;
    double ld5 = 219.88782249426484;

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
    Thought lo0 = Thought352.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        boolean lb1 = false;
            lb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb1 = !lb1;
    double ld2 = 21.8778507482627;
    ld2 *= -1;
    fb0 = fd0 > fd1;
        ld2 = fd0 - fd1;
    fb1 = ld2 < fd0;
    Output.points[7][8] += fd1;
        double ld3 = 781.5994109313074;
    ld2 = ld3 - fd0;

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
