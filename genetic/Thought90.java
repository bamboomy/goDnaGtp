package genetic;
import java.util.ArrayList;
class Thought90 extends Thought{
private static ArrayList<Thought90> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 29.30020074379692;
private double fd1 = 601.0159486247973;
private Thought fo0 = null;
private Thought fo1 = null;
Thought90 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought90 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought90 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought90 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought90 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought90 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought90 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought90 instance = new Thought90 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    if (fb0) {
        fd1 *= -1;
        fb1 = lb0 && fb0;
        fb1 = !lb0;
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Output.points[1][1] += fd0;
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb1);
}
        } else if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
        lb0 = !fb0;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fd1 *= -1;
        fb0 = fd0 > fd1;
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
    Thought lo0 = Thought71.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2();
}
        fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        double ld1 = 107.12932984591454;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab4, fb0, fb1, ab1);
}
        ab2 = fd1 < ld1;
        boolean lb2 = false;
        Thought lo3 = Thought65.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
        fb1 = !lb2;
if(fo0 != null){
          fo0.m3(fd0, fd1, ld1, fd0);
}
        ab1 = fd1 > ld1;
        fd0 *= -1;
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
        ld1 = fd0 + fd1;
        ld1 = fd0 - fd1;
        Thought lo4 = Thought74.getInstance(ab3, ab4, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought41.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
    ad3 = ad4 - fd0;
    boolean lb1 = false;
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        fb1 = lb1 && fb0;
    fb1 = lb1 || fb0;
    Output.points[1][2] += fd0;
    double ld2 = 4.744652437630855;
    fb1 = fd0 > fd1;
    ld2 = ad1 - ad2;
    ad3 = ad4 - fd0;
    Thought lo3 = Thought9.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2);
    double ld4 = 541.2726573388335;
    Thought lo5 = Thought22.getInstance(lb1, fb0, fb1, lb1);
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4();
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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    double ld0 = 326.1549772311895;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought65.getInstance(fd1, ld0, ad1, ad2);
    ab1 = ab2 || ab3;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld3 = 532.0907217773372;
    ld0 = ld3 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
    Thought lo4 = Thought65.getInstance(fo0, fo1, fo0, fo1);
    boolean lb5 = false;
    ab3 = !ab4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld3, ad1, lb2, lb5, ab1, ab2);
}
    ab3 = ab4 && fb0;
    ad2 *= -1;
    fb1 = ad3 < ad4;
    double ld6 = 917.8831882470306;
    Thought lo7 = Thought5.getInstance(fo0, fo1, fo0, fo1, lb2, lb5, ab1, ab2);
    Thought lo8 = Thought88.getInstance(ad4, fd0, fd1, ld0);
    Thought lo9 = Thought7.getInstance(fo0, fo1, fo0, fo1, ld3, ld6, ad1, ad2);
    ad3 *= -1;

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
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m1();
}
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    fd0 *= -1;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao3.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo1 = Thought25.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    lb0 = fd1 > fd0;
    Thought lo2 = Thought58.getInstance(fd1, fd0, fd1, fd0);
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb3 = fb0 && fb1;
if(ao1 != null){
      fd1 = ao1.m3(lb0, lb3, fb0, fb1);
}
    Thought lo4 = Thought13.getInstance();
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
if(ao2 != null){
          ao2.m3(fd1, fd0, fd1, fd0, lb0, lb3, fb0, fb1);
}
        Thought lo5 = Thought46.getInstance(ao3, ao4, fo0, fo1);
        boolean lb6 = false;
        Thought lo7 = Thought44.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb6, lb0, lb3, fb0);
        Output.points[1][3] -= fd1;
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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb1 = false;
    lb0 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Output.points[1][4] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4(lb1, fb0, fb1, lb0);
}
if(ao3 != null){
      lb1 = ao3.m2();
}
    Thought lo2 = Thought99.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
    double ld3 = 893.4513754136659;
    fd0 *= -1;
    fb0 = fd1 < ld3;

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
    ab2 = fd1 < fd0;
    fd1 = fd0 + fd1;
    ab3 = ab4 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[1][5] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought79.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
    ab3 = fd0 > fd1;
    boolean lb1 = true;
    Thought lo2 = Thought18.getInstance(fd0, fd1, fd0, fd1);
    ab3 = ab4 || fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
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
    double ld0 = 824.8647023114364;
    double ld1 = 387.48343896578314;
    ld1 = ad1 + ad2;
    ab1 = !ab2;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, ab1);
}
    Thought lo2 = Thought4.getInstance();
    Thought lo3 = Thought40.getInstance(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
    Thought lo4 = Thought79.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ld0, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought61.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    Output.points[1][6] -= ld0;
if(fo0 != null){
      ld1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
    Thought lo6 = Thought89.getInstance(ab3, ab4, fb0, fb1);
    fd0 = fd1 - ld0;
if(ao4 != null){
      ab1 = ao4.m2();
}
    ab2 = ld1 < ad1;
if(fo0 != null){
      ab3 = fo0.m2(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Thought lo7 = Thought26.getInstance(fo0, fo1, ao1, ao2, ld0, ld1, ad1, ad2, ab2, ab3, ab4, fb0);
    boolean lb8 = true;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb8, ab1);
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
    Thought lo0 = Thought99.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought68.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
    fd1 *= -1;

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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    Thought lo0 = Thought19.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    Thought lo1 = Thought52.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab1 = fd1 > fd0;
    ab2 = !ab3;
    if (ab4) {
        fd1 *= -1;
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
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought7.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
    fb0 = !fb1;
    lb1 = ad4 > fd0;
    Thought lo2 = Thought85.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb1, fb0);
    ad4 = fd0 + fd1;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
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
        Thought lo0 = Thought78.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ad2 *= -1;
if(fo1 != null){
      ab3 = fo1.m2();
}
if(fo0 != null){
      ab4 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab3 = fd0 < fd1;
    ad1 *= -1;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
    Output.points[1][7] -= fd0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
        Thought lo2 = Thought4.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Output.points[1][8] -= fd1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    double ld0 = 221.76725076748664;
    fb1 = !fb0;
    boolean lb1 = true;
    boolean lb2 = true;
    ld0 = fd0 - fd1;
    lb2 = ld0 < fd0;
if(ao2 != null){
      ao2.m3(fb0, fb1, lb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo3 = Thought98.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb2);
    fb0 = fb1 || lb1;
    lb2 = ld0 > fd0;
    Thought lo4 = Thought4.getInstance(fo0, fo1, ao1, ao2);
    fd1 = ld0 - fd0;
    Thought lo5 = Thought40.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, lb2);
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb1, lb2);
}
        fb0 = fb1 && lb1;
    fd0 = fd1 + ld0;
    boolean lb6 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      ao1.m3(lb2, lb6, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = !fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought58.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd1 > ad1;
    fb0 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld1 = 137.76982491174752;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    ad3 = ad4 + fd0;
    fd1 = ld1 + ad1;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb2 = false;
    boolean lb3 = true;
if(ao3 != null){
      ld1 = ao3.m3(ao4, fo0, fo1, ao1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - fd0;
        fb1 = fd1 > fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        boolean lb0 = true;
        ab4 = fd1 > fd0;
        fd1 = fd0 - fd1;
        fd0 *= -1;
        Output.points[2][0] -= fd1;
        fb0 = !fb1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
        ab4 = fd0 < fd1;
        Thought lo1 = Thought60.getInstance(fd0, fd1, fd0, fd1);
        fb0 = fd0 > fd1;
        fb1 = lb0 || ab1;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    ab2 = !ab3;
    double ld0 = 329.09164425171616;
    ad4 = fd0 - fd1;
    ld0 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld0 = ad1 - ad2;
    boolean lb1 = true;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ld0 = ad1 + ad2;
    ab2 = ab3 || ab4;
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, ab1);
}
    Thought lo2 = Thought28.getInstance(ld0, ad1, ad2, ad3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
    lb0 = fd1 < fd0;
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
    lb0 = fd0 > fd1;
    fd0 *= -1;

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
    ab2 = fd0 > fd1;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought96.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought34.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb3 = true;
    lb0 = lb3 && ab1;
    Output.points[2][1] += fd0;
    double ld4 = 533.853558800951;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      lb0 = fo1.m2();
}
    lb3 = !ab1;
    ld4 = fd0 + fd1;
if(fo0 != null){
      ab2 = fo0.m2(ld4, fd0, fd1, ld4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld0 = 845.2151748935408;
    double ld1 = 781.9890148611368;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
        fb0 = !fb1;
        fb0 = !fb1;
        fb0 = ad4 < fd0;
        Thought lo2 = Thought10.getInstance(fb1, fb0, fb1, fb0);
        fb1 = fd1 < ld0;
        boolean lb3 = true;
        ld1 = ad1 + ad2;
        lb3 = fb0 && fb1;
if(fo1 != null){
          ad3 = fo1.m3();
}
        ad4 = fd0 - fd1;
        boolean lb4 = true;
if(fo0 != null){
          ld0 = fo0.m3(ld1, ad1, ad2, ad3, lb3, lb4, fb0, fb1);
}
        lb3 = !lb4;
        Thought lo5 = Thought36.getInstance(fo1, fo0, fo1, fo0);
        Thought lo6 = Thought86.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb3, lb4);
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
        double ld7 = 15.08685960269638;
        lb3 = ad3 > ad4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld7, ld0);
}
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
    Thought lo0 = Thought54.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ad2 < ad3;
    Thought lo1 = Thought46.getInstance();
    ab1 = !ab2;
    Thought lo2 = Thought43.getInstance(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
    ab1 = ab2 || ab3;
    boolean lb3 = true;
    boolean lb4 = false;
    double ld5 = 218.4038425214776;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld5, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb3, lb4, ab1);
}
    boolean lb6 = true;
    ad1 = ad2 - ad3;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld5);
}
    ab4 = fb0 || fb1;
    lb3 = ad1 < ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld5 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(lb4, lb6, ab1, ab2);
}
    ab3 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld5, ad1, fb1, lb3, lb4, lb6);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fb1 = !fb0;
    Thought lo0 = Thought5.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4();
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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Output.points[2][2] += ad3;
    fb1 = ad4 < fd0;
    Thought lo0 = Thought79.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    Output.points[2][3] += ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Thought lo2 = Thought29.getInstance(fd0, fd1, ad1, ad2);
    ad3 = ad4 + fd0;
    lb1 = fd1 < ad1;
    fb0 = fb1 || lb1;
    ad2 *= -1;
    fb0 = fb1 && lb1;

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
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
if(ao1 != null){
      fd1 = ao1.m3(fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    ab3 = ab4 || fb0;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    if (fb1) {
        ab1 = !ab2;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
        ab3 = fd0 < fd1;
        fd0 = fd1 - fd0;
        boolean lb0 = true;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb0 = fd0 < fd1;
        ab1 = !ab2;
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 && ab3;
        fd0 = fd1 + fd0;
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
        } else if (fb0) {
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
          ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
        boolean lb1 = false;
        Output.points[2][4] -= fd1;
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ad2 < ad3;
    Output.points[2][5] += ad4;
    ab3 = ab4 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought3.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
        boolean lb1 = true;
    fd0 *= -1;
    ab2 = fd1 < ad1;

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
    Output.points[2][6] -= fd0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    Thought lo0 = Thought86.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    if (fb0) {
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        double ld1 = 86.91150499688922;
        Output.points[2][7] -= fd0;
        fb0 = fb1 && fb0;
        fd1 = ld1 + fd0;
        fb1 = !fb0;
        Output.points[2][8] -= fd1;
        fb1 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        ld1 = fd0 - fd1;
        ld1 = fd0 + fd1;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4();
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
    ab2 = fd0 < fd1;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought62.getInstance(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought41.getInstance(ab4, fb0, fb1, ab1);
    boolean lb2 = false;
if(fo0 != null){
      fo0.m2();
}
    Thought lo3 = Thought88.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Thought lo4 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
    boolean lb5 = true;
        boolean lb6 = true;

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
    Thought lo0 = Thought33.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    boolean lb1 = true;
    lb1 = ad1 < ad2;
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;
    Output.points[3][0] -= ad3;
    double ld2 = 221.07487488069748;
    fb0 = ad3 < ad4;
    fd0 *= -1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld2, ad1, ad2);
}
    double ld4 = 353.1425187369682;
    boolean lb5 = true;
    double ld6 = 118.59110317931132;
    boolean lb7 = true;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    lb5 = lb7 && fb0;
    fb1 = fd1 > ld2;
    lb1 = ld4 > ld6;
if(fo0 != null){
      fo0.m3(lb3, lb5, lb7, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !lb1;

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
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Output.points[3][1] -= ad3;
    double ld1 = 475.86046831626845;
if(fo1 != null){
      fo1.m1(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ad3 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;

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
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    boolean lb0 = true;
    lb0 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    double ld1 = 622.8547682476521;
    fb1 = lb0 || fb0;
    double ld2 = 754.7319982717837;
    fb1 = ld2 > fd0;
    lb0 = fd1 < ld1;
    boolean lb3 = false;
    boolean lb4 = true;
    Thought lo5 = Thought37.getInstance(lb3, lb4, fb0, fb1);
if(fo0 != null){
      ao4 = fo0.m4();
}
    lb0 = lb3 && lb4;
    fb0 = ld2 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld1, ld2, fd0, lb0, lb3, lb4, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = lb0 || lb3;
    fd1 = ld1 + ld2;
    fd0 = fd1 + ld1;
    ld2 *= -1;
    lb4 = fd0 > fd1;
if(fo1 != null){
      ld1 = fo1.m3(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
}
if(fo0 != null){
      lb4 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb3);
}
    lb4 = fb0 || fb1;

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
    ad2 *= -1;
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    boolean lb1 = false;
    fd0 *= -1;
    boolean lb2 = false;
    lb0 = fd1 > ad1;
    Output.points[3][2] += ad2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
    double ld0 = 662.4737173502209;
    Output.points[3][3] -= ld0;
    ab1 = fd0 > fd1;
    Thought lo1 = Thought10.getInstance();
if(ao1 != null){
      ab2 = ao1.m2(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    Output.points[3][4] -= fd1;
    ab2 = !ab3;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    double ld2 = 575.7801645753748;
    ab2 = ab3 || ab4;
    boolean lb3 = false;
    ab4 = fd0 > fd1;
    fb0 = ld0 < ld2;
    fb1 = lb3 && ab1;

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
    ab1 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    ab3 = ab4 && fb0;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
        ad1 *= -1;
    ad2 = ad3 - ad4;
    double ld1 = 992.6373688448997;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    ad4 = fd0 - fd1;
    boolean lb2 = false;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    double ld3 = 791.9910180444997;
    boolean lb4 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb2);
}
if(ao3 != null){
      lb4 = ao3.m2(ad4, fd0, fd1, ld1);
}
if(ao4 != null){
      ld3 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    double ld0 = 921.4937340349641;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought44.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fd1 > ld0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 - fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
        fb1 = fd1 < ld0;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought13.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    Thought lo1 = Thought49.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb2 = false;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;

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
    Thought lo0 = Thought10.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought82.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld3 = 281.5534538225176;
    lb2 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb2, fb0, fb1);
}
    Output.points[3][5] += fd1;
if(fo1 != null){
      ld3 = fo1.m3();
}
    Thought lo4 = Thought95.getInstance(fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb2);
    fb0 = fd1 < ld3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo5 = Thought47.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, fb1, lb2, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
    fb0 = !fb1;
    lb2 = fd1 < ld3;
    Thought lo6 = Thought57.getInstance(fd0, fd1, ld3, fd0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1);
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
