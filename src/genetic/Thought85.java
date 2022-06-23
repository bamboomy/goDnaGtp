package genetic;
import java.util.ArrayList;
class Thought85 extends Thought{
private static ArrayList<Thought85> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 368.2941667586431;
private double fd1 = 73.82957062935584;
private Thought fo0 = null;
private Thought fo1 = null;
Thought85 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought85 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought85 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought85 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought85 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    if (fb0) {
        Thought lo1 = Thought19.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        for(int i0=0; i0<10; i0++){
            fb0 = fd0 < fd1;
            fb1 = fd0 > fd1;
            boolean lb2 = true;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, lb2, lb0, fb0, fb1);
}
            lb2 = fd0 > fd1;
if(fo0 != null){
              lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
            fb0 = fb1 && lb2;
            boolean lb3 = false;
            Thought lo4 = Thought32.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
              fo1.m1(lb3, lb0, fb0, fb1);
}
            fd0 = fd1 - fd0;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    ab1 = fd1 < fd0;
    double ld0 = 912.4745916653532;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    double ld1 = 315.0234294041904;
if(fo1 != null){
      fo1.m3(ld0, ld1, fd0, fd1);
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
    double ld0 = 318.18723522406043;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
    fb0 = ad4 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought69.getInstance();
    double ld2 = 862.2231278964733;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld2, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    ad3 = ad4 - fd0;
    boolean lb3 = false;
    lb3 = fd1 > ld0;
    double ld4 = 487.68174852250513;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld4, ad1, ad2, fb0, fb1, lb3, fb0);
}
    ad3 = ad4 - fd0;

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
    Output.points[3][6] -= ad1;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ab1 = ad2 > ad3;
    boolean lb0 = false;
    boolean lb1 = true;
    lb1 = ab1 && ab2;
    Thought lo2 = Thought77.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    ab3 = ab4 || fb0;
    double ld3 = 372.2343062137563;
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld4 = 922.841548138041;
    ld4 *= -1;
    ab3 = !ab4;
    fb0 = fb1 && lb0;

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
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought61.getInstance(ao4, fo0, fo1, ao1);
    lb1 = !fb0;
    fb1 = lb0 && lb1;
    Output.points[3][7] -= fd0;
    Thought lo3 = Thought24.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
    lb0 = !lb1;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought84.getInstance(fb1, lb0, lb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4();
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
    ad2 *= -1;
    fb1 = !fb0;
    fb1 = ad3 < ad4;
    fb0 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought18.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
if(ao1 != null){
      ao1.m3(ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m1(lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m1();
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    if (fb1) {
        boolean lb2 = true;
        ad4 *= -1;
        lb2 = !lb0;
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
    boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    ab1 = ab2 || ab3;
    if (ab4) {
        fb0 = fd1 > fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
        fd1 = fd0 + fd1;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          lb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
          ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        Output.points[3][8] += fd1;
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo1.m2(ab2, ab3, ab4, fb0);
}
        double ld1 = 610.9035767257242;
        fb1 = fd0 > fd1;
        lb0 = ld1 < fd0;
        double ld2 = 10.98617735626163;
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
    double ld0 = 240.4306739749719;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ld0, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    Output.points[4][0] += ad4;
    ab3 = !ab4;
    fb0 = !fb1;
    double ld1 = 321.745199643571;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    ad4 = fd0 + fd1;
    ab1 = ld0 > ld1;
    ad1 = ad2 - ad3;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought92.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
    double ld1 = 339.7941108731742;
    ld1 = fd0 + fd1;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0, lb2, fb0, fb1, lb2);
}
    boolean lb3 = true;
    lb3 = fd1 > ld1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb2, lb3, fb0);
}
    fb1 = !lb2;
    lb3 = fd1 > ld1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    ab1 = fd0 > fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 && ab1;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4();
}
            } else {
if(fo0 != null){
              fo0.m3(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
            Output.points[4][1] += fd0;
            ab4 = fd1 < fd0;
            boolean lb1 = false;
            fd1 = fd0 - fd1;
            Output.points[4][2] -= fd0;
            ab4 = fd1 > fd0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            fd1 = fd0 - fd1;
            fb0 = fd0 > fd1;
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    boolean lb1 = true;
    fd0 *= -1;
    Output.points[4][3] -= fd1;
    boolean lb2 = false;
    double ld3 = 840.4785274170829;
    Thought lo4 = Thought34.getInstance(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
    Thought lo5 = Thought13.getInstance(ld3, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    boolean lb6 = true;
    lb1 = ld3 > ad1;
    lb2 = lb6 && fb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        double ld7 = 623.1663815714708;
        fb1 = lb0 && lb1;
        Output.points[4][4] += fd0;
        lb2 = !lb6;
        fb0 = fb1 || lb0;
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
    boolean lb0 = true;
    lb0 = ad1 > ad2;
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo1.m2();
}
if(fo0 != null){
          fo0.m1(ad3, ad4, fd0, fd1, lb1, lb0, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo2 = Thought59.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
        fd0 = fd1 - ad1;
        double ld3 = 800.2984371565298;
        ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb0, ab1, ab2);
}
        Thought lo4 = Thought16.getInstance(ad2, ad3, ad4, fd0);
        ab3 = fd1 > ld3;
        double ld5 = 497.43575179071416;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
if(ao4 != null){
      fb0 = ao4.m2();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    boolean lb0 = true;
    fb0 = fd1 < fd0;
    double ld1 = 37.86479625613299;
    fd0 *= -1;
    Output.points[4][5] += fd1;

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
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    lb0 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    double ld1 = 107.82571394270055;
    Output.points[4][6] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd1 *= -1;
    ld1 *= -1;
    if (fb1) {
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought14.getInstance(ao2, ao3, ao4, fo0);
    lb0 = fd1 < fd0;
    ab1 = fd1 < fd0;
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    if (fb0) {
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao2 != null){
      ao2.m3();
}
    ad2 = ad3 - ad4;
    double ld0 = 137.94634023137044;
    ab1 = ab2 && ab3;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    lb1 = ad1 > ad2;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
}
        ld0 = ad1 + ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb1);
}
    ad4 = fd0 - fd1;
    ld0 *= -1;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Output.points[4][7] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2);
}
    lb2 = lb3 || ab1;
    ab2 = ab3 || ab4;
    boolean lb4 = false;
    boolean lb5 = true;
if(ao4 != null){
      ab3 = ao4.m2(ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = lb3 && lb4;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, lb5, ab1, ab2, ab3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;

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
    double ld0 = 596.5478834090621;
    double ld1 = 901.5092271564279;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    ld0 = ld1 - fd0;
    double ld2 = 612.3031851223778;
    fd0 *= -1;
    double ld3 = 916.9236187505117;
    fd0 = fd1 + ld0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = ld1 < ld2;
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld0, ld1, fb0, fb1, ab1, ab2);
}
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld2 = ld3 - fd0;
    fd1 *= -1;
    ld0 *= -1;
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld2, ld3, fd0, ab4, fb0, fb1, lb4);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    fb0 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb0, lb1, fb0, fb1);
}
    Output.points[4][8] -= fd0;
    fd1 *= -1;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb0 = ad1 < ad2;
    Thought lo3 = Thought0.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 > ad3;
    lb0 = ad4 < fd0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb0 = ab1 && ab2;
    double ld1 = 779.1298037803482;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = true;
    lb0 = !lb2;
    lb3 = ab1 && ab2;
    Thought lo4 = Thought49.getInstance(fo0, fo1, fo0, fo1);
    ab3 = ab4 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb1, lb0, lb2, lb3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
    boolean lb5 = false;
    boolean lb6 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Thought lo0 = Thought38.getInstance(fo1, ao1, ao2, ao3);
    fd0 *= -1;
    fd1 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    boolean lb2 = false;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    lb1 = fd1 > fd0;
    Thought lo4 = Thought65.getInstance(lb2, lb3, fb0, fb1);
    fd1 = fd0 + fd1;
    Thought lo5 = Thought88.getInstance();
    fd0 = fd1 + fd0;
    lb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, lb3, fb0, fb1);
}
    lb1 = lb2 && lb3;
    if (fb0) {
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
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    lb0 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = ad3 > ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = ad1 < ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        double ld1 = 764.6282696733479;
if(ao2 != null){
          ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
        lb0 = fb0 || fb1;
        lb0 = ad4 > fd0;
        for(int i1=0; i1<10; i1++){
            double ld2 = 821.0281450336107;
            fb0 = !fb1;
if(ao3 != null){
              ao3.m2();
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = ab1 && ab2;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab1 = !ab2;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    Output.points[5][0] += fd1;
    fd0 = fd1 + fd0;
    Output.points[5][1] += fd1;
    ab3 = ab4 && fb0;
    double ld1 = 467.3890064540279;
        fb1 = lb0 && ab1;
    ld1 = fd0 - fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[5][2] -= ad2;
if(ao1 != null){
      lb0 = ao1.m2();
}
    boolean lb1 = false;
    ad3 *= -1;
    lb1 = ab1 && ab2;
    ab3 = !ab4;
    fb0 = !fb1;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, lb0, lb1, ab1, ab2);
}
    ad3 *= -1;
    ab3 = ad4 < fd0;
    fd1 = ad1 - ad2;
    Thought lo2 = Thought63.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    Output.points[5][3] += ad2;
    boolean lb3 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, lb1, lb3, ab1, ab2);
}
    ab3 = ad3 > ad4;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
        fd1 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    double ld0 = 675.4427095355768;
    ld0 = fd0 + fd1;
        fb0 = fb1 && fb0;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
        double ld1 = 252.63415631275808;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2();
}
    Thought lo2 = Thought59.getInstance(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    Thought lo3 = Thought46.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
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
    Output.points[5][4] -= fd1;
    ab2 = fd0 > fd1;
    double ld0 = 721.0579049063887;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && ab1;
    ld0 = fd0 - fd1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
    lb1 = ab1 && ab2;
    ab3 = !ab4;
    boolean lb2 = true;
    ab4 = !fb0;
    boolean lb3 = false;
    Output.points[5][5] -= ld0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      lb3 = fo1.m2();
}
if(fo0 != null){
      ab1 = fo0.m2(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb1, lb2, lb3);
}
    ab1 = fd0 > fd1;
    ab2 = ld0 < fd0;
    ab3 = fd1 > ld0;
    ab4 = fd0 < fd1;

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
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Output.points[5][6] -= ad4;
    fd0 = fd1 + ad1;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    ad2 *= -1;
if(fo1 != null){
      fo1.m3(lb0, lb1, fb0, fb1);
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
    double ld0 = 693.2283909199574;
    ab1 = ld0 < ad1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = !ab3;
    Thought lo1 = Thought30.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
    boolean lb2 = true;
    Output.points[5][7] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 = ad1 + ad2;
    ab1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    Output.points[5][8] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2);
}
    double ld3 = 162.36385741133756;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb2);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb1 = !fb0;
    Thought lo0 = Thought67.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    boolean lb1 = true;
if(ao1 != null){
      lb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
        fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    double ld2 = 533.0419016670984;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb1, fb0, fb1);
}
    Output.points[6][0] -= fd1;
if(fo0 != null){
      ld2 = fo0.m3(fd0, fd1, ld2, fd0);
}
    lb1 = !fb0;
    fb1 = fd1 > ld2;
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(lb1, fb0, fb1, lb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
        ad1 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    if (fb0) {
        fb1 = fd1 > ad1;
        ad2 = ad3 + ad4;
        fb0 = fb1 || fb0;
if(fo0 != null){
          ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
          fo1 = ao1.m4();
}
        fb1 = fd0 > fd1;
        boolean lb0 = false;
        Thought lo1 = Thought63.getInstance(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
        fb0 = fb1 && lb0;
        fb0 = !fb1;
if(ao2 != null){
          lb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
}
        fb0 = ad3 > ad4;
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
    ab1 = ab2 || ab3;
    boolean lb0 = true;
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, fd0, fd1);
}
    ab4 = fb0 && fb1;
    fd0 = fd1 + fd0;
    lb0 = !ab1;
    fd1 *= -1;
    Thought lo1 = Thought24.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    Thought lo2 = Thought67.getInstance(ab2, ab3, ab4, fb0);
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao2 != null){
      fb1 = ao2.m2(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    Output.points[6][1] -= fd1;
    ab4 = fb0 && fb1;
    boolean lb3 = false;
    lb0 = lb3 || ab1;
    fd0 = fd1 + fd0;
    Thought lo4 = Thought95.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo5 = Thought1.getInstance(fo1, ao1, ao2, ao3, lb0, lb3, ab1, ab2);

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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    double ld0 = 517.1310577676309;
    double ld1 = 797.5504869095699;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ad1 = ao4.m3();
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, ld1, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    fb0 = ad3 < ad4;
    fd0 = fd1 + ld0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ld1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd1, ld0, ld1, ad1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
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
    double ld0 = 562.7139111815867;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0);
}
    Output.points[6][2] += fd1;
    fb1 = !fb0;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - fd0;
    fd1 *= -1;
    fb1 = ld0 > fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Thought lo1 = Thought96.getInstance(fo1, fo0, fo1, fo0);
    fd1 = ld0 + fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 > ld0;
    fb0 = fb1 && fb0;

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
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
    Thought lo0 = Thought22.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
    fb1 = fb0 && fb1;
    double ld1 = 588.5929454460761;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[6][3] += ld1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fb0 = fb1 && fb0;
    Thought lo2 = Thought22.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || fb0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    lb0 = fd1 < fd0;
    fb0 = fd1 < fd0;
    double ld1 = 292.9138547310395;
    fd0 *= -1;
    double ld2 = 623.9332445031457;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ld2, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld2, fd0);
}
    fb1 = lb0 && fb0;
    boolean lb3 = true;

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
