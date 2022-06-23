package genetic;
import java.util.ArrayList;
class Thought41 extends Thought{
private static ArrayList<Thought41> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 947.5780460312694;
private double fd1 = 836.0275739573765;
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
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    double ld0 = 436.9694491686186;
    fb1 = ld0 > fd0;
    boolean lb1 = false;
    lb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2();
}
    lb1 = !fb0;
    boolean lb2 = false;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 - fd0;
    double ld3 = 278.467704982079;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, lb1, lb2, fb0, fb1);
}
    lb1 = fd0 < fd1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ld0, ld3, fd0, fd1);
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
    Thought lo0 = Thought44.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 || ab4;
    Thought lo2 = Thought90.getInstance(fo1, fo0, fo1, fo0);
    boolean lb3 = false;
    ab4 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb5 = true;
if(fo0 != null){
      fo0.m2(ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld6 = 228.432619941377;
    lb1 = lb3 && lb4;
    fd0 = fd1 - ld6;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld6, fd0, fd1, lb5, ab1, ab2, ab3);
}
    ld6 *= -1;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = fb0 && fb1;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    double ld0 = 598.8775774424566;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
        ad2 = ad3 + ad4;
        for(int i1=0; i1<10; i1++){
            fb1 = fb0 || fb1;
            Thought lo1 = Thought41.getInstance(fb0, fb1, fb0, fb1);
            boolean lb2 = true;
            lb2 = !fb0;
            fb1 = lb2 || fb0;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3();
}
    ab1 = ad3 > ad4;
    fd0 *= -1;
    ab2 = fd1 > ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought46.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = true;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        lb1 = lb2 && ab1;
        Thought lo3 = Thought8.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
        fb1 = ad4 > fd0;
        fd1 = ad1 + ad2;
        lb1 = ad3 < ad4;
        }
    boolean lb4 = false;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][0] += fd0;
    fb1 = fd1 < fd0;
    Thought lo0 = Thought43.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, fb0, fb1);
}
    Output.points[1][1] += fd0;
    fb0 = !fb1;
    fb0 = fb1 || fb0;

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
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    double ld1 = 191.41402141256202;
    lb0 = fb0 && fb1;
if(ao4 != null){
      lb0 = ao4.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = !fb1;
    boolean lb2 = true;
    fd0 *= -1;
    lb0 = fd1 > ld1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    ad4 = fd0 + fd1;
    lb2 = ld1 < ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought53.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
    fd1 *= -1;
    ld1 *= -1;
    Thought lo4 = Thought33.getInstance(ad1, ad2, ad3, ad4);
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
}
    lb5 = ad2 < ad3;

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
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought72.getInstance();
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
    Output.points[1][2] -= fd0;

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
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    ad2 = ad3 - ad4;
    double ld0 = 734.7906444363598;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
        double ld1 = 373.37787871688107;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld0 = 498.610868303525;
    fb0 = fb1 || fb0;
    ld0 *= -1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    ld0 = fd0 - fd1;
    boolean lb2 = false;
    ld0 *= -1;
    fd0 = fd1 - ld0;
    lb2 = fd0 < fd1;
    fb0 = ld0 < fd0;
    fb1 = lb1 || lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[1][3] += fd1;
    double ld3 = 801.29297048356;
    fb0 = ld0 < ld3;

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
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
    if (ab3) {
        fd0 = fd1 - fd0;
        ab4 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fd1 > fd0;
        fd1 = fd0 + fd1;
        double ld0 = 386.6725573997751;
        boolean lb1 = true;
        double ld2 = 632.7912419457515;
if(fo1 != null){
          fo1.m1(ld0, ld2, fd0, fd1);
}
        Output.points[1][4] += ld0;
        ld2 = fd0 + fd1;
        fb0 = ld0 > ld2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
        boolean lb3 = true;
if(fo0 != null){
          fo0.m2(fb0, fb1, lb1, lb3);
}
        boolean lb4 = true;
if(fo1 != null){
          lb4 = fo1.m2();
}
        Thought lo5 = Thought19.getInstance(fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
        fb0 = fb1 || lb1;
        fd0 = fd1 + ld0;
        lb3 = ld2 < fd0;
        Output.points[1][5] += fd1;
        lb4 = ld0 < ld2;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad1 < ad2;
    double ld0 = 836.8414835689599;
    double ld1 = 492.4248579785691;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb2 = false;
    fb0 = !fb1;
    boolean lb3 = true;
    lb2 = fd0 < fd1;
    ld0 *= -1;
    lb3 = fb0 && fb1;
    ld1 = ad1 - ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, lb3, fb0, fb1);
}
    lb2 = ad3 > ad4;
    boolean lb4 = false;

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
    ab1 = ab2 && ab3;
    ad1 *= -1;
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(ab1, ab2, ab3, ab4);
}
    double ld0 = 723.2885244863982;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought50.getInstance();
    fb0 = ld0 < ad1;
        ad2 *= -1;
    Output.points[1][6] -= ad3;
if(fo0 != null){
      fo0.m1(ad4, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ad1 = ad2 + ad3;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ld0);
}
    ab3 = ab4 || fb0;
    Thought lo3 = Thought58.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    boolean lb4 = false;

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
    double ld0 = 953.3716631208341;
if(ao2 != null){
      ao2.m3(fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(ao3 != null){
      lb1 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
    fd1 *= -1;
    Output.points[1][7] += ld0;
    fb0 = !fb1;
    boolean lb3 = false;
    fd0 = fd1 + ld0;
    fd0 = fd1 + ld0;
    Output.points[1][8] += fd0;
    lb1 = !lb2;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fd1 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought8.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        boolean lb1 = true;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
        lb1 = fb0 && fb1;
        boolean lb2 = true;
        lb1 = ad4 > fd0;
if(fo1 != null){
          lb2 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
        fb0 = fb1 && lb1;
        lb2 = fb0 || fb1;
        ad4 *= -1;
        fd0 = fd1 - ad1;
if(fo0 != null){
          fo0.m1(lb1, lb2, fb0, fb1);
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
    Thought lo0 = Thought62.getInstance();
    fd1 *= -1;
    Output.points[2][0] -= fd0;
    Output.points[2][1] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    boolean lb2 = false;
    Thought lo3 = Thought42.getInstance(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb1);
    lb2 = ab1 && ab2;
    Thought lo4 = Thought61.getInstance(fd1, fd0, fd1, fd0);
    ab3 = fd1 < fd0;
    boolean lb5 = false;
    Output.points[2][2] += fd1;
    ab3 = !ab4;
    Thought lo6 = Thought99.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
if(ao4 != null){
      fd0 = ao4.m3(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, lb5, ab1, ab2, ab3);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo7 = Thought79.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
    boolean lb8 = false;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    double ld0 = 892.7170202582859;
    boolean lb1 = true;
    lb1 = ab1 || ab2;
    Output.points[2][3] -= ld0;
    boolean lb2 = false;
    boolean lb3 = false;
    ad1 = ad2 - ad3;
    ab1 = ab2 || ab3;
    ad4 *= -1;
    boolean lb4 = false;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb1);
}
if(ao1 != null){
      ao1.m3(fd0, fd1, ld0, ad1);
}
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
}
    lb2 = lb3 || lb4;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m2(ab4, fb0, fb1, lb1);
}
    Thought lo5 = Thought41.getInstance();
if(ao2 != null){
      ao2.m3(ad3, ad4, fd0, fd1, lb2, lb3, lb4, ab1);
}
    ab2 = ab3 || ab4;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    ld0 = ad1 - ad2;
    double ld6 = 235.70079496252657;

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
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    Thought lo1 = Thought45.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Output.points[2][4] += fd0;
        fd1 *= -1;
    lb0 = fd0 < fd1;
    fb0 = fb1 || lb0;
    boolean lb2 = true;
    Thought lo3 = Thought29.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
    fd0 = fd1 + fd0;
    boolean lb4 = true;
    lb4 = fd1 > fd0;
    boolean lb5 = true;
    lb5 = fd1 > fd0;

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
    Output.points[2][5] -= fd0;
    boolean lb0 = true;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought42.getInstance(fo1, fo0, fo1, fo0);
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        boolean lb2 = false;
        ab3 = fd0 > fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
        lb0 = !ab1;
        fd0 = fd1 + fd0;
        double ld3 = 490.85397190460094;
        for(int i1=0; i1<10; i1++){
            ab2 = fd0 > fd1;
            Output.points[2][6] -= ld3;
            double ld4 = 918.7873947008734;
            ab3 = ab4 || fb0;
            }
        fd0 = fd1 + ld3;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb2, lb0, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld3, fd0, fd1);
}
        ld3 = fd0 + fd1;
        boolean lb5 = false;
if(fo1 != null){
          ld3 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
        ab1 = fd1 < ld3;
        ab2 = !ab3;
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
    fb0 = !fb1;
    fb0 = ad1 > ad2;
    fb1 = !fb0;
        fb1 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought93.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought4.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    fb1 = ad1 < ad2;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
    fb1 = !fb0;
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2();
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
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    for(int i0=0; i0<10; i0++){
        ab3 = ad2 < ad3;
        ab4 = ad4 < fd0;
        double ld1 = 27.884819727591125;
        fb0 = fd0 < fd1;
        fb1 = ld1 > ad1;
if(fo0 != null){
          fo0.m1(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fd1 = ld1 + ad1;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd1 < fd0;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought62.getInstance();
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought13.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    fd1 *= -1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo3 = Thought59.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought18.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      fb1 = ao3.m2(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
    boolean lb1 = false;
    fb0 = ad4 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    ad4 *= -1;
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    double ld3 = 668.5130588187413;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld3, ad1);
}
    ad2 = ad3 + ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld3, ad1, ad2);
}
    ad3 = ad4 - fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m3();
}
    boolean lb0 = false;
    boolean lb1 = true;
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    boolean lb2 = false;
    Thought lo3 = Thought13.getInstance(fd0, fd1, fd0, fd1, lb0, lb1, lb2, ab1);
    boolean lb4 = true;
    double ld5 = 843.3169593963105;
    double ld6 = 885.3660770915342;
        ld5 *= -1;
    double ld7 = 136.25765476553656;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Thought lo8 = Thought55.getInstance(ao3, ao4, fo0, fo1, ld6, ld7, fd0, fd1, ab1, ab2, ab3, ab4);

Thought.STACK_COUNTER++;
return ld5;
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
    ab1 = !ab2;
    ab3 = ad2 < ad3;
    Output.points[2][7] += ad4;
    boolean lb0 = false;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought9.getInstance(ao1, ao2, ao3, ao4, fb1, lb0, ab1, ab2);
    ab3 = !ab4;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    ab4 = ad4 > fd0;
    fb0 = !fb1;
    fd1 = ad1 - ad2;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    lb2 = ab1 && ab2;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[2][8] -= fd0;
    lb0 = lb2 && ab1;
    fd1 = ad1 + ad2;
    double ld3 = 369.3867988512785;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 806.851228315469;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m1(ld0, fd0, fd1, ld0);
}
        Thought lo1 = Thought91.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
        fd1 = ld0 + fd0;
        fb1 = fd1 > ld0;
        boolean lb2 = true;
        fd0 = fd1 - ld0;
        }
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    ld0 = fd0 - fd1;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = ld0 > fd0;
    fd1 = ld0 - fd0;
    double ld3 = 746.4100853344628;
    boolean lb4 = false;
    for(int i1=0; i1<10; i1++){
        fb0 = fd0 < fd1;
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
    lb0 = ab1 || ab2;
    Thought lo1 = Thought28.getInstance();
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    if (lb0) {
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        for(int i0=0; i0<10; i0++){
            boolean lb2 = false;
            boolean lb3 = true;
            Thought lo4 = Thought24.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
            fd1 = fd0 + fd1;
            lb2 = !lb3;
            lb0 = ab1 && ab2;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
            double ld5 = 958.9292478115061;
            ab3 = ab4 || fb0;
            ld5 = fd0 + fd1;
            Thought lo6 = Thought83.getInstance(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld5);
if(fo0 != null){
              fo1 = fo0.m4(fb1, lb2, lb3, lb0);
}
            ab1 = !ab2;
if(fo0 != null){
              fo1 = fo0.m4();
}
if(fo1 != null){
              fo1.m1(fd0, fd1, ld5, fd0, ab3, ab4, fb0, fb1);
}
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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
        double ld0 = 18.411651504919824;
    ld0 = ad1 + ad2;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 + fd0;
    double ld1 = 135.56759531057688;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
    fb0 = fb1 || fb0;
    fb1 = ad1 > ad2;
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3();
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 + fd1;

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
    double ld0 = 920.2336309244338;
    ld0 = ad1 + ad2;
    ab2 = ab3 && ab4;
    fb0 = ad3 < ad4;
    double ld1 = 446.64247710417885;
    fb1 = ab1 && ab2;
    boolean lb2 = false;
    ab2 = ad4 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    lb2 = !ab1;
    ab2 = ad3 > ad4;
        ab3 = ab4 && fb0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb2, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ld1 = fo1.m3(ad1, ad2, ad3, ad4);
}
        Thought lo3 = Thought8.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
        ab3 = ad1 < ad2;
        ab4 = fb0 && fb1;
        lb2 = ad3 < ad4;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    boolean lb1 = true;
    boolean lb2 = false;
if(ao4 != null){
      lb0 = ao4.m2();
}
    lb1 = lb2 && fb0;
    double ld3 = 154.09926294743994;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3, lb0, lb1, lb2, fb0);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    if (fb0) {
        boolean lb0 = false;
        ad3 = ad4 + fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
        fd0 *= -1;
        fb0 = fb1 && lb0;
        Thought lo1 = Thought44.getInstance(fd1, ad1, ad2, ad3);
        Thought lo2 = Thought4.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
if(ao4 != null){
          ad2 = ao4.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        ad3 = ad4 + fd0;
if(ao1 != null){
          fd1 = ao1.m3(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
        for(int i0=0; i0<10; i0++){
if(ao2 != null){
              ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
              ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(ao1 != null){
              fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
            fb1 = lb0 || fb0;
            fb1 = ad3 < ad4;
            Output.points[3][0] += fd0;
            lb0 = fb0 && fb1;
            boolean lb3 = true;
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
    Thought lo0 = Thought10.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 && ab4;
    Output.points[3][1] -= fd1;
    boolean lb1 = true;
    ab4 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;
    double ld3 = 198.38812451879394;
if(ao2 != null){
      ld3 = ao2.m3();
}
    Output.points[3][2] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld3, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb1;
    Thought lo4 = Thought47.getInstance(fo0, fo1, ao1, ao2);
    Output.points[3][3] -= ld3;
    lb2 = ab1 || ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld3, fd0, ab4, fb0, fb1, lb1);
}
    lb2 = fd1 > ld3;
    boolean lb5 = true;
    Thought lo6 = Thought58.getInstance(ao2, ao3, ao4, fo0, lb5, ab1, ab2, ab3);
    fd0 = fd1 + ld3;
    ab4 = fb0 || fb1;

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
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao2.m1();
}
    if (ab3) {
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
    fd0 = fd1 + fd0;
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    lb0 = fd1 > fd0;
    Thought lo2 = Thought35.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb3, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
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
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
        double ld0 = 906.7372418042195;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ld0;
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
    Output.points[3][4] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld0;
    lb1 = fb0 || fb1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, lb2, fb0, fb1);
}
    double ld3 = 644.0186434175127;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    boolean lb1 = false;
        lb0 = lb1 && fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb2 = true;
    Thought lo3 = Thought1.getInstance();
    boolean lb4 = true;
    Output.points[3][5] += fd1;
    boolean lb5 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, lb4, lb5, fb0, fb1);
}
    Thought lo6 = Thought66.getInstance(fo1, fo0, fo1, fo0);
    lb0 = lb1 && lb2;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb5, fb0, fb1, lb0);
}
    fd1 *= -1;
    double ld7 = 989.600010679403;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, lb4, lb5);
}
    ld7 = fd0 - fd1;
if(fo0 != null){
      fo0.m2(ld7, fd0, fd1, ld7);
}
    fd0 = fd1 + ld7;

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
