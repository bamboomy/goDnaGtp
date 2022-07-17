package genetic;
import java.util.ArrayList;
class Thought41 extends Thought{
private static ArrayList<Thought41> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 686.0526761185012;
private double fd1 = 204.40603800371449;
private Thought fo0 = null;
private Thought fo1 = null;
Thought41 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought41 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought41 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought41 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought41 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    if (fb0) {
        Output.points[6][1] -= fd0;
        } else if (fb1) {
        Output.points[6][2] -= fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
        fd0 = fd1 - fd0;
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
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    lb0 = !ab1;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought146.getInstance(fo0, fo1, fo0, fo1);
        ab2 = ab3 && ab4;
        }
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought74.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 < fd1;
    double ld3 = 444.3670526734239;
    ld3 = fd0 - fd1;
    boolean lb4 = true;
    ld3 *= -1;
        boolean lb5 = false;

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
    lb0 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m1();
}
    double ld1 = 280.0656420788916;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought368.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought98.getInstance(fd0, fd1, ld1, ad1);
    fb1 = lb0 || fb0;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    double ld4 = 474.97081036375795;
    for(int i0=0; i0<10; i0++){
        boolean lb5 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
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
    ad2 *= -1;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = ad2 > ad3;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ad1;
    ab4 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
    ab1 = ad3 > ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad3 = ad4 + fd0;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
        Thought lo1 = Thought280.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);

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
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought257.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd0 = ao1.m3();
}
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought113.getInstance(fb1, lb1, fb0, fb1);
    fd1 = fd0 - fd1;
    lb1 = fb0 && fb1;
    lb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    double ld3 = 790.4889447518362;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld3, fd0, fd1, ld3);
}
    boolean lb4 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld3, fd0);
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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Output.points[6][3] -= fd1;
    boolean lb0 = false;
    lb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao2.m2();
}
    fb0 = !fb1;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    lb0 = ad4 > fd0;
if(ao3 != null){
      lb1 = ao3.m2(fb0, fb1, lb0, lb1);
}
    fd1 *= -1;
    ad1 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
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
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = false;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    Output.points[6][4] -= fd0;
    fd1 *= -1;
    boolean lb1 = false;
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    double ld3 = 20.901098348204865;
if(fo0 != null){
      ao4 = fo0.m4(ld3, fd0, fd1, ld3);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld3, fd0);
}
    fd1 *= -1;
    ld3 = fd0 - fd1;
    Thought lo4 = Thought329.getInstance(ld3, fd0, fd1, ld3, lb0, lb1, lb2, ab1);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    double ld5 = 576.4710948390274;

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
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2();
}
    ad2 = ad3 - ad4;
    Thought lo0 = Thought110.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought159.getInstance(ad3, ad4, fd0, fd1);
    ab2 = ab3 && ab4;
    Thought lo2 = Thought227.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(fo1 != null){
      ab1 = fo1.m2();
}
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
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
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fb0 = !fb1;
        fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought297.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fd1 *= -1;
    fb1 = !lb0;
    Thought lo2 = Thought108.getInstance();
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
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
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Output.points[6][5] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Output.points[6][6] -= fd1;
    double ld0 = 952.6341424066861;
    ab1 = ld0 < fd0;
    fd1 = ld0 + fd0;
    ab2 = ab3 || ab4;
    fd1 = ld0 - fd0;
    fb0 = fd1 < ld0;
        fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    ld0 *= -1;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[6][7] += fd0;
    fb0 = fd1 < ad1;
    double ld0 = 373.77514434333216;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought351.getInstance();
    fb1 = lb1 || fb0;
    boolean lb3 = true;
    fb0 = fb1 && lb1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
    double ld2 = 582.5342921601566;
    Thought lo3 = Thought15.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
    lb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    ad2 = ad3 + ad4;
    fb1 = !lb0;
    fd0 = fd1 + ld2;
    Thought lo4 = Thought126.getInstance();
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    fb1 = lb0 || lb1;

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
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = fb1 || lb0;
    fd0 *= -1;
    fd1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[6][8] += fd1;
    fb0 = fd0 < fd1;
    fd0 *= -1;
    double ld1 = 407.03139936579925;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      fb0 = ao2.m2();
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
    fb0 = fb1 || fb0;
    fb1 = ad1 < ad2;
    double ld0 = 180.50801748725797;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ld0 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fb1 = ad1 > ad2;
if(ao2 != null){
          fb0 = ao2.m2(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought297.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Output.points[7][0] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = !ab2;
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && ab1;
    ab2 = fd0 < fd1;
    ab3 = !ab4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][1] -= ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = !ab2;
    boolean lb0 = false;
    Thought lo1 = Thought182.getInstance(ad2, ad3, ad4, fd0);
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought188.getInstance(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, ab1, ab2);
}
    ab3 = ad4 < fd0;
    ab4 = fd1 > ad1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo3 = Thought179.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
    Output.points[7][2] -= fd1;
    ad1 *= -1;
    boolean lb4 = true;
    boolean lb5 = true;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 + ad4;
if(fo1 != null){
          lb5 = fo1.m2(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0);
}
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(ao1 != null){
              fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
            boolean lb6 = false;
            ad2 = ad3 - ad4;
if(fo1 != null){
              fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb6, lb0);
}
            ad3 = ad4 - fd0;
}}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 927.2762239970672;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Output.points[7][3] += fd0;
    fb1 = fb0 && fb1;
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = true;
    double ld4 = 424.8059167349593;
    lb1 = lb2 || lb3;
    boolean lb5 = true;
if(fo1 != null){
      fo1.m2(lb5, fb0, fb1, lb1);
}
    Thought lo6 = Thought72.getInstance(fo0, fo1, fo0, fo1);

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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    ab1 = fd0 < fd1;
    double ld1 = 187.76064881423451;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        boolean lb3 = true;
        double ld4 = 576.2329463346139;
        ab1 = ld4 < ld1;
if(fo0 != null){
          fo0.m3();
}
        ab2 = fd0 < fd1;
        ld4 = ld1 + fd0;
        for(int i1=0; i1<10; i1++){
            if (ab3) {
                ab4 = !fb0;
                fb1 = fd1 > ld4;
                double ld5 = 454.40166517541155;
                Thought lo6 = Thought104.getInstance(fo1, fo0, fo1, fo0, ld4, ld1, fd0, fd1, lb2, lb3, lb0, ab1);
                Output.points[7][4] += ld5;
if(fo0 != null){
                  fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
                boolean lb7 = true;
                fb0 = ld4 > ld1;
                double ld8 = 167.30177789740856;
                ld1 *= -1;
}}}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought75.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought75.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought10.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(fo1 != null){
      fo1.m2();
}
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        fd1 = ad1 + ad2;
        double ld4 = 267.9572908426838;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb3, fb0);
}
            Thought lo5 = Thought342.getInstance(fb1, lb3, fb0, fb1);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            fd1 *= -1;
}}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab1 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought74.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fd0 < fd1;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fb1 = fo0.m2();
}
    ad3 = ad4 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        Output.points[7][5] += fd0;
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
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought336.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    double ld1 = 613.0909227835366;
    Output.points[7][6] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    if (fb1) {
        fd1 = ld1 + fd0;
        Output.points[7][7] += fd1;
        Output.points[7][8] += ld1;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
        fd0 *= -1;
        fb1 = !fb0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld1);
}
        fb1 = fb0 && fb1;
        fd0 *= -1;
if(fo1 != null){
          fb0 = fo1.m2(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        ld1 = fd0 - fd1;
        fb1 = fb0 || fb1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Output.points[8][0] += ad2;
    Output.points[8][1] -= ad3;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 > fd0;
    boolean lb1 = false;
    fd1 = ad1 + ad2;
    lb0 = !lb1;
    ad3 = ad4 - fd0;
    boolean lb2 = false;
    lb2 = !fb0;
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb0, lb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m2(fb1, lb0, lb1, lb2);
}
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
    lb2 = !fb0;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1);
}
    Output.points[8][2] -= ad1;
        ad2 *= -1;
    boolean lb3 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ab1 = ao2.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        Thought lo2 = Thought202.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
        lb0 = fd1 > fd0;
        double ld3 = 552.5410401994502;
        fd0 *= -1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        for(int i1=0; i1<10; i1++){
            ab1 = ab2 || ab3;
            boolean lb4 = true;
            boolean lb5 = true;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld3, fd0, fd1, ab2, ab3, ab4, fb0);
}
            fb1 = lb4 && lb5;
            ld3 *= -1;
if(ao3 != null){
              fd0 = ao3.m3(lb1, lb0, ab1, ab2);
}
if(ao4 != null){
              ao4.m3(fo0, fo1, ao1, ao2);
}
            boolean lb6 = false;
if(ao4 != null){
              ao3 = ao4.m4(fd1, ld3, fd0, fd1);
}
            ab2 = ld3 > fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    boolean lb0 = true;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
    ab3 = ab4 && fb0;
    fb1 = lb0 || lb1;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ad2 = ao2.m3();
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
    Thought lo2 = Thought307.getInstance(ao4, fo0, fo1, ao1);
    ad1 = ad2 - ad3;
    lb1 = !ab1;
    double ld3 = 671.9965164759539;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1);
}
    boolean lb4 = false;
    ab1 = !ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld3, ad1, ad2, ad3);
}
    ab3 = ab4 || fb0;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ld3, ad1, fb1, lb0, lb1, lb4);
}
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
        boolean lb5 = true;
        Output.points[8][3] += ad2;
if(ao4 != null){
          ad3 = ao4.m3();
}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought252.getInstance(fo0, fo1, fo0, fo1);
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    double ld1 = 505.8676790238961;
    boolean lb2 = true;

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
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    boolean lb1 = false;
    double ld2 = 399.7138772626927;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld2, fd0, ab4, fb0, fb1, lb0);
}
    lb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    Output.points[8][4] += fd1;

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
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = true;
    ad4 *= -1;
        double ld1 = 314.7483113954839;
    double ld2 = 775.1304467913895;
    lb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
        fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ad4, fd0, fd1, ld1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    ab4 = !fb0;
    Output.points[8][5] += fd0;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    if (lb1) {
        fd1 = ad1 + ad2;
if(fo0 != null){
          ad3 = fo0.m3();
}
        ad4 = fd0 + fd1;
        ad1 = ad2 + ad3;
        lb2 = ab1 && ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        double ld3 = 548.5098049618458;
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
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    double ld0 = 473.4272610235912;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought3.getInstance(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + ld0;
        Output.points[8][6] -= fd0;
if(ao4 != null){
          fd1 = ao4.m3(fb1, fb0, fb1, fb0);
}
        ld0 = fd0 + fd1;
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        } else if (fb0) {
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    ad3 *= -1;
    fb0 = ad4 < fd0;
    Thought lo0 = Thought78.getInstance(fd1, ad1, ad2, ad3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    if (fb0) {
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo0 != null){
          ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
          ao4.m1(fb0, fb1, lb1, fb0);
}
        fb1 = ad3 > ad4;
        fd0 *= -1;
        fd1 = ad1 - ad2;
        double ld2 = 960.6432810709022;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + fd0;
    double ld0 = 411.6965561117403;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
    Thought lo1 = Thought399.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
if(ao2 != null){
      ao2.m3(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld0;
    ab1 = fd0 < fd1;
    double ld2 = 62.46489020864664;
    Thought lo3 = Thought87.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      ld0 = ao1.m3();
}
    double ld4 = 977.8394695497066;
    ld2 = ld4 + fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, ld2, ld4, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
    fb0 = ld0 > ld2;
if(ao1 != null){
      fb1 = ao1.m2(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ld4 = ao2.m3(ao3, ao4, fo0, fo1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][7] += ad2;
    boolean lb0 = false;
    ad3 *= -1;
    lb0 = ab1 && ab2;
    Thought lo1 = Thought248.getInstance(ad4, fd0, fd1, ad1);
        ad2 = ad3 - ad4;
    ab3 = ab4 && fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
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
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[8][8] += fd1;
    fb1 = !fb0;
    double ld0 = 573.5088487354399;
    fb1 = ld0 < fd0;
    Output.points[0][0] -= fd1;
    fb0 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 > fd0;
    fb0 = fb1 && fb0;
    fd1 = ld0 + fd0;
        boolean lb1 = true;
    Thought lo2 = Thought221.getInstance(fb0, fb1, lb1, fb0);
    fd1 *= -1;
    ld0 = fd0 + fd1;

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
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 || fb1;
    Thought lo1 = Thought198.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[0][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    double ld2 = 595.8671459857285;
    fb1 = lb0 && fb0;
    fb1 = lb0 || fb0;
if(fo1 != null){
              fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought178.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought25.getInstance(fd1, ld2, fd0, fd1);
    fb1 = !lb0;
    ld2 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0, fb1, lb0, fb0, fb1);
}
        lb0 = fd1 > ld2;
    fb0 = !fb1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ld2 = fo1.m3();
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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought278.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
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
}
