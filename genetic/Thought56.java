package genetic;
import java.util.ArrayList;
class Thought56 extends Thought{
private static ArrayList<Thought56> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 46.13300019713258;
private double fd1 = 523.3450511041809;
private Thought fo0 = null;
private Thought fo1 = null;
Thought56 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought56 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought56 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought56 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought56 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought56 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought56 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought56 instance = new Thought56 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    double ld0 = 91.14169659232651;
    Output.points[6][4] -= fd0;
    boolean lb1 = false;
    Thought lo2 = Thought3.getInstance(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
    ld0 = fd0 - fd1;
    fb0 = ld0 < fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1);
}
    if (fb0) {
        fb1 = !lb1;
        boolean lb4 = false;
        lb1 = lb3 && fb0;
        Output.points[6][5] -= ld0;
        boolean lb5 = true;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb4, lb5);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought41.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
        fd1 = fd0 - fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ab1 = fd1 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb1 = fd0 < fd1;
        ab1 = ab2 || ab3;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        double ld1 = 300.3092099055369;
if(fo1 != null){
          fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 525.3307531145197;
    Output.points[6][6] += ld0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    fd0 = fd1 - ld0;
    lb1 = ad1 > ad2;
    fb0 = ad3 > ad4;
    Output.points[6][7] += fd0;
    fb1 = fd1 > ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      ld0 = fo0.m3();
}
    boolean lb2 = true;
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    Output.points[6][8] -= fd1;
    fb1 = lb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ad1, ad2, ad3);
}
    fb0 = fb1 && lb1;
    lb2 = !fb0;
    Thought lo3 = Thought53.getInstance(fb1, lb1, lb2, fb0);
    fb1 = lb1 && lb2;
    fb0 = ad4 > fd0;
    fb1 = !lb1;

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
    double ld0 = 966.7060736564055;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    ab2 = ad4 > fd0;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = !fb0;
    fb1 = ab1 || ab2;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    fd1 = ld0 - ad1;
    ab1 = ad2 < ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    double ld3 = 679.7546473225497;
    Thought lo4 = Thought16.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
        double ld5 = 420.21819675705416;
    Output.points[7][0] -= fd0;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought71.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought67.getInstance();
    fb0 = !fb1;
    Thought lo2 = Thought13.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 > ad3;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    ad3 = ad4 - fd0;
    for(int i0=0; i0<10; i0++){
        if (fb0) {
            } else {
            boolean lb0 = true;
            fb0 = fd1 > ad1;
            ad2 = ad3 - ad4;
            fb1 = fd0 < fd1;
            boolean lb1 = true;
            lb0 = lb1 || fb0;
            fb1 = lb0 && lb1;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
            boolean lb2 = false;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb0);
}
            double ld3 = 938.658181637199;
            Thought lo4 = Thought3.getInstance(ao2, ao3, ao4, fo0, lb1, lb2, fb0, fb1);
if(fo1 != null){
              ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
            lb0 = lb1 || lb2;
            double ld5 = 848.3373439919359;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 228.72965072258404;
    ab2 = !ab3;
    fd0 *= -1;
    double ld1 = 391.7919844393816;
    boolean lb2 = true;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ld1, fd0, ab3, ab4, fb0, fb1);
}
    double ld3 = 543.346606737326;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo4 = Thought52.getInstance(fd0, fd1, ld0, ld1);
    lb2 = !ab1;
    ab2 = ab3 || ab4;
    ld3 = fd0 + fd1;
if(ao4 != null){
      fb0 = ao4.m2(fb1, lb2, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld0, ld1, ld3, fd0);
}
    ab3 = !ab4;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, ld1, ld3, fd0, fb0, fb1, lb2, ab1);
}
    ab2 = !ab3;
    ab4 = fd1 < ld0;
    double ld5 = 975.8985338858344;
    double ld6 = 112.44039715949356;
    ld1 = ld3 - ld5;
    Output.points[7][1] += ld6;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, ab1);
}
    boolean lb7 = true;
    boolean lb8 = false;
    lb8 = ab1 && ab2;
    if (ab3) {
        ab4 = fb0 && fb1;
        lb2 = !lb7;
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
    double ld0 = 978.7632693058578;
    ab1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    if (ab2) {
        ab3 = !ab4;
        fb0 = fb1 || ab1;
        ab2 = ad3 < ad4;
if(ao1 != null){
          ao1.m2(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
        Output.points[7][2] += ad2;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
        double ld1 = 523.6009789669241;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld1, ld0, ad1, ad2);
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        ld1 = ld0 - ad1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    Output.points[7][3] += fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    double ld0 = 98.33677363770566;
    ab2 = !ab3;
    Output.points[7][4] += fd0;
    ab4 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[7][5] += ld0;
    Output.points[7][6] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    boolean lb2 = true;
    Output.points[7][7] += fd0;
if(fo0 != null){
      ab4 = fo0.m2();
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought90.getInstance(lb1, lb2, fb0, fb1);
    lb0 = ad1 < ad2;
        lb1 = ad3 < ad4;
    lb2 = !fb0;
    for(int i0=0; i0<10; i0++){
        Thought lo4 = Thought19.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
        for(int i1=0; i1<10; i1++){
            Thought lo5 = Thought39.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
}}
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
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    Thought lo1 = Thought58.getInstance(fo0, fo1, fo0, fo1);
    double ld2 = 723.2694054965892;
    ad4 = fd0 + fd1;
    ld2 *= -1;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1();
}
    ab1 = !ab2;
    fd0 *= -1;
    fd1 = ld2 - ad1;
    Output.points[7][8] -= ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo0.m3(fd1, ld2, ad1, ad2);
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
    boolean lb3 = false;
    boolean lb4 = true;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][0] += fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    Thought lo1 = Thought38.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    Output.points[8][1] -= fd0;
    boolean lb2 = true;
    Output.points[8][2] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m2();
}
    boolean lb3 = false;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    double ld4 = 523.9186767686901;
    lb0 = ld4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld4, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought70.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Output.points[8][3] += ad1;
    if (fb1) {
        fb0 = ad2 > ad3;
        ad4 = fd0 + fd1;
        fb1 = ad1 < ad2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    double ld0 = 649.6199793490488;
    Output.points[8][4] -= ld0;
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < ld0;
if(ao4 != null){
      fd0 = ao4.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0);
}
    Output.points[8][5] += fd0;
    fb0 = !fb1;
    Thought lo1 = Thought83.getInstance(ab1, ab2, ab3, ab4);
    fd1 = ld0 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ld0;
    boolean lb2 = false;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb2 && ab1;
    Thought lo3 = Thought27.getInstance();

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    Output.points[8][6] -= ad4;
    Thought lo0 = Thought20.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, ab1);
}
    ad3 *= -1;
    Thought lo2 = Thought48.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought89.getInstance();
    double ld4 = 602.3478200513358;
    double ld5 = 197.95153820545247;
    ad1 = ad2 - ad3;
    boolean lb6 = true;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ld4);
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
      fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 = fd0 - fd1;
    Output.points[8][7] -= fd0;
    fd1 *= -1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought31.getInstance(fo0, fo1, fo0, fo1);
    boolean lb3 = true;

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
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought21.getInstance();
    fb1 = !ab1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    ab4 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought5.getInstance();
        fd1 = fd0 - fd1;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(fo0 != null){
          fo0.m3(fb1, lb1, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        Output.points[8][8] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
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
    Output.points[0][0] -= ad1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        ad2 *= -1;
        boolean lb0 = true;
        Output.points[0][1] -= ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
        ad2 *= -1;
        ad3 = ad4 + fd0;
        double ld1 = 33.5396142774494;
        fd0 = fd1 - ld1;
        fb0 = ad1 < ad2;
        ad3 *= -1;
        fb1 = ad4 < fd0;
        boolean lb2 = true;
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
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    fb0 = ad4 < fd0;
    fb1 = fd1 > ad1;
    Thought lo1 = Thought64.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = ad2 < ad3;
    ad4 = fd0 + fd1;
    double ld2 = 527.4709345513867;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !ab1;
    Output.points[0][2] += ld2;
    Thought lo3 = Thought11.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3();
}
        ab3 = ab4 && fb0;
        Output.points[0][3] += fd1;
if(fo0 != null){
          fo0.m1(ld2, ad1, ad2, ad3);
}
        Output.points[0][4] -= ad4;
        double ld4 = 94.40882132096213;
        double ld5 = 688.8634173360225;
if(fo1 != null){
          fo1.m2(fb1, ab1, ab2, ab3);
}
        boolean lb6 = false;
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought99.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
        Output.points[0][5] += fd0;
    if (fb1) {
        fb0 = fb1 || fb0;
        fd1 *= -1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
        Output.points[0][6] += fd0;
if(ao4 != null){
          ao4.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m1();
}
        fd1 = fd0 + fd1;
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
    fb1 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    Output.points[0][7] += ad2;
    ad3 = ad4 - fd0;
if(ao4 != null){
      ao4.m2(fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    double ld0 = 630.4422786647408;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 + fd0;
    double ld1 = 595.8095054708895;
    double ld2 = 532.4999989588947;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    double ld3 = 476.2232296547796;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
        boolean lb4 = false;
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ld0, fb1, lb4, fb0, fb1);
}
    lb4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo5 = Thought89.getInstance(ld1, ld2, ld3, ad1);
if(fo0 != null){
      ad2 = fo0.m3(lb4, fb0, fb1, lb4);
}
    Output.points[0][8] += ad3;
    Output.points[1][0] += ad4;

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[1][1] += fd1;
    Thought lo0 = Thought4.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
    double ld1 = 421.48916543335235;
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    double ld2 = 987.0049340303837;
if(fo0 != null){
      ao4 = fo0.m4(ld1, ld2, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ld1 = ld2 - fd0;
if(fo1 != null){
      fo1.m1();
}
    fd1 = ld1 + ld2;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ld2);
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ab1 = ld1 > ld2;
    ab2 = ab3 && ab4;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld2);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld2, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought44.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    if (ab3) {
        double ld4 = 213.82672994602925;
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
    ad2 *= -1;
    double ld0 = 595.941743755863;
    Output.points[1][2] += ad2;
    double ld1 = 680.378147484679;
    Thought lo2 = Thought71.getInstance(ao2, ao3, ao4, fo0);
    ab2 = ad2 > ad3;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    double ld4 = 908.6729328072512;
    ld1 = ld4 - ad1;
    boolean lb5 = true;
if(ao2 != null){
      ad2 = ao2.m3();
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao3.m3(fd1, ld0, ld1, ld4);
}
    boolean lb6 = true;
    Output.points[1][3] -= ad1;
    double ld7 = 30.02854485945117;

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
    fb0 = fd1 < fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    double ld0 = 619.7580856866718;
    fb0 = !fb1;
    fd0 = fd1 + ld0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    ld0 = fd0 + fd1;
    fb0 = ld0 < fd0;
    fd1 *= -1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    ld0 = fd0 - fd1;
    lb3 = fb0 && fb1;
    boolean lb4 = false;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb1 = fo1.m2(ld0, fd0, fd1, ld0, lb2, lb3, lb4, lb5);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;

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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought81.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    ab4 = fb0 && fb1;
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought17.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    fd0 = fd1 + fd0;
    lb2 = fd1 > fd0;
    double ld3 = 145.1570735713362;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    boolean lb4 = false;
    fd0 = fd1 - ld3;
    fd0 = fd1 + ld3;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld3, fd0, fb1, lb2, lb4, ab1);
}
    Thought lo5 = Thought63.getInstance();
if(fo0 != null){
      fd1 = fo0.m3(ld3, fd0, fd1, ld3);
}
    ab2 = fd0 > fd1;
    ld3 *= -1;
    boolean lb6 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
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
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        lb0 = fb0 && fb1;
        Thought lo1 = Thought39.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
        Thought lo2 = Thought19.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        ad4 *= -1;
if(fo1 != null){
          fo1.m1(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        lb3 = !lb0;
        ad1 = ad2 + ad3;
        Output.points[1][4] += ad4;
        fb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb3, lb0, fb0);
}
        boolean lb4 = false;
        fb0 = fb1 && lb3;
        boolean lb5 = true;
        double ld6 = 258.47917420030666;
        lb4 = ld6 > ad1;
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
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    fb1 = ad4 > fd0;
    Thought lo0 = Thought18.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    double ld1 = 548.7122713477323;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ad3 = ad4 - fd0;
    fd1 = ld1 + ad1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought87.getInstance(fo0, fo1, fo0, fo1);
    Thought lo3 = Thought57.getInstance(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
    ab4 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb1 = ab1 && ab2;
    ld1 = ad1 + ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
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
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !lb0;
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo0 != null){
          fo0.m1(fd0, fd1, fd0, fd1);
}
        fb1 = lb0 && fb0;
        fb1 = !lb0;
        fb0 = fd0 > fd1;
        fb1 = !lb0;
if(fo1 != null){
          fo1.m2(fb0, fb1, lb0, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad2 *= -1;
    ad3 *= -1;
    double ld0 = 269.4887842970142;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    ad3 *= -1;
    Thought lo1 = Thought56.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
    Output.points[1][5] -= ad1;
    ad2 = ad3 + ad4;
    fb0 = fb1 && lb2;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    boolean lb1 = true;
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = fd0 - fd1;
    Output.points[1][6] += fd0;
    Thought lo2 = Thought59.getInstance();
    ab1 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[1][7] += fd0;
    fd1 = fd0 + fd1;
    lb0 = !lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, ab1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ab2 = fd1 < fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    Output.points[1][8] -= ad3;
    lb0 = !ab1;

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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = fd1 < fd0;
    double ld2 = 333.1859849815474;
    Output.points[2][0] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    lb1 = ld2 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    Output.points[2][1] -= fd0;
    fb0 = fb1 || lb0;
    lb1 = fb0 && fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld2, fd0, fd1, ld2, lb0, lb1, lb3, fb0);
}
    Thought lo4 = Thought53.getInstance();
    fd0 = fd1 + ld2;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld2, fd0, fd1);
}
    fb1 = ld2 < fd0;
    Thought lo5 = Thought61.getInstance(lb0, lb1, lb3, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
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
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[2][2] -= fd0;
    Thought lo0 = Thought38.getInstance();
    fb0 = fd1 > fd0;
        fb1 = fd1 > fd0;
    Thought lo1 = Thought21.getInstance(fd1, fd0, fd1, fd0);
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    Thought lo2 = Thought61.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    lb3 = fd1 < fd0;

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
    double ld0 = 876.5000452994639;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[2][3] += ld0;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought8.getInstance();
    Thought lo2 = Thought28.getInstance(fd1, ld0, fd0, fd1);
    fb1 = ld0 > fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
