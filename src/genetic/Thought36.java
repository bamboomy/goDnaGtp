package genetic;
import java.util.ArrayList;
class Thought36 extends Thought{
private static ArrayList<Thought36> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 263.0534871665723;
private double fd1 = 419.17654787912096;
private Thought fo0 = null;
private Thought fo1 = null;
Thought36 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought36 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought36 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought36 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought36 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    Thought lo1 = Thought81.getInstance();
    if (fb1) {
        Output.points[1][5] += fd1;
        lb0 = fb0 && fb1;
        double ld2 = 493.0125166451247;
if(fo0 != null){
          ld2 = fo0.m3(fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
}
        boolean lb3 = true;
        boolean lb4 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    ab1 = ab2 && ab3;
    Output.points[1][6] -= fd0;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    double ld1 = 263.3666646249339;
    fd0 = fd1 + ld1;
    Thought lo2 = Thought90.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
    Output.points[1][7] += ld1;
    fd0 = fd1 - ld1;

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
    fb1 = fb0 || fb1;
    ad2 *= -1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    Output.points[1][8] -= ad1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = ad2 < ad3;
    boolean lb2 = false;
    fb0 = !fb1;
    boolean lb3 = false;
    lb0 = lb1 || lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb0);
}
    if (lb1) {
        lb2 = !lb3;
        ad2 = ad3 - ad4;
        Output.points[2][0] -= fd0;
        boolean lb4 = true;
        lb3 = fb0 && fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb4, lb0, lb1, lb2);
}
        lb3 = fb0 || fb1;
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
    double ld0 = 276.2047037874207;
    Thought lo1 = Thought22.getInstance(ad4, fd0, fd1, ld0);
    Thought lo2 = Thought62.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    boolean lb3 = false;
    Thought lo4 = Thought99.getInstance(lb3, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab4 = fb0 || fb1;
    lb3 = ab1 && ab2;
        ab3 = ab4 && fb0;
    boolean lb5 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, fb0, fb1, lb3, lb5);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo6 = Thought94.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb5);
if(fo0 != null){
      fd1 = fo0.m3(ld0, ad1, ad2, ad3);
}
    Thought lo7 = Thought38.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb3, lb5);
}
    ab1 = fd0 < fd1;
    boolean lb8 = true;
    boolean lb9 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, lb9, ab1, ab2, ab3);
}
    ad4 *= -1;

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
    Output.points[2][1] -= fd1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
if(ao4 != null){
      fd1 = ao4.m3();
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    lb1 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought35.getInstance(fd0, fd1, fd0, fd1);
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    lb2 = fd0 > fd1;
    lb4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      lb2 = ao3.m2(fd0, fd1, fd0, fd1, lb4, fb0, fb1, lb0);
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
        double ld0 = 231.39564725214834;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ld0 = ad1 + ad2;
    Thought lo1 = Thought35.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    fb0 = fb1 && lb2;
    double ld3 = 811.5648125015248;
    fb0 = !fb1;
        boolean lb4 = true;
if(fo1 != null){
      lb2 = fo1.m2(ld0, ld3, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
    lb4 = ld3 > ad1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb2, lb4, fb0);
}
    ad2 *= -1;
    fb1 = lb2 && lb4;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = ld0 + ld3;
    Output.points[2][2] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb2, lb4);
}
    fd1 = ld0 - ld3;
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 && lb2;
    lb4 = fb0 && fb1;

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
    ab1 = !ab2;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = !ab2;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m3(fd1, fd0, fd1, fd0);
}
        ab3 = fd1 < fd0;
        ab4 = fd1 < fd0;
        fb0 = !fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
        boolean lb0 = false;
if(ao3 != null){
          ao2 = ao3.m4(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          ab4 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
        fd1 = fd0 + fd1;
        ab2 = fd0 < fd1;
        ab3 = ab4 && fb0;
        boolean lb1 = false;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, ab1);
}
        ab2 = fd0 > fd1;
        Thought lo2 = Thought87.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
        boolean lb3 = true;
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
        lb0 = lb1 && lb3;
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
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    ab2 = ad1 < ad2;
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought64.getInstance();
    ab1 = ad3 < ad4;
        ab2 = fd0 < fd1;
    double ld1 = 240.6152432001978;
    ab3 = !ab4;
    Output.points[2][3] -= ld1;
    fb0 = !fb1;
    ad1 *= -1;
    boolean lb2 = false;
    lb2 = ad2 > ad3;
    ad4 = fd0 + fd1;
    Thought lo3 = Thought54.getInstance(ld1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    fb0 = fb1 && lb2;
    ab1 = !ab2;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad4 *= -1;
    ab4 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld1, ad1, ad2, ad3, fb0, fb1, lb2, ab1);
}
    double ld4 = 724.1943314495925;

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
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Output.points[2][4] -= fd1;
    Thought lo0 = Thought71.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    Output.points[2][5] -= fd0;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought11.getInstance(fo1, fo0, fo1, fo0);
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought71.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
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
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought35.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    Output.points[2][6] -= ad3;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = fb0 || fb1;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fd1, ad1, ad2, ad3);
}
    boolean lb2 = true;
    ad4 *= -1;
    Thought lo3 = Thought26.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
    lb2 = fb0 && fb1;

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
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
    Output.points[2][7] -= ad3;
    ab2 = ab3 && ab4;
    Output.points[2][8] += ad4;
    fd0 *= -1;

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
    boolean lb0 = true;
    Thought lo1 = Thought64.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fb1 = ao1.m2(lb0, fb0, fb1, lb0);
}
    double ld2 = 885.5038019955831;
if(ao2 != null){
      ao2.m3();
}
    double ld3 = 238.1347129800799;
if(ao4 != null){
      ao3 = ao4.m4(ld3, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
    ld3 = fd0 + fd1;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 && fb1;
if(fo0 != null){
          fb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
        fb1 = ad2 > ad3;
if(fo1 != null){
          fo1.m1(fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          ao1.m1();
}
if(ao2 != null){
          ao2.m1(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1);
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
    Thought lo0 = Thought24.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
    Output.points[3][0] -= fd0;
    Output.points[3][1] -= fd1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
    double ld1 = 148.4849500724874;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    if (ab4) {
        fb0 = fd1 > ld1;
        fb1 = ab1 || ab2;
        fd0 = fd1 + ld1;
if(ao2 != null){
          fd0 = ao2.m3(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab2 = fd0 > fd1;
        ab3 = !ab4;
    double ld0 = 692.6026321033069;
    boolean lb1 = true;
    double ld2 = 571.1048505575325;
    ab4 = !fb0;
    boolean lb3 = false;
    double ld4 = 565.0384734227067;
    ld0 *= -1;
    fb0 = ld2 < ld4;
    ad1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, lb1, lb3, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    lb1 = fd1 > ld0;
    lb3 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld4, ad1, ad2);
}
    boolean lb5 = false;

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
    Thought lo0 = Thought34.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
        Output.points[3][2] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    Output.points[3][3] += fd1;
    Output.points[3][4] += fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    boolean lb1 = true;
    Thought lo2 = Thought69.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    boolean lb0 = true;
    ab4 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
    ab3 = !ab4;
    fb0 = !fb1;
    boolean lb1 = false;
    lb0 = lb1 || ab1;
    double ld2 = 902.0153733585225;
    ab2 = ab3 && ab4;

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
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
        if (fb1) {
            fb0 = ad1 > ad2;
if(fo0 != null){
              fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
            Thought lo0 = Thought50.getInstance();
            fb0 = ad3 > ad4;
            boolean lb1 = true;
            fb0 = fb1 && lb1;
if(fo1 != null){
              fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0);
}
            fb1 = !lb1;
            for(int i1=0; i1<10; i1++){
if(fo1 != null){
                  fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, fb0);
}
                fb1 = lb1 || fb0;
                Output.points[3][5] += ad1;
                fb1 = ad2 < ad3;
if(fo1 != null){
                  fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
                  fb0 = fo0.m2(ad4, fd0, fd1, ad1);
}
                fb1 = !lb1;
                Thought lo2 = Thought42.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
                fb0 = fb1 && lb1;
                fd1 = ad1 - ad2;
}}}
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
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    fb0 = ad2 < ad3;
    Thought lo1 = Thought21.getInstance();
    ad4 = fd0 + fd1;
    fb1 = ad1 > ad2;
    if (lb0) {
        ad3 *= -1;
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
        ab1 = ad2 < ad3;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        double ld2 = 332.1705899957055;
        } else {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
        boolean lb3 = false;
        ad2 = ad3 + ad4;
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
    fb0 = fd1 > fd0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 *= -1;
    Output.points[3][6] += fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
    double ld2 = 829.9817051125198;
    fb1 = fd0 < fd1;
    ld2 = fd0 + fd1;
if(ao2 != null){
      ao2.m1();
}
    boolean lb3 = false;
    lb0 = ld2 < fd0;
    Thought lo4 = Thought15.getInstance(fd1, ld2, fd0, fd1, lb1, lb3, fb0, fb1);
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld2 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0, lb1, lb3, fb0, fb1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 266.67656792231054;
    boolean lb1 = true;
    lb1 = ld0 > ad1;
    boolean lb2 = true;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    Thought lo3 = Thought25.getInstance(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb1, lb2);
}
    fb0 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(fd1, ld0, ad1, ad2, fb1, lb1, lb2, fb0);
}
    fb1 = lb1 || lb2;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb1, lb2, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1, lb1, lb2, fb0, fb1);
}
        lb1 = lb2 || fb0;
if(ao2 != null){
          ao1 = ao2.m4(ld0, ad1, ad2, ad3);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
        Thought lo4 = Thought74.getInstance(fb1, lb1, lb2, fb0);
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m3(ad1, ad2, ad3, ad4, fb1, lb1, lb2, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab2 = !ab3;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    Thought lo0 = Thought29.getInstance(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
    ab1 = fd1 < fd0;
    Thought lo1 = Thought24.getInstance(fd1, fd0, fd1, fd0);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought94.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      ab1 = ao3.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb1 = !ab1;

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
          ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought70.getInstance(ao1, ao2, ao3, ao4, fb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    double ld1 = 344.77336353802417;
    boolean lb2 = true;
    ad4 = fd0 - fd1;
    ld1 = ad1 + ad2;
    Output.points[3][7] -= ad3;
    double ld3 = 672.8271526949311;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo4 = Thought4.getInstance(ab3, ab4, fb0, fb1);
    Output.points[3][8] -= ld1;
    Output.points[4][0] -= ld3;
    ad1 = ad2 + ad3;
    Thought lo5 = Thought58.getInstance();
    lb2 = !ab1;
    if (ab2) {
        ad4 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld1, ld3, ab3, ab4, fb0, fb1);
}
        Output.points[4][1] += ad1;
        lb2 = ab1 && ab2;
}
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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought52.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Thought lo1 = Thought43.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    Thought lo2 = Thought46.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    double ld3 = 993.1515742087305;
    boolean lb4 = true;
    Thought lo5 = Thought52.getInstance();
    Thought lo6 = Thought6.getInstance(fd0, fd1, ld3, fd0, fb0, fb1, lb4, fb0);

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
    ab1 = fd0 > fd1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    if (lb1) {
        fd0 = fd1 - fd0;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        boolean lb2 = true;
        boolean lb3 = false;
        Output.points[4][2] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        double ld4 = 838.063809874861;
        lb3 = ld4 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld4);
}
        lb0 = lb1 || ab1;
if(fo1 != null){
          fo1.m1(ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - ld4;
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
    ad2 = ad3 + ad4;
        for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fd0 = fd1 + ad1;
            Thought lo0 = Thought1.getInstance();
            Output.points[4][3] += ad2;
            fb1 = ad3 < ad4;
            fb0 = fb1 && fb0;
            fb1 = fb0 && fb1;
            Output.points[4][4] -= fd0;
            fd1 = ad1 - ad2;
            ad3 = ad4 - fd0;
if(fo1 != null){
              fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
            fd0 = fd1 + ad1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            boolean lb1 = false;
            if (lb1) {
                ad2 *= -1;
                ad3 = ad4 - fd0;
                boolean lb2 = false;
                double ld3 = 862.985327507083;
}}}
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ab4 = ad1 < ad2;
    Output.points[4][5] -= ad3;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought15.getInstance();
    double ld2 = 767.572989931725;
    boolean lb3 = true;
    boolean lb4 = false;
        lb3 = lb4 || ab1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb3);
}
    lb4 = fd1 < ld2;
    Thought lo5 = Thought59.getInstance(fo0, fo1, fo0, fo1);
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    lb4 = ad4 < fd0;
if(fo0 != null){
      ab1 = fo0.m2(fd1, ld2, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
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
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
        fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    double ld0 = 926.1650473473122;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought86.getInstance(ao1, ao2, ao3, ao4);
    Output.points[4][6] += fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao3.m3(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2();
}
    lb0 = ad2 < ad3;
    ad4 *= -1;
    boolean lb1 = true;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought11.getInstance(ao1, ao2, ao3, ao4);
    fd1 *= -1;
    lb1 = ad1 < ad2;
    boolean lb3 = false;
    ad3 = ad4 - fd0;
    lb3 = !fb0;
    double ld4 = 867.9732841820941;
    double ld5 = 666.8158701932795;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld4, fb1, lb0, lb1, lb3);
}
    ld5 *= -1;

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
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = lb0 || ab1;
        ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought67.getInstance();
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
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
    ab1 = ab2 && ab3;
    ab4 = ad2 > ad3;
    fb0 = ad4 > fd0;
    fb1 = ab1 || ab2;
    ab3 = fd1 > ad1;
    ad2 = ad3 - ad4;
    ab4 = fd0 > fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    boolean lb0 = false;
    fb0 = ad2 > ad3;
    fb1 = !lb0;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb0);
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
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
        fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
    boolean lb1 = false;
    Output.points[4][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    lb0 = lb1 || fb0;
    fb1 = fd1 > fd0;
    lb0 = lb1 || fb0;
    fb1 = !lb0;
    double ld2 = 156.97466340250983;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    fd0 = fd1 + ld2;
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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[4][8] -= fd1;
    Thought lo0 = Thought66.getInstance(fb0, fb1, fb0, fb1);
    Thought lo1 = Thought11.getInstance();
        fb0 = fb1 || fb0;
    Output.points[5][0] += fd0;

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
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[5][1] += fd0;
    fd1 *= -1;
    Thought lo0 = Thought16.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fd0 < fd1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;

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
