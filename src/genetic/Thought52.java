package genetic;
import java.util.ArrayList;
class Thought52 extends Thought{
private static ArrayList<Thought52> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 233.07124123983908;
private double fd1 = 783.2152351829442;
private Thought fo0 = null;
private Thought fo1 = null;
Thought52 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought52 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought52 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought52 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought52 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought52 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought52 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought52 instance = new Thought52 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      lb0 = fo0.m2();
}
    fb0 = fd1 > fd0;
    fd1 *= -1;
    Thought lo1 = Thought51.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    if (lb0) {
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        boolean lb2 = false;
        lb0 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb2, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb2, lb0, fb0);
}
        Output.points[2][7] -= fd0;
        fd1 *= -1;
        if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
            fd0 = fd1 + fd0;
            boolean lb3 = true;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    boolean lb1 = true;
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought60.getInstance(fo0, fo1, fo0, fo1);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb1 = !ab1;

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
    if (fb1) {
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        fb0 = fb1 || fb0;
        ad1 = ad2 + ad3;
        Output.points[2][8] += ad4;
        boolean lb0 = false;
        fd0 *= -1;
        Thought lo1 = Thought52.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
        ad4 = fd0 - fd1;
        ad1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m3();
}
if(fo1 != null){
          fb1 = fo1.m2(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    ad2 = ad3 - ad4;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = ad3 < ad4;
    fd0 = fd1 - ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    boolean lb0 = true;
    Thought lo1 = Thought49.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
    Output.points[3][0] += fd1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought43.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
    fb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo0.m1(fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Output.points[3][1] -= ad2;
    double ld3 = 773.1532751215724;
if(fo1 != null){
      fo1.m3();
}
    fb1 = ad2 < ad3;
    ad4 *= -1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ld3, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    boolean lb4 = true;
    if (lb4) {
        ad2 = ad3 + ad4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
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
    Thought lo0 = Thought85.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb1;
    Output.points[3][2] -= fd0;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld2 = 703.0052859920571;

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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m1(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    double ld1 = 746.4929530528098;
    lb0 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = ld1 + ad1;
    Output.points[3][3] -= ad2;
    boolean lb2 = true;
    Thought lo3 = Thought65.getInstance(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb0);
    boolean lb4 = true;
    Output.points[3][4] += ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld1, ad1);
}
    lb2 = lb4 && fb0;
    boolean lb5 = false;
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
        fd0 *= -1;
    ab2 = fd1 > fd0;
if(ao3 != null){
      ao3.m1();
}
    Thought lo0 = Thought48.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Output.points[3][5] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo1 = Thought40.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    Thought lo2 = Thought1.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        boolean lb3 = true;
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3(ab3, ab4, fb0, fb1);
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
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ab1 = ao2.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ad3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
    Output.points[3][6] -= fd1;
    ad1 *= -1;
    Thought lo0 = Thought53.getInstance(ab2, ab3, ab4, fb0);
    Output.points[3][7] -= ad2;
    fb1 = !ab1;
    if (ab2) {
if(fo0 != null){
          ao4 = fo0.m4();
}
if(ao1 != null){
          fo1 = ao1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought12.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
        double ld3 = 406.2045205942298;
    lb2 = fd0 > fd1;
    fb0 = !fb1;
    lb1 = lb2 || fb0;
    double ld4 = 206.90139662518772;
    ld3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, lb2, fb0);
}
    ld4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
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
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld0 = 240.8349629009492;
    fb0 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    double ld1 = 841.4780728610764;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld2 = 531.8211788368515;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld1, ld2, fd0, fd1);
}
    ab3 = !ab4;
    boolean lb3 = false;
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        ld0 = ld1 - ld2;
        fd0 *= -1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    ad1 = ad2 + ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
    Output.points[3][8] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        double ld1 = 223.79702272509073;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fb0 = ad4 < fd0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
    Output.points[4][0] += fd0;
    double ld0 = 473.5691821170726;
    Thought lo1 = Thought83.getInstance(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Thought lo2 = Thought15.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m3(fd1, ld0, ad1, ad2);
}
    ab4 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    Output.points[4][1] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    ab4 = ad1 > ad2;

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
    fb1 = fb0 || fb1;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    Thought lo0 = Thought9.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
    fb1 = fd0 < fd1;
    Thought lo1 = Thought61.getInstance(fb0, fb1, fb0, fb1);
    boolean lb2 = false;
    lb2 = fd0 < fd1;

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
    ad1 = ad2 + ad3;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 773.0308685272549;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb0 = fb0 || fb1;
    if (lb0) {
        } else if (fb0) {
        if (fb1) {
            ad1 = ad2 + ad3;
if(fo1 != null){
              fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
              fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
              ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
              fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld1, ad1);
}
            ad2 = ad3 + ad4;
if(fo0 != null){
              lb0 = fo0.m2(fb0, fb1, lb0, fb0);
}
            fb1 = lb0 && fb0;
            if (fb1) {
if(ao1 != null){
                  fo1 = ao1.m4();
}
if(ao2 != null){
                  ao2.m2(fd0, fd1, ld1, ad1, lb0, fb0, fb1, lb0);
}
                Thought lo2 = Thought11.getInstance(ao3, ao4, fo0, fo1);
}}}
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought46.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      ao1.m3();
}
    if (lb0) {
        ab1 = fd1 > fd0;
        fd1 = fd0 - fd1;
        ab2 = fd0 > fd1;
        fd0 = fd1 - fd0;
        fd1 *= -1;
if(ao2 != null){
          ao2.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb0 = ab1 || ab2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        Thought lo2 = Thought33.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
        double ld3 = 978.6517335366037;
        Output.points[4][2] -= ld3;
        boolean lb4 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ad3 *= -1;
    ab2 = ad4 < fd0;
    Output.points[4][3] -= fd1;
    double ld0 = 507.99277745068355;
    ab3 = ld0 > ad1;
    ab4 = fb0 || fb1;
    Output.points[4][4] += ad2;
    ab1 = !ab2;
    ad3 *= -1;
    boolean lb1 = false;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
    fb1 = ad1 < ad2;
    lb1 = ab1 || ab2;
    boolean lb2 = false;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
}
    boolean lb3 = false;
if(ao1 != null){
      ad3 = ao1.m3(ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought75.getInstance();
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
if(ao2 != null){
          ao2.m3(ld0, ad1, ad2, ad3, fb0, fb1, lb1, lb2);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        lb3 = !ab1;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Thought lo0 = Thought12.getInstance(fd0, fd1, fd0, fd1);
    Thought lo1 = Thought20.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    double ld2 = 458.05495973657656;
    fb1 = !fb0;
    if (fb1) {
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(lb3, fb0, fb1, lb3);
}
        ld2 *= -1;
        fd0 = fd1 + ld2;
        boolean lb4 = true;
if(fo0 != null){
          lb4 = fo0.m2();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0, fb0, fb1, lb3, lb4);
}
        double ld5 = 456.02526920415494;
        fb0 = fb1 && lb3;
        lb4 = !fb0;
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
    ab2 = ab3 || ab4;
    double ld0 = 208.63539610412758;
    fb0 = fb1 || ab1;
        fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb1 = true;
    fd0 *= -1;
    ab1 = ab2 || ab3;
    boolean lb2 = true;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
    double ld3 = 955.584475516602;
    Thought lo4 = Thought45.getInstance(ld3, fd0, fd1, ld0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}
    boolean lb5 = true;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fo1.m3(ld3, fd0, fd1, ld0, lb2, lb5, ab1, ab2);
}
    Thought lo6 = Thought94.getInstance(fo0, fo1, fo0, fo1);

Thought.STACK_COUNTER++;
return ld3;
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
    boolean lb0 = true;
    Thought lo1 = Thought65.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
    fd0 *= -1;
    boolean lb2 = false;
    boolean lb3 = true;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
if(fo1 != null){
      lb2 = fo1.m2(ad2, ad3, ad4, fd0);
}
    Output.points[4][5] += fd1;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fb0, fb1, lb0, lb2);
}
    double ld4 = 329.926577896283;
    lb3 = fb0 || fb1;
    lb0 = ld4 > ad1;
    double ld5 = 890.008130675256;
    lb2 = !lb3;
if(fo0 != null){
      fo0.m3();
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought74.getInstance(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ad1 = ad2 + ad3;
    double ld1 = 319.6119648442613;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m1(fd1, ld1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    double ld2 = 990.7921581040299;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
        ab3 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld2, ad1);
}
    Thought lo3 = Thought18.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);

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
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    double ld0 = 375.00608662795753;
    Output.points[4][6] += fd0;
    boolean lb1 = true;
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
if(ao2 != null){
      lb1 = ao2.m2();
}
    Thought lo2 = Thought9.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
    fb1 = lb1 && fb0;
    fb1 = ld0 > fd0;
    double ld3 = 40.147290193350784;

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
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = !fb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m1(fd0, fd1, ad1, ad2);
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought77.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
    Output.points[4][7] -= ad1;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    Thought lo1 = Thought33.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    fb1 = fb0 || fb1;
    Thought lo2 = Thought95.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = ad2 < ad3;
    boolean lb3 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][8] += fd0;
if(ao2 != null){
      ab1 = ao2.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought6.getInstance(ao3, ao4, fo0, fo1);
        fd1 *= -1;
    fb1 = fd0 < fd1;
    Thought lo1 = Thought57.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    Thought lo2 = Thought54.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
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
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ad2 = ao2.m3();
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    ad3 = ad4 - fd0;
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
    ab2 = ad4 > fd0;
    ab3 = fd1 > ad1;
    Output.points[5][0] -= ad2;
    ab4 = !fb0;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fb1 = fd0 < fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    fd0 = fd1 + ad1;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, ab1);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    lb0 = fd0 > fd1;
    boolean lb1 = false;
    ad1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
        Thought lo0 = Thought25.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought57.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought26.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;

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
      ab2 = fo1.m2();
}
    ab3 = ab4 && fb0;
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[5][1] += fd0;
    Thought lo0 = Thought6.getInstance(fd1, fd0, fd1, fd0);
    double ld1 = 329.7970626632929;
    fb0 = fb1 && ab1;

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
    double ld0 = 964.5079230793702;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld2 = 587.6128908187891;
    Output.points[5][2] -= ad4;
    fb0 = !fb1;
    lb1 = fb0 && fb1;
    Thought lo3 = Thought64.getInstance(lb1, fb0, fb1, lb1);
if(fo0 != null){
      fb0 = fo0.m2();
}
    boolean lb4 = false;
    fb0 = fb1 || lb1;
    lb4 = fd0 < fd1;
    double ld5 = 882.3339503909051;

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
    Thought lo0 = Thought72.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    double ld1 = 684.3008769139013;
        Thought lo2 = Thought74.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, fb0, fb1, ab1, ab2);
}
    Output.points[5][3] += ad1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    boolean lb3 = false;
    ad2 *= -1;
    ab3 = !ab4;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld1, ad1);
}
    Output.points[5][4] -= ad2;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ld1 *= -1;
    ad1 *= -1;
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
    ad2 = ad3 + ad4;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
if(ao4 != null){
      ao4.m2(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    Thought lo1 = Thought35.getInstance(fo0, fo1, ao1, ao2);
    fb1 = lb0 && fb0;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb2 = false;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb0);
}
    lb2 = fd1 < fd0;
    fd1 *= -1;
    fb0 = !fb1;
    lb0 = lb2 || fb0;
    fb1 = fd0 < fd1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb3 = false;
    fd0 = fd1 + fd0;
    lb0 = !lb2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb3, fb0, fb1, lb0);
}
    boolean lb4 = true;
    Thought lo5 = Thought19.getInstance();
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, lb2, lb3, lb4, fb0);
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
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld0 = 729.7646255741907;
        Thought lo1 = Thought11.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    Output.points[5][5] -= fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = fd1 > ld0;
        fb1 = fb0 || fb1;
        fb0 = ad1 < ad2;
        ad3 = ad4 - fd0;
        fd1 *= -1;
        ld0 = ad1 - ad2;
        } else {
        boolean lb2 = false;
        Output.points[5][6] += ad3;
        double ld3 = 159.1578101002145;
        double ld4 = 741.8024376233503;
if(ao4 != null){
          fb0 = ao4.m2(ad2, ad3, ad4, fd0);
}
        fb1 = lb2 || fb0;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, fd1, ld3, ld4, ld0);
}
        ad1 *= -1;
        boolean lb5 = true;
        for(int i0=0; i0<10; i0++){
}}
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
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
if(ao3 != null){
          fb0 = ao3.m2();
}
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
        ab1 = fd0 < fd1;
        fd0 = fd1 - fd0;
        ab2 = fd1 > fd0;
        double ld0 = 561.8668667124294;
        fd0 = fd1 - ld0;
if(fo1 != null){
          fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        fb0 = ld0 < fd0;
        fd1 = ld0 + fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 66.20542413747951;
    ld0 = ad1 + ad2;
    Thought lo1 = Thought18.getInstance(ad3, ad4, fd0, fd1);
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
if(ao2 != null){
      ao2.m3();
}
    fb0 = fb1 || lb2;
if(ao3 != null){
      ao3.m3(fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2);
}
    double ld3 = 547.2936678919172;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb2, ab1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 + ld3;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fb1 = lb2 || ab1;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;

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
    fb0 = fd0 > fd1;
    boolean lb0 = true;
    fd0 *= -1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought84.getInstance(fb0, fb1, lb0, fb0);
    Thought lo2 = Thought52.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    double ld3 = 169.29083064051477;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ld3 = fd0 - fd1;
    ld3 = fd0 + fd1;
    ld3 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = ld3 < fd0;
    double ld4 = 140.6260079036166;
    fd0 *= -1;

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
    Thought lo0 = Thought1.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    double ld1 = 561.4235333999756;
    fb1 = fd0 > fd1;
        fb0 = ld1 > fd0;
    fd1 = ld1 + fd0;
    fd1 = ld1 - fd0;
    fb1 = fd1 < ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0);
}
    fb0 = fb1 || fb0;
        fb1 = fd1 < ld1;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought52.getInstance();
    fb0 = fd1 > ld1;
    Thought lo3 = Thought22.getInstance(fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fd1 > ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    double ld4 = 871.5117316364848;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = ld1 + ld4;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, ld4, fd0);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    fb1 = !lb0;
    Output.points[5][7] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    lb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    Output.points[5][8] += fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
