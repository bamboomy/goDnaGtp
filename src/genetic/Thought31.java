package genetic;
import java.util.ArrayList;
class Thought31 extends Thought{
private static ArrayList<Thought31> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 556.302750291509;
private double fd1 = 77.78561885973683;
private Thought fo0 = null;
private Thought fo1 = null;
Thought31 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought31 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought31 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought31 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought31 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought31 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought31 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought31 instance = new Thought31 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    if (fb0) {
        Output.points[8][7] -= fd0;
        Thought lo0 = Thought22.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[8][8] += fd1;
        Thought lo1 = Thought55.getInstance(fd0, fd1, fd0, fd1);
        fb1 = fd0 > fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb0 = fb1 && fb0;
        Thought lo2 = Thought143.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 < fd0;
        fb0 = fb1 || fb0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        boolean lb3 = true;
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
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = ab1 && ab2;
    ab3 = ab4 && fb0;
    if (fb1) {
        lb0 = !ab1;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        Thought lo1 = Thought267.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        ab2 = !ab3;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 && ab3;
        double ld2 = 459.425821841558;
        ab4 = fb0 && fb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(fo0 != null){
          fo0.m3();
}
        double ld3 = 530.8428302527071;
        Thought lo4 = Thought347.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld2, fb1, lb0, ab1, ab2);
        ld3 = fd0 - fd1;
        Thought lo5 = Thought184.getInstance(ab3, ab4, fb0, fb1);
        ld2 = ld3 - fd0;
        double ld6 = 125.1425100035627;
        lb0 = fd0 < fd1;
        ab1 = ld2 < ld3;
        ab2 = ab3 && ab4;
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
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld0 = 75.72446814197475;
    double ld1 = 314.3325982258297;
    boolean lb2 = false;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
    boolean lb3 = false;
    boolean lb4 = true;
    lb3 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb4, fb0, fb1, lb2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb3, lb4, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb5 = true;
    if (lb2) {
        ld0 *= -1;
        Output.points[0][0] -= ld1;
        Thought lo6 = Thought135.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb3, lb4, lb5, fb0);
        fb1 = lb2 && lb3;
        Thought lo7 = Thought296.getInstance(lb4, lb5, fb0, fb1);
        lb2 = !lb3;
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
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought233.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    lb0 = !ab1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb3 = true;
    ab4 = fd0 < fd1;
    fb0 = ad1 > ad2;
    ad3 = ad4 + fd0;

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
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    double ld0 = 338.15956565447743;
    double ld1 = 838.790558267072;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought294.getInstance();
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ld1, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb3, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - ld0;

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
    boolean lb0 = true;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    ad1 *= -1;

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
    ab1 = ab2 && ab3;
    fd1 *= -1;
if(ao2 != null){
      ao2.m3();
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      fd1 = ao3.m3(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        ab1 = !ab2;
        boolean lb0 = true;
if(ao3 != null){
          fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
        for(int i1=0; i1<10; i1++){
            Thought lo1 = Thought125.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
            double ld2 = 119.11533070861998;
if(ao3 != null){
              ao2 = ao3.m4(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
            fd1 *= -1;
            for(int i2=0; i2<10; i2++){
if(ao4 != null){
                  ab3 = ao4.m2();
}
if(fo0 != null){
                  ab4 = fo0.m2(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
                  fd0 = ao4.m3(ab2, ab3, ab4, fb0);
}
                Thought lo3 = Thought306.getInstance(fo0, fo1, ao1, ao2);
                boolean lb4 = false;
if(ao4 != null){
                  ao3 = ao4.m4(fd1, ld2, fd0, fd1);
}
                boolean lb5 = false;
}}}
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
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = ab1 && ab2;
    double ld1 = 557.0902734419717;
    Thought lo2 = Thought164.getInstance(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2();
}
    fb0 = fd0 > fd1;
    boolean lb3 = true;
    Output.points[0][1] -= ld1;
    boolean lb4 = false;
    ab4 = ad1 > ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
}
if(fo1 != null){
      lb4 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
    boolean lb5 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ld1 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld1, ad1, lb3, lb4, lb5, ab1);
}
    ab2 = !ab3;
    ad2 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    Thought lo6 = Thought173.getInstance();
    double ld7 = 919.8904337575694;

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
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Output.points[0][2] += fd0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought82.getInstance(fd0, fd1, fd0, fd1);
    Thought lo2 = Thought21.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo0 != null){
      lb0 = fo0.m2();
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    double ld1 = 910.2518750385925;
    ab4 = ld1 < fd0;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought181.getInstance(fb0, fb1, lb0, ab1);
        fd1 = ld1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb3 = true;
        ab1 = ld1 < fd0;
        boolean lb4 = false;
        ab1 = fd1 > ld1;
        ab2 = !ab3;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, fd0, fd1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
    Output.points[0][3] += ad3;
    double ld0 = 48.985365914420974;
    ad3 *= -1;
        boolean lb1 = true;
    Thought lo2 = Thought101.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb3 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      ld0 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb3);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m3(fb0, fb1, lb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    lb1 = !lb3;
    Thought lo4 = Thought150.getInstance(ad1, ad2, ad3, ad4);
        Thought lo5 = Thought104.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
    boolean lb6 = true;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, lb6, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb6, fb0, fb1);
}
    Output.points[0][4] -= fd1;
    Thought lo7 = Thought74.getInstance();
    lb1 = ld0 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb3, lb6, fb0, fb1);
}
    fd1 = ld0 + ad1;
    boolean lb8 = true;

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
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    boolean lb0 = false;
    Thought lo1 = Thought339.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    double ld2 = 851.2777263571302;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb0 = !ab1;
    fd0 = fd1 + ld2;
    ab2 = ab3 && ab4;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    fd1 *= -1;
    ld2 = ad1 - ad2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    double ld1 = 939.5861682897003;
    Thought lo2 = Thought268.getInstance();
    fb0 = ld1 < fd0;
    fb1 = lb0 && fb0;
    Output.points[0][5] += fd1;
    ld1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(lb0, fb0, fb1, lb0);
}
    ld1 = fd0 - fd1;
    ld1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = ld1 - fd0;
    fb0 = fb1 && lb0;

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
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
    fd1 = ad1 - ad2;
    double ld0 = 87.94010502523602;
    ad2 = ad3 - ad4;
        fb0 = fb1 && fb0;

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
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[0][6] -= fd0;
    fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    boolean lb1 = false;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    boolean lb2 = false;

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
if(ao2 != null){
      ao2.m2(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought215.getInstance(ao3, ao4, fo0, fo1);
    fb0 = ad1 > ad2;
    fb1 = ab1 || ab2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3);
}
    if (ab3) {
        ab4 = fb0 && fb1;
        ab1 = ad4 > fd0;
        ab2 = fd1 < ad1;
        for(int i0=0; i0<10; i0++){
}}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    boolean lb0 = false;
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 *= -1;
    double ld1 = 275.5348585486851;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
    ab3 = ab4 || fb0;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab4 = fb0 && fb1;
    lb0 = lb1 && ab1;
    double ld2 = 273.2469561193745;
    Output.points[0][7] -= ld2;
    if (ab2) {
        ab3 = fd0 < fd1;
        ld2 = fd0 + fd1;
        ab4 = fb0 || fb1;
        double ld3 = 927.6749950230927;
        } else {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2);
}
        fd0 = fd1 + ld2;
        lb0 = lb1 && ab1;
        fd0 = fd1 - ld2;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
}
        double ld4 = 462.91884986709175;
        double ld5 = 923.7901845066605;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        if (ab2) {
            ld2 = fd0 - fd1;
}}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought89.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    Output.points[0][8] += fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    Thought lo1 = Thought371.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    fb0 = !fb1;
    ad1 *= -1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    Thought lo3 = Thought245.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
    boolean lb4 = true;
    Thought lo5 = Thought151.getInstance();
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb2, lb4);
}
    fb0 = fb1 || lb2;
    lb4 = ad2 < ad3;

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
    ad1 = ad2 + ad3;
        ab1 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    double ld0 = 236.5867533554757;
    fb1 = fd0 < fd1;
    double ld1 = 985.025865311955;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb2 = fo1.m2(ld0, ld1, ad1, ad2);
}
    boolean lb3 = true;
    lb3 = ad3 > ad4;
    ab1 = !ab2;
    Thought lo4 = Thought316.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb2 = lb3 || ab1;
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought196.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo0.m1();
}
        Thought lo6 = Thought81.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb1, lb2, lb3, ab1);
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        }
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo7 = Thought290.getInstance(ad1, ad2, ad3, ad4);

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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought84.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought210.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[1][0] += fd0;
    fd1 = fd0 - fd1;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;

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
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fd0 > fd1;
    fb1 = lb0 || fb0;
    fb1 = !lb0;
    for(int i0=0; i0<10; i0++){
        Output.points[1][1] -= ad1;
        Thought lo1 = Thought350.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
        fb0 = fb1 || lb0;
if(ao2 != null){
          fd1 = ao2.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
        }
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    boolean lb2 = false;
    ad4 = fd0 - fd1;
    lb2 = ad1 > ad2;
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
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = !ab4;
    fb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 *= -1;
    boolean lb0 = false;
    fb0 = !fb1;
    Thought lo1 = Thought269.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    Output.points[1][2] += ad3;
if(ao3 != null){
      ao3.m2();
}
    ab2 = ad4 < fd0;
    double ld1 = 109.24812811033411;
    fd0 = fd1 + ld1;
    ad1 = ad2 + ad3;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ad1 = ao3.m3(lb0, ab1, ab2, ab3);
}
    if (ab4) {
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        Thought lo2 = Thought270.getInstance(ad2, ad3, ad4, fd0);
        boolean lb3 = false;
        fd1 = ld1 - ad1;
        Thought lo4 = Thought168.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
if(ao2 != null){
          ao2.m1(fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb3);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
}
        double ld5 = 224.34861735450556;
if(ao3 != null){
          ao3.m1();
}
        ab4 = ad2 > ad3;
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
    boolean lb0 = true;
    boolean lb1 = true;
    double ld2 = 812.0508734386281;
    ld2 = fd0 + fd1;
    lb0 = !lb1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
if(fo0 != null){
      ld2 = fo0.m3(fb0, fb1, lb0, lb1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[1][3] += fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fb0 = fo0.m2(fd1, ld2, fd0, fd1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought374.getInstance(fb0, fb1, lb0, ab1);
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
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
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 465.9475805147804;
    boolean lb1 = true;
    ld0 = ad1 + ad2;
    double ld2 = 838.3055267966408;
    double ld3 = 141.39713999088715;
    Thought lo4 = Thought168.getInstance();
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = ld0 - ld2;
    lb1 = ld3 > ad1;
    if (fb0) {
        fb1 = !lb1;
        ad2 = ad3 + ad4;
        } else {
        fb0 = !fb1;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld0, ld2, ld3);
}
        lb1 = ad1 > ad2;
        fb0 = fb1 || lb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        fb0 = !fb1;
if(fo1 != null){
          lb1 = fo1.m2(ld0, ld2, ld3, ad1, fb0, fb1, lb1, fb0);
}
        ad2 = ad3 - ad4;
        fd0 = fd1 - ld0;
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
    boolean lb0 = true;
    lb0 = ad2 < ad3;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    ad4 = fd0 - fd1;
    boolean lb1 = true;
    ad1 = ad2 - ad3;
    Output.points[1][4] += ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, lb1, ab1, ab2);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 *= -1;
    fb0 = !fb1;
if(ao2 != null){
          ao2.m1(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought347.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad2 = ad3 + ad4;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    Output.points[1][5] += ad3;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(lb0, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    Thought lo1 = Thought165.getInstance(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
    double ld2 = 475.418962322777;
    ld2 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    boolean lb3 = true;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1, lb3, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    Thought lo0 = Thought286.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab3 = !ab4;
    fb0 = fb1 || ab1;
    ab2 = !ab3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[1][6] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    for(int i0=0; i0<10; i0++){
        ab1 = ad3 > ad4;
        Output.points[1][7] -= fd0;
        fd1 = ad1 - ad2;
        boolean lb0 = false;
        Thought lo1 = Thought277.getInstance(ab1, ab2, ab3, ab4);
        if (fb0) {
            Output.points[1][8] -= ad3;
            Output.points[2][0] += ad4;
            fb1 = lb0 && ab1;
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
            ab2 = ab3 && ab4;
            fb0 = fb1 && lb0;
}}
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
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
    double ld1 = 565.0021207848916;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought96.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    Thought lo3 = Thought288.getInstance();
    Thought lo4 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
    ld1 *= -1;
    fd0 = fd1 + ld1;
    Thought lo5 = Thought179.getInstance(fb1, lb0, fb0, fb1);
        lb0 = fb0 || fb1;
    boolean lb6 = false;
    boolean lb7 = false;
    lb0 = lb6 || lb7;
    double ld8 = 214.84444247166218;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(ld8, fd0, fd1, ld1);
}
    fb1 = ld8 > fd0;
    fd1 = ld1 - ld8;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld0 = 140.38970754994048;
    Output.points[2][1] += fd0;
    double ld1 = 967.909990270756;
    fb0 = fb1 && fb0;
    Output.points[2][2] -= fd0;
    fd1 *= -1;
    boolean lb2 = false;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    double ld0 = 701.2335573752745;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 804.6558759934904;
    ld0 = ld1 + fd0;
    fd1 = ld0 + ld1;
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
}
